package com.motaharinia.springandboot.aspringsecurity.dspringprojectmodules;

/**
 * https://www.javatpoint.com/spring-security-project-modules
 * Spring Project Modules:
 * In Spring Security 3.0, the Security module is divided into separate jar files.
 * The purpose was to divide jar files based on their functionalities, so, the developer can integrate according to their requirement.
 * It also helps to set required dependency into pom.xml file of maven project.
 * The following are the jar files that are included into Spring Security module.
 *ماژول های پروژه Spring:
 * در Spring Security 3.0 ، ماژول Security به فایل های جداگانه تقسیم می شود.
 * هدف این بود که فایل های jar را بر اساس ویژگی های آنها تقسیم کنیم ، بنابراین ، توسعه دهنده می تواند مطابق نیاز آنها ادغام شود.
 * همچنین کمک می کند تا وابستگی مورد نیاز را به فایل pom.xml پروژه maven تنظیم کنید.
 * در زیر فایل های jar که در ماژول Spring Security گنجانده شده اند
 *
 * 1. Core (spring-security-core.jar):
 * This is core jar file and required for every application that wants to use Spring Security.
 * This jar file includes core access-control and core authentication classes and interfaces.
 * We can use it in standalone applications or remote clients applications.
 * It contains top level packages:
 * org.springframework.security.core
 * org.springframework.security.access
 * org.springframework.security.authentication
 * org.springframework.security.provisioning
 * 1. Core (spring-security-core.jar):
 * این فایل اصلی jar است و برای هر برنامه ای که مایل به استفاده از Spring Security است لازم است.
 * این فایل jar شامل کلاسهای کنترل و دسترسی اصلی و کلاسهای تأیید اعتبار اصلی است.
 * ما می توانیم از آن در برنامه های مستقل یا برنامه های مشتری از راه دور استفاده کنیم.
 * این شامل پکیج های سطح بالا:
 * org.springframework.security.core
 * org.springframework.security.access
 * org.springframework.security.authentication
 * org.springframework.security.provisioning
 *
 * 2. Remoting (spring-security-remoting.jar):
 * This jar is used to integrate security feature into the Spring remote application.
 * We don't need it until or unless we are creating remote application.
 * All the classes and interfaces are located into org.springframework.security.remoting package.
 * 2. Remoting (spring-security-remoting.jar):
 * این jar برای ادغام ویژگی امنیتی در برنامه از راه دور Spring استفاده می شود.
 * ما به آن نیاز نداریم تا یا مگر اینکه در حال ایجاد برنامه راه دور هستیم.
 * تمام کلاس ها و رابط ها در پکیج org.springframework.security.remoting قرار دارند.
 *
 * 3. Web (spring-security-web.jar):
 * This jar is useful for Spring Security web authentication and URL-based access control.
 * It includes filters and web-security infrastructure.
 * All the classes and interfaces are located into the org.springframework.security.web package.
 * 3. Web (spring-security-web.jar):
 * این jar برای احراز هویت Spring Security وب و کنترل دسترسی مبتنی بر URL مفید است.
 * این شامل فیلترها و زیرساخت های امنیتی وب است.
 * تمام کلاس ها و رابط ها در پکیج org.springframework.security.web قرار دارند.
 *
 * 4. Config (spring-security-config.jar):
 * This jar file is required for Spring Security configuration using XML and Java both.
 * It includes Java configuration code and security namespace parsing code.
 * All the classes and interfaces are stored in org.springframework.security.config package.
 * 4. Config (spring-security-config.jar):
 * این فایل jar برای پیکربندی Spring Security با استفاده از XML و Java هر دو مورد نیاز است.
 * این شامل کد پیکربندی جاوا و کد تجزیه فضای نام امنیتی است.
 * تمام کلاس ها و رابط ها در پکیج org.springframework.security.config ذخیره می شوند.
 *
 * 5. LDAP (spring-security-ldap.jar):
 * This jar file is required only if we want to use LDAP (Lighweight Directory Access Protocol).
 * It includes authentication and provisioning code.
 * All the classes and interfaces are stored into org.springframework.security.ldap package.
 * 5. LDAP (spring-security-ldap.jar):
 * این فایل jar تنها در صورتی لازم است که ما می خواهیم از LDAP (پروتکل دسترسی به فهرست دایرکتوری سبک وزن) استفاده کنیم.
 * این شامل احراز هویت و تهیه کد می باشد.
 * همه کلاس ها و رابط ها در پکیج org.springframework.security.ldap ذخیره می شوند.
 *
 * 6. OAuth 2.0 Core (spring-security-oauth2-core.jar):
 * This jar is required to integrate Oauth 2.0 Authorization Framework and OpenID Connect Core 1.0 into the application.
 * This jar file includes the core classes for OAuth 2.0 and classes are stored into the org.springframework.security.oauth2.core package.
 * 6. OAuth 2.0 Core (spring-security-oauth2-core.jar):
 * این jar برای ادغام چارچوب مجوز Oauth 2.0 و OpenID Connect Core 1.0 در برنامه مورد نیاز است.
 * این فایل jar شامل کلاس های اصلی OAuth 2.0 می باشد و کلاس ها در پکیج org.springframework.security.oauth2.core ذخیره می شوند.
 *
 * 7. OAuth 2.0 Client (spring-security-oauth2-client.jar):
 * This jar file is required to get client support for OAuth 2.0 Authorization Framework and OpenID Connect Core 1.0.
 * This module provides OAuth login and OpenID client support.
 * All the classes and interfaces are available from org.springframework.security.oauth2.client package.
 * 7. OAuth 2.0 Client (spring-security-oauth2-client.jar):
 * برای دریافت پشتیبانی مشتری از OAuth 2.0 چارچوب مجوز و OpenID Connect Core 1.0 ، این فایل jar مورد نیاز است.
 * این ماژول پشتیبانی OAuth و پشتیبانی مشتری OpenID را فراهم می کند.
 * تمام کلاس ها و رابط ها از پکیج بندی org.springframework.security.oauth2.client در دسترس هستند.
 *
 * 8. OAuth 2.0 JOSE (spring-security-oauth2-jose.jar):
 * It provides Spring Security's support for the JOSE (Javascript Object Signing and Encryption) framework.
 * The JOSE framework provides methods to establish secure connection between clients. It contains following collection of specifications:
 * JWT (JSON Web Token)
 * JWS (JSON Web Signature)
 * JWE (JSON Web Encryption)
 * JWK (JSON Web Key)
 * All the classes and interfaces are available into these two packages:
 * org.springframework.security.oauth2.jwt and org.springframework.security.oauth2.jose.
 * 8. OAuth 2.0 JOSE (spring-security-oauth2-jose.jar):
 * این پشتیبانی Spring Security را برای چارچوب JOSE (Javascript Object Signing and Encryption) فراهم می کند.
 * چارچوب JOSE متدهایی را برای برقراری ارتباط امن بین مشتری ارائه می دهد. این مجموعه شامل مشخصات زیر است:
 * JWT (JSON Web Token)
 * JWS (JSON Web Signature)
 * JWE (JSON Web Encryption)
 * JWK (JSON Web Key)
 * تمام کلاس ها و رابط ها در این دو پکیج موجود است:
 * org.springframework.security.oauth2.jwt و org.springframework.security.oauth2.jose.
 *
 * 9. ACL (spring-security-acl.jar):
 * This jar is used to apply security to domain object in the application.
 * We can access classes and code from the org.springframework.security.acls package.
 * 9. ACL (spring-security-acl.jar):
 * از این jar برای اعمال امنیت در مورد دامنه در برنامه استفاده می شود.
 * ما می توانیم از پکیج org.springframework.security.acls  به کلاسها و کد دسترسی پیدا کنیم.
 *
 * 10. CAS (spring-security-cas.jar):
 * It is required for Spring Security`s CAS client integration.
 * We can use it to integrate Spring Security web authentication with CAS single sign-on server.
 * The source code is located into org.springframework.security.cas package.
 * 10. CAS (spring-security-cas.jar):
 * برای ادغام مشتری Spring Security CAS لازم است.
 * ما می توانیم از آن برای ادغام تأیید هویت وب Spring Security با سرورsingle sign-on در  CAS استفاده کنیم.
 * کد منبع در پکیج org.springframework.security.cas قرار دارد.
 *
 * 11. OpenID (spring-security-openid.jar):
 * This jar is used for OpenID web authentication support.
 * We can use it to authenticate users against an external OpenID server.
 * It requires OpenID4Java and top level package is org.springframework.security.openid.
 * 11. OpenID (spring-security-openid.jar):
 * این jar برای پشتیبانی از تأیید اعتبار وب OpenID استفاده می شود.
 * ما می توانیم از آن برای تأیید اعتبار کاربران در برابر سرور OpenID خارجی استفاده کنیم.
 * به OpenID4Java احتیاج دارد و پکیج بندی سطح بالا org.springframework.security.openid است.
 *
 * 12. Test (spring-security-test.jar):
 * This jar provides support for testing Spring Security application.
 * 12. Test (spring-security-test.jar):
 * این jar پشتیبانی از آزمایش برنامه Spring Security را ارائه می دهد
 *
 */
public class SpringSecurityProjectModules {
}
