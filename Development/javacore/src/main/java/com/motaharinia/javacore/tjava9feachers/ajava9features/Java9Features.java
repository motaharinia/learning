package com.motaharinia.javacore.tjava9feachers.ajava9features;

/**
 * https://www.javatpoint.com/java-9-features
 *--------------------------------------------
 * نکات خودم برای استفاده از جاوا 9 در Intellij Idea:
 * تنظیم نسخه SDK در File>ProjectStructure>SDKs روی پوشه نصب شده جاوا نسخه9 در ویندوز
 * تنظیم نسخه جاوا در File>ProjectStructure>Project روی SDK تعریف شده نسخه9
 *تنظیم نسخه bytecode در File>Settings>Build, Execution, Deployment>Compiler>Java Compiler روی نسخه9
 * تنظیم نسخه جاوا در pom.xml پروژه در تگ java.version داخل تگ properties روی نسخه1.9
 *--------------------------------------------
 *
 * Java 9 Features
 * Oracle has released Java 9 with rich set of new features.
 * It includes various upgrades to the Java programming, JVM, Tools and libraries.
 * In this tutorial, we will discuss all the main features that are given below.
 *ویژگی های جاوا 9
 * اوراکل جاوا 9 را با مجموعه ای از ویژگی های جدید منتشر کرده است.
 * این شامل ارتقاء های مختلف به برنامه نویسی جاوا ، JVM ، ابزارها و کتابخانه ها است.
 * در این آموزش ، در مورد کلیه ویژگی های اصلی که در زیر آورده شده است صحبت خواهیم کرد.
 *
 * Platform Module System (Project Jigsaw)
 * Interface Private Methods
 * Try-With Resources
 * Anonymous Classes
 * @SafeVarargs Annotation
 * Collection Factory Methods
 * Process API Improvement
 * New Version-String Scheme
 * JShell: The Java Shell (REPL)
 * Process API Improvement
 * Control Panel
 * Stream API Improvement
 * Installer Enhancement for Microsoft windows and many more
 *
 *
 * Java Platform Module System (Project Jigsaw):
 * It is a new kind of Java programing component that can be used to collect Java code (classes and packages).
 * The main goal of this project is to easily scale down application to small devices.
 * In Java 9, JDK itself has divided into set of modules to make it more lightweight.
 * It also allows us to develop modular applications.
 * این نوع جدیدی از مؤلفه های برنامه نویسی جاوا است که می تواند برای جمع آوری کد جاوا (کلاس ها و پکیج ها) استفاده شود.
 * هدف اصلی این پروژه مقیاس بندی آسان برنامه ها در دستگاه های کوچک است.
 * در جاوا 9 ، JDK خود را به سبک تر از ماژول تقسیم شده است.
 * همچنین به ما امکان می دهد برنامه های مدولار توسعه دهیم.
 *
 * Interface Private Methods:
 * In Java 9, we can create private methods inside an interface.
 * Interface allows us to declare private methods that help to share common code between non-abstract methods.
 * Before Java 9, creating private methods inside an interface cause a compile time error.
 * متد های خصوصی رابط:
 * در جاوا 9 می توانیم متدهای خصوصی را درون یک رابط ایجاد کنیم.
 * رابط به ما این امکان را می دهد که متدهای خصوصی را برای کمک به اشتراک گذاری کد مشترک بین متدهای غیر انتزاعی اعلام کنیم.
 * قبل از جاوا 9 ، ایجاد متد های خصوصی در داخل رابط باعث ایجاد خطای زمان کامپایل می شود.
 *
 * Try-With Resources:
 * Java introduced try-with-resource feature in Java 7 that helps to close resource automatically after being used.
 * In other words, we can say that we don't need to close resources (file, connection, network etc) explicitly, try-with-resource close that automatically by using AutoClosable interface.
 * In Java 7, try-with-resources has a limitation that requires resource to declare locally within its block.
 * Try-With Resources:
 * جاوا ویژگیtry-with-resource را در Java 7 معرفی کرد که به شما کمک می کند تا پس از استفاده ، منابع را بطور خودکار ببندید.
 * به عبارت دیگر ، ما می توانیم بگوییم که نیازی به بستن منابع (پرونده ، اتصال ، شبکه و غیره) نداریم ، با استفاده از رابط AutoClosable بطور خودکار سعی کنید با منبع را ببندید.
 * در جاوا 7 ،try-with-resources محدودیتی دارد که به آن نیاز دارد تا منابع را به صورت محلی در بلاک خود اعلام کنند.
 *
 *Anonymous Classes Improvement:
 * Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
 * Using the diamond with anonymous classes was not allowed in Java 7.
 * In Java 9, as long as the inferred type is denotable, we can use the diamond operator when we create an anonymous inner class.
 * بهبود کلاسهای ناشناس:
 * جاوا 9 ویژگی جدیدی را معرفی کرد که به ما امکان استفاده از اپراتور الماس را با کلاس های ناشناس می دهد.
 * استفاده از الماس با کلاس های ناشناس در جاوا 7 مجاز نبود.
 * در جاوا 9 ، تا زمانی که نوع استنباطی قابل توصیف باشد ، می توانیم هنگام ایجاد یک کلاس داخلی ناشناس از عملگر الماس استفاده کنیم.
 *
 *Java @SafeVarargs Annotation:
 * It is an annotation which applies on a method or constructor that takes varargs parameters.
 * It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
 * It was included in Java 7 and can only be applied on
 * Final methods
 * Static methods
 * Constructors
 *انوتیشن SafeVarargs جاوا
 * این انوتیشن است که در مورد یک متد یا سازنده که پارامترهای varargs را می گیرد صدق می کند.
 * استفاده می شود تا اطمینان حاصل شود که این روش عملیات ناامن را بر روی پارامترهای varargs خود انجام نمی دهد.
 * این در جاوا 7 گنجانده شده است و فقط قابل استفاده است
 * متدهای نهایی
 * متدهای استاتیک
 * سازندگان
 *
 *
 * Java Collection Factory Methods:
 * Factory methods are special type of static methods that are used to create unmodifiable instances of collections.
 * It means we can use these methods to create list, set and map of small number of elements.
 * It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException
 * متد های Collection Factory جاوا:
 *متد های  Factory نوع خاصی از متد های استاتیک است که برای ایجاد نمونه های غیر قابل اصلاح از مجموعه ها استفاده می شود.
 * این بدان معنی است که ما می توانیم از این متدها برای ایجاد لیست ، ست و مپ با تعداد کمی از عناصر استفاده کنیم.
 * غیر قابل اصلاح است ، بنابراین با اضافه کردن عنصر جدید ، java.lang.UnsupportedOperationException پرتاب خواهد شد
 *
 * Java Process API Improvement:
 * Java has improved its process API in Java 9 version that helps to manage and control operating system processes.
 * In earlier versions, it was complex to manage and control operating system processes by using Java programming.
 * Now, new classes and interfaces are added to perform this task.
 * بهبود  API پردازش جاوا:
 * جاوا API پردازش خود را در نسخه Java 9 بهبود داده است که به مدیریت و کنترل پردازشهای سیستم عامل کمک می کند.
 * در نسخه های قبلی ، مدیریت و کنترل پردازشهای سیستم عامل با استفاده از برنامه نویسی جاوا پیچیده بود.
 * اکنون کلاس ها و رابط های جدیدی برای انجام این کار اضافه می شوند.
 *
 * Java New Version-String Scheme:
 * Java version-string is a format that contains version specific information.
 * This version-string consists of major, minor, security and patch update releases.
 * In Java 9, a new version-string scheme is introduced.
 * طرح جدید رشته-نسخه جاوا:
 *رشته-نسخه جاوا فرمی است که حاوی اطلاعات خاص نسخه است.
 * این رشته شامل نسخه های اصلی ، جزئی ، امنیتی و به روزرسانی پچ است.
 * در جاوا 9 ، طرح جدید رشته ای معرفی می شود.
 *
 * JShell: The Java Shell (REPL):
 * It is an interactive Java Shell tool, it allows us to execute Java code from the shell and shows output immediately.
 * JShell is a REPL (Read Evaluate Print Loop) tool and run from the command line.
 * It is benificial, if we want to test our business logic and get result immediately.
 * JShell: The Java Shell (REPL):
 * این یک ابزار Java Shell تعاملی است ، به ما امکان می دهد تا کد جاوا را از پوسته اجرا کنیم و فوراً خروجی را نشان می دهد.
 * ابزار JShell ابزاری REPL (Read Evaluate Print Loop) است و از خط فرمان اجرا می شود.
 * اگر بخواهیم منطق تجارت خود را آزمایش کنیم و فوراً نتیجه بگیریم ، فایده ای دارد.
 *
 * Java 9 Control Panel:
 * Java control panel is used to control Java applications that are embedded in browser.
 * This control panel maintains the settings that manage Java application embedded in browser.
 * In Java 9, control panel was rewritten as a JavaFX application and the storage location has changed
 * کنترل پنل Java 9:
 * کنترل پنل جاوا برای کنترل برنامه های جاوا که در مرورگر تعبیه شده اند ، استفاده می شود.
 * این کنترل پنل تنظیمات مدیریت برنامه جاوا را که در مرورگر تعبیه شده است ، حفظ می کند.
 * در جاوا 9 ، صفحه کنترل به عنوان یک برنامه JavaFX بازنویسی شد و مکان ذخیره سازی تغییر کرده است
 *
 * Java 9 Stream API Improvement
 * In Java 9, Stream API has improved and new methods are added to the Stream interface.
 * TakeWhile, dropWhile and ofNullable, and one overloaded iterate method are added to perform operations on stream elements.
 * بهبود API Java 9 Stream
 * در جاوا 9 ، Stream API بهبود یافته و متدهای جدیدی به رابط Stream اضافه شده است.
 * متدهای TakeWhile ، dropWhile و of Nullable ، و یک متد overloaded برای انجام عملیات روی عناصر جریان اضافه شده است.
 *
 * Installer Enhancement for Microsoft windows:
 * Java 9 includes improved version of Microsoft Windows installer and added the following feature.
 * This installer allows us to enable and disable web deployement.
 * We can enable web deployment by selecting Custom Setup, install and click on the checkbox from the welcome page of the installer.
 * تقویت کننده نصب برای ویندوز مایکروسافت:
 * جاوا 9 شامل نسخه بهبود یافته نصب کننده مایکروسافت ویندوز است و ویژگی زیر را اضافه کرده است.
 * این نصب کننده به ما امکان فعال سازی و غیرفعال کردن استقرار وب را می دهد.
 * ما می توانیم با انتخاب Custom Setup ، نصب وب را فعال کنیم ، از صفحه استقبال از نصب کننده ، روی کادر تأیید نصب و کلیک کنید.
 *
 *Installer Enhancements for macOS:
 * Java 9 included the following features to the macOS installer.
 * CPU Version Availability:
 * It provides notification on next CPU availability after uninstalling the current CPU version.
 * User Experience:
 * It enhanced user experience while updating the JRE.
 * پیشرفتهای نصب کننده برای macOS:
 * جاوا 9 ویژگی های زیر را در اختیار نصب کننده macOS قرار داد.
 * در دسترس بودن نسخه CPU:
 * پس از حذف نسخه فعلی CPU ، اطلاعیه ای درباره در دسترس بودن CPU ارائه می دهد.
 * تجربه ی کاربر:
 * این تجربه کاربر را هنگام بروزرسانی JRE افزایش داد.
 *
 * Add More Diagnostic Commands:
 * Java 9 has added some new commands to improve the diagnose issues.
 * These diagnostic command are used to diagnose Hotspot and JDK.
 * The Java jcmd utility can be used to send diagnostic command requests to a running Java Virtual Machine (JVM).
 * دستورات تشخیصی بیشتری اضافه کنید:
 * جاوا 9 برای بهبود مشکلات تشخیص دستورات جدیدی را اضافه کرده است.
 * این دستورالعمل تشخیصی برای تشخیص Hotspot و JDK استفاده می شود.
 * از ابزار جاوا jcmd می توان برای ارسال درخواست دستور تشخیصی به دستگاه مجازی جاوا در حال اجرا (JVM) استفاده کرد.
 *
 * Remove Launch-Time JRE Version Selection:
 * Java 9 has removed JRE (Java Runtime Environment) version selection at launch time.
 * Now days, modern application has own active installer that further contains methods to manage the JRE. that?s why JRE version selection has been removed.
 *حذف نسخه پرتاب JRE نسخه:
 * جاوا 9 انتخاب نسخه JRE (Java Runtime Environment) را در زمان راه اندازی حذف کرده است.
 *امروزه، برنامه مدرن دارای نصب کننده فعال خود است که بیشتر شامل متد هایی برای مدیریت JRE است. به همین دلیل انتخاب نسخه JRE حذف شده است.
 *
 * Remove the JVM TI hprof Agent:
 * Java 9 has removed the hprof from the existed JDK. It was not intended to be a production tool.
 * Some better featured of the hprof agent have been superseded for better alternatives.
 *حذف  JVM TI hprof Agent:
 * جاوا 9 hprof را از JDK موجود حذف کرده است. قرار نبود ابزاری برای تولید باشد.
 * برخی از ویژگی های بهتر نماینده hprof برای جایگزین های بهتر لغو شده اند.
 *
 * Remove the Jhat Tool:
 * Java has removed the jhat tool in its new release JDK 9.
 * it was an experimental and unsupported tool added in JDK 6, now has outdated.
 * حذف ابزار Jhat:
 * جاوا در نسخه جدید JDK 9 ابزار jhat را حذف کرده است.
 * این یک ابزار آزمایشی و پشتیبانی نشده بود که در JDK 6 اضافه شده است ، اکنون قدیمی است.
 *
 * Validate JVM Command-Line Flag Arguments:
 * Java validates arguments to all numeric JVM command-line flags to avoid failure.
 * If arguments are invalid or out-of-range, it displays an appropriate error message.
 * Constraint check has been implemented for range and optional that require numeric value.
 *اعتبارسنجی آرگومانهای پرچم خط  JVM Command-Line  :
 * جاوا برای جلوگیری از خرابی ،Arguments مربوط به همه پرچم های خط فرمان JVM را اعتبارسنجی می کند.
 * اگر آرگومان نامعتبر یا خارج از محدوده باشد ، یک پیام خطای مناسب را نشان می دهد.
 * بررسی محدودیت برای دامنه و اختیاری انجام شده است که به ارزش عددی نیاز دارند.
 *
 * jlink: The Java Linker:
 * jlink is a tool that can be used to assemble set of modules into a runtime image.
 * It also allows us to assemble module's dependencies into the custom runtime image.
 * Link time is a phase between the compile and runtime, jlink works there for linking and assemble modules to runtime image.
 * jlink: لینک دهنده جاوا:
 * ابزار jlink ابزاری است که می تواند برای جمع آوری مجموعه ای از ماژول ها به یک تصویر در زمان اجرا استفاده شود.
 * همچنین این امکان را به ما می دهد تا وابستگی های ماژول را در تصویر زمان اجرا سفارشی جمع کنیم.
 * زمان لینک فاز بین کامپایل و زمان اجرا است ، jlink در آنجا برای پیوند و مونتاژ ماژول ها به تصویر زمان اجرا کار می کند.
 *
 * Datagram Transport Layer Security (DTLS):
 * DTLS is a protocol which is used to construct TLS over datagram.
 * JSSE (Java Secure Socket Extension) API support DTLS protocol and both versions 1.0 and 1.2.
 * The TLS protocol requires a TCP, So it can't be used to secure unreliable datagram traffic.
 * Datagram Transport Layer Security (DTLS):
 * DTLS پروتکلی است که برای ساخت TLS بر روی دیتاگرام استفاده می شود.
 * افزونه JSSE (Java Secure Socket Extension) API از پروتکل DTLS و هر دو نسخه 1.0 و 1.2 پشتیبانی می کند.
 * پروتکل TLS به TCP نیاز دارد ، بنابراین نمی توان از آن برای تأمین ترافیک غیرقابل اعتماد دیتاگرام استفاده کرد
 *
 * TLS Application-Layer Protocol Negotiation Extension:
 * This extension allows the client and server in TLS connection to negotiate for application protocol.
 * Client server communicate and inform to each other about supported application protocols.
 * The application protocol negotiation accomplished within the TLS handshake.
 * برنامه افزودنی مذاکرات پروتکل لایه کاربرد TLS:
 * این برنامه افزودنی اجازه می دهد تا مشتری و سرور در اتصال TLS برای پروتکل برنامه مذاکره کنند.
 * سرور مشتری در مورد پروتکل های برنامه پشتیبانی شده به یکدیگر ارتباط برقرار کرده و به هم اطلاع می دهد.
 * مذاکره پروتکل برنامه با دست دادن TLS انجام میشود.
 *
 * OCSP Stapling for TLS:
 * OCSP (Online Certificate Status Protocol) helps to the server in a TLS connection to check for a revoked X.509 certificate revocation.
 * During TLS handshaking server contact an OCSP responder for the certificate.
 * Server then staple the revocation information tot the certificate at client.
 *پروتوکل OCSP Stapling برای TLS:
 * پروتوکل OCSP Stapling (پروتکل وضعیت صدور گواهینامه آنلاین) به اتصال دهنده TLS به سرور کمک می کند تا در مورد ابطال گواهی X.509 ابطال شده بررسی کند.
 * در طول دست دادن TLS سرور با یک پاسخ دهنده OCSP برای گواهی تماس میگیرد.
 * سپس سرور اطلاعات ابطال این گواهی را در مشتری تکمیل می کند
 *
 * DRBG-Based SecureRandom Implementation:
 * Java 9 includes the functionality of DRBG (Deterministic Random Bit Generator) mechanisms as specified in NIST SP 800-90Ar1 in the SecureRandom API.
 * The DRBG mechanisms use modern algorithms as strong as SHA-512 and AES-256.
 * Each of these mechanisms can be configured with different security strengths and features to match user requirements.
 * پیاده سازی SecureRandom مبتنی بر DRBG:
 * جاوا 9 شامل عملکرد مکانیسم های DRBG (Deterministic Random Bit Generator) است که در NIST SP 800-90Ar1 در API SecureRandom مشخص شده است.
 * مکانیزم DRBG از الگوریتم های مدرن با قدرت SHA-512 و AES-256 استفاده می کند.
 * هر یک از این مکانیسم ها می توانند با نقاط قوت و ویژگی های امنیتی مختلف تنظیم شوند تا با نیازهای کاربر مطابقت داشته باشند.
 *
 * Disable SHA-1 Certificates:
 * The security configuration of the JDK has improved.
 * It provides more flexible mechanism to disable X.509 certificate having SHA-1-based signatures.
 * The jdk.certpath.disabledAlgorithms security property is enhanced with several new constraints that allow greater control over the types of certificates that can be disabled.
 * غیرفعال کردن گواهینامه های SHA-1:
 * پیکربندی امنیتی JDK بهبود یافته است.
 * این سازوکار انعطاف پذیرتر را برای غیرفعال کردن گواهی X.509 با امضاهای مبتنی بر SHA-1 فراهم می کند.
 * ویژگی امنیتی jdk.certpath.disabledAlgorithms با چندین محدودیت جدید افزایش یافته است که امکان کنترل بیشتر بر روی انواع گواهینامه های غیرفعال را فراهم می آورد
 *
 * Create PKCS12 Keystores by Default:
 * The default keystore type has modified from JKS to PKCS12.
 * The PKCS is an extensible, standard, and widely supported format for storing cryptographic keys.
 * It improves confidentiality by storing private keys, trusted public key certificates etc.
 * This feature also opens opportunities for interoperability with other systems such as Mozilla, Microsoft's Internet Explorer, and OpenSSL that support PKCS12.
 *ایجاد کلیدهای اصلی PKCS12 به صورت پیش فرض:
 * نوع پیش فرض کلید اصلی از JKS به PKCS12 تغییر یافته است.
 * یک PKCS یک فرمت قابل توسعه ، استاندارد و گسترده برای ذخیره سازی کلیدهای رمزنگاری است.
 * با ذخیره کردن کلیدهای خصوصی ، گواهینامه های کلید عمومی عمومی و غیره ، محرمانه را بهبود می بخشد.
 * این ویژگی همچنین فرصت هایی را برای همکاری با سایر سیستم ها مانند Mozilla ، Internet Explorer Microsoft و OpenSSL که از PKCS12 پشتیبانی می کنند ، باز می کند.
 *
 * SHA-3 Hash Algorithms:
 * New Java version supports SHA-3 cryptographic hash functions.
 * The java.security.MessageDigest API supports various algorithms like: SHA3-224, SHA3-256, SHA3-384, and SHA3-512.
 * The following providers support SHA-3 algorithm enhancements:
 * SUN provider: SHA3-224, SHA3-256, SHA3-384, and SHA3-512
 * OracleUcrypto provider: SHA-3 digests supported by Solaris 12.0
 * الگوریتم های SHA-3 Hash:
 * نسخه جاوا جدید از توابع هش رمزنگاری SHA-3 پشتیبانی می کند.
 * و java.security.MessageDigest  API از الگوریتم های مختلفی مانند: SHA3-224 ، SHA3-256 ، SHA3-384 و SHA3-512 پشتیبانی می کند.
 * ارائه دهندگان زیر از پیشرفت های الگوریتم SHA-3 پشتیبانی می کنند:
 * ارائه دهنده SUN: SHA3-224 ، SHA3-256 ، SHA3-384 و SHA3-512
 * ارائه دهنده OracleUcrypto: هضم SHA-3 توسط Solaris 12.0 پشتیبانی می شود
 *
 * Deprecate the Java Plug-in:
 * Java Plug-in and applet technologies has deprecate in JDK 9.
 * In future releases, these technologies will be removed.
 * Java Plug-in is require to run applet and JavaFX applications in web browser.
 * It is recommended to rewrite applications as Java Web applications.
 *مستهلک شدن Plug-in جاوا:
 * افزونه های جاوا پلاگین و اپلت در JDK 9 مستهلک شده است.
 * در نسخه های آینده این فناوری ها حذف می شوند.
 * افزونه Java برای اجرای برنامه های برنامه های کاربردی و JavaFX در مرورگر وب لازم است.
 * توصیه می شود که برنامه ها را به عنوان برنامه های Java Web applications بازنویسی کنید
 *
 * Enhanced Java Control Panel:
 * Java control panel has improved, information is easier to locate, a search field is available and modal dialog boxes are no longer used.
 * Note that the location of some options has changed from previous versions of the Java Control Panel.
 * کنترل پنل پیشرفته جاوا:
 * کنترل پنل جاوا بهبود یافته است ، یافتن اطلاعات آسان تر است ، یک قسمت جستجو در دسترس است و جعبه های گفتگوی modal دیگر استفاده نمی شود.
 * توجه داشته باشید که مکان برخی از گزینه ها نسبت به نسخه های قبلی کنترل پنل جاوا تغییر کرده است.
 *
 * Modular Java Application Packaging:
 * Java new version integrates features from Project Jigsaw into the Java Packager, including module awareness and custom runtime creation.
 * We can use jlink tool to create smaller packages.
 * بسته بندی برنامه ماژولار جاوا:
 * نسخه جدید جاوا ویژگی های پروژه Jigsaw را در Java Packager شامل آگاهی از ماژول و ایجاد زمان اجرا سفارشی ادغام کرده است.
 * ما می توانیم از ابزار jlink برای ایجاد بسته های کوچکتر استفاده کنیم.
 *
 * Simplified Doclet API:
 * The old Doclet API is replaced with a new simplified API that leverages other standard, existing APIs.
 * In Java 9, the standard doclet has been rewritten to use the new Doclet API.
 * آسان شده Doclet API:
 * نسخه API Document قدیمی Doclet با یک API ساده شده جدید جایگزین می شود که از سایر استاندارد ها ، API های موجود استفاده می کند.
 * در جاوا 9 ، دستورالعمل استاندارد برای استفاده از API جدید Doclet بازنویسی شده است.
 *
 * Compiler Control:
 * Now, we can control JVM compilation through compiler directive options.
 * The level of control is runtime-manageable and method-specific.
 * Compiler Control supersedes, and is backward compatible, with CompileCommand.
 * کنترل کامپایلر:
 * اکنون ، ما می توانیم compilation JVM را از طریق گزینه های راهنمای کامپایلر کنترل کنیم.
 * سطح كنترلruntime-manageable و method-specific است.
 * کنترل کامپایلر با CompileCommand جایگزین و سازگار با قبل است
 *
 * Segmented Code Cache:
 * Code cache is divided into distinct segments.
 * Each segment is a compiled code and improve performance and enable extensibility.
 * بخش حافظه نهان کد:
 * حافظه نهان کد به بخش های مشخص تقسیم می شود.
 * هر بخش یک کد کامپایل شده است و عملکرد را بهبود می بخشد و قابلیت توسعه را فعال می کند
 *
 * Unified JVM Logging:
 * Java new version introduces a common logging system for all components of the JVM.
 * لاگینگ JVM یکپارچه:
 * نسخه جدید جاوا یک سیستم لاگینگ مشترک برای همه مؤلفه های JVM را معرفی می کند.
 *
 * Remove GC Combinations Deprecated in JDK 8:
 * Deprecated garbage collector combination has removed from JDK 9.
 * Following are the garbage collector combination that are not supported in new version.
 * DefNew + CMS
 * ParNew + SerialOld
 * Incremental CMS
 * Unified GC Logging
 * Garbage collection logging is reimplemented by using the unified JVM logging framework.
 * حذف ترکیبات GC مستهلک در JDK 8:
 * ترکیب جمع آوری زباله از JDK 9 حذف شده است.
 * در زیر مجموعه های جمع آوری زباله که در نسخه جدید پشتیبانی نمی شوند ، آورده شده اند.
 * DefNew + CMS
 * ParNew + SerialOld
 * Incremental CMS
 * Unified GC Logging
 *لاگینگ جمع آوری زباله با استفاده از چارچوب یکپارچه لاگینگ JVM مجدداً پیاده سازی شده است
 *
 * Deprecate the Concurrent Mark Sweep (CMS) Garbage Collector:
 * The Concurrent Mark Sweep (CMS) garbage collector is deprecated.
 * It issue a warning message when requested on the command line.
 * The Garbage-First (G1) garbage collector is intended to be a replacement for most uses of CMS.
 *مستهلک شدن جمع آوری زباله Concurrent Mark Sweep (CMS):
 * جمع آوری زباله Concurrent Mark Sweep (CMS)  مستهلک می شود.
 * در صورت درخواست در خط فرمان ، یک پیام هشدار دهنده صادر می کند.
 * جمع آوری زباله Garbage-First (G1) در نظر گرفته شده است که جایگزینی برای اکثر موارد استفاده از CMS است
 *
 * Process API Updates:
 * Process API has improved with methods and interfaces.
 * This API handles the operating system processes.
 * The ProcessHandle class is used to get process's native process ID, arguments, command, start time, accumulated CPU time, user, parent process, and descendants.
 *به روزرسانی API پردازش:
 * API پردازش با متد ها و رابط ها بهبود یافته است.
 * این API پردازشهای سیستم عامل را اداره می کند.
 * کلاس ProcessHandle برای بدست آوردن شناسه پردازش بومی ، آرگومان ها ، دستورات ، زمان شروع ، زمان CPU انباشته شده ، کاربر ، پردازش والدین و فرزندان استفاده می شود
 *
 * Compact Strings:
 * In new version, Java uses more space-efficient internal representation for strings.
 * In previous versions, the String was stored in char array and takes two bytes for each character.
 * Now, the new internal presentation of the string is a byte class.
 * رشته های فشرده:
 * در نسخه جدید ، جاوا از نمایشگر داخلی با کارآیی بیشتر فضا برای رشته ها استفاده می کند.
 * در نسخه های قبلی ، String در کاراکتر ذخیره شده بود و برای هر کاراکتر دو بایت می گیرد.
 * اکنون ، نمایش داخلی جدید رشته ، یک کلاس byte است
 *
 * Platform Logging API and Service:
 * The java.util.logging API helps to log messages, together with a service interface for consumers.
 * An application or library can provide implementation of this service to log messages to logging framework.
 * It uses default implementation, if no implementation is provided.
 * خدمات و API مربوط به Platform Logging:
 * رابط java.util.logging به شما کمک می کند تا پیام ها را بهمراه یک رابط سرویس برای مصرف کنندگان وارد کنید.
 * یک برنامه یا کتابخانه می تواند اجرای این سرویس را برای ورود پیام به چهارچوب ورود به سیستم فراهم کند.
 * در صورت عدم ارائه برنامه ، از اجرای پیش فرض استفاده می کند
 *
 * More Concurrency Updates:
 * More concurrency updates are added to JDK 9.
 * These updates are improved CompletableFuture API and interoperable publish-subscribe framework.
 * به روزرسانی های همزمان بیشتر:
 * به روزرسانی های همزمان بیشتری به JDK 9 اضافه می شود.
 * این به روز رسانی ها  API CompletableFuture و و چارچوب publish-subscribe قابل تعامل را بهبود داده اند.
 *
 * XML Catalogs:
 * Standard XML catalog API is added which supports the organization for the Advancement of OASIS (Structured Information Standards) XML Catalogs version 1.1.
 * This API consists of catalog-resolver which can be used as an intrinsic with the JAXP processors.
 *XML کاتالوگ های:
 * رابط API كاتالوگ XML استاندارد اضافه شده است كه از سازمان برای پیشرفت OASIS (استاندارد اطلاعات ساختاری) XML Catalogs نسخه 1.1 پشتیبانی می كند.
 * این API متشکل از catalog-resolver  است که می تواند به عنوان یک ذاتی در پردازنده های JAXP استفاده شود.
 *
 * Convenience Factory Methods for Collections:
 * This feature makes easier to create instances of collection and maps with small number of elements.
 * Some new methods are added to List, Set and Map to create immutable instances. For example:
 * Set<String> alphabet = Set.of(1, 2, 3);
 * متد های کارخانه رفاه برای مجموعه ها:
 * این ویژگی ایجاد نمونه های کالکشن و نقشه هایی با تعداد کم عنصر را آسان تر می کند.
 * برخی از متد های جدید به لیست ، ست و نقشه اضافه شده اند تا نمونه های غیرقابل تغییر ایجاد کنند. مثلا:
 * Set<String> alphabet = Set.of(1, 2, 3);
 *
 * Enhanced Deprecation:
 * The @Deprecated annotation is improved to provide better information about the status and intended disposition of an API. Following new elements are added.
 * @Deprecated(forRemoval=true):
 * It indicates that the API will be removed from the future release of Java.
 * @Deprecated(since="version"):
 * It contains the Java SE version string that indicates deprecared API element for Java 9.
 *پیشرفت استهلاک :
 * انوتیشن Deprecated برای ارائه اطلاعات بهتر در مورد وضعیت و قرار گیری در نظر گرفته شده از API بهبود یافته است. عناصر جدید زیر اضافه می شوند.
 * @ Deprecated(forRemoval=true):
 * این نشان می دهد که API از نسخه بعدی جاوا حذف می شود.
 * @ Deprecated(since="version"):
 * این شامل رشته نسخه Java SE است که نشانگر عنصر API محاسبه شده برای Java 9 است.
 *
 * Spin-Wait Hints:
 * It enables Java code to inform that a spin loop is executing.
 * A spin loop repeatedly checks to see if a condition is true,
 * such as when a lock can be acquired, after which some computation can be safely performed followed by the release of the lock.
 * This API is purely a hint, and carries no semantic behavior requirements.
 *نکات Spin-Wait:
 * این کد جاوا را قادر می سازد که یک حلقه چرخش را اجرا کند.
 * یک حلقه چرخش به طور مکرر بررسی می کند که آیا یک وضعیت صحیح است ،
 * مانند زمانی که می توان قفل را بدست آورد ، پس از آن با محاسبه با اطمینان برخی محاسبات به دنبال انتشار قفل انجام می شود.
 * این API کاملاً یک اشاره است و هیچ الزامات رفتار معنایی ندارد.
 *
 * Filter Incoming Serialization Data:
 * It helps to filter date of incoming stream of object-serialization data to improve both robustness and security.
 * Object-serialization clients can validate their input more easily, and exported Remote Method Invocation (RMI) objects can validate invocation arguments more easily as well.
 * Serialization clients implement a filter interface that is set on an ObjectInputStream.
 * For RMI, the object is exported through a RemoteServerRef that sets the filter on the MarshalInputStream to validate the invocation arguments as they are unmarshalled.
 *فیلتر کردن داده های سریال سازی ورودی :
 * این کمک می کند تا تاریخ جریان ورودی از داده های سریال سازی شی را فیلتر کنید تا هم از استحکام و امنیت استفاده کند.
 * مشتریان سریال سازی شی می توانند ورودی خود را با سهولت بیشتری اعتبار دهند و اشیاء فراخوان از راه دور روش صادر شده (RMI) صادر شده می توانند استدلالهای فراخوانی را آسان تر نیز اعتبارسنجی کنند.
 * مشتریان سریال سازی یک رابط فیلتر را اجرا می کنند که روی یک ObjectInputStream تنظیم شده است.
 * برای RMI ، جسم از طریق RemoteServerRef صادر می شود که فیلتر را بر روی MarshalInputStream قرار می دهد تا استدلال های فراخوانی را تأیید کند ، زیرا آنها غیرمجاز هستند.
 *
 * Stack-Walking API:
 * Java included a stack-walking API that allows lazy access of information in stack.
 * It also allows easy filtering of information.
 * This stack-walking API allows access to Class objects, if the stack walker is configured.
 * Stack-Walking API:
 * جاوا شامل یک API stack-walking است که اجازه می دهد تا دسترسی تنبل به اطلاعات در پشته فراهم شود.
 * همچنین امکان فیلتر آسان اطلاعات را نیز فراهم می آورد.
 * در صورت پیکربندی stack walker  ، این API stack-walking  امکان دسترسی به اشیاء Class را فراهم می کند.
 *
 * Parser API for Nashorn:
 * Java added Parser API which allows use to Enable applications, in server-side framework, particular IDEs etc..
 * It can be used to parse ECMAScript code from a string, URL, or file with methods of Parser class.
 * Methods of this class return an object of CompilationUnitTree class, which represents ECMAScript code as an abstract syntax tree.
 * Nashorn parser API is located into jdk.nashorn.api.tree package.
 * رابط Parser API برای Nashorn:
 * جاوا پارسر API را اضافه کرد که امکان استفاده از برنامه های فعال شده را در چارچوب سمت سرور ، IDE های خاص و غیره فراهم  کند.
 * می توان برای تجزیه کد ECMAScript از یک رشته ، URL یا فایل با متدهای کلاس پارسر استفاده کرد.
 * متدهای این کلاس یک شیء از کلاس CompilationUnitTree را باز می گرداند ، که کد ECMAScript را به عنوان یک درخت نحو انتزاعی نشان می دهد.
 * رابط API parser Nashorn در بسته jdk.nashorn.api.tree قرار دارد.
 *
 *
 * Implement Selected ECMAScript 6 Features in Nashorn:
 * Java added some new features to Nashorn in the 6th edition of ECMA-62.
 * Following are the Implemented features.
 * Template strings
 * let, const, and block scope
 * Iterators and for..of loops
 * Map, Set, WeakMap, and WeakSet
 * Symbols
 * Binary and octal literals
 * پیاده سازی ECMAScript 6 انتخاب شده در Nashorn:
 * جاوا در نسخه ششم ECMA-62 ویژگی های جدیدی به Nashorn اضافه کرد.
 * در زیر ویژگی های پیاده سازی شده وجود دارد.
 * Template strings
 * let, const, and block scope
 * Iterators and for..of loops
 * Map, Set, WeakMap, and WeakSet
 * Symbols
 * Binary and octal literals
 *
 * Prepare JavaFX UI Controls and CSS APIs for Modularization:
 * Java included public APIs for CSS functionality and JavaFX UI controls.
 * These functionalities previously available only through internal packages, but now can be accessible because of modular approach.
 * A new package javafx.scene.control.skin is included that consists of a set of classes to provide a default implementation of each UI (User Interface) control.
 *آماده سازی کنترل های UI JavaFX و API های CSS را برای Modularization:
 * جاوا شامل API های عمومی برای عملکرد CSS و کنترل UI JavaFX بود.
 * این ویژگی ها قبلاً فقط از طریق بسته های داخلی قابل دسترسی بودند ، اما اکنون به دلیل رویکرد ماژولار قابل دسترسی هستند.
 * بسته جدید javafx.scene.control.skin گنجانده شده است که شامل مجموعه ای از کلاس ها است تا اجرای پیش فرض هر کنترل UI (رابط کاربری) را ارائه دهد
 *
 * BeanInfo Annotations:
 * The @beaninfo Javadoc tag is replaced with the annotation types JavaBean, BeanProperty, and SwingContainer.
 * We can use these attributed directly in the Bean class.
 * It also allows auto removal for automatically created classes and set the corresponding feature attributes during BeanInfo generation at runtime.
 *انوتیشنهای BeanInfo:
 * برچسبbeaninfo Javadoc@ با انواع انوتیشن JavaBean ، BeanProperty و SwingContainer جایگزین می شود.
 * ما می توانیم از اینها به طور مستقیم در کلاس Bean استفاده کنیم.
 * همچنین امکان حذف خودکار برای کلاسهای ایجاد شده به صورت خودکار و تنظیم ویژگیهای مربوطه در طول نسل BeanInfo را در زمان اجرا فراهم می کند.
 *
 * TIFF Image I/O:
 * TIFF (Tag Image File Format) is added for reading and writing as standard.
 * It is located into the package javax.imageio.
 * One more new package javax.imageio.plugins.tiff is added to provide classes that simplify the optional manipulation of TIFF metadata.
 *تصویر TIFF I/O:
 * فرمت TIFF (قالب تصویر پرونده Tag) برای خواندن و نوشتن به صورت استاندارد اضافه شده است.
 * در بسته javax.imageio قرار دارد.
 * یک بسته جدید دیگر javax.imageio.plugins.tiff اضافه شده است تا کلاسهایی را فراهم کند که دستکاری اختیاری از ابرداده TIFF را ساده می کنند.
 *
 * HiDPI Graphics on Windows and Linux:
 * Automatically scales and sizes AWT and Swing components for High Dots Per Inch (HiDPI) displays on Windows and Linux.
 * The JDK already supports HiDPI "retina displays" on OS X.
 * Prior to this release, on Windows and Linux, Java applications were sized and rendered based on pixels,
 * even on HiDPI displays that can have pixel densities two to three times as high as traditional displays.
 * This led to GUI components and windows that were too small to read or use.
 * Graphics HiDPI در ویندوز و لینوکس:
 * به صورت خودکار مقادیر AWT و اجزای Swing برای نمایشگرهای پر نقطه در هر اینچ (HiDPI)  بر روی ویندوز و لینوکس مقیاس و اندازه میشوند.
 * کیت JDK از قبل از HiDPI "retina displays"  در سیستم عامل OS X پشتیبانی می کند.
 * قبل از این نسخه ، در ویندوز و لینوکس ، برنامه های جاوا بر اساس پیکسل ها اندازه گیری و ارائه شدند ،
 * حتی در نمایشگرهای HiDPI که دارای تراکم پیکسلی هستند دو تا سه برابر بیشتر از نمایشگرهای سنتی.
 * این امر منجر به مؤلفه های GUI و پنجره هایی شد که برای خواندن یا استفاده از آن ها بسیار کوچک بودند.
 *
 * Platform-Specific Desktop Features:
 * Some new methods are added to the java.awt.Desktop class.
 * These methods provides the following features.
 * Show custom About and Preferences windows.
 * Handle requests to open or print a list of files.
 * Handle requests to open a URL.
 * Open the native help viewer application.
 * Set the default menu bar.
 * Enable or disable the application to be suddenly terminated.
 * ویژگی های دسک تاپ خاص:
 * برخی از متد های جدید به کلاس java.awt.Desktop اضافه می شود.
 * این متدها ویژگی های زیر را ارائه می دهد.
 * نمایش سفارشی کردن درباره Windows و تنظیمات برگزیده.
 * درخواست ها را برای باز کردن یا چاپ لیستی از پرونده ها انجام دهید.
 * درخواست ها را برای باز کردن آدرس اینترنتی انجام دهید.
 * برنامه مشاهده گر محلی راهنما را باز کنید.
 * نوار منوی پیش فرض را تنظیم کنید.
 * برنامه رافعال یا غیرفعال کنید که به طور ناگهانی خاتمه یابد
 *
 * Enable GTK 3 on Linux:
 * Java new version allows Java graphical applications(JavaFX, Swing, or Abstract Window Toolkit) to use GTK version on Linux.
 * JDK uses GTK +2 by default, if it is not available, GTK+3 is used.
 * We can use specific version by setting property of jdk.gtk.version.
 * فعال کردن GTK 3 در لینوکس:
 * نسخه جدید جاوا به برنامه های گرافیکی Java (JavaFX ، Swing یا Abstract Window Toolkit) اجازه می دهد تا از نسخه GTK در لینوکس استفاده کنند.
 * کیت JDK بطور پیش فرض از GTK +2 استفاده می کند ، اگر در دسترس نباشد از GTK + 3 استفاده می شود.
 * می توانیم با تنظیم ویژگی jdk.gtk.version از نسخه خاص استفاده کنیم.
 *
 * Unicode 8.0:
 * Java supports Unicode 8.0 in its new Java 9 version, previously Unicode 6.2 was used.
 * Java 9 supports, Unicode 6.3, 7.0 and 8.0 standards that combined introduced 10,555 characters, 29 scripts, and 42 blocks.
 * یونیکد 8.0:
 * جاوا در نسخه جدید جاوا 9 خود از یونیکد 8.0 پشتیبانی می کند ، قبلاً از یونیکد 6.2 استفاده شده بود.
 * جاوا 9 از استاندارد های یونیکد 6.3 ، 7.0 و 8.0 که در ترکیب 10.555 کاراکتر ، 29 اسکریپت و 42 بلوک معرفی شده اند پشتیبانی می کند
 *
 * CLDR Locale Data Enabled by Default:
 * CLDR (Common Locale Data Repository's) represents the locale data provided by the Unicode CLDR project.
 * It was first added in JDK 8 and now default in JDK 9.
 * We can enable behavior compatible with Java 8 by setting the property java.locale.providers to a value with COMPAT ahead of CLDR.
 * داده های محلی CLDR به صورت پیش فرض فعال شده است:
 * ریپازیتوری CLDR (مخزن داده های مشترک محلی) داده های محلی ارائه شده توسط پروژه یونیکد CLDR را نشان می دهد.
 * این اولین بار در JDK 8 اضافه شد و اکنون به طور پیش فرض در JDK 9 است.
 * ما می توانیم با تنظیم ویژگی java.locale.providers روی یک مقدار با COMPAT ahead of CLDR ، رفتار سازگار با Java 8 را فعال کنیم
 *
 * UTF-8 Properties Files:
 * The UTF-8 is a convenient way to represent non-Latin characters.
 * The new version of java loads properties files in UTF-8 encoding.
 * In earlier versions, ISO-8859-1 encoding was used when loading property resource bundles.
 * Java removes the endorsed-standards override mechanism and the extension mechanism.
 * The rt.jar and tools.jar both has been removed from JRE.
 * JDK's internal APIs are inaccessible by default.
 * فایل های UTF-8 Properties:
 * استاندارد UTF-8 راهی مناسب برای نمایش کارکتر های غیر لاتین است.
 * نسخه جدید جاوا فایل هایی را در رمزگذاری UTF-8 بارگذاری می کند.
 * در نسخه های قبلی ، هنگام بارگیری بسته های resource  ، از رمزگذاری ISO-8859-1 استفاده شده است.
 * جاوا مکانیسم نادیده گرفتن استاندارد و مکانیسم فرمت را حذف می کند.
 * فایلهای rt.jar و tool.jar هر دو از JRE حذف شده اند.
 * رابط API های داخلی JDK به طور پیش فرض در دسترس نیست
 */
public class Java9Features {
}
