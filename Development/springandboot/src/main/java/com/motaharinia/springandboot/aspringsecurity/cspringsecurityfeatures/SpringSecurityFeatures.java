package com.motaharinia.springandboot.aspringsecurity.cspringsecurityfeatures;

/**
 * https://www.javatpoint.com/spring-security-features
 * Spring Security Features:
 * 1. LDAP (Lightweight Directory Access Protocol):
 * It is an open application protocol for maintaining and accessing distributed directory information services over an Internet Protocol.
 * 2. Single sign-on:
 * This feature allows a user to access multiple applications with the help of single account(user name and password).
 * 3. JAAS (Java Authentication and Authorization Service) LoginModule:
 * It is a Pluggable Authentication Module implemented in Java. Spring Security supports it for its authentication process.
 * 4. Basic Access Authentication:
 * Spring Security supports Basic Access Authentication that is used to provide user name and password while making request over the network.
 * 5. Digest Access Authentication:
 * This feature allows us to make authentication process more secure than Basic Access Authentication.
 * It asks to the browser to confirm the identity of the user before sending sensitive data over the network.
 * 6. Remember-me:
 * Spring Security supports this feature with the help of HTTP Cookies.
 * It remember to the user and avoid login again from the same machine until the user logout.
 * 7. Web Form Authentication:
 * In this process, web form collect and authenticate user credentials from the web browser.
 * Spring Security supports it while we want to implement web form authentication.
 * 8. Authorization:
 * Spring Security provides the this feature to authorize the user before accessing resources.
 * It allows developers to define access policies against the resources.
 * 9. Software Localization:
 * This feature allows us to make application user interface in any language.
 * 10. HTTP Authorization:
 * Spring provides this feature for HTTP authorization of web request URLs using Apache Ant paths or regular expressions.
 * ویژگی های Spring Security:
 * 1. LDAP (Lightweight Directory Access Protocol):
 * این پروتکل برنامه کاربردی باز برای حفظ و دسترسی به خدمات اطلاعات دایرکتوری توزیع شده از طریق پروتکل اینترنت است.
 * 2. Single sign-on:
 * این ویژگی به کاربر اجازه می دهد تا با کمک یک حساب واحد (نام کاربری و رمز عبور) به چندین برنامه دسترسی داشته باشد.
 * 3. JAAS (Java Authentication and Authorization Service) LoginModule:
 * این یک ماژول تأیید هویت Pluggable است که در جاوا اجرا می شود.  Spring Security از آن برای فرآیند احراز هویت خود پشتیبانی می کند.
 * 4. Basic Access Authentication:
 * در Spring Security ازBasic Access Authentication پشتیبانی می کند که برای ارائه نام کاربری و رمز عبور هنگام درخواست از طریق شبکه استفاده می شود.
 * 5. Digest Access Authentication:
 * این ویژگی به ما امکان می دهد تا روند احراز هویت را ایمن تر از Basic Access Authentication انجام دهیم.
 * از مرورگر می خواهد تا قبل از ارسال داده های حساس از طریق شبکه ، هویت کاربر را تأیید کند.
 * 6. Remember-me:
 *یک Spring Security از این ویژگی با کمک کوکی های HTTP پشتیبانی می کند.
 * این را برای کاربر به یاد داشته باشید و از ورود دوباره از همان دستگاه تا ورود کاربر جلوگیری کنید.
 * 7. Web Form Authentication:
 * در این فرایند ، فرم وب اعتبار کاربر را از مرورگر وب جمع آوری و تأیید می کند.
 * در Spring Security در حالی که می خواهیم احراز هویت فرم وب را اجرا کنیم از آن پشتیبانی می کند.
 * 8. Authorization:
 * در Spring Security این ویژگی را برای اجازه کاربر قبل از دسترسی به منابع فراهم می کند.
 * این اجازه می دهد تا توسعه دهندگان سیاست های دسترسی در برابر منابع را تعریف کنند.
 * 9. Software Localization:
 * این ویژگی به ما امکان می دهد تا به هر زبانی رابط کاربری برنامه ایجاد کنیم.
 * 10. HTTP Authorization:
 * در Spring این ویژگی را برای مجوز HTTP از URL های درخواست وب با استفاده از مسیرهای Apache Ant یا عبارات منظم فراهم می کند
 *
 *Features added in Spring Security 5.0:
 * 1. OAuth 2.0 Login:
 * This feature provides the facility to the user to login into the application by using their existing account at GitHub or Google.
 * This feature is implemented by using the Authorization Code Grant that is specified in the OAuth 2.0 Authorization Framework.
 * 2. Reactive Support:
 * From version Spring Security 5.0, it provides reactive programming and reactive web runtime support and even, we can integrate with Spring WebFlux.
 * 3. Modernized Password Encoding:
 * Spring Security 5.0 introduced new Password encoder DelegatingPasswordEncoder which is more modernize and solve all the problems of previous encoder NoOpPasswordEncoder.
 *ویژگی های اضافه شده در Spring Security 5.0:
 * 1. OAuth 2.0 Login:
 * این ویژگی با استفاده از حساب موجود در GitHub یا Google ، این امکان را برای کاربر فراهم می کند تا وارد برنامه شود.
 * این ویژگی با استفاده از Grant Code Autorization که در چارچوب مجوز OAuth 2.0 مشخص شده است ، پیاده سازی می شود.
 * 2. Reactive Support:
 * از نسخه Spring Security 5.0 ، برنامه نویسی واکنشی و پشتیبانی از زمان واکنش وب را فراهم می کند و حتی ، می توانیم با Spring WebFlux ادغام شویم.
 * 3. Modernized Password Encoding:
 * در Spring Security 5.0 رمزگذار رمز جدید DelegatingPasswordEncoder را معرفی کرد که مدرن تر و رفع کلیه مشکلات رمزگذار قبلی NoOpPasswordEncoder است.
 */
public class SpringSecurityFeatures {
}
