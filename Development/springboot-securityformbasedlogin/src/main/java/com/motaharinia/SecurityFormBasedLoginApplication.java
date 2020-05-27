package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.javatpoint.com/spring-security-form-based-authentication
 * Spring Security Form-Based Authentication:
 * Form-Based authentication is a way in which user's authentication is done by login form.
 * This form is built-in and provided by spring security framework.
 * The HttpSecurity class provide a method formLogin() which is responsible to render login form and validate user credentials.
 * In this tutorial, we will create an example that implements form-based authentication.
 *احراز هویت مبتنی بر اسپرینگ سکیوریتی:
 * احراز هویت مبتنی بر فرم روشی است که در آن هویت کاربر توسط فرم ورود به سیستم انجام می شود.
 * این فرم ساخته شده است و توسط چارچوب امنیتی اسپرینگ تهیه شده است.
 * کلاس HttpSecurity یک متد formLogin ارائه می دهد که وظیفه ارائه فرم ورود به سیستم و اعتبار اطلاعات کاربر را دارد.
 * در این آموزش نمونه ای را می سازیم که احراز هویت فرم را پیاده سازی می کند
 *
 * Output:
 * Click on link, a login form is rendered that will use for form-based authentication.
 * After validating credentials it authenticate the user and render to the admin page.
 *خروجی:
 * بر روی پیوند کلیک کنید ، فرم ورود به سیستم ارائه می شود که برای احراز هویت مبتنی بر فرم استفاده می کند.
 * پس از اعتبار سنجی ، کاربر را تأیید می کند و به صفحه مدیر ارائه می دهد.
 */
@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class SecurityFormBasedLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityFormBasedLoginApplication.class, args);
    }

}
