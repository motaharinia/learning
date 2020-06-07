package com.motaharinia.springandboot.rspringbootautoconfiguration;

/**
 * https://www.javatpoint.com/spring-boot-auto-configuration
 *
 *Spring Boot Auto-configuration:
 * Spring Boot auto-configuration automatically configures the Spring application based on the jar dependencies that we have added.
 * For example, if the H2 database Jar is present in the classpath and we have not configured any beans related to the database manually, the Spring Boot's auto-configuration feature automatically configures it in the project.
 * We can enable the auto-configuration feature by using the annotation @EnableAutoConfiguration.
 * But this annotation does not use because it is wrapped inside the @SpringBootApplication annotation.
 * The annotation @SpringBootApplication is the combination of three annotations: @ComponentScan, @EnableAutoConfiguration, and @Configuration.
 * However, we use @SpringBootApplication annotation instead of using @EnableAutoConfiguration.
 * When we add the spring-boot-starter-web dependency in the project, Spring Boot auto-configuration looks for the Spring MVC is on the classpath.
 * It auto-configures dispatcherServlet, a default error page, and web jars.
 * Similarly, when we add the spring-boot-starter-data-jpa dependency, we see that Spring Boot Auto-configuration, auto-configures a datasource and an Entity Manager.
 * All auto-configuration logic is implemented in spring-boot-autoconfigure.jar, as shown in the following figure.
 *تنظیمات خودکار Spring Boot:
 * تنظیمات خودکار Spring Boot به طور خودکار برنامه Spring را بر اساس وابستگی های jar ای که اضافه کرده ایم پیکربندی می کند.
 * به عنوان مثال ، اگر Jar database Jar در classpath موجود باشد و ما هیچ بین مربوط به دیتابیس را به صورت دستی پیکربندی نکرده ایم ، ویژگی تنظیمات خودکار Spring Boot به طور خودکار آن را در پروژه پیکربندی می کند.
 * ما می توانیم با استفاده از انوتیشنEnableAutoConfiguration  ، ویژگی تنظیمات خودکار را فعال کنیم.
 * اما این انوتیشن از آن استفاده نمی کند زیرا درون انوتیشنSpringBootApplication شامل شده است.
 * انوتیشنSpringBootApplication ترکیبی از سه انوتیشن است:ComponentScan ،EnableAutoConfiguration وConfiguration.
 * با این حال ، ما به جای استفاده ازEnableAutoConfiguration از انوتیشنSpringBootApplication استفاده می کنیم.
 * وقتی وابستگی spring-boot-starter-web را در پروژه اضافه می کنیم ، پیکربندی خودکار Spring Boot به نظر می رسد که Spring MVC در مسیر کلاس باشد.
 * این پیکربندی خودکار dispatcherServlet ، یک صفحه خطای پیش فرض و jar های وب است.
 * به طور مشابه ، هنگامی که به Spring-boot-starter-data-jpa وابستگی اضافه می کنیم ، می بینیم که Spring Boot Auto-configuration ، پیکربندی خودکار یک منبع داده و یک Entity Manager را پیکربندی می کند.
 * تمام منطق پیکربندی خودکار همانطور که در شکل زیر نشان داده شده است در spring-boot-autoconfigure.jar اجرا می شود
 *
 * Need of auto-configuration:
 * Spring-based application requires a lot of configuration.
 * When we use Spring MVC, we need to configure dispatcher servlet, view resolver, web jars among other things.
 * Similarly, when we use Hibernate/ JPA, we need to configure datasource, a transaction manager, an entity manager factory among a host of other things.
 * نیاز به پیکربندی خودکار:
 * برنامه مبتنی بر اسپرینگ نیاز به پیکربندی زیادی دارد.
 * هنگامی که ما از Spring MVC استفاده می کنیم ، باید پیکربندی dispatcher servlet ، view resolver ،  web jars را از جمله موارد دیگر تنظیم کنیم.
 *به طور مشابه ، هنگامی که ما از Hibernate / JPA استفاده می کنیم ، باید پیکربندی داده ها ، transaction manager ،  entity manager factory را در میان سایر موارد دیگر پیکربندی کنیم.
 *
 * Disable Auto-configuration Classes:
 * We can also disable the specific auto-configuration classes, if we do not want to be applied.
 * We use the exclude attribute of the annotation @EnableAutoConfiguration to disable the auto-configuration classes.For example:
 * @ EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
 * We can use the attribute excludeName of the annotation @EnableAutoConfiguration and specify the qualified name of the class, if the class is not on the class path.
 * We can exclude any number of auto-configuration classes by using the property spring.autoconfigure.exclude.
 *غیر فعال کردن کلاس های تنظیمات خودکار:
 * اگر نمی خواهیم اعمال شود ، می توانیم کلاس های خاص تنظیمات خودکار را غیرفعال کنیم.
 * ما برای غیرفعال کردن کلاس های تنظیمات خودکار از ویژگی حذف انوتیشنEnableAutoConfiguration استفاده می کنیم. برای مثال:
 * @ EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
 * اگر کلاس در مسیر کلاس نباشد می توانیم از ویژگی excludeName انوتیشنEnableAutoConfiguration استفاده کنیم و نام واجد شرایط کلاس را مشخص کنیم.
 * ما می توانیم با استفاده از خاصیت Spring.autoconfigure.exclude تعداد کلاسهای تنظیمات خودکار را حذف کنیم.
 *
 * Debugging Auto-configuration:
 * We can find more information about auto-configuration by using the following two ways:
 *اشکال زدایی تنظیم خودکار:
 * با استفاده از دو روش زیر می توانیم اطلاعات بیشتری درباره تنظیمات خودکار پیدا کنیم:
 *
 * 1. Turning on debug logging:
 * We can debug logging by adding a property in the application.properties file.
 * Open the application.properties file and add the following property:
 * logging.level.org.springframework: DEBUG
 * Now restart the application.
 * We see that an auto-configuration report printed in the log.
 * The report includes all the classes that are auto-configured.
 * It is divided into two parts: positive matches and negative matches.
 *1. روشن کردن ورود به سیستم اشکال زدایی:
 * ما می توانیم با اضافه کردن یک ویژگی در پرونده Application.properties ، ورود به سیستم را انجام دهیم.
 * پرونده Application.properties را باز کنید و ویژگی زیر را اضافه کنید:
 * logging.level.org.springframework: DEBUG
 * اکنون برنامه را مجدداً راه اندازی کنید.
 * ما می بینیم که گزارش پیکربندی خودکار در سیاهه سیاه چاپ می شود.
 * این گزارش شامل کلیه کلاسهایی است که به صورت خودکار تنظیم می شوند.
 * این تطبیقها به دو بخش تقسیم می شود: تطبیقهای مثبت و تطبیقهای منفی.
 *
 * 2. Using Spring Boot Actuator:
 * We can also debug auto-configuration by using Actuator in the project.
 * We will also add in HAL Browser to make things easy.
 * It shows the details of all the beans that are auto-configured, and those are not.
 * invoke the actuator URL http://localhost:8080/actuator. It launches the actuator that shows the three URLs: self, health, and info
 * Open the pom.xml file and add the HAL Browser dependency.
 * To access the HAL browser, type http://localhost:8080 in the browser and hit the enter key
 * Now we can access the actuator through the HAL browser.
 * Type /actuator in the Explorer's text box and click on the Go button.
 * It shows all the things related to the actuator.
 * The most important thing in the actuator is beans.
 * When we click on the bean's arrow, it shows all the beans configured in the Spring Boot project.
 *2. با استفاده از Spring Boot Actuator:
 * همچنین می توانیم با استفاده از Actuator در پروژه ، پیکربندی خودکار را اشکال زدایی کنیم.
 * ما همچنین به مرورگر HAL اضافه خواهیم کرد تا کارها آسان شود.
 * جزئیات تمام بین هایی که به صورت خودکار تنظیم شده اند نشان می دهد ، و آنهایی که اینگونه نیستند.
 * آدرس URL محرک http://localhost:8080/actuator را فراخوانی کنید. این محرک را راه اندازی می کند که سه URL را نشان می دهد: self ، health و info
 * پرونده pom.xml را باز کرده و وابستگی مرورگر HAL را اضافه کنید.
 * برای دسترسی به مرورگر HAL ، در مرورگر http://localhost:8080 را تایپ کرده و کلید Enter را بزنید
 * اکنون می توانیم از طریق مرورگر HAL به محرک دسترسی پیدا کنیم.
 * در کادر متن Explorer تایپ/actuator را بزنید و بر روی دکمه Go کلیک کنید.
 * تمام موارد مربوط به محرک را نشان می دهد.
 * مهمترین چیز در محرک بین است.
 * وقتی روی پیکان بین کلیک می کنیم ، تمام بین های تنظیم شده در پروژه Spring Boot را نشان می دهد.
 *
 */
public class SpringBootAutoConfiguration {
}
