package com.motaharinia.springandboot.ospringbootdevtools;

/**
 * https://www.javatpoint.com/spring-boot-devtools
 *
 * Spring Boot DevTools:
 * Spring Boot 1.3 provides another module called Spring Boot DevTools. DevTools stands for Developer Tool.
 * The aim of the module is to try and improve the development time while working with the Spring Boot application.
 * Spring Boot DevTools pick up the changes and restart the application.
 * We can implement the DevTools in our project by adding the following dependency in the pom.xml file.
 * Spring Boot DevTools:
 * یک Spring Boot 1.3 ماژول دیگری به نام Spring Boot DevTools را فراهم می کند. DevTools مخفف ابزار Developer است.
 * هدف از ماژول تلاش و بهبود زمان توسعه در حین کار با برنامه Spring Boot است.
 * یک Spring Boot DevTools تغییرات را انتخاب کرده و برنامه را مجدداً راه اندازی می کند.
 * ما می توانیم DevTools را در پروژه خود با اضافه کردن وابستگی زیر در پرونده pom.xml پیاده سازی کنیم.
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-devtools</artifactId>
 * <scope>runtime<scope >
 * </dependency>
 *
 * Spring Boot DevTools Features
 * Spring Boot DevTools provides the following features:
 * ویژگی های  Spring Boot DevTools
 * Spring Boot DevTools ویژگی های زیر را ارائه می دهد:
 * 1. Property Defaults:
 * Spring Boot provides templating technology Thymeleaf that contains the property spring.thymeleaf.cache.
 * It disables the caching and allows us to update pages without the need of restarting the application.
 * But setting up these properties during the development always creates some problems.
 * When we use the spring-boot-devtools module, we are not required to set properties.
 * During the development caching for Thymeleaf, Freemarker, Groovy Templates are automatically disabled.
 * Note: If we do not want to apply property defaults on an application, we can set configprop:spring.devtools.add-properties[] to false in the application.properties file.
 * 1. پیش فرض Property:
 * اسپرینگ بوت Thymeleaf را ارائه می دهد که حاوی خاصیت Spring.thymeleaf.cache است.
 * این حافظه پنهان را غیرفعال می کند و به ما امکان می دهد صفحات را بدون نیاز به راه اندازی مجدد برنامه به روز کنیم.
 * اما تنظیم این خصوصیات در حین توسعه همیشه برخی از مشکلات را به وجود می آورد.
 * وقتی از ماژول spring-boot-devtools استفاده می کنیم ، نیازی به تنظیم ویژگی ها نداریم.
 * در حین ذخیره سازی توسعه برای Thymeleaf ، Freemarker ، Groovy Templates بطور خودکار غیرفعال می شود.
 * توجه: اگر نمی خواهیم پیش فرض Property را در یک برنامه اعمال کنیم ، می توانیم پیکربندی: Spring.devtools.add-Properties [] را در پرونده Application.properties غلط تنظیم کنیم.
 *
 * 2. Automatic Restart:
 * Auto-restart means reloading of Java classes and configure it at the server-side.
 * After the server-side changes, it deployed dynamically, server restarts happen, and load the modified code.
 * It is mostly used in microservice-based applications.
 * Spring Boot uses two types of ClassLoaders:
 * The classes that do not change (third-Jars) are loaded in the base ClassLoader.
 * The classes that we are actively developing are loaded in the restart ClassLoader.
 * When the application restarts, the restart ClassLoader is thrown away, and a new one is populated.
 * Therefore, the base ClassLoader is always available and populated.
 * We can disable the auto-restart of a server by using the property spring.devtools.restart.enabled to false.
 * Remember:
 * The DevTools always monitors the classpath resources.
 * There is only a way to trigger a restart is to update the classpath.
 * DevTools required a separate application classloader to work properly.
 * By default, Maven fork the application process.
 * Auto-restart works well with LiveReload.
 * DevTools depends on the application context's shutdown hook to close it during the restart.
 * 2. راه اندازی مجدد خودکار:
 * راه اندازی مجدد خودکار به معنی بارگذاری مجدد کلاس های جاوا و پیکربندی آن در سمت سرور است.
 * پس از تغییر سمت سرور ، به صورت پویا مستقر می شود ، راه اندازی مجدد سرور اتفاق می افتد و کد اصلاح شده را بارگیری می کنید.
 * بیشتر در برنامه های مبتنی بر میکروسرویس استفاده می شود.
 * اسپرینگ بوت از دو نوع ClassLoaders استفاده می کند:
 * کلاس هایی که تغییر نمی کنند (third-Jars) در کلاس ClassLoader بارگیری می شوند.
 * کلاس هایی که ما به طور فعال در حال توسعه هستیم در ClassLoader مجدداً بارگیری می شود.
 * با شروع مجدد برنامه ، راه اندازی مجدد ClassLoader دور ریخته می شود ، و یک مورد جدیدگشترش می یابد.
 * بنابراین ، پایه ClassLoader همیشه در دسترس و گسترش یافته است.
 * می توانیم با استفاده از خاصیت Spring.devtools.restart.enabled به راه اندازی مجدد خودکار یک سرور غیرفعال کنیم.
 * یاد آوردن:
 * یک DevTools همیشه منابع کلاس را کنترل می کند.
 * تنها راهی برای شروع مجدد وجود دارد ، به روزرسانی مسیر کلاس.
 * یک DevTools برای کار صحیح به یک کلاس لودر برنامه جداگانه نیاز داشت.
 * بطور پیش فرض ، فرایند درخواست را Maven fork کنید.
 * راه اندازی مجدد خودکار با LiveReload به خوبی کار می کند.
 * یک DevTools بستگی به هوک خاموش کردن بستر برنامه برای بستن آن در هنگام راه اندازی مجدد دارد.
 *
 * 3. LiveReload:
 * The Spring Boot DevTools module includes an embedded server called LiveReload.
 * It allows the application to automictically trigger a browser refresh whenever we make changes in the resources.
 * It is also known as auto-refresh.
 * Note: We can disable the LiveReload by setting the property spring.devtools.livereload.enabled to false.
 * It provides browser extensions for Chrome, Firefox, and Safari.
 * By default, LiveReload is enabled. The LiveReload works on the following path:
 * /META-INF/maven
 * /META-INF/resources
 * /resources
 * /static
 * /public
 * /templates
 * We can also disable auto-reload in browser by excluding the above paths. For example:
 * spring.devtools.restart.exclude=public/**, static/**, templates/**
 * We can see the other additional path by using the property spring.devtools.restart.additional-paths.
 * For example:
 * spring.devtools.restart.additional-paths=/path-to-folder
 * If we want to exclude additional path and want to keep defaults then use the property spring.devtools.restart.additional-exclude. For example:
 * spring.devtools.restart.additional-exclude=styles/**
 * Remember
 * We can run one LiveReload server at a time.
 * Before starting the application, ensure that no other LiveReload server is running.
 * If we start multiple applications from IDE, it supports only the first LiveReload.
 *3. LiveReload:
 * ماژول Spring Boot DevTools شامل یک سرور تعبیه شده به نام LiveReload است.
 * این برنامه به برنامه اجازه می دهد تا هر زمان که در منابع تغییراتی ایجاد کند ، یک مرورگر را به صورت خودکار تحریک کند.
 * همچنین به عنوان auto-refresh شناخته می شود.
 * توجه: می توانیم LiveReload را با تنظیم ویژگی Spring.devtools.livereload.enabled غیرفعال کنیم.
 * افزونه های مرورگر برای Chrome ، Firefox و Safari را در اختیار شما قرار می دهد.
 * به طور پیش فرض ، LiveReload فعال است. LiveReload در مسیر زیر کار می کند:
 * /META-INF/maven
 * /META-INF/resources
 * /resources
 * /static
 * /public
 * /templates
 * همچنین با حذف مسیرهای فوق می توان بارگیری خودکار را در مرورگر غیرفعال کرد. مثلا:
 * spring.devtools.restart.exclude=public/**, static/**, templates/**
 * با استفاده از خاصیت Spring.devtools.restart.additional-path می توان مسیر اضافی دیگری را مشاهده کرد.
 * مثلا:
 * spring.devtools.restart.additional-paths=/path-to-folder
 * اگر می خواهیم مسیر اضافی را کنار بگذاریم و می خواهیم پیش فرض ها را ادامه دهیم ، از خاصیت Spring.devtools.restart.additional-exclud استفاده کنید. مثلا:
 * spring.devtools.restart.additional-exclude=styles/**
 * یاد آوردن
 * ما می توانیم یک سرور LiveReload را همزمان انجام دهیم.
 * قبل از شروع برنامه ، اطمینان حاصل کنید که هیچ سرور LiveReload دیگری در حال اجرا نیست.
 * اگر چندین برنامه را از IDE شروع کنیم ، فقط از اولین LiveReload پشتیبانی می کند.
 *
 * 4. Remote Debug Tunneling:
 * Spring Boot can tunnel JDWP (Java Debug Wire Protocol) over HTTP directly to the application.
 * It can even work application deployment to Internet Cloud providers that only expose port 80 and 443.
 *4. تنظیم اشکال زدایی از راه دور:
 * اسپرینگ بوت می تواند JDWP (پروتکل سیم اشکال زدایی Java) را از طریق HTTP مستقیماً به برنامه تونل کند.
 * این حتی می تواند استقرار برنامه کاربردی را به ارائه دهندگان اینترنت ابر بپردازد که فقط پورت 80 و 443 را در معرض دید شما قرار می دهد.
 * 
 * 5. Remote Update and Restart:
 * There is another trick that DevTools offers is: it supports remote application updates and restarts.
 * It monitors local classpath for file changes and pushes them to a remote server, which is then restarted.
 * We can also use this feature in combination with LiveReload.
 * 5. بروزرسانی از راه دور و راه اندازی مجدد:
 * ترفند دیگری که DevTools ارائه می دهد وجود دارد: پشتیبانی از به روزرسانی برنامه راه دور و راه اندازی مجدد.
 * این برنامه کلاس محلی را برای تغییر پرونده نظارت می کند و آنها را به سمت سرور از راه دور سوق می دهد ، که مجدداً راه اندازی می شود.
 * همچنین می توانیم از این ویژگی در ترکیب با LiveReload استفاده کنیم.
 *
 * Using a Trigger File:
 * Automatic restart sometimes can slow down development time due to frequent restarts.
 * To remove this problem, we can use a trigger file.
 * Spring Boot monitors trigger file and detects modifications in that file. It restarts the server and reloads all previous changes.
 * We can implement the trigger file in our application by adding the property spring.devtools.restart.trigger-file.
 * The file can be internal or external. For example:
 * با استفاده از یک پرونده Trigger:
 * راه اندازی مجدد خودکار گاهی اوقات به دلیل شروع مجدد مکرر می تواند زمان توسعه را کند کند.
 * برای رفع این مشکل ، می توانیم از یک پرونده Trigger استفاده کنیم.
 * اسپرینگ بوت مانیتور پرونده را آغاز می کند و تغییرات موجود در آن پرونده را تشخیص می دهد. مجدداً سرور را بارگذاری می کند و همه تغییرات قبلی را بارگیری می کند.
 * ما می توانیم با اضافه کردن خاصیت spring.devtools.restart.trigger-file ، ماشه را در برنامه خود پیاده سازی کنیم.
 * پرونده می تواند داخلی یا خارجی باشد. مثلا:
 * spring.devtools.restart.trigger-file=c:/workspace-sts-3.9.9.RELEASE/restart-trigger.txt
 *
 * Spring Boot DevTools Example
 * Step 1: Create a Maven project using Spring Initializr https://start.spring.io/.
 * Step 2: Provide the Group name and Artifact Id. We have provided Group name com.javatpoint and Artifact Id spring-boot-devtools-example.
 * Step 3: Add the following dependencies: spring-boot-starter-web and spring-boot-devtools.
 * Step 4: Click on the Generate button. It downloads the Jar file of the project.
 * Step 5: Extract the Jar file.
 * Step 6: Import the folder to STS. It takes time to import.
 * File -> Import -> Existing Maven Projects -> Browse -> Select the folder spring-boot-devtools-example -> Finish
 * When the project imports successfully, we can see the following directory in the Package Explorer section of the STS.
 * Step 7: Open the SpringBootDevtoolsExampleApplication.java and run it as Java Application.
 * After that, make any changes (edit or remove some file or code) in the application, and save that changes. As soon as we save the changes, the server restarts and pick up the changes.
 */
public class SpringBootDevTools {
}
