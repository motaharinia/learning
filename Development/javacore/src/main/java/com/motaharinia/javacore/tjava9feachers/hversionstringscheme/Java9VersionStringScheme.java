package com.motaharinia.javacore.tjava9feachers.hversionstringscheme;

/**
 *https://www.javatpoint.com/java-9-new-version-string-scheme
 *
 * Java version-string is a format that contains version specific information.
 * This version-string consists of major, minor, security and patch update releases.
 * In Java 9, a new version-string scheme is introduced that looks like the below.
 * $MAJOR.$MINOR.$SECURITY.$PATCH
 * رشته نسخه Java فرمی است که حاوی اطلاعات خاص نسخه است.
 * این رشته شامل نسخه های اصلی ، جزئی ، امنیتی و به روزرسانی پچ است.
 * در جاوا 9 ، یک طرح جدید رشته ای ارائه می شود که مانند شکل زیر است.
 * $MAJOR.$MINOR.$SECURITY.$PATCH
 *
 * $MAJOR:
 * This version number shows a major change in Java version.
 * It increases when a major change occurs.
 * Like Java 8 to Java 9. Each major release contains new features to the existing one.
 * $MAJOR:
 * این شماره نسخه یک تغییر عمده در نسخه جاوا را نشان می دهد.
 * با تغییر عمده رخ می دهد.
 * مانند Java 8 تا Java 9. هر نسخه اصلی شامل ویژگی های جدید موجود است.
 *
 * $MINOR:
 * This version number shows minor changes in Java version and increases with each minor update.
 * These updates can be bug fixes, revision to standard API etc.
 * if an update is released to Java 9, version-string format will be Java 9.1 (contains major and minor release number).
 * $MINOR:
 * این شماره نسخه تغییرات جزئی در نسخه جاوا را نشان می دهد و با هر بروزرسانی جزئی افزایش می یابد.
 * این به روزرسانی ها می توانند رفع اشکال ، تجدید نظر در API استاندارد و غیره باشند.
 * اگر به روزرسانی به Java 9 منتشر شود ، فرمت رشته آن جاوا 9.1 خواهد بود (شامل شماره انتشار بزرگ و جزئی).
 *
 * $SECURITY:
 * This version number represents security update and increase for each new security update.
 * Security updates can be critical fixes and security issues.
 * If any security update is released to Java 9, the version-string format will be like: Java 9.1.5 (contains major, minor and security release number).
 * $SECURITY:
 * این شماره نسخه نشان دهنده بروزرسانی امنیتی و افزایش برای هر به روزرسانی امنیتی جدید است.
 * به روزرسانی های امنیتی می تواند مشکلات اساسی و امنیتی باشد.
 * در صورت انتشار هرگونه بروزرسانی امنیتی به Java 9 ، فرمت رشته آن مانند: Java 9.1.5 (شامل شماره انتشار اصلی ، جزئی و امنیتی) است
 *
 * $PATCH:
 * This version number increases for each security and high-priority customer fixes, which has been tested together.
 * If a patch is released to Java 9, version-string format will be Java 9.1.5.1 (contains major, minor, security and patch release number).
 * $PATCH:
 * این شماره نسخه برای هر رفع اشکال امنیتی و اصلاحات اولویت بالای مشتری ، که با هم آزمایش شده اند ، افزایش می یابد.
 * اگر وصله ای به Java 9 منتشر شد ، فرمت رشته آن Java 9.1.5.1 خواهد بود (شامل شماره اصلی ، جزئی ، امنیتی و انتشار patch)
 *
 * The $MINOR and $SECURITY version numbers are set to zero, if the $MAJOR version number is incremented.
 * However, when the $MINOR version number is incremented, the subsequent $SECURITY version number need not be set to zero.
 * In Java 9, a Runtime.Version class is added to get Java version information.
 * This class contains methods and has following signature.
 * public static final class Runtime.Version extends Object implements Comparable<Runtime.Version>
 * در صورت افزایش تعداد نسخه MAJOR ، تعداد نسخه های MINOR و SECURITY صفر تنظیم شده است.
 * با این حال ، هنگامی که شماره نسخه MINOR افزوده می شود ، لازم نیست شماره نسخه بعدی SECURITY روی صفر تنظیم شود.
 * در جاوا 9 ، یک کلاس Runtime.Version برای به دست آوردن اطلاعات نسخه جاوا اضافه می شود.
 * این کلاس شامل متدهای است و دارای امضای زیر است
 * public static final class Runtime.Version extends Object implements Comparable<Runtime.Version>
 *
 *Java Runtime.Version Class Methods:
 * Optional<Integer>	build():
 * It returns the build number.
 * int	compareTo(Runtime.Version obj):
 * It compares this version to another.
 * int	compareToIgnoreOptional(Runtime.Version obj):
 * It compares this version to another disregarding optional build information.
 * boolean	equals(Object obj):
 * It determines whether this Version is equal to another object.
 * boolean	equalsIgnoreOptional(Object obj):
 * It determines whether this Version is equal to another disregarding optional build information.
 * int	hashCode():
 * It returns the hash code of this version.
 * int	major():
 * It returns the major version number.
 * int	major():
 * It returns the minor version number or zero if it was not set.
 * Optional<String>	optional():
 * It returns optional additional identifying build information.
 * static Runtime.Version	parse(String s):
 * It parses the given string as a valid version string containing a version number followed by pre-release and build information.
 * Optional<String>	pre():
 * It returns the optional pre-release information.
 * int	security():
 * It returns the security version number or zero if it was not set.
 * String	toString():
 * It returns a string representation of this version.
 * List<Integer>	version():
 * It returns an unmodifiable List of the integer numerals contained in the version number.
 * متد های کلاس Java Runtime.Version :
 * Optional<Integer>	build():
 * این تعداد ساخت را برمی گرداند.
 * int	compareTo(Runtime.Version obj):
 * این نسخه را با نسخه دیگری مقایسه می کند.
 * int	compareToIgnoreOptional(Runtime.Version obj):
 * این نسخه را با بی توجهی به اطلاعات دیگر در مورد ساخت اختیاری مقایسه می کند.
 * boolean	equals(Object obj):
 * تعیین می کند که آیا این نسخه برابر است با یک شیء دیگر.
 * boolean	equalsIgnoreOptional(Object obj):
 * این تعیین می کند که آیا این نسخه برابر است با سایر اطلاعات ساخت و ساز اختیاری.
 * int	hashCode():
 * کد هش این نسخه را برمی گرداند.
 * int	major():
 * این شماره نسخه اصلی را برمی گرداند.
 * int	minor():
 * اگر نسخه تنظیم نشده باشد ، نسخه نسخه جزئی یا صفر را برمی گرداند.
 * Optional<String>	optional():
 * این اطلاعات اضافی برای شناسایی اطلاعات ساخت را برمی گرداند.
 * static Runtime.Version	parse(String s):
 * این رشته داده شده را به عنوان یک رشته نسخه معتبر که حاوی شماره نسخه است و پس از انتشار و ساخت اطلاعات ، تجزیه می کند.
 * Optional<String>	pre():
 * این اطلاعات پیش از انتشار اختیاری را برمی گرداند.
 * int	security():
 * اگر تنظیم نشده باشد  نسخه امنیتی یا صفر را برمی گرداند.
 * String	toString():
 * بازنمایی رشته ای از این نسخه است.
 * List<Integer>	version():
 * این یک لیست اصلاح نشده از اعداد صحیح موجود در شماره نسخه را برمی گرداند.
 */
public class Java9VersionStringScheme {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();                 // Getting runtime version instance
        System.out.println("Current version is "+version);           // Getting current Java version
        System.out.println("Major version number "+version.major()); // Getting major version number
        System.out.println("Minor version number "+version.minor()); // Getting minor version number
        System.out.println("Security version number "+version.security());  // Getting security version number
        System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information
        System.out.println("Build Number "+version.build());                // Getting Optional build number
    }
}
