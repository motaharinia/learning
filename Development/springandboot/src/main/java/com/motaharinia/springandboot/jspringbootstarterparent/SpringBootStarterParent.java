package com.motaharinia.springandboot.jspringbootstarterparent;

/**
 *https://www.javatpoint.com/spring-boot-starter-parent
 *
 * Spring Boot Starter Parent:
 * The spring-boot-starter-parent is a project starter. It provides default configurations for our applications.
 * It is used internally by all dependencies.
 * All Spring Boot projects use spring-boot-starter-parent as a parent in pom.xml file.
 * والدین Spring Boot Starter :
 * والدین Spring-boot-starter یک پروژه شروع کننده است. این تنظیمات پیش فرض را برای برنامه های ما فراهم می کند.
 * در داخل توسط کلیه وابستگی ها مورد استفاده قرار می گیرد.
 * تمام پروژه های Boot Spring از والدین اسپرینگ و شروع برنامه والدین به عنوان والدین در پرونده pom.xml استفاده می کنند
 *
 * <parent>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-parent</artifactId>
 * <version>1.4.0.RELEASE</version>
 * </parent>
 *
 * Parent Poms allow us to manage the following things for multiple child projects and modules:
 * 1. Configuration: It allows us to maintain consistency of Java Version and other related properties.
 * 2. Dependency Management: It controls the versions of dependencies to avoid conflict.
 * 3. Source encoding
 * 4. Default Java Version
 * 5. Resource filtering
 * 6. It also controls the default plugin configuration.
 * The spring-boot-starter-parent inherits dependency management from spring-boot-dependencies. We only need to specify the Spring Boot version number. If there is a requirement of the additional starter, we can safely omit the version number.
 *والدین Poms به ما امکان می دهد موارد زیر را برای چندین پروژه کودک و ماژول مدیریت کنیم:
 * 1. پیکربندی: این امکان را به ما می دهد که قوام نسخه Java و سایر خصوصیات مرتبط را حفظ کنیم.
 * 2- مدیریت وابستگی: برای جلوگیری از درگیری ، نسخه های وابستگی را کنترل می کند.
 * 3. رمزگذاری منبع
 * 4. نسخه پیش فرض جاوا
 * 5. فیلتر کردن منابع
 * 6. همچنین تنظیمات پیش فرض افزونه را کنترل می کند.
 * والدین اسپرینگ شروع به کار مدیریت وابستگی را از وابستگی اسپرینگ-بوت به ارث می برند. ما فقط باید شماره نسخه Spring Boot را مشخص کنیم. در صورت نیاز به استارت اضافی ، می توانیم با خیال راحت شماره نسخه را حذف کنیم.
 *
 * Spring Boot Starter Parent Internal:
 * Spring Boot Starter Parent defines spring-boot-dependencies as a parent pom.
 * It inherits dependency management from spring-boot-dependencies.
 * والدین Spring Boot Starter داخلی:
 * اسپرینگ Boot Starter والدین ، وابستگی های اسپرینگ و بوت را به عنوان یک pom والدین تعریف می کند.
 * این مدیریت وابستگی را از وابستگی های اسپرینگ-بوت به ارث می برد.
 *
 * <parent>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-dependencies</artifactId>
 * <version>1.6.0.RELEASE</version>
 * <relativePath>../../spring-boot-dependencies</relativePath>
 * </parent>
 *
 * Default Parent Pom
 * یک Parent Pom پیش فرض
 *
 * <properties>
 * <java.version>1.8</java.version>
 * <resource.delimiter>@</resource.delimiter>
 * <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
 * <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
 * <maven.compiler.source>${java.version}</maven.compiler.source>
 * <maven.compiler.target>${java.version}</maven.compiler.target>
 * </properties>
 *
 * The properties section defines the application default values.
 * The default Java version is 1.8. We can also override Java version by specifying a property <java.version>1.8</java.version> in the project pom.
 * The parent pom also contains the few other settings related to encoding and source.
 * The Spring Boot framework uses these defaults in case, if we have not defined in the application.properties file.
 * بخش Properties مقادیر پیش فرض برنامه را تعریف می کند.
 * نسخه پیش فرض جاوا 1.8 است. ما همچنین می توانیم با مشخص کردن یک ویژگی < java.version> 1.8 < /java.version> در pom پروژه ، نسخه جاوا را نادیده بگیریم.
 * والدین pom همچنین حاوی معدود تنظیمات دیگر در رابطه با رمزگذاری و منبع است.
 * فریم ورک Spring Boot در صورتی که در پرونده Application.properties تعریف نکرده باشیم از این پیش فرض ها استفاده می کند.
 *
 * Plugin Management:
 * The spring-boot-starter-parent specifies the default configuration for a host of plugins including maven-failsafe-plugin, maven-jar-plugin and maven-surefire-plugin.
 *مدیریت افزونه:
 * والدین Spring-boot-starter ، تنظیمات پیش فرض برای تعدادی از افزونه ها شامل پلاگین maven-failsafe-plugin ، maven-jar-plugin و maven-surefire-plugin را مشخص می کند.
 *
 * Spring Boot Dependencies:
 * The spring-boot-starter-parent dependency inherit from the spring-boot-dependencies, it shares all these characteristics as well.
 * Hence the Spring Boot manages the list of the dependencies as the part of the dependency management.
 *وابستگی های بوت اسپرینگ:
 * وابستگیspring-boot-starter-parent  از وابستگی هایspring-boot-dependencies به ارث می برد ، همه این خصوصیات را نیز به اشتراک می گذارد.
 * از این رو بوت اسپرینگ لیست وابستگی ها را به عنوان بخشی از مدیریت وابستگی مدیریت می کند.
 *
 * Spring Boot Starter without Parent:
 * In some cases, we need not to inherit spring-boot-starter-parent in the pom.xml file.
 * To handle such use cases, Spring Boot provides the flexibility to still use the dependency management without inheriting the spring-boot-starter-parent.
 *In the above code, we can see that we have used <scope> tag for this. It is useful when we want to use different version for a certain dependency.
 *آغازگر بوت اسپرینگ بدون پدر و مادر:
 * در بعضی موارد ، لازم نیست که در پرونده pom.xml وراثت spring-boot-starter-parent  را به ارث ببریم.
 * برای رسیدگی به چنین موارد استفاده ، Spring Boot قابلیت انعطاف پذیری را برای استفاده از مدیریت وابستگی بدون ارث بردن از والدین spring-boot-starter-parent  اسپرینگ فراهم می کند.
 * در کد بالا می بینیم که از این برچسب < scope> استفاده کرده ایم. وقتی می خواهیم از یک نسخه متفاوت برای یک وابستگی خاص استفاده کنیم ، مفید است.
 */
public class SpringBootStarterParent {
}
