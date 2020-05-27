package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *https://www.javatpoint.com/spring-security-login-logout
 * Spring Security Login-Logout Module Example:
 * Spring Security provides login and logout features that we can use in our application.
 * It is helpful to create secure Spring application.
 * Here, we are creating a Spring MVC application with Spring Security and implementing login and logout features.
 *اسپرینگ سکیوریتی ورود به سیستم مثال ماژول Login-Logout :
 * اسپرینگ سکیوریتی ویژگی های ورود و خروج را فراهم می کند که می توانیم در برنامه خود استفاده کنیم.
 * برای ایجاد برنامه اسپرینگی امن مفید است.
 * در اینجا ، ما در حال ایجاد یک برنامه MVC اسپرینگ با امنیت اسپرینگ و اجرای ویژگی های ورود و خروج هستیم.
 *
 * Output:
 * When run using apache tomcat, it produces the following output to the browser.
 * Now, providing user credentials to get logged in.
 * It shows home page after logged in successfully, see below.
 * Here, we are created a logout link which can be used to get logged out. Let's check out and log out from the application.
 * And it redirect back to the login page.
 * Well, we have created a successfully Spring MVC application that uses Spring Security to implement login and logout features.
 * خروجی:
 * با استفاده از apache tomcat ، خروجی زیر را به مرورگر می دهد.
 * اکنون ، برای ورود به سیستم ، اعتبارنامه کاربر را ارائه می دهید.
 * صفحه اصلی بعد از ورود به سیستم با موفقیت نشان می دهد ، در زیر مشاهده کنید.
 * در اینجا ، ما یک لینک خروج ایجاد کرده ایم که می تواند برای خروج از سیستم استفاده شود. بیایید بررسی کنید و از برنامه خارج شوید.
 * و دوباره به صفحه ورود تغییر مسیر می دهد.
 * خوب ، ما یک برنامه اسپرینگ موفقیت آمیز MVC ایجاد کرده ایم که از Spring Security برای پیاده سازی ویژگی های ورود و خروج استفاده می کند.
 *
 */
@SpringBootApplication
public class SecurityLoginLogoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityLoginLogoutApplication.class, args);
    }

}
