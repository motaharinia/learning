package com.motaharinia.springandboot.aspringsecurity.fspringsecurityjavaexample;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Step 4
 * WebSecurityConfigurerAdapter class provides a configure(HttpSecurity http) method that contains the following default configuration. Default definition looks like below.
 * This method does the following things.
 * It ensures that each request made by the user requires to the user to be authenticated
 * It allows user to authenticate by using form based login
 * It allows user to authenticate with HTTP Basic authentication
 * گام 4
 * کلاس WebSecurityConfigurerAdapter یک متد پیکربندی (HttpSecurity http) ارائه می دهد که شامل پیکربندی پیش فرض زیر است. تعریف پیش فرض به شرح زیر است.
 * این متد کارهای زیر را انجام می دهد.
 * این اطمینان را می دهد که هر درخواستی که توسط کاربر انجام شده است نیاز به تأیید اعتبار کاربر دارد
 * این اجازه می دهد تا کاربر را با استفاده از ورود با فرم احراز هویت شود
 * این اجازه می دهد تا کاربر را با احراز هویت HTTP Basic احراز هویت شود
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
}
