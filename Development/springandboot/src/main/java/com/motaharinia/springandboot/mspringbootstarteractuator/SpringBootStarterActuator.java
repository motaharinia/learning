package com.motaharinia.springandboot.mspringbootstarteractuator;

/**
 *https://www.javatpoint.com/spring-boot-actuator
 *
 * Spring Boot Actuator:
 * Spring Boot Actuator is a sub-project of the Spring Boot Framework.
 * It includes a number of additional features that help us to monitor and manage the Spring Boot application.
 * It contains the actuator endpoints (the place where the resources live).
 * We can use HTTP and JMX endpoints to manage and monitor the Spring Boot application.
 * If we want to get production-ready features in an application, we should use the Spring Boot actuator.
 * محرک اسپرینگ بوت:
 * یک Spring Boot Actuator یک پروژه فرعی از چارچوب بهار چکمه است.
 * این شامل تعدادی از ویژگی های اضافی است که به ما در نظارت و مدیریت برنامه Spring Boot کمک می کند.
 * این شامل نقاط انتهایی محرک (مکانی است که منابع در آن زندگی می کنند).
 * ما می توانیم از نقاط پایانی HTTP و JMX برای مدیریت و نظارت بر برنامه Spring Boot استفاده کنیم.
 * اگر می خواهیم از ویژگی های آماده تولید در یک برنامه استفاده کنیم ، باید از محرک Spring Boot استفاده کنیم.
 *
 * Spring Boot Actuator Features:
 * There are three main features of Spring Boot Actuator:
 * 1. Endpoint:
 * The actuator endpoints allows us to monitor and interact with the application.
 * Spring Boot provides a number of built-in endpoints.
 * We can also create our own endpoint. We can enable and disable each endpoint individually.
 * Most of the application choose HTTP, where the Id of the endpoint, along with the prefix of /actuator, is mapped to a URL.
 * For example, the /health endpoint provides the basic health information of an application.
 * The actuator, by default, mapped it to /actuator/health.
 * 2. Metrics:
 * Spring Boot Actuator provides dimensional metrics by integrating with the micrometer.
 * The micrometer is integrated into Spring Boot.
 * It is the instrumentation library powering the delivery of application metrics from Spring.
 * It provides vendor-neutral interfaces for timers, gauges, counters, distribution summaries, and long task timers with a dimensional data model.
 * 3. Audit:
 * Spring Boot provides a flexible audit framework that publishes events to an AuditEventRepository.
 * It automatically publishes the authentication events if spring-security is in execution.
 * ویژگی های محرک اسپرینگ بوت:
 * سه ویژگی اصلی فعال کننده اسپرینگ بوت وجود دارد:
 * 1. نقطه پایانی:
 * نقاط پایانی محرک این امکان را به ما می دهد تا با برنامه نظارت و تعامل داشته باشیم.
 * اسپرینگ بوت تعدادی از نقاط پایانی داخلی را در اختیار شما قرار می دهد.
 * ما همچنین می توانیم نقطه پایانی خود را ایجاد کنیم. ما می توانیم هر نقطه انتهایی را بطور جداگانه فعال و غیرفعال کنیم.
 * اکثر برنامه ها HTTP را انتخاب می کنند ، جایی که شناسه نقطه پایان به همراه پیشوند/actuator ، در یک URL نگاشت می شود.
 * به عنوان مثال ، نقطه پایانی /health اطلاعات اصلی سلامت یک برنامه را ارائه می دهد.
 * محرک ، به طور پیش فرض ، آن را به /actuator/health نگاشت شده است.
 * 2.معیارها:
 * اسپرینگ بوت Actuator با ادغام با میکرومتر معیارهای بعدی را فراهم می کند.
 * میکرومتر در Spring Boot یکپارچه شده است.
 * این کتابخانه ابزار دقیق قدرت تحویل معیارهای کاربردی از Spring است.
 * این رابط های بی طرف-فروشنده برای تایمرها ، سنج ها ، شمارنده ها ، خلاصه های توزیع و تایمرهای کار طولانی با یک مدل داده بعدی ارائه می دهد.
 * 3. ممیزی:
 * اسپرینگ بوت چارچوب حسابرسی منعطفی را ارائه می دهد که وقایع را برای یک AuditEventRepository منتشر می کند.
 * اگر spring-security  در حال اجرا باشد ، به طور خودکار وقایع authentication را منتشر می کند.
 *
 * Enabling Spring Boot Actuator:
 * We can enable actuator by injecting the dependency spring-boot-starter-actuator in the pom.xml file.
 * فعال کردن Spring Boot Actuator:
 * ما می توانیم با تزریق spring-boot-starter-actuator در پرونده pom.xml وابستگی را فعال کنیم.
 *
 * <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-actuator</artifactId>
 *     <version>2.2.2.RELEASE</version>
 * </dependency>
 *
 *Spring Boot Actuator Endpoints:
 * The actuator endpoints allow us to monitor and interact with our Spring Boot application.
 * Spring Boot includes number of built-in endpoints and we can also add custom endpoints in Spring Boot application.
 * The following table describes the widely used endpoints.
 * نقاط پایانی محرک اسپرینگ بوت:
 * نقاط پایانی محرک این امکان را به ما می دهد تا با برنامه Spring Boot ما نظارت و تعامل داشته باشیم.
 * اسپرینگ بوت شامل تعدادی از نقاط پایانی داخلی است که می توانیم در برنامه Spring Boot نیز نقاط انتهایی سفارشی را اضافه کنیم.
 * جدول زیر نقاط پایانی پرکاربرد را توصیف می کند
 * actuator:
 * It provides a hypermedia-based discovery page for the other endpoints.
 * It requires Spring HATEOAS to be on the classpath.
 * default value is True.
 * این یک صفحه کشف مبتنی بر هایپرمی مدیا برای نقاط پایانی دیگر است.
 * لازم است که بهار HATEOAS در مسیر کلاس باشد.
 * مقدار پیش فرض True است.
 * auditevents:
 * It exposes audit events information for the current application.
 * default value is True.
 * اطلاعات رویدادهای حسابرسی را برای برنامه فعلی افشا می کند.
 * مقدار پیش فرض True است.
 * autoconfig:
 * It is used to display an auto-configuration report showing all auto-configuration candidates and the reason why they 'were' or 'were not' applied.
 * default value is True.
 * این برای نمایش یک گزارش تنظیمات خودکار استفاده می شود که تمام نامزدهای پیکربندی خودکار را نشان می دهد و دلیل استفاده نکردن از آنها "یا" را نشان می دهد.
 * مقدار پیش فرض True است.
 * beans:
 * It is used to display a complete list of all the Spring beans in your application.
 * default value is True.
 * برای نمایش لیست کاملی از تمام بین های اسپرینگ در برنامه شما استفاده می شود.
 * مقدار پیش فرض True است
 * configprops:
 * It is used to display a collated list of all @ConfigurationProperties.
 * default value is True.
 * برای نمایش لیستی از همه@ConfigurationProperties استفاده می شود.
 * مقدار پیش فرض True است.
 * dump:
 * It is used to perform a thread dump.
 * default value is True.
 * از آن برای انجام دامپ نخ استفاده می شود.
 * مقدار پیش فرض True است
 * env:
 * It is used to expose properties from Spring's ConfigurableEnvironment.
 * default value is True.
 * این مورد برای افشای خواص از Spring ConfigurableEnvironment استفاده می شود.
 * مقدار پیش فرض True است.
 * flyway:
 * It is used to show any Flyway database migrations that have been applied.
 * default value is True.
 * این برای نشان دادن هرگونه مهاجرت از پایگاه داده Flyway استفاده شده است.
 * مقدار پیش فرض True است.
 * health:
 * It is used to show application health information.
 * default value is False.
 * این برای نشان دادن اطلاعات سلامت برنامه کاربردی استفاده می شود.
 * مقدار پیش فرض False است.
 * info:
 * It is used to display arbitrary application info.
 * default value is False.
 * این برای نمایش اطلاعات برنامه دلخواه استفاده می شود.
 * مقدار پیش فرض False است.
 * loggers:
 * It is used to show and modify the configuration of loggers in the application.
 * default value is True.
 * این برای نشان دادن و اصلاح پیکربندی loggers در برنامه کاربرد دارد.
 * مقدار پیش فرض True است.
 * liquibase:
 * It is used to show any Liquibase database migrations that have been applied.
 * default value is True.
 * این برای نشان دادن هرگونه مهاجرت از پایگاه داده Liquibase مورد استفاده قرار می گیرد.
 * مقدار پیش فرض True است.
 * metrics:
 * It is used to show metrics information for the current application.
 * default value is True.
 * این برای نشان دادن اطلاعات معیارها برای برنامه فعلی استفاده می شود.
 * مقدار پیش فرض True است
 * mappings:
 * It is used to display a collated list of all @RequestMapping paths.
 * default value is True.
 * برای نمایش لیستی از همه مسیرهای @RequestMapping استفاده می شود.
 * مقدار پیش فرض True است
 * shutdown:
 * It is used to allow the application to be gracefully shutdown.
 * default value is True.
 * این مورد استفاده می شود تا به برنامه اجاره بدهد به طرز مناسبی خاموش شود
 * مقدار پیش فرض True است.
 * trace:
 * It is used to display trace information.
 * default value is True.
 * برای نمایش اطلاعات ردیابی استفاده می شود.
 * مقدار پیش فرض True است.
 *
 * For Spring MVC, the following additional endpoints are used.
 * برای Spring MVC ، نقاط پایانی اضافی زیر استفاده می شود.
 *
 * docs:
 * It is used to display documentation, including example requests and responses for the Actuator's endpoints.
 * default value is False.
 * این برای نمایش اسناد و مدارک ، از جمله درخواست ها و پاسخ های مربوط به نقاط انتهایی محرک استفاده می شود.
 * مقدار پیش فرض False است.
 * heapdump:
 * It is used to return a GZip compressed hprof heap dump file.
 * default value is True.
 * برای برگرداندن پرونده دامپ hprof heap فشرده شده GZip استفاده می شود.
 * مقدار پیش فرض True است.
 * jolokia:
 * It is used to expose JMX beans over HTTP (when Jolokia is on the classpath).
 * default value is True.
 * از این ماده برای افشای بین های JMX بر روی HTTP استفاده می شود (هنگامی که جلوکیا در مسیر کلاس است).
 * مقدار پیش فرض True است.
 * logfile:
 * It is used to return the contents of the logfile.
 * default value is True.
 * برای برگرداندن محتویات پرونده لاگ استفاده می شود.
 * مقدار پیش فرض True است.
 * prometheus:
 * It is used to expose metrics in a format that can be scraped by a prometheus server.
 * It requires a dependency on micrometer-registry-prometheus.
 * default value is True.
 * از آن برای افشای معیارها در قالبی استفاده می شود که توسط یک سرور prometheus قابل برداشت است.
 * نیاز به وابستگی micrometer-registry-prometheus دارد.
 * مقدار پیش فرض True است
 *
 * Spring Boot actuator properties:
 * Spring Boot enables security for all actuator endpoints.
 * It uses form-based authentication that provides user Id as the user and a randomly generated password.
 * We can also access actuator-restricted endpoints by customizing basicauth security to the endpoints.
 * We need to override this configuration by management.security.roles property.
 * For example:
 * خصوصیتهای محرک Boot Spring:
 * اسپرینگ بوت امنیت را برای تمام نقاط پایانی محرک فعال می کند.
 * از احراز هویت مبتنی بر فرم استفاده می کند که شناسه کاربر را به عنوان کاربر و رمز عبور تولید شده به صورت تصادفی در اختیار کاربر قرار می دهد.
 * ما همچنین می توانیم با تنظیم امنیت اولیه پایه به نقاط انتهایی ، به نقاط انتهایی محدود شده برای محرک دسترسی داشته باشیم.
 * ما باید این پیکربندی را با خاصیت management.security.roles را override کنیم.
 * مثلا:
 * management.security.enabled=true
 * management.security.roles=ADMIN
 * security.basic.enabled=true
 * security.user.name=admin
 * security.user.passowrd=admin
 *
 * Spring Boot Actuator Example
 * Let's understand the concept of the actuator through an example.
 * Step 1: Open Spring Initializr https://start.spring.io/ and create a Maven project.
 * Step 2: Provide the Group name. We have provided com.javatpoint.
 * Step 3: Provide the Artifact Id. We have provided the spring-boot-actuator-example.
 * Step 4: Add the following dependencies: Spring Web, Spring Boot Starter Actuator, and Spring Data Rest HAL Browser.
 * Step 5: Click on the Generate button. When we click on the Generate button, it wraps all the specifications related to the project into a Jar file and downloads it to our local system.
 * Step 6: Extract the Jar file and paste it into the STS workspace.
 * Step 7: Import the project folder.
 * File -> Import -> Existing Maven Projects -> Browse -> Select the folder spring-boot-actuator-example -> Finish
 * It takes some time to import. After importing the project, we can see the project directory in the package explorer section.
 * Step 8: Create a Controller class. We have created the controller class with the name DemoRestController.
 * Step 9: Open the application.properties file and disable the security feature of the actuator by adding the following statement.
 * application.properties:
 * management.security.enabled=false
 * Step 10: Run the SpringBootActuatorExampleApplication.java file.
 * Step 11: Open the browser and invoke the URL http://localhost:8080/actuator. It returns the following page:
 * {"_links":{"self":{"href":"http://localhost:8080/actuator","templated":false},"health":{"href":"http://localhost:8080/actuator/health","templated":false},"health-path":{"href":"http://localhost:8080/actuator/health/{*path}","templated":true},"info":{"href":"http://localhost:8080/actuator/info","templated":false}}}
 * The application runs on port 8080 by default. Once the actuator has started, we can see the list of all the endpoints exposed over HTTP.
 * Let's invoke the health endpoint by invoking the URL http://localhost:8080/actuator/health. It denotes the status UP. It means the application is healthy and running without any interruption.
 * Similarly, we can invoke other endpoints that helps us to monitor and manage the Spring Boot application.
 */
public class SpringBootStarterActuator {
}
