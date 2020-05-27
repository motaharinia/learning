package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.javatpoint.com/spring-security-java-example
 * Spring Security Project using Java Configuration:
 * Spring Framework added Java configuration support in Spring 3.1.
 * In Spring Security, Java configuration was added to Spring Security 3.2 that allows us to configure Spring Security without writing single line of XML.
 * Here, we will create an example that implements Spring Security and configured without using XML.
 * پروژه اسپرینگ سکیوریتی با استفاده از پیکربندی جاوا:
 * چارچوب اسپرینگ پشتیبانی  پیکربندی جاوا را در اسپرینگ 3.1 اضافه کرد.
 * در Spring Security ، پیکربندی جاوا به Spring Security 3.2 اضافه شده است که به ما امکان می دهد Security Spring را بدون نوشتن یک خط XML ، پیکربندی کنیم.
 * در اینجا ، ما نمونه ای را ایجاد خواهیم کرد که Spring Security را پیاده سازی کرده و بدون استفاده از XML پیکربندی شده است.
 *
 * Output:
 * We have a single action in our controller and it can be accessed only by authentic user.
 * So, when we run the application, it prompts for the login credentials. The output is given below.
 * This is default login page provided by the Spring Security, we did not create it.
 * Although we can create our own login page and configure with the application.
 * We will do this in our next topics.
 * Well, now, provide the login credentials to get into the application resource.
 * Spring Security validate user credentials and make sure that user is authentic.
 * Let's see, what happen? If we enter wrong credentials.
 * After click on login button, it throws Bad Credentials error.
 * Now, login with correct credentials.
 * This time credentials are matched and shows our home page (index.jsp).
 * خروجی:
 * ما یک متد واحد در کنترلر خود داریم و فقط توسط کاربر معتبر قابل دسترسی است.
 * بنابراین ، وقتی برنامه را اجرا می کنیم ، اعتبار نامه ورود به سیستم را درخواست می کند. خروجی در زیر آورده شده است.
 * این صفحه ورود به طور پیش فرض است که توسط Spring Security تهیه شده است ، ما آن را ایجاد نکردیم.
 * اگرچه ما می توانیم صفحه ورود به سیستم خود را ایجاد کرده و با برنامه پیکربندی کنیم.
 * ما این را در مباحث بعدی خود انجام خواهیم داد.
 * خوب ، اکنون ، اعتبار ورود به سیستم را وارد کنید تا وارد منابع برنامه شوید.
 * اسپرینگ سکیوریتی اعتبار کاربر را تأیید می کند و مطمئن شوید که کاربر معتبر است.
 * بیایید ببینیم ، چه اتفاقی می افتد؟ اگر اعتبارنامه اشتباهی وارد کنیم.
 * پس از کلیک بر روی دکمه ورود به سیستم ، خطای Bad Credentials را پرتاب می کند.
 * اکنون با مدارک صحیح وارد شوید.
 * اعتبار این بار مطابقت دارد و صفحه اصلی ما (index.jsp) را نشان می دهد.
 */
@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class SecurityJavaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJavaConfigApplication.class, args);
    }

}
