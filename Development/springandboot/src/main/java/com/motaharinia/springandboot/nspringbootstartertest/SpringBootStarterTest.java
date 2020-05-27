package com.motaharinia.springandboot.nspringbootstartertest;

/**
 * https://www.javatpoint.com/spring-boot-starter-test
 *
 * Spring Boot Starter Test:
 * The spring-boot-starter-test is the primary dependency for the test.
 * It contains the majority of elements required for our tests.
 * There are several different types of tests that we can write to help test and automate the health of an application.
 * Before starting any testing, we need to integrate the testing framework.
 * With Spring Boot, we need to add starter to our project, for testing we only need to add the spring-boot-starter-test dependency.
 * شروع کننده Spring Boot Starter Test:
 * یک spring-boot-starter-test  ، وابستگی اصلی برای تست است.
 * این شامل اکثر عناصر مورد نیاز برای آزمایش های ما است.
 * چندین نوع تست مختلف وجود دارد که می توانیم برای کمک به تست و خودکارسازی سلامت یک برنامه بنویسیم.
 * قبل از شروع هر آزمایش ، باید چارچوب آزمایش را یکپارچه کنیم.
 * با Spring Boot ، باید شروع کننده را به پروژه خود اضافه کنیم ، برای آزمایش ما فقط باید وابستگی spring-boot-starter-test را اضافه کنیم.
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-test</artifactId>
 * <version>2.2.2.RELEASE</version>
 * <scope>test</scope>
 * </dependency>
 * It pulls all the dependencies related to test.
 * After adding it, we can build up a simple unit test.
 * We can either create the Spring Boot project through IDE or generate it using Spring Initializr.
 * Note: If you are adding test dependency manually, add it to the bottom of the pom.xml file.
 * In the above dependency, one thing to be noticed that it includes the scope of test <scope>test</scope>.
 * It means when the application is bundled and packaged for deployment, any dependency that is declared with the test scopes is ignored.
 * The test scope dependencies are only available when running in the development and Maven test modes.
 * When we create a simple Spring Boot application, by default, it contains the test dependency in the pom.xml file and ApplicationNameTest.java file under in the folder src/test/java.
 تمام وابستگی های مربوط به آزمایش را قرار میدهد.
 پس از افزودن آن ، می توانیم یک تست واحد ساده ایجاد کنیم.
 ما می توانیم از طریق IDE پروژه Spring Boot را ایجاد کنیم یا آن را با استفاده از Spring Initializr تولید کنیم.
 توجه: اگر وابستگی تست را به صورت دستی اضافه می کنید ، آن را در انتهای فایل pom.xml اضافه کنید.
 در وابستگی فوق ، یک نکته قابل ذکر است که شامل دامنه تست < scope> test < /scope> است.
 این بدان معناست که وقتی برنامه برای استقرار بسته بندی شده و بسته بندی می شود ، هرگونه وابستگی که با دامنه های تست اعلام شود ، نادیده گرفته می شود.
 وابستگی دامنه آزمون فقط هنگام اجرا در حالت های توسعه و تست Maven در دسترس است.
 هنگامی که ما یک برنامه ساده Boot Spring را ایجاد می کنیم ، به طور پیش فرض ، شامل وابستگی تست در پرونده pom.xml و پرونده ApplicationNameTest.java در پوشه src / test / java است.
 *
 */
public class SpringBootStarterTest {
}
