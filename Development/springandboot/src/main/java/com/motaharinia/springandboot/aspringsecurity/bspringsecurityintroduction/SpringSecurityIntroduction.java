package com.motaharinia.springandboot.aspringsecurity.bspringsecurityintroduction;

/**
 * https://www.javatpoint.com/spring-security-introduction
 * Introduction:
 * Spring Security is a framework which provides various security features like: authentication, authorization to create secure Java Enterprise Applications.
 * It is a sub-project of Spring framework which was started in 2003 by Ben Alex.
 * Later on, in 2004, It was released under the Apache License as Spring Security 2.0.0.
 * It overcomes all the problems that come during creating non spring security applications and manage new server environment for the application.
 * مقدمه:
 * یک Spring Security چارچوبی است که ویژگی های امنیتی مختلفی مانند: تأیید اعتبار ، مجوز ایجاد برنامه های کاربردی امن Java Enterprise را ارائه می دهد.
 * این یک پروژه فرعی از چارچوب Spring است که در سال 2003 توسط بن الکس آغاز شد.
 * بعداً ، در سال 2004 ، تحت مجوز Apache به عنوان Spring Security 2.0.0 منتشر شد.
 * این غلبه بر تمام مشکلاتی که در هنگام ایجاد برنامه های امنیتی غیر Spring ایجاد می شود و مدیریت سرور جدید برای برنامه است.
 *
 * This framework targets two major areas of application are authentication and authorization.
 * Authentication is the process of knowing and identifying the user that wants to access.
 * Authorization is the process to allow authority to perform actions in the application.
 * We can apply authorization to authorize web request, methods and access to individual domain.
 * Technologies that support Spring Security Integration
 * Spring Security framework supports wide range of authentication models.
 * These models either provided by third parties or framework itself.
 * Spring Security supports integration with all of these technologies.
 * HTTP BASIC authentication headers
 * HTTP Digest authentication headers
 * HTTP X.509 client certificate exchange
 * LDAP (Lighweight Directory Access Protocol)
 * Form-based authentication
 * OpenID authentication
 * Automatic remember-me authentication
 * Kerberos
 * JOSSO (Java Open Source Single Sign-On)
 * AppFuse
 * AndroMDA
 * Mule ESB
 * DWR(Direct Web Request)
 * The beauty of this framework is its flexible authentication nature to integrate with any software solution.
 * Sometimes, developers want to integrate it with a legacy system that does not follow any security standard, there Spring Security works nicely.
 * این چارچوب ، دو بخش اصلی برنامه authentication و authorization را هدف گرفته است.
 * احراز هویت فرآیند شناخت و شناسایی کاربری است که می خواهد به آن دسترسی داشته باشد.
 * مجوز فرایندی است که به مقام اجازه می دهد اقدامات را در برنامه انجام دهد.
 * ما می توانیم از مجوز برای تأیید درخواست وب ، متد ها و دسترسی به دامنه فردی استفاده کنیم.
 * فن آوری هایی که از ادغام امنیت Spring پشتیبانی می کنند
 * چارچوب امنیت Spring طیف گسترده ای از مدل های تأیید هویت را پشتیبانی می کند.
 * این مدل ها یا توسط اشخاص ثالث یا خود چارچوب ارائه می شوند.
 * یک Spring Security از ادغام با همه این فناوری ها پشتیبانی می کند.
 * HTTP BASIC authentication headers
 * HTTP Digest authentication headers
 * HTTP X.509 client certificate exchange
 * LDAP (Lighweight Directory Access Protocol)
 * Form-based authentication
 * OpenID authentication
 * Automatic remember-me authentication
 * Kerberos
 * JOSSO (Java Open Source Single Sign-On)
 * AppFuse
 * AndroMDA
 * Mule ESB
 * DWR(Direct Web Request)
 * زیبایی این چارچوب ماهیت تصدیق انعطاف پذیر آن برای ادغام با هر راه حل نرم افزاری است.
 * گاهی اوقات ، توسعه دهندگان می خواهند آن را با یک سیستم قدیمی که هیچ استاندارد امنیتی را رعایت نمی کند ادغام کنند ، در آنجا Spring Security به خوبی کار می کند.
 *
 * Advantages
 * Spring Security has numerous advantages. Some of that are given below.
 * 1. Comprehensive support for authentication and authorization.
 * 2. Protection against common tasks
 * 3. Servlet API integration
 * 4. Integration with Spring MVC
 * 5. Portability
 * 6. CSRF protection
 * 7. Java Configuration support
 * مزایای
 * یک Spring Security مزایای بی شماری دارد. برخی از آن در زیر آورده شده است.
 * 1. پشتیبانی جامع از تأیید اعتبار و مجوز.
 * 2. محافظت در برابر کارهای عمومی
 * 3. ادغام API Servlet
 * 4. ادغام با Spring MVC
 * 5. قابلیت حمل
 * 6. حفاظت از CSRF
 * 7. پشتیبانی از پیکربندی جاوا
 *
 * Spring Security History:
 * In late 2003, a project Acegi Security System for Spring started with the intention to develop a Spring-based security system.
 * So, a simple security system was implemented but not released officially.
 * Developers used that code internally for their solutions and by 2004 about 20 developers were using that.
 * Initially, authentication module was not part of the project, around a year after, module was added and complete project was reconfigure to support more technologies.
 * After some time this project became a subproject of Spring framework and released as 1.0.0 in 2006.
 * in 2007, project is renamed to Spring Security and widely accepted.
 * Currently, it is recognized and supported by developers open community world wide.
 * تاریخچه Spring Security :
 * در اواخر سال 2003 ، پروژه ای از سیستم امنیتی Acegi برای Spring با هدف توسعه یک سیستم امنیتی مبتنی بر Spring آغاز شد.
 * بنابراین ، یک سیستم امنیتی ساده پیاده سازی شد اما به طور رسمی منتشر نشد.
 * توسعه دهندگان از آن کد داخلی برای راه حل های خود استفاده می کردند و تا سال 2004 حدود 20 برنامه نویس از آن استفاده می کردند.
 * در ابتدا ، ماژول تأیید اعتبار بخشی از پروژه نبود ، حدود یک سال پس از آن ، ماژول اضافه شد و پروژه کامل برای پشتیبانی از فن آوری های بیشتر ، دوباره پیکربندی شد.
 * پس از مدتی این پروژه به یک پروژه فریم ورک Spring تبدیل شد و در سال 2006 با 1.0.0 منتشر شد.
 * در سال 2007 ، این پروژه به Spring Security تغییر نام یافته است و به طور گسترده ای پذیرفته شده است.
 * در حال حاضر ، توسط توسعه دهندگان جامعه باز جامعه در سراسر جهان شناخته و پشتیبانی می شود.
 */
public class SpringSecurityIntroduction {
}
