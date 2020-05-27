package com.motaharinia.springandboot.kspringbootstarterweb;

/**
 * https://www.javatpoint.com/spring-boot-starter-web
 *
 * Spring Boot Starter Web
 * There are two important features of spring-boot-starter-web:
 * 1. It is compatible for web development
 * 2. Auto configuration
 * If we want to develop a web application, we need to add the following dependency in pom.xml file:
 *
 *Spring Boot Starter Web
 * دو ویژگی مهم spring-boot-starter-web وجود دارد:
 * 1. برای توسعه وب سازگار است
 * 2. پیکربندی خودکار
 * اگر می خواهیم یک برنامه وب توسعه دهیم ، باید وابستگی زیر را در پرونده pom.xml اضافه کنیم:
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-web</artifactId>
 * <version>2.2.2.RELEASE</version>
 * </dependency>
 *
 * Starter of Spring web uses Spring MVC, REST and Tomcat as a default embedded server.
 * The single spring-boot-starter-web dependency transitively pulls in all dependencies related to web development.
 * It also reduces the build dependency count.
 * The spring-boot-starter-web transitively depends on the following:
 * شروع کننده وب  Spring Spring از Spring MVC ، REST و Tomcat به عنوان سرور جاسازی شده پیش فرض استفاده می کند.
 * وابستگیspring-boot-starter-web به تنهایی وابستگی های وابسته به توسعه وب را به خود جلب می کند.
 * همچنین تعداد وابستگی ساخت را کاهش می دهد.
 * یک spring-boot-starter-web به طور گذرا به موارد زیر بستگی دارد:
 * 1. org.springframework.boot:spring-boot-starter
 * 2. org.springframework.boot:spring-boot-starter-tomcat
 * 3. org.springframework.boot:spring-boot-starter-validation
 * 4. com.fasterxml.jackson.core:jackson-databind
 * 5. org.springframework:spring-web
 * 6. org.springframework:spring-webmvc
 * By default, the spring-boot-starter-web contains the following tomcat server dependency:
 * به طور پیش فرض ،  spring-boot-starter-web شامل وابستگی سرور Tomcat زیر است
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-tomcat</artifactId>
 * <version>2.0.0.RELEASE</version>
 * <scope>compile</scope>
 * </dependency>
 *
 * The spring-boot-starter-web auto-configures the following things that are required for the web development:
 * 1. Dispatcher Servlet
 * 2. Error Page
 * 3. Web JARs for managing the static dependencies
 * 4. Embedded servlet container
 *
 *  یک spring-boot-starter-web  به صورت خودکار تنظیمات موارد زیر را که برای توسعه وب مورد نیاز است تنظیم می کند:
 *  1. دیسپچر سروت
 * 2. صفحه خطا
 * 3. س JAR های وب برای مدیریت وابستگی های استاتیک
 * 4- ظرف سرو سرویس جاسازی شده
 *
 *
 * Spring Boot Embedded Web Server:
 * Each Spring Boot application includes an embedded server.
 * Embedded server is embedded as a part of deployable application.
 * The advantage of embedded server is, we do not require pre-installed server in the environment.
 * With Spring Boot, default embedded server is Tomcat.
 * Spring Boot also supports another two embedded servers:
 * 1. Jetty Server
 * 2. Undertow Server
 * وب سرور جاسازی شده بوت:
 * هر برنامه Spring Boot شامل یک سرور تعبیه شده است.
 * سرور جاسازی شده به عنوان بخشی از برنامه قابل استقرار تعبیه شده است.
 * مزیت سرور تعبیه شده این است که ما نیازی به سرور از پیش نصب شده در محیط نداریم.
 * با Spring Boot ، سرور تعبیه شده پیش فرض Tomcat است.
 * Boot Spring همچنین از دو سرور تعبیه شده دیگر پشتیبانی می کند:
 * 1. سرور Jetty
 * 2. سرور Undertow
 *
 *
 * Using another embedded web server:
 * For servlet stack applications, the spring-boot-starter-web includes Tomcat by including spring-boot-starter-tomcat, but we can use spring-boot-starter-jetty or spring-boot-starter-undertow instead.
 * For reactive stack applications, the spring-boot-starter-webflux includes Reactor Netty by including spring-boot-starter-reactor-netty, but we can use spring-boot-starter-tomcat, spring-boot-starter-jetty, or spring-boot-starter-undertow instead.
 *با استفاده از یک سرور وب جاسازی شده دیگر:
 * برای برنامه های کاربردی پشته servlet ،spring-boot-starter-web شامل Tomcat توسط spring-boot-starter-tomcat است ، اما به جای آن می توانیم ازspring-boot-starter-jetty  یاspring-boot-starter-undertow استفاده کنیم.
 * برای برنامه های کاربردی پشته واکنشی ، spring-boot-starter-webflux  شامل Reactor Netty با شامل spring-boot-starter-reactor-netty است ، اما می توانیم از spring-boot-starter-jetty، spring-boot-starter-tomcat یا به جای آن ، از spring-boot-starter-undertow استفاده کنیم.
 *
 * Jetty Server:
 * The Spring Boot also supports an embedded server called Jetty Server.
 * It is an HTTP server and Servlet container that has the capability of serving static and dynamic content.
 * It is used when machine to machine communication is required.
 * If we want to add the Jetty server in the application, we need to add the spring-boot-starter-jetty dependency in our pom.xml file.
 * Remember: While using Jetty server in the application, make sure that the default Tomcat server is excluded from the spring-boot-starter-web.
 * It avoids the conflict between servers.
 * سرور Jetty:
 * اسپرینگ بوت همچنین از سرور تعبیه شده به نام Jetty Server پشتیبانی می کند.
 * این یک سرور HTTP و ظرف Servlet است که قابلیت ارائه محتوای استاتیک و پویا را دارد.
 * این مورد هنگام استفاده از دستگاه به دستگاه مورد نیاز مورد استفاده قرار می گیرد.
 * اگر می خواهیم سرور Jetty را در برنامه اضافه کنیم ، باید وابستگیspring-boot-starter-jetty را در پرونده pom.xml خود اضافه کنیم.
 * به یاد داشته باشید: در حالی که از سرور Jetty در برنامه استفاده می کنید ، اطمینان حاصل کنید که سرور پیش فرض Tomcat از spring-boot-starter-web خارج شده است
 * این از درگیری بین سرورها جلوگیری می کند.
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-web</artifactId>
 * <exclusions>
 * <exclusion>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-tomcat</artifactId>
 * </exclusion>
 * </exclusions>
 * </dependency>
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-jetty</artifactId>
 * </dependency>
 *
 * We can also customize the behavior of the Jetty server by using the application.properties file.
 * همچنین می توانیم با استفاده از پرونده Application.properties رفتار سرور Jetty را سفارشی سازی کنیم
 *
 * Undertow Server:
 * Spring Boot provides another server called Undertow.
 * It is also an embedded web server like Jetty.
 * It is written in Java and manage and sponsored by JBoss.
 * The main advantages of Undertow server are:
 * 1. Supports HTTP/2
 * 2. HTTP upgrade support
 * 3. Websocket Support
 * 4. Provides support for Servlet 4.0
 * 5. Flexible
 * 6. Embeddable
 * Remember: While using Undertow server in the application, make sure that the default Tomcat server is excluded from the spring-boot-starter-web.
 * It avoids the conflict between servers.
 * سرور Undertow:
 * اسپرینگ بوت سرور دیگری به نام Undertow ارائه می دهد.
 * همچنین یک وب سرور جاسازی شده مانند Jetty است.
 * در جاوا نوشته شده و توسط JBoss مدیریت و پشتیبانی می کند.
 * مزایای اصلی سرور Undertow عبارتند از:
 * 1. از HTTP / 2 پشتیبانی می کند
 * 2. پشتیبانی از ارتقاء HTTP
 * 3. پشتیبانی از وب
 * 4- پشتیبانی از Servlet 4.0 را فراهم می کند
 * 5. انعطاف پذیر
 * 6. جاسازی شده
 * به یاد داشته باشید: در حالی که از سرور Undertow در برنامه استفاده می کنید ، اطمینان حاصل کنید که سرور پیش فرض Tomcat از spring-boot-starter-web خارج شده است.
 * این از درگیری بین سرورها جلوگیری می کند.
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-web</artifactId>
 * <exclusions>
 * <exclusion>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-tomcat</artifactId>
 * </exclusion>
 * </exclusions>
 * </dependency>
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-undertow</artifactId>
 * </dependency>
 *
 * We can also customize the behavior of the Undertow server by using the application.properties file.
 * همچنین می توانیم با استفاده از پرونده Application.properties رفتارهای سرور Undertow را سفارشی کنیم.
 *
 * spring-boot-starter-web vs. spring-boot-starter-tomcat:
 * The spring-boot-starter-web contains the spring web dependencies that includes spring-boot-starter-tomcat. The spring-boot-starter-web contains the following:
 *spring-boot-starter-web  در مقابل spring-boot-starter-tomcat:
 * یک  spring-boot-starter-web  شامل وابستگی های اسپرینگ وب است که شامل spring-boot-starter-tomcat. است. spring-boot-starter-web شامل موارد زیر است:
 * 1. spring-boot-starter
 * 2. jackson
 * 3. spring-core
 * 4. spring-mvc
 * 5. spring-boot-starter-tomcat
 *
 * While the spring-boot-starter-tomcat contains everything related to Tomcat server.
 * در حالی که Spring-boot-starter-tomcat شامل همه چیز مربوط به سرور Tomcat است.
 *
 * 1. core
 * 2. el
 * 3. logging
 * 4. websocket
 *
 * The starter-tomcat has the following dependencies:
 * یک starter-tomcat وابستگی های زیر را دارد:
 *
 * <dependency>
 * <groupId>org.apache.tomcat.embed</groupId>
 * <artifactId>tomcat-embed-core</artifactId>
 * <version>8.5.23</version>
 *  <scope>compile</scope>
 * </dependency>
 * <dependency>
 * <groupId>org.apache.tomcat.embed</groupId>
 * <artifactId>tomcat-embed-el</artifactId>
 * <version>8.5.23</version>
 * <scope>compile</scope>
 * </dependency>
 * <dependency>
 * <groupId>org.apache.tomcat.embed</groupId>
 * <artifactId>tomcat-embed-websocket</artifactId>
 * <version>8.5.23</version>
 * <scope>compile</scope>
 * </dependency>
 *
 * We can also use spring-mvc without using the embedded Tomcat server.
 * If we want to do so, we need to exclude the Tomcat server by using the <exclusion> tag, as shown in the following code.
 * ما همچنین می توانیم از Spring-mvc بدون استفاده از سرور Tomcat تعبیه شده استفاده کنیم.
 * اگر می خواهیم این کار را انجام دهیم ، باید همانطور که در کد زیر نشان داده شده است ، سرور Tomcat را با استفاده از برچسب < exclusion> حذف کنیم.
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-web</artifactId>
 * <exclusions>
 * <exclusion>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-tomcat</artifactId>
 * </exclusion>
 * </exclusions>
 * </dependency>
 */
public class SpringBootStarterWeb {
}
