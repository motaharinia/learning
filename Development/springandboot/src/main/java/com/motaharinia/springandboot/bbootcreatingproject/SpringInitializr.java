package com.motaharinia.springandboot.bbootcreatingproject;

/**
 * https://www.javatpoint.com/spring-initializr
 * Spring Initializr:
 * Spring Initializr is a web-based tool provided by the Pivotal Web Service.
 * With the help of Spring Initializr, we can easily generate the structure of the Spring Boot Project.
 * It offers extensible API for creating JVM-based projects.
 * It also provides various options for the project that are expressed in a metadata model.
 * The metadata model allows us to configure the list of dependencies supported by JVM and platform versions, etc.
 * It serves its metadata in a well-known that provides necessary assistance to third-party clients.
 * اسپرینگ Initializr:
 * یکSpring Initializr ابزاری مبتنی بر وب است که توسط سرویس Pivotal Web ارائه شده است.
 * با کمک Spring Initializr می توان ساختار پروژه Spring Boot  را به راحتی تولید کرد.
 * این نرم افزار API گسترده برای ایجاد پروژه های مبتنی بر JVM ارائه می دهد.
 * همچنین گزینه های مختلفی را برای این پروژه ارائه می دهد که در یک مدل ابرداده بیان شده است.
 * مدل ابرداده به ما امکان پیکربندی لیست وابستگی های پشتیبانی شده توسط نسخه های JVM و پلت فرم و غیره را می دهد.
 * این ابرداده خود را در یک سرویس مشهور ارائه می دهد که به مشتری های شخص ثالث کمک های لازم را انجام می دهد.
 *
 * Spring Initializr Modules:
 * 1. initializr-actuator:
 * It provides additional information and statistics on project generation. It is an optional module.
 * 2. initializr-bom:
 * In this module, BOM stands for Bill Of Materials. In Spring Boot, BOM is a special kind of POM that is used to control the versions of a project's dependencies. It provides a central place to define and update those versions. It provides flexibility to add a dependency in our module without worrying about the versions.
 * Outside the software world, the BOM is a list of parts, items, assemblies, and other materials required to create products. It explains what, how, and where to collect required materials.
 * 3. initializr-docs:
 * It provides documentation.
 * 4. initializr-generator:
 * It is a core project generation library.
 * 5. initializr-generator-spring:
 * 6. initializr-generator-test:
 * It provides a test infrastructure for project generation.
 * 7. initializr-metadata:
 * It provides metadata infrastructure for various aspects of the projects.
 * 8. initializr-service-example:
 * It provides custom instances.
 * 9. initializr-version-resolver:
 * It is an optional module to extract version numbers from an arbitrary POM.
 * 10. initializr-web:
 * It provides web endpoints for third party clients.
 * ماژول های Initializr Spring:
 * 1. initializr-actuator:
 * این اطلاعات و آمار اضافی در مورد تولید پروژه را ارائه می دهد. این یک ماژول اختیاری است.
 * 2. initializr-bom:
 * در این ماژول ، BOM مخفف Bill Of Material است. در Spring Boot ، BOM نوعی خاص از POM است که برای کنترل نسخه های وابستگی یک پروژه استفاده می شود. این یک مکان اصلی برای تعریف و به روزرسانی آن نسخه ها است. این انعطاف پذیری را برای اضافه کردن یک وابستگی در ماژول ما بدون نگرانی در مورد نسخه ها فراهم می کند.
 * در خارج از دنیای نرم افزار ، BOM لیستی از قطعات ، آیتم ها ، مجامع و سایر مواد مورد نیاز برای ایجاد محصولات است. این توضیح می دهد که چه چیزی ، چگونه و از کجا می توان مواد مورد نیاز را جمع آوری کرد.
 * 3. initializr-docs:
 * این مستندات را ارائه می دهد.
 * 4. initializr-generator:
 * این کتابخانه تولید پروژه اصلی است.
 * 5. initializr-generator-spring:
 * 6. initializr-generator-test:
 * این یک زیرساخت آزمایش برای تولید پروژه فراهم می کند.
 * 7. initializr-metadata:
 * این زیرساخت ابرداده را برای جنبه های مختلف پروژه ها فراهم می کند.
 * 8. initializr-service-example:
 * این نمونه های سفارشی را ارائه می دهد.
 * 9. initializr-version-resolver:
 * این یک ماژول اختیاری برای استخراج شماره نسخه ها از POM دلخواه است.
 * 10. initializr-web:
 * این قسمت های انتهایی وب را برای مشتری های شخص ثالث فراهم می کند.
 *
 * Supported Interface:
 * 1. It supports IDE STS, IntelliJ IDEA Ultimate, NetBeans, Eclipse. You can download the plugin from https://github.com/AlexFalappa/nb-springboot. If you are using VSCode, download the plugin from https://github.com/microsoft/vscode-spring-initializr.
 * 2. Use Custom Web UI http://start.spring.io or https://start-scs.cfapps.io.
 * 3. It also supports the command-line with the Spring Boot CLI or cURL or HTTPie.
 * رابط پشتیبانی شده:
 * 1. این برنامه از IDE STS ، IntelliJ IDEA Ultimate ، NetBeans ، Eclipse پشتیبانی می کند. می توانید افزونه را از https://github.com/AlexFalappa/nb-springboot بارگیری کنید. اگر از VSCode استفاده می کنید ، افزونه را از https://github.com/microsoft/vscode-spring-initializr بارگیری کنید.
 * 2. از UI وب سفارشی http://start.spring.io یا https://start-scs.cfapps.io استفاده کنید.
 * 3. همچنین از خط فرمان با Spring Boot CLI یا cURL یا HTTPie پشتیبانی می کند.
 *
 * Generating a Project:
 * Before creating a project, we must be friendly with UI. Spring Initializr UI has the following labels:
 * Project:
 * It defines the kind of project. We can create either Maven Project or Gradle Project. We will create a Maven Project throughout the tutorial.
 * Language:
 * Spring Initializr provides the choice among three languages Java, Kotlin, and Groovy. Java is by default selected.
 * Spring Boot:
 * We can select the Spring Boot version. The latest version is 2.2.2.
 * Project Metadata:
 * It contains information related to the project, such as Group, Artifact, etc. Group denotes the package name; Artifact denotes the Application name. The default Group name is com.example, and the default Artifact name is demo.
 * Dependencies:
 * Dependencies are the collection of artifacts that we can add to our project.
 *تولید یک پروژه:
 * قبل از ایجاد یک پروژه ، ما باید با رابط کاربر دوستانه باشیم. Spring Initializr UI دارای برچسب های زیر است:
 * پروژه:
 * نوع پروژه را تعریف می کند. ما می توانیم Maven Project یا Gradle Project ایجاد کنیم. ما در طول آموزش یک پروژه Maven ایجاد خواهیم کرد.
 * زبان:
 * امکان Spring Initializr از بین سه زبان جاوا ، كوتلین و گرووی انتخابی را ارائه می دهد. جاوا بطور پیش فرض انتخاب شده است.
 * Spring Boot:
 * ما می توانیم نسخه Spring Boot را انتخاب کنیم. آخرین نسخه 2.2.2 است.
 * ابرداده پروژه:
 * این شامل اطلاعات مربوط به پروژه است ، از جمله گروه ، Artifact ، و غیره. گروه نام این بسته را نشان می دهد. Artifact نام برنامه را نشان می دهد. نام پیش فرض گروه com.example است و نام پیش فرض Artifact نسخه ی نمایشی است.
 * وابستگی:
 * وابستگی ها مجموعه artifacts است که می توانیم به پروژه خود اضافه کنیم.
 * 
 * There is another Options section that contains the following fields:
 * Name:
 * It is the same as Artifact.
 * Description:
 * In the description field, we can write a description of the project.
 * Package Name:
 * It is also similar to the Group name.
 * Packaging:
 * We can select the packing of the project. We can choose either Jar or War.
 * Java:
 * We can select the JVM version which we want to use. We will use Java 8 version throughout the tutorial.
 *یک بخش گزینه دیگر وجود دارد که شامل قسمتهای زیر است:
 * نام:
 * این همان Artifact است.
 * شرح:
 * در قسمت توضیحات می توانید توضیحی از پروژه بنویسیم.
 * نام بسته:
 * همچنین شبیه به نام Group است.
 * بسته بندی:
 * ما می توانیم بسته بندی پروژه را انتخاب کنیم. ما می توانیم Jar یا War را انتخاب کنیم.
 * جاوا:
 * ما می توانیم نسخه JVM را که می خواهیم از آن استفاده کنیم انتخاب کنیم. ما در کل آموزش از نسخه Java 8 استفاده خواهیم کرد.
 *
 * There is a Generate button. When we click on the button, it starts packing the project and downloads the Jar or War file, which you have selected.
 * یک دکمه تولید وجود دارد. وقتی روی دکمه کلیک می کنیم ، بسته بندی پروژه شروع می شود و پرونده Jar یا War را که انتخاب کرده اید بارگیری می کند.
 */
public class SpringInitializr {
}
