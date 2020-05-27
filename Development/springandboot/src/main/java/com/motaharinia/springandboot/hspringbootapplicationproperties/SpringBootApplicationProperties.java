package com.motaharinia.springandboot.hspringbootapplicationproperties;

/**
 *https://www.javatpoint.com/spring-boot-properties
 * Spring Boot Application Properties:
 * Spring Boot Framework comes with a built-in mechanism for application configuration using a file called application.properties.
 * It is located inside the src/main/resources folder, as shown in the following figure.
 * Spring Boot provides various properties that can be configured in the application.properties file.
 * The properties have default values.
 * We can set a property(s) for the Spring Boot application.
 * Spring Boot also allows us to define our own property if required.
 * The application.properties file allows us to run an application in a different environment.
 * In short, we can use the application.properties file to:
 * 1. Configure the Spring Boot framework
 * 2. define our application custom configuration properties
 * ویژگی های برنامه بوت اسپرینگ:
 * چارچوب Spring با یک مکانیزم داخلی برای پیکربندی برنامه با استفاده از پرونده ای به نام Application.properties همراه است.
 * همانطور که در شکل زیر نشان داده شده است ، در داخل پوشه src / main / منابع قرار دارد.
 * اسپرینگ Boot خصوصیات مختلفی را در پیکربندی پرونده Application.properties ارائه می دهد.
 * این ویژگی ها مقادیر پیش فرض دارند.
 * ما می توانیم یک ویژگی (های) را برای برنامه Spring Boot تنظیم کنیم.
 * اسپرینگ Boot همچنین به ما امکان می دهد در صورت لزوم خاصیت خود را تعریف کنیم.
 * پرونده Application.properties به ما امکان می دهد تا یک برنامه را در یک محیط متفاوت اجرا کنیم.
 * به طور خلاصه ، می توانیم از پرونده Application.properties استفاده کنیم:
 * 1- چارچوب Spring Boot را پیکربندی کنید
 * 2. از ویژگی های پیکربندی سفارشی برنامه ما تعریف کنید
 *
 * Example of application.properties:
 * #configuring application name
 * spring.application.name = demoApplication
 * #configuring port
 * server.port = 8081
 * In the above example, we have configured the application name and port. The port 8081 denotes that the application runs on port 8081.
 *در مثال بالا نام برنامه و پورت را پیکربندی کرده ایم. پورت 8081 بیانگر اجرای برنامه در پورت 8081 است.
 *
 * YAML Properties File:
 * Spring Boot provides another file to configure the properties is called yml file.
 * The Yaml file works because the Snake YAML jar is present in the classpath.
 * Instead of using the application.properties file, we can also use the application.yml file, but the Yml file should be present in the classpath.
 * پرونده ویژگی های YAML:
 * اسپرینگ Boot یک پرونده دیگر برای پیکربندی خواص فایل yml نامیده می شود.
 * پرونده Yaml به این دلیل کار می کند که jar Snake YAML در مسیر کلاس وجود دارد.
 * به جای استفاده از پرونده Application.properties ، می توانیم از فایل Application.yml نیز استفاده کنیم ، اما فایل Yml باید در classpath موجود باشد.
 *
 * Classpath:
 * the path /src/main/resources is a Maven project structure convention.
 * It's a path inside your project where you place resources. During the build step, Maven will take files in there and place them in the appropriate place for you to use them in your runtime classpath.
 *مسیر کلاس:
 * مسیر/src/main/resources  منابع یک کنوانسیون ساختار پروژه Maven است.
 * این مسیری در داخل پروژه شما است که در آن منابع قرار می دهید.
 * در طی مرحله ساخت ، Maven پرونده هایی را در آنجا قرار می دهد و آنها را در مکان مناسبی قرار می دهد تا شما بتوانید از آنها در مسیر runtime استفاده کنید
 *
 * Example of application.yml:
 * spring:
 * application:
 * name: demoApplication
 * server:
 * port: 8081
 * In the above example, we have configured the application name and port. The port 8081 denotes that the application runs on port 8081.
 *
 * Spring Boot Property Categories
 * There are sixteen categories of Spring Boot Property are as follows:
 *دسته بندی Propertiesهای بوت Spring
 * شانزده دسته از Propertiesهای بوت Spring به شرح زیر است:
 *
 * Core Properties
 * Cache Properties
 * Mail Properties
 * JSON Properties
 * Data Properties
 * Transaction Properties
 * Data Migration Properties
 * Integration Properties
 * Web Properties
 * Templating Properties
 * Server Properties
 * Security Properties
 * RSocket Properties
 * Actuator Properties
 * DevTools Properties
 * Testing Properties
 *
 * Application Properties Table:
 * The following tables provide a list of common Spring Boot properties:
 * جدول ویژگی های برنامه:
 * در جدول زیر لیستی از خصوصیات مشترک Spring Boot  ارائه شده است:
 *
 * Debug:
 * Default Value: false
 * It enables debug logs.
 *این logs مربوط به اشکال زدایی را فعال می کند.
 *
 * spring.application.name:
 * It is used to set the application name.
 *برای تنظیم نام برنامه استفاده می شود.
 *
 * spring.application.admin.enabled:
 * Default Value: false
 * It is used to enable admin features of the application.
 *این برای فعال کردن ویژگی های سرپرست برنامه استفاده می شود.
 *
 * spring.config.name:
 * Default Value: application
 * It is used to set config file name.
 *برای تنظیم نام پرونده پیکربندی استفاده می شود.
 *
 * spring.config.location	:
 * It is used to config the file name.
 * برای پیکربندی نام پرونده استفاده می شود.
 *
 * server.port:
 * Default Value: 8080
 * Configures the HTTP server port
 * درگاه سرور HTTP را پیکربندی می کند
 *
 * server.servlet.context-path:
 * It configures the context path of the application.
 * این مسیر متن برنامه را پیکربندی می کند.
 *
 * logging.file.path:
 * It configures the location of the log file.
 * این مکان پرونده log را پیکربندی می کند.
 *
 * spring.banner.charset:
 * Default Value: UTF-8
 * Banner file encoding.
 * رمزگذاری پرونده بنر.
 *
 * spring.banner.location:
 * Default Value: classpath:banner.txt
 * It is used to set banner file location.
 * از آن برای تنظیم موقعیت مکانی بنر استفاده می شود.
 *
 * logging.file:
 * It is used to set log file name. For example, data.log.
 * برای تنظیم نام پرونده log استفاده می شود. به عنوان مثال ، data.log.
 *
 * spring.application.index:
 * It is used to set application index.
 * برای تنظیم فهرست برنامه کاربرد دارد.
 *
 * spring.application.name:
 * It is used to set the application name.
 * برای تنظیم نام برنامه استفاده می شود.
 *
 * spring.application.admin.enabled:
 * Default Value: false
 * It is used to enable admin features for the application.
 * برای فعال کردن ویژگی های سرپرست برای برنامه استفاده می شود.
 *
 * spring.config.location:
 * It is used to config the file locations.
 * برای پیکربندی مکان پرونده استفاده می شود.
 *
 * spring.config.name:
 * Default Value: application
 * It is used to set config the file name.
 * برای تنظیم پیکربندی نام پرونده استفاده می شود.
 *
 * spring.mail.default-encoding:
 * Default Value: UTF-8
 * It is used to set default MimeMessage encoding.
 * برای تنظیم رمزگذاری پیش فرض MimeMessage استفاده می شود.
 *
 * spring.mail.host:
 * It is used to set SMTP server host. For example, smtp.example.com.
 * برای تنظیم میزبان سرور SMTP استفاده می شود. به عنوان مثال ، smtp.example.com.
 *
 * spring.mail.password:
 * It is used to set login password of the SMTP server.
 * برای تنظیم گذرواژه ورود به سرور SMTP استفاده می شود.
 *
 * spring.mail.port:
 * It is used to set SMTP server port.
 * برای تنظیم پورت سرور SMTP استفاده می شود.
 *
 * spring.mail.test-connection:
 * Default Value: false
 * It is used to test that the mail server is available on startup.
 * برای آزمایش اینکه سرور نامه در هنگام راه اندازی در دسترس است استفاده می شود.
 *
 * spring.mail.username:
 * It is used to set login user of the SMTP server.
 * برای تنظیم کاربر ورود به سیستم از سرور SMTP استفاده می شود.
 *
 * spring.main.sources:
 * It is used to set sources for the application.
 * برای تنظیم منابع برای برنامه استفاده می شود.
 *
 * server.address:
 * It is used to set network address to which the server should bind to.
 * برای تنظیم آدرس شبکه ای که سرور باید به آن وصل شود استفاده می شود.
 *
 * server.connection-timeout:
 * It is used to set time in milliseconds that connectors will wait for another HTTP request before closing the connection.
 *این برای تنظیم زمان در میلی ثانیه استفاده می شود که اتصالات قبل از بستن اتصال منتظر درخواست HTTP دیگر شوند.
 *
 * server.context-path:
 * It is used to set context path of the application.
 * برای تنظیم مسیر متن برنامه استفاده می شود.
 *
 * server.port:
 * Default Value: 8080
 * It is used to set HTTP port.
 * برای تنظیم پورت HTTP استفاده می شود.
 *
 * server.server-header:
 * It is used for the Server response header (no header is sent if empty)
 * برای هدر پاسخ سرور استفاده می شود (در صورت خالی هیچ هدر ارسال نمی شود)
 *
 * server.servlet-path:
 * Default Value: /
 * It is used to set path of the main dispatcher servlet
 * این برای تنظیم مسیر سرویس اصلی توزیع کننده مورد استفاده قرار می گیرد
 *
 * server.ssl.enabled:
 * It is used to enable SSL support.
 * برای فعال کردن پشتیبانی SSL استفاده می شود.
 *
 * spring.http.multipart.enabled:
 * Default Value: True
 * It is used to enable support of multi-part uploads.
 * برای فعال کردن پشتیبانی از آپلودهای چند بخشی استفاده می شود.
 *
 * spring.servlet.multipart.max-file-size
 * Default Value: 1MB
 * It is used to set max file size.
 * برای تنظیم اندازه پرونده حداکثر استفاده می شود.
 *
 * spring.mvc.async.request-timeout:
 * It is used to set time in milliseconds.
 * برای تنظیم زمان در میلی ثانیه استفاده می شود.
 *
 * spring.mvc.date-format:
 * It is used to set date format. For example, dd/MM/yyyy.
 * برای تنظیم فرمت تاریخ استفاده می شود. به عنوان مثال ، dd / MM / yyyy.
 *
 * spring.mvc.locale:
 * It is used to set locale for the application.
 * از آن برای تنظیم محلی برای برنامه استفاده می شود.
 *
 * spring.social.facebook.app-id:
 * It is used to set application's Facebook App ID.
 * برای تنظیم شناسه برنامه Facebook کاربرد استفاده می شود.
 *
 * spring.social.linkedin.app-id:
 * It is used to set application's LinkedIn App ID.
 * برای تنظیم شناسه برنامه LinkedIn برنامه کاربردی استفاده می شود.
 *
 * spring.social.twitter.app-id	:
 * It is used to set application's Twitter App ID.
 * برای تنظیم شناسه برنامه توییتر برنامه استفاده می شود.
 *
 * security.basic.authorize-mode:
 * Default Value: role
 * It is used to set security authorize mode to apply.
 * برای تنظیم حالت مجوز امنیتی استفاده می شود.
 *
 * security.basic.enabled:
 * Default Value: true
 * It is used to enable basic authentication.
 * برای فعال کردن احراز هویت اساسی استفاده می شود.
 *
 * Spring.test.database.replace:
 * Default Value: any
 * Type of existing DataSource to replace.
 * نوع داده موجود را جایگزین کنید.
 *
 * Spring.test.mockmvc.print:
 * Default Value: default
 * MVC Print option
 * گزینه چاپ MVC
 *
 * spring.freemaker.content-type:
 * Default Value: text/html
 * Content Type value
 * مقدار نوع محتوا
 *
 * server.server-header:
 * Value to use for the server response header.
 * ارزش استفاده برای هدر پاسخ سرور.
 *
 * spring.security.filter.dispatcher-type:
 * Default Value: async, error, request
 * Security filter chain dispatcher types.
 * انواع توزیع کننده زنجیره ای فیلتر امنیتی.
 *
 * spring.security.filter.order:
 * Default Value: -100
 * Security filter chain order.
 * سفارش زنجیره فیلتر امنیتی.
 *
 * spring.security.oauth2.client.registration.*:
 * Default Value: OAuth
 * client registrations.
 * ثبت نام مشتری.
 *
 * spring.security.oauth2.client.provider.*:
 * Default Value: OAuth
 * provider details.
 * جزئیات ارائه دهنده
 */
public class SpringBootApplicationProperties {
}
