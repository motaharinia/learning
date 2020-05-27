package com.motaharinia.springandboot.aspringsecurity.fspringsecurityjavaexample;

/**
 * https://www.javatpoint.com/spring-security-java-example
 *Spring Security Project using Java Configuration:
 * Spring Framework added Java configuration support in Spring 3.1.
 * In Spring Security, Java configuration was added to Spring Security 3.2 that allows us to configure Spring Security without writing single line of XML.
 * Here, we will create an example that implements Spring Security and configured without using XML.
 * It includes the following steps.
 * پروژه Spring Security با استفاده از پیکربندی جاوا:
 * چارچوب Spring پشتیبانی پیکربندی جاوا را در spring 3.1 اضافه کرد.
 * در Spring Security ، پیکربندی جاوا به Spring Security 3.2 اضافه شده است که به ما امکان می دهد Security Spring را بدون نوشتن یک خط XML ، پیکربندی کنیم.
 * در اینجا ، ما نمونه ای را ایجاد خواهیم کرد که Spring Security را پیاده سازی کرده و بدون استفاده از XML پیکربندی شده است.
 * مراحل زیر را شامل می شود.
 *
 * Step 1 (WebSecurityConfig.java)
 * Step 2 (SecurityWebApplicationInitializer.java)
 * Step 3 (MvcWebApplicationInitializer.java)
 * Step 4 (SecurityConfig.java)
 * Step 5 (HomeController.java)
 *
 * We have a single action in our controller and it can be accessed only by authentic user.
 * So, when we run the application, it prompts for the login credentials.
 * default login page provided by the Spring Security, we did not create it. Although we can create our own login page and configure with the application.
 * Well, now, provide the login credentials to get into the application resource.
 * Spring Security validate user credentials and make sure that user is authentic.
 * When credentials are matched it shows our home page (index.jsp).
 * ما یک متد واحد در کنترلر خود داریم و فقط توسط کاربر معتبر قابل دسترسی است.
 * بنابراین ، وقتی برنامه را اجرا می کنیم ، اعتبار نامه ورود به سیستم را درخواست می کند.
 * صفحه ورود به طور پیش فرض ارائه شده توسط Spring Security ، ما آن را ایجاد نکردیم. اگرچه ما می توانیم صفحه ورود به سیستم خود را ایجاد کرده و با برنامه پیکربندی کنیم.
 * خوب ، اکنون ، اعتبار ورود به سیستم را وارد کنید تا وارد منابع برنامه شوید.
 * و Spring Security اعتبار کاربر را تأیید می کند و مطمئن شوید که کاربر معتبر است.
 * هنگامی که اعتبارها با یکدیگر مطابقت دارند ، صفحه اصلی ما (index.jsp) نشان داده می شود.
 */
public class SpringSecurityExample {
}
