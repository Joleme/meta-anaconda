SUMMARY = "The anaconda package"
DESCRIPTION = "The anaconda package"
HOMEPAGE = "http://fedoraproject.org/wiki/Anaconda"
LICENSE = "GPLv2"
SECTION = "devel"

LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "e2fsprogs gettext libarchive \
           pango python3 rpm \
           "

DEPENDS += "libxklavier glade libxml2-native \
            gdk-pixbuf-native \
            "

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "e2fsprogs e2fsprogs-e2fsck e2fsprogs-mke2fs \
                   e2fsprogs-tune2fs e2fsprogs-resize2fs \
                   ntfsprogs xfsprogs btrfs-tools nfs-utils-client \
                   parted dosfstools gzip libarchive lvm2 \
                   squashfs-tools openssh python3 python3-misc \
                   python3-modules  python3-dbus python3-pyparted \
                   python3-pykickstart \
                   dmidecode python3-meh python3-libreport localedef \
                   python3-pygobject python3-rpm grub usermode tigervnc \
                   tzdata tzdata-misc tzdata-posix tzdata-right tzdata-africa \
                   tzdata-americas tzdata-antarctica tzdata-arctic tzdata-asia \
                   tzdata-atlantic tzdata-australia tzdata-europe tzdata-pacific \
                   keybinder module-init-tools dnf util-linux efibootmgr \
                   ca-certificates isomd5sum \
                   btrfs-tools ntfs-3g iproute2 mdadm shadow chkconfig \
                   util-linux-swaponoff util-linux-uuidgen python3-blivet \
                   xrandr glibc-charmaps glibc-localedatas \
                   python3-pytz python3-langtable libpwquality \
                   python3-ntplib libgnomekbd libtimezonemap \
                   procps python3-prctl rsync glibc-utils python3-pid \
                   python3-ordered-set python3-wrapt python3-coverage \
                   python3-requests-file python3-requests-ftp \
                   python3-blivetgui librsvg librsvg-gtk bash \
                   python3-systemd python3-pydbus python3-simpleline \
                "

RDEPENDS_${PN} += "networkmanager libnmutil libnmglib libnmglib-vpn \
                   network-manager-applet \
"

SRC_URI = "git://github.com/rhinstaller/anaconda;protocol=https;branch=f28-release \
           file://wrlinux.py \
           file://81-edit-sudoers.ks \
           file://0001-do-not-support-po.patch \
           file://0002-widgets-Makefile.am-do-not-compile-doc.patch \
           file://0003-pyanaconda-flags.py-drop-selinux-module.patch \
           file://0004-add-package-site-dir-for-installclass-searching.patch \
           file://0005-do-not-load-the-system-wide-Xresources.patch \
           file://0006-tweak-iso-mount-dir-and-kernel-name.patch \
           file://0007-dnfpayload.py-customize-for-OE.patch \
           file://0008-Remove-unnecessary-noverifyssl-for-http-ftp-protocol.patch \
           file://0009-dynamic-detect-workable-locale.patch \
           file://0010-improve-thread-monitor.patch \
           file://0011-disable-audit.patch \
           file://0012-bootloader.py-Change-grub2-settings-to-match-oe-core.patch \
           file://0013-tweak-detect-kernel-version.patch \
           file://0014-tweak-grub-config-file-for-OE.patch \
           file://0015-Revert-Use-time.tzset-to-apply-timezone-changes-when.patch \
           file://0016-kickstart-not-support-Authselect-Firewall-Firstboot.patch \
           file://0017-invisible-help-button.patch \
           file://0018-disable-non-implemented-functions.patch \
           file://0019-support-UEFI-boot.patch \
           file://0020-do-not-verify-ssl-certification-by-default.patch \
           file://0021-tweak-default-nfs-mount-point.patch \
           file://0022-fix-quoted-empty-string-failed.patch \
           file://0023-do-not-support-ISO-hold-by-hard-drive-partitions.patch \
           file://0024-fix-cannot-stat-usr-share-gettext-gettext.h.patch \
           file://0025-tweak-bootloader-fs-type.patch \
           file://0026-support-timezone-setting.patch \
           file://0027-disable-ntp-support.patch \
           file://0028-do-not-support-manually-set-time.patch \
           file://0029-support-user-account-creation.patch \
           file://0030-detect-existence-of-Xorg.patch \
           file://0031-fix-write-network-conf-failed-while-liveinst.patch \
           file://0032-revert-commits-to-support-reboot-for-live-installs.patch \
           file://0033-text-repository-setting-do-not-support-local-ISO-fil.patch \
           file://0034-text-repository-setting-support-http-proxy.patch \
           file://0035-set-keyboard-xlayouts-with-us-by-default.patch \
           file://0036-do-not-support-network-setting-for-now.patch \
           file://0037-tweak-boot-storage-sanity-check.patch \
           file://0038-support-to-get-kickstart-from-network.patch \
           file://0039-support-authentication-for-kickstart.patch \
           file://0040-support-downloading-file-from-http-ftp-server-to-tar.patch \
           file://0041-live-install-supports-kickstart.patch \
           file://0042-support-initramfs-boot.patch \
           file://0043-fix-hang-while-installed-system-reboot.patch \
           file://0044-fix-installed-system-boot-from-encrypt-fs-failed.patch \
           file://0045-installation-destination-disable-iSCSI-network-disks.patch \
           file://0046-update-region-while-city-changes.patch \
           file://0047-remove-incorrect-prefix-of-addon-repo-url.patch \
           file://0048-fix-write-sysconfig-network-failed.patch \
           file://0049-pyanaconda-ui-gui-utils.py-tweak-mouse-arrow.patch \
           file://0050-tweak-search-location-of-new-kernel-pkg.patch \
           file://0051-always-write-fstab-after-install.patch \
           file://0052-invoke-grub-install-to-generate-efi-filesystem.patch \
           file://0053-do-not-support-closest-mirror.patch \
           file://0054-tweak-MAX_TREEINFO_DOWNLOAD_RETRIES.patch \
           file://0055-tweak-time-setting.patch \
           file://0056-Add-dracut-args-for-home-to-bootloader.patch \
           file://0057-do-not-customize-window-theme.patch \
           file://0058-tweak-product-short-name.patch \
           file://0059-disable-dmraid.patch \
           file://0060-tweak-shebang-of-bash.patch \
           file://0061-Tweak-label-name.patch \
           file://0062-Mount-var-volatile-during-install.patch \
           file://0063-update-fstab-by-appending.patch \
           file://0064-users.py-Fix-multilib-user-creation-error.patch \
           file://0065-bootloader.py-fix-UEFI-multilib-installation.patch \
           file://0066-enlarge-timeout-of-wait_for_modules.patch \
          "

