package com.motaharinia.springandboot.pspringbootmultimoduleproject;

/**
 * https://www.javatpoint.com/spring-boot-multi-module-project
 *
 * Multi-Module Project:
 * A Spring Boot project that contains nested maven projects is called the multi-module project.
 * In the multi-module project, the parent project works as a container for base maven configurations.
 * In other words, a multi-module project is built from a parent pom that manages a group of submodules.
 * Or A multi-module project is defined by a parent POM referencing one or more submodules.
 * The parent maven project must contain the packaging type pom that makes the project as an aggregator.
 * The pom.xml file of the parent project consists the list of all modules, common dependencies, and properties that are inherited by the child projects.
 * The parent pom is located in the project's root directory.
 * The child modules are actual Spring Boot projects that inherit the maven properties from the parent project.
 * When we run the multi-module project, all the modules are deployed together in an embedded Tomcat Server.
 * We can deploy an individual module, also.
 * پروژه چند ماژول:
 * پروژه Spring Boot که شامل پروژه های maven nested است ، پروژه چند ماژول نامیده می شود.
 * در پروژه چند ماژول ، پروژه والدین به عنوان یک کانتینر برای پیکربندی های پایه maven کار می کند.
 * به عبارت دیگر ، یک پروژه چند ماژول از یک pom والدین ساخته شده است که گروهی از زیرمجموعه ها را مدیریت می کند.
 * یا یک پروژه چند ماژول توسط یک POM والدین که یک یا چند زیرمجموعه را ارجاع می دهد تعریف شده است.
 * پروژه maven اصلی باید حاوی نوع بسته بندی pom باشد که این پروژه را به عنوان جمع کننده تبدیل می کند.
 * پرونده pom.xml پروژه والدین شامل لیست تمام ماژول ها ، وابستگی های متداول و خواصی است که توسط پروژه های کودک به ارث می برند.
 * والدین pom در فهرست اصلی پروژه قرار دارد.
 * ماژول های کودک پروژه های Spring Boot واقعی هستند که خواص maven را از پروژه والدین به ارث می برند.
 *وقتی پروژه چند ماژول را اجرا می کنیم ، همه ماژول ها در یک سرور جاسازی شده Tomcat مستقر می شوند.
 * ما همچنین می توانیم یک ماژول اختصاصی مستقر کنیم.
 *
 * Parent POM:
 * The parent POM defines the Group ID, Artifact ID, version, and packaging.
 * In the previous Maven projects, we have seen that the parent POM defines the packaging jar.
 * But in the multi-module project, the parent POM defines the packaging pom. The packaging pom refers to other Maven projects.
 * POM والدین:
 * یک POM والدین ، ID Group ، Artifact ID ، نسخه و بسته بندی را تعریف می کند.
 * در پروژه های قبلی Maven ، ما دیده ایم که POM والدین jar بسته بندی را مشخص می کند.
 * اما در پروژه چند ماژول ، POM والدین pom بسته بندی را تعریف می کند. بسته pom به سایر پروژه های Maven اشاره دارد.
 *
 * Why we need multi-module project:
 * Splitting the project into multiple modules is useful and easy to maintain.
 * We can also easily edit or remove modules in the project without affecting the other modules.
 * It is useful when we required to deploy modules individually.
 * We only need to specify all the dependencies in the parent pom.
 * All the other modules share the same pom, so we need not to specify the same dependency in each module separately.
 * It makes the code easier to keep in order with a big project.
 * چرا ما نیاز به پروژه چند ماژول داریم:
 * تقسیم پروژه در چند ماژول مفید و آسان برای حفظ است.
 * ما همچنین می توانیم به راحتی ماژول ها را در پروژه ویرایش یا حذف کنیم بدون اینکه بر ماژول های دیگر تأثیر بگذارد.
 * مفید است که ما نیاز به استقرار ماژول ها به صورت جداگانه داشته باشیم.
 * ما فقط باید تمام وابستگی ها را در pom والدین مشخص کنیم.
 * همه ماژول های دیگر دارای یک pom یکسان هستند ، بنابراین لازم نیست که وابستگی یکسان را در هر ماژول به طور جداگانه مشخص کنیم.
 * این امر باعث می شود تا ترتیب کار با یک پروژه بزرگ کد آسانتر شود.
 *
 * Child module-ear, war, and jar:
 * The child module may be any project and can have any packaging.
 * We are free to create any type of dependency between modules and bundles together.
 * For example, we are creating an EAR (Enterprise ARchive), WAR (Web ARchive), and JAR (Java ARchive) file.
 * A JAR file is bundled into a war file that is bundled into an EAR file.
 * The EAR file is the final package that is ready to deploy on the application server.
 * The EAR file contains one or many WAR files.
 * Each WAR file contains the service project that has common code to all WAR files and packaging type in the JAR.
 * Child module-ear, war, and jar:
 * ماژول کودک ممکن است هر پروژه ای باشد و بسته بندی آن را داشته باشد.
 * ما در ایجاد هر نوع وابستگی بین ماژول ها و بسته های مختلف با هم آزاد هستیم.
 * به عنوان مثال ، ما در حال ایجاد پرونده ای EAR (Enterprise Archive) ، WAR (Web Archive) و JAR (Java Archive) هستیم.
 * یک پرونده JAR در یک پرونده war قرار گرفته است که در یک پرونده EAR همراه است.
 * پرونده EAR بسته نهایی است که آماده استقرار در سرور برنامه است.
 * پرونده EAR شامل یک یا بسیاری از پرونده های WAR است.
 * هر پرونده WAR شامل پروژه خدماتی است که دارای کد مشترک با کلیه پرونده های WAR و نوع بسته بندی در JAR است.
 *
 *Maven child projects/ modules:
 * 1. The child modules are independent maven projects that share properties from the parent project.
 * 2. All child projects can be built with a single command because it is inside a parent project.
 * 3. It is easier to define the relationship between the projects.
 * پروژه های کودک / ماژول های Maven:
 * 1. ماژول های کودک پروژه های مستقر در maven هستند که دارای ویژگی های پروژه والدین هستند.
 * 2. کلیه پروژه های کودک می تواند با یک دستور واحد ساخته شود زیرا در داخل یک پروژه والدین است.
 * 3. تعریف رابطه بین پروژه ها آسان تر است.
 *
 * Multi-Module Project Directory Structure:
 * Let's understand the multi-module project directory structure.
 * In the following image, we have created a project named spring-boot-multi-module-project.
 * It contains the parent pom at the bottom of the directory.
 * After that, we have created two Maven Modules named module1 and module2, respectively.
 * These two modules contain their own pom files.
 * ساختار دایرکتوری پروژه چند ماژول:
 * بیایید ساختار دایرکتوری پروژه چند ماژول را درک کنیم.
 * در تصویر زیر ، ما یک پروژه با نام Spring-boot-multi-module-project ایجاد کرده ایم.
 * این برنامه شامل pom والدین در پایین فهرست است.
 * پس از آن ، ما به ترتیب دو ماژول Maven به نام های module1 و module2 ایجاد کرده ایم.
 * این دو ماژول حاوی پرونده های pom مخصوص به خود هستند.
 *
 * When we create multi-module project, we need to configure packaging pom in the parent pom file instead of jar.
 * وقتی پروژه چند ماژولی را ایجاد می کنیم ، لازم است بسته های pom را در پرونده والدین pom به جای jar پیکربندی کنیم.
 * <packaging>pom</packaging>
 *
 * When we create Maven Modules in the project, Spring Boot automatically configures the modules in the parent pom inside the module tag, as shown below.
 *وقتی ماژول های Maven را در پروژه ایجاد می کنیم ، Spring Boot ماژول های موجود در pom والدین را در داخل برچسب ماژول پیکربندی می کند ، مانند تصویر زیر.
 *  <modules>
 * <module>module1</module>
 * <module>module2</module>
 * </modules>
 *
 * Now, we are going to see what inside the pom file of module1.
 * حال می خواهیم ببینیم که درون فایل pom module1 چیست.
 * <?xml version="1.0"?>
 * <project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
 * <modelVersion>4.0.0</modelVersion>
 * <parent>
 * <groupId>com.javatpoint</groupId>
 * <artifactId>spring-boot-multi-module-project</artifactId>
 * <version>0.0.1-SNAPSHOT</version>
 * </parent>
 * <groupId>com.javatpoint</groupId>
 * <artifactId>module1</artifactId>
 * <version>0.0.1-SNAPSHOT</version>
 * <name>module1</name>
 * <url>http://maven.apache.org</url>
 * <properties>
 * <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
 * </properties>
 * <dependencies>
 * <dependency>
 * <groupId>junit</groupId>
 * <artifactId>junit</artifactId>
 * <version>3.8.1</version>
 * <scope>test</scope>
 * </dependency>
 * </dependencies>
 * </project>
 *
 * Here, a point to be noticed that the above pom file does not contain the common dependencies like starter-web, web-mvc, etc.
 * It inherits all the common dependencies and the properties from the parent pom.
 *در اینجا ، نکته ای که باید توجه داشت که پرونده pom فوق شامل وابستگی های متداول مانند starter-web ، web-mvc و غیره نیست.
 * این همه وابستگی های مشترک و خواص را از pom والدین به ارث می برد.
 *
 *
 *
 *
 *
 * Spring Boot Multi-Module Project Example
 * Let' create an example of a multi-module application.
 * In the following example, we have created a maven project named spring-boot-multimodule. It is the main application. In the main application, we have created five modules are as follows:
 * نمونه پروژه اسپرینگ بوت چند ماژولی
 * بگذارید نمونه ای از برنامه چند ماژول ایجاد کنیم.
 * در مثال زیر ، یک پروژه maven بنام Spring-boot-multimodule ایجاد کرده ایم. این برنامه اصلی است. در برنامه اصلی ، ما پنج ماژول ایجاد کرده ایم
 * application
 * model
 * repository
 * service-api
 * service-impl
 *
 * Application Module:
 * The application module is the main module of the project.
 * It contains the application class in which the main method is defined that is necessary to run the Spring Boot Application.
 * It also contains application configuration properties, Controller, views, and resources.
 * The Application Module includes Model Module, Service Implementation Module as dependency that contains Model Module, Repository Module, and Service API module.
 *ماژول برنامه اصلی ترین پروژه است.
 * این شامل کلاس برنامه ای است که در آن روش اصلی تعریف شده است که برای اجرای برنامه Boot Spring لازم است.
 * این نرم افزار همچنین حاوی ویژگی های پیکربندی برنامه ، کنترل کننده ، نمایش ها و منابع است.
 * ماژول برنامه شامل ماژول مدل ، ماژول پیاده سازی سرویس به عنوان وابستگی است که شامل ماژول مدل ، ماژول مخزن و ماژول API خدمات است.
 *
 * Model Module:
 * The Model Module contains Entities and Visual Objects to be used in the project.
 *ماژول مدل شامل اشخاص و اشیاء بصری است که در پروژه استفاده می شود.
 *
 * Repository Module:
 * The Repository module contains repositories to be used in the project. It depends on the Model Module
 *ماژول مخزن شامل مخازن مورد استفاده در پروژه است. بستگی به ماژول مدل دارد.
 *
 * Service API Module:
 * The Service API module contains all project services. It also depends on Model Module
 *ماژول سرویس API شامل کلیه خدمات پروژه است. همچنین به ماژول مدل بستگی دارد.
 *
 * Service Implementation Module:
 * The Service Implementation module implements the service. It depends on Repository Module and Service API Module.
 *ماژول پیاده سازی سرویس خدمات را پیاده سازی می کند. این بستگی به ماژول مخزن و ماژول API سرویس دارد.
 *
 * POM Aggregator (Parent POM):
 * The parent pom contains all the application modules.
 * It also includes all the common dependencies and properties that are needed by more than one module.
 * Dependencies are defined without version because the project has defined the Spring IO Platform as a parent.
 * Let's understand the structure of the multi-module application that we have created.
 * یک pom والدین شامل تمام ماژول های برنامه است.
 * همچنین شامل کلیه وابستگی ها و خواص مشترک مورد نیاز بیش از یک واحد است.
 * وابستگی ها بدون نسخه تعریف می شوند زیرا این پروژه از Spring IO Platform به عنوان یک والد تعریف کرده است.
 *
 *
 * Step 1:
 * Create a Maven Project with the name spring-boot-multimodule.
 * Step 2:
 * Open the pom.xml (parent pom) file and change the packaging type jar to pom.
 * One thing to be noticed in the above pom file is that there is no maven module configured because we have not created yet.
 * Now we will create Maven Modules one by one that we have specified above.
 * Step 3:
 * Create a Maven Module with the name application.
 * Step 4:
 * Open the pom.xml file of application module and ensure that the packaging type is jar.
 * Step 5:
 * Create the main class. It is the class that is to be run.
 * Step 6:
 * Create a Controller class with the name WelocameController under the package smaple.multimodule.web.
 * Step 7:
 * Create a HTML file with the name show.html under the folder src/main/resource -> templates ->welcome.
 * Step 8:
 * Open theapplication.properties file, configure the application message and thymeleaf cache to false.
 * # Application messages
 * application.message = Hello User!
 * dummy.type = type-inside-the-war
 * # Spring Thymeleaf config
 * spring.thymeleaf.cache = false
 *
 *
 * Let's create the second module that is model.
 * Step 9:
 * Create a Maven Module with the name model.
 * Step 10:
 * Open the pom.xml file of model module and ensure that the packaging type is jar.
 * Step 11:
 * Create a class with the name Account under the package sample.multimodule.domain.entity.
 *
 * Let's create the third module that is the repository.
 * Step 12:
 * Create a Maven Module with the name repository.
 * Step 13:
 * Open the pom.xml file of application module and ensure that the packaging type is jar.
 * Step 14:
 * Create a class with the name AccountRepositoryunder the package sample.multimodule.repository.
 *
 * Let's create the fourth module that is service-api.
 * Step 15:
 * Create a Maven Module with the name service-api.
 * Step 16:
 * Open the pom.xml file of application service-api and ensure that the packaging type is jar.
 * Step 17:
 * Create a package with the name sample.multimodule.service.api.
 * Step 18:
 * Create a class with the name AccountNotFoundException. It handles the exception if the account is not found.
 * Step 19:
 * Create a class with the name AccountService. It provides the service related to account, such as find and create an account.
 * Step 20:
 * Create a Maven Module with the name service-impl.
 * Step 21:
 * Open the pom.xml file of application service-impl and ensure that the packaging type is jar.
 * Step 22:
 * Create a class with the name AccountServiceImpl under the package sample.multimodule.service.impl.
 * Now open the parent pom file, we see that all the Maven Modules that we have created is configured in the parent pom inside the tag.
 * We need not to configure it manually.
 * Step 23:
 * Now run the SampleWebJspApplication.java file as Java Application.
 * Step 24:
 * Open the browser and invoke the URL http://localhost:8080. It returns the Message and account number that is 23.
 *
 * مرحله 1:
 * یک پروژه Maven با نام Spring-boot-multimodule ایجاد کنید.
 * گام 2:
 * پرونده pom.xml (والد pom) را باز کرده و نوع شیشه بسته بندی را به pom تغییر دهید.
 * نکته ای که باید در پرونده pom فوق بدانید این است که هیچ ماژول maven پیکربندی نشده است زیرا ما هنوز ایجاد نکرده ایم.
 * اکنون ماژول های Maven را یکی یکی ایجاد می کنیم که در بالا مشخص کردیم.
 * مرحله 3:
 * یک ماژول Maven را با برنامه نام ایجاد کنید.
 * مرحله 4:
 * پرونده pom.xml ماژول برنامه را باز کرده و از بسته بندی بودن آن مطمئن شوید.
 * مرحله 5:
 * کلاس اصلی را ایجاد کنید. این کلاس است که قرار است اداره شود.
 * مرحله 6:
 * یک کلاس Controller با نام WelocameController در زیر بسته smaple.multimodule.web ایجاد کنید.
 * مرحله 7:
 * یک فایل HTML با نام show.html در زیر پوشه src / main / منبع -> قالب ها -> خوش آمدید.
 * مرحله 8:
 * پرونده theapplication.properties را باز کنید ، پیام برنامه و حافظه نهانگاه Thymeleaf را نادرست تنظیم کنید.
 * # Application messages
 * application.message = Hello User!
 * dummy.type = type-inside-the-war
 * # Spring Thymeleaf config
 * spring.thymeleaf.cache = false
 *
 *
 * بیایید ماژول دوم را که مدل است ایجاد کنیم.
 * مرحله 9:
 * با مدل نام یک ماژول Maven ایجاد کنید.
 * مرحله 10:
 * پرونده pom.xml ماژول مدل را باز کرده و از نوع بسته بندی شیشه اطمینان حاصل کنید.
 * مرحله 11:
 * یک کلاس با نام Account در زیر نمونه بسته.multimodule.domain.entity ایجاد کنید.
 *
 * بیایید ماژول سوم را که مخزن است ایجاد کنیم.
 * مرحله 12:
 * با مخزن نام یک ماژول Maven ایجاد کنید.
 * مرحله 13:
 * پرونده pom.xml ماژول برنامه را باز کرده و از بسته بندی بودن آن مطمئن شوید.
 * مرحله 14:
 * یک کلاس با نام AccountRepositoryunder بسته نمونه sample.multimodule.repository ایجاد کنید.
 *
 * بیایید چهارمین ماژول را ایجاد کنیم که سرویس api است.
 * مرحله 15:
 * یک ماژول Maven با نام service-api ایجاد کنید.
 * مرحله شانزدهم:
 * پرونده pom.xml برنامه service-api را باز کرده و از بسته بندی آن مطمئن شوید.
 * مرحله 17:
 * بسته ای را با نام sample.multimodule.service.api ایجاد کنید.
 * مرحله 18:
 * یک کلاس با نام AccountNotFoundException ایجاد کنید. اگر حساب پیدا نشد ، این استثنا را به دست می آورد.
 * مرحله 19:
 * یک کلاس با نام AccountService ایجاد کنید. این سرویس خدمات مرتبط با حساب ، مانند یافتن و ایجاد یک حساب کاربری را ارائه می دهد.
 * مرحله 20:
 * یک ماژول Maven با نام service-impl ایجاد کنید.
 * مرحله 21:
 * پرونده pom.xml برنامه service-impl را باز کرده و از بسته بندی آن مطمئن شوید.
 * مرحله 22:
 * یک کلاس با نام AccountServiceImpl زیر نمونه بسته.multimodule.service.impl ایجاد کنید.
 * اکنون پرونده والدین pom را باز کنید ، می بینیم که تمام ماژول های Maven که ایجاد کرده ایم در pom والدین در داخل برچسب پیکربندی شده است.
 * لازم نیست که آن را به صورت دستی پیکربندی کنیم.
 * مرحله 23:
 * اکنون پرونده SampleWebJspApplication.java را به عنوان Java Application اجرا کنید.
 * مرحله 24:
 * مرورگر را باز کنید و آدرس اینترنتی http: // localhost: 8080 را فراخوانی کنید. این پیام و شماره حساب را که 23 است برمی گرداند.
 */
public class SpringBootMultiModule {
}
