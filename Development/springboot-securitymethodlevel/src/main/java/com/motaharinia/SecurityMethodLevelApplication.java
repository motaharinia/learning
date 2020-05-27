package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.javatpoint.com/spring-security-at-method-level
 * Spring Security at Method Level:
 * Apart from authentication, spring security also check authorization of the logged in user.
 * After login which user is authorize to access the resource is done on the bases of user's ROLE.
 * At the time of creating user in WebSecurityConfig class, we can specify user?s ROLE as well.
 * Security applied on a method restricts to unauthorized user and allow only authentic user.
 * امنیت Spring در سطح متد:
 * جدا از تأیید هویت ، امنیت Spring همچنین مجوز ورود به سیستم کاربر را بررسی می کند.
 * پس از ورود به سیستم که کاربر مجاز به دستیابی به منبع است ، براساس ROLE کاربر انجام می شود.
 * در زمان ایجاد کاربر در کلاس WebSecurityConfig ، می توانیم ROLE کاربر را نیز مشخص کنیم.
 * امنیت استفاده شده از متدی محدود به کاربر غیرمجاز است و فقط به کاربر معتبر اجازه می دهد.
 *
 * Output:
 * First login as ADMIN
 * After login,
 * Click on update record and see, record is updated because the user's role is ADMIN.
 * Now, login as user.
 * Now, click on update record and see server decline the access because the user's role is USER.
 * خروجی:
 * ابتدا وارد ADMIN شوید
 * بعد از ورود ،
 * روی رکورد به روزرسانی کلیک کنید و ببینید ، ضبط به روز شده است زیرا نقش کاربر ADMIN است.
 * اکنون به عنوان کاربر وارد شوید
 * حال بر روی ضبط بروزرسانی کلیک کنید و ببینید سرور دسترسی را کاهش می دهد زیرا نقش کاربر USER است.
 */
@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class SecurityMethodLevelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityMethodLevelApplication.class, args);
    }

}
