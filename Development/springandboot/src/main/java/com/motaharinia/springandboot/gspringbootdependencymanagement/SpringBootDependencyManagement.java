package com.motaharinia.springandboot.gspringbootdependencymanagement;

/**
 * https://www.javatpoint.com/spring-boot-dm
 * Spring Boot Dependency Management:
 * Spring Boot manages dependencies and configuration automatically.
 * Each release of Spring Boot provides a list of dependencies that it supports.
 * The list of dependencies is available as a part of the Bills of Materials (spring-boot-dependencies) that can be used with Maven.
 * So, we need not to specify the version of the dependencies in our configuration.
 * Spring Boot manages itself.
 * Spring Boot upgrades all dependencies automatically in a consistent way when we update the Spring Boot version.
 *مدیریت وابستگی اسپرینگ بوت:
 * بوت Spring به طور خودکار وابستگی ها و پیکربندی ها را مدیریت می کند.
 * هر نسخه از Spring Boot لیستی از وابستگی هایی را که پشتیبانی می کند فراهم می کند.
 * لیست وابستگی ها به عنوان بخشی از لیست اقلام (spring-boot-dependencies) در دسترس است که می تواند توسط Maven استفاده شود.
 * بنابراین ، لازم نیست که نسخه وابستگی ها را در پیکربندی خود مشخص کنیم.
 * اسپرینگ بوت خودش را مدیریت می کند.
 * بوت Spring هنگام به روزرسانی نسخه Boot Spring ، تمام وابستگی ها را بطور خودکار به روز می کند.
 *
 * Advantages of Dependency Management:
 * 1. It provides the centralization of dependency information by specifying the Spring Boot version in one place. It helps when we switch from one version to another.
 * 2. It avoids mismatch of different versions of Spring Boot libraries.
 * 3. We only need to write a library name with specifying the version. It is helpful in multi-module projects.
 * مزایای مدیریت وابستگی:
 * 1. با مشخص کردن نسخه Spring Boot در یک مکان ، مرکزیت اطلاعات وابستگی را فراهم می کند. این کمک می کند که از یک نسخه به نسخه دیگر تغییر دهیم.
 * 2. از عدم تطابق نسخه های مختلف کتابخانه های اسپرینگ جلوگیری می کند.
 * 3. فقط باید با مشخص کردن نسخه ، یک نام کتابخانه بنویسیم. در پروژه های چند ماژول مفید است
 *
 * Maven Dependency Management System:
 * The Maven project inherits the following features from spring-boot-starter-parent:
 * 1. The default Java compiler version
 * 2. UTF-8 source encoding
 * 3. It inherits a Dependency Section from the spring-boot-dependency-pom. It manages the version of common dependencies. It ignores the <version> tag for that dependencies.
 * 4. Dependencies, inherited from the spring-boot-dependencies POM
 * 5. Sensible resource filtering
 * 6. Sensible plugin configuration
 * سیستم مدیریت وابستگی Maven:
 * پروژه Maven ویژگی های زیر را از spring-boot-starter-parent به ارث می برد:
 * 1. نسخه کامپایلر جاوا به طور پیش فرض
 * 2. رمزگذاری منبع UTF-8
 * 3. یک بخش وابستگی را از spring-boot-dependency-pom به ارث می برد. این نسخه از وابستگی های مشترک را مدیریت می کند. این برچسب < version> را برای آن وابستگی ها نادیده می گیرد.
 * 4- وابستگی ، که از POM spring-boot-dependencies  به ارث رسیده است
 * 5. فیلتر کردن منابع معقول
 * 6. پیکربندی پلاگین حساس
 *
 * Inheriting Starter Parent:
 * The following spring-boot-starter-parent inherits automatically when we configure the project.
 * وراثت والدین Starter:
 * والدین spring-boot-starter-parent زیر هنگام پیکربندی پروژه به طور خودکار به ارث می برند.
 * <parent>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-parent</artifactId>
 * <version>2.2.2.BUILD-SNAPSHOT</version>      <!-- lookup parent from repository -->
 * <relativePath/>
 * </parent>
 * For example, if we want to add another dependency with the same artifact that we have injected already, inject that dependency again inside the <properties> tag to override the previous one.
 *به عنوان مثال ، اگر می خواهیم وابستگی دیگری را با همان artifact که قبلاً تزریق کرده ایم اضافه کنیم ، دوباره آن وابستگی را درون برچسب < properties> تزریق کنیم تا مورد قبلی نادیده گرفته شود.
 *
 * Changing the Java version:
 * We can also change the Java version by using the <java.version> tag.
 * تغییر نسخه جاوا:
 * همچنین می توانیم با استفاده از برچسب < java.version> نسخه Java را تغییر دهیم.
 * <properties>
 * <java.version>1.8</java.version>
 * </properties>
 *
 * Adding Spring Boot Maven Plugin:
 * We can also add Maven plugin in our pom.xml file. It wraps the project into an executable jar file.
 * افزودن پلاگین Maven Spring Boot:
 * همچنین می توانیم پلاگین Maven را در پرونده pom.xml خود اضافه کنیم. این پروژه را در یک پرونده Jar اجرایی میپیچد.
 * <build>
 * <plugins>
 * <plugin>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-maven-plugin</artifactId>
 * </plugin>
 * </plugins>
 * </build>
 *
 * Spring Boot without Parent POM:
 * If we don't want to use spring-boot starter-parent dependency, but still want to take the advantage of the dependency management, we can use <scope> tag, as follows:
 * اسپرینگ بوت بدون POM والدین:
 * اگر نمی خواهیم از وابستگی spring-boot starter-parent  استفاده کنیم ، اما هنوز می خواهیم از مزیت مدیریت وابستگی استفاده کنیم ، می توانیم از برچسب < scope> به شرح زیر استفاده کنیم:
 * <dependencyManagement>
 * <dependencies>
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-dependencies</artifactId>
 * <version>2.2.2.RELEASE</version>
 * <type>pom</type>
 * <scope>import</scope>
 * </dependency>
 * </dependencies>
 * </dependencyManagement>
 * The above dependency does not allow overriding.
 * To achieve the overriding, we need to add an entry inside the <dependencyManagement> tag of our project before the spring-boot-dependencies entry.
 * For example, to upgrade another spring-data-releasetrain, add the following dependency in the pom.xml file.
 * وابستگی فوق امکان رد کردن را نمی دهد
 * برای دستیابی به موارد مهم ، باید قبل از ورود به spring-boot-dependencies  ، یک ورودی را در برچسب < dependencyManagement> پروژه خود اضافه کنیم.
 * به عنوان مثال ، برای به روزرسانی داده های دیگرspring-data-releasetrain
 * ، وابستگی زیر را در پرونده pom.xml اضافه کنید.
 * <dependencyManagement>
 * <dependencies>
 * <dependency>
 * <groupId>org.springframework.data</groupId>
 * <artifactId>spring-data-releasetrain</artifactId>
 * <version>Fowler-SR2</version>
 * <type>pom</type>
 * <scope>import</scope>
 * </dependency>
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-dependencies</artifactId>
 * <version>2.2.2.RELEASE</version>
 * <type>pom</type>
 * <scope>import</scope>
 * </dependency>
 * </dependencies>
 * </dependencyManagement>
 */
public class SpringBootDependencyManagement {
}