SRCREV = "0b0d2f86b4323e6ee7a186bc8181ffe7553c9235"

FILES_${PN}-dbg += "${libexecdir}/anaconda/.debug ${PYTHON_SITEPACKAGES_DIR}/pyanaconda/.debug"
FILES_${PN}-staticdev += "${PYTHON_SITEPACKAGES_DIR}/pyanaconda/_isys.a"
FILES_${PN} = "/lib ${libdir} ${sysconfdir} ${bindir} ${sbindir} ${libexecdir} \
              ${datadir}/anaconda ${datadir}/applications ${datadir}/glade \
              ${PYTHON_SITEPACKAGES_DIR}/pyanaconda ${PYTHON_SITEPACKAGES_DIR}/log_picker \
              ${datadir}/themes \
"
FILES_${PN}-misc = "/usr/lib"
PACKAGES += "${PN}-misc"
RDEPENDS_${PN}-misc += "bash python3-core"

EXTRA_OECONF += "--disable-selinux \
         --with-sysroot=${PKG_CONFIG_SYSROOT_DIR} \
"

inherit distro_features_check
REQUIRED_DISTRO_FEATURES = "systemd x11"

inherit autotools-brokensep gettext python3native pkgconfig gobject-introspection

do_configure_prepend() {
    ( cd ${S}; STAGING_DATADIR_NATIVE=${STAGING_DATADIR_NATIVE} ${S}/autogen.sh --noconfigure)
}

do_install_append() {
    install -m 644 ${WORKDIR}/81-edit-sudoers.ks ${D}${datadir}/anaconda/post-scripts
    install -m 644 ${S}/widgets/src/resources/*.svg ${D}${datadir}/anaconda/pixmaps
    install -m 644 ${S}/widgets/src/resources/*.png ${D}${datadir}/anaconda/pixmaps
}

addtask do_setupdistro after do_patch before do_configure
do_setupdistro() {
    cp ${WORKDIR}/wrlinux.py ${S}/pyanaconda/installclasses/
}

python __anonymous () {
    if not bb.utils.contains("PACKAGE_CLASSES", "package_rpm", True, False, d):
        raise bb.parse.SkipPackage('Anaconda requires RPM packages to be the default in PACKAGE_CLASSES.')
}

