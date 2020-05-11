package com.motaharinia.javacore.tjava9feachers.jmodulesystem;

/**
 * https://www.javatpoint.com/java-9-module-system
 * Java 9 Module System:
 * Java Module System is a major change in Java 9 version.
 * Java added this feature to collect Java packages and code into a single unit called module.
 * In earlier versions of Java, there was no concept of module to create modular Java applications,
 * that why size of application increased and difficult to move around.
 * Even JDK itself was too heavy in size, in Java 8, rt.jar file size is around 64MB.
 * To deal with situation, Java 9 restructured JDK into set of modules so that we can use only required module for our project.
 * Apart from JDK, Java also allows us to create our own modules so that we can develop module based application.
 * سیستم ماژول جاوا 9:
 * سیستم ماژول جاوا یک تغییر عمده در نسخه جاوا 9 است.
 * جاوا این ویژگی را برای جمع آوری پکیج ها و کدهای جاوا در یک واحد به نام ماژول اضافه کرد.
 * در نسخه های اولیه جاوا ، مفهومی از ماژول برای ایجاد برنامه های مدولار جاوا وجود نداشت ،
 * به همین دلیل اندازه برنامه افزایش یافته و حرکت در آن دشوار است.
 * حتی JDK خود اندازه خیلی سنگین بود ، در جاوا 8 اندازه فایل rt.jar حدود 64MB است.
 * برای مقابله با وضعیت ، جاوا 9 JDK را به مجموعه ماژولها بازسازی کرد تا بتوانیم فقط از ماژول مورد نیاز برای پروژه خود استفاده کنیم.
 * به غیر از JDK ، جاوا همچنین به ما امکان می دهد ماژول های خودمان را بسازیم تا بتوانیم یک برنامه مبتنی بر ماژول توسعه دهیم
 *
 * The module system includes various tools and options that are given below:
 * 1. Includes various options to the Java tools javac, jlink and java where we can specify module paths that locates to the location of module.
 * 2. Modular JAR file is introduced. This JAR contains module-info.class file in its root folder.
 * 3. JMOD format is introduced, which is a packaging format similar to JAR except it can include native code and configuration files.
 * 4. The JDK and JRE both are reconstructed to accommodate modules. It improves performance, security and maintainability.
 * 5. Java defines a new URI scheme for naming modules, classes and resources.
 * سیستم ماژول شامل ابزارها و گزینه های مختلفی است که در زیر آورده شده است:
 * 1. شامل گزینه های مختلفی به ابزارهای جاوا ، jlink و java می باشد که می توان مسیرهای ماژول را مشخص کرد که به مکان ماژول می رسد.
 * 2. فایل JAR ماژولار معرفی شده است. این JAR حاوی فایل module-info.class در پوشه root است.
 * 3. فرمت JMOD معرفی شده است ، که فرمت پکیج بندی مشابه JAR است به جز اینکه می تواند شامل کد های بومی و فایل های پیکربندی باشد.
 * 4. هر دو JDK و JRE برای تنظیم ماژول ها بازسازی شده اند. این عملکرد ، امنیت و قابلیت حفظ را بهبود می بخشد.
 * 5- جاوا یک طرح جدید URI را برای نامگذاری ماژول ها ، کلاس ها و منابع تعریف می کند
 *
 * Java 9 Module:
 * Module is a collection of Java programs or softwares.
 * To describe a module, a Java file module-info.java is required.
 * This file also known as module descriptor and defines the following
 * 1. Module name
 * 2. What does it export
 * 3. What does it require
 * ماژول جاوا 9:
 * ماژول مجموعه ای از برنامه ها یا نرم افزارهای جاوا است.
 * برای توصیف یک ماژول ، یک فایل ماژول module-info.java لازم است.
 * این فایل همچنین به عنوان توصیف کننده ماژول شناخته می شود و موارد زیر را تعریف می کند
 * 1. نام ماژول
 * 2. چه چیزی صادر می کند
 * 3. آنچه نیاز دارد
 *
 * Module Name:
 * It is a name of module and should follow the reverse-domain-pattern.
 * Like we name packages, e.g. com.javatpoint.
 * نام ماژول:
 * این یک نام ماژول است و باید از الگوی دامنه معکوس پیروی کند.
 * مثل اینکه ما پکیج ها را نام می بریم ، به عنوان مثال com.javatpoint.
 *
 * How to create Java module:
 * Creating Java module required the following steps.
 * 1. Create a directory structure
 * 2. Create a module declarator
 * 3. Java source code
 * نحوه ایجاد ماژول جاوا:
 * ایجاد ماژول جاوا مراحل زیر را می طلبد.
 * 1- یک ساختار دایرکتوری ایجاد کنید
 * 2. اعلام کننده ماژول ایجاد کنید
 * 3. کد منبع جاوا
 *
 * Create a Directory Structure:
 * To create module, it is recommended to follow given directory structure,
 * it is same as reverse-domain-pattern, we do to create packages / project-structure in Java.
 * Note: The name of the directory containing a module's sources should be equal to the name of the module, e.g. com.javatpoint.
 * Create a file module-info.java, inside this file, declare a module by using module identifier and provide module name same as the directory name that contains it.
 *ایجاد یک ساختار دایرکتوری:
 * برای ایجاد ماژول ، توصیه می شود ساختار فهرست داده شده را دنبال کنید ،
 * این همان الگوی دامنه معکوس است ، ما برای ایجاد پکیج ها / ساختار پروژه در جاوا اقدام می کنیم
 * توجه: نام دایرکتوری حاوی منابع ماژول باید برابر با نام ماژول باشد ، به عنوان مثال com.javatpoint.
 *  یک فایل module-info.java ایجاد کنید. در داخل این فایل ، ماژول را با استفاده از شناسه ماژول اعلام کرده و نام ماژول را همان نام دایرکتوری موجود در آن تهیه کنید.
 *
 * In our case, our directory name is com.javatpoint:
 * module com.javatpoint{
 *
 * }
 * Leave module body empty, if it does not has any module dependency.
 * Save this file inside src/com.javatpoint with module-info.java name.
 * در مورد ما ، نام دایرکتوری ما com.javatpoint است:
 * module com.javatpoint{
 *
 * }
 * در صورت عدم وابستگی ماژول ، بدنه ماژول را خالی بگذارید.
 * این فایل را درون نام src / com.javatpoint با نام module-info.java ذخیره کنید
 *
 * Java Source Code:
 * Now, create a Java file to compile and execute module.
 * In our example, we have a Hello.java file that contains the following code.
 * class Hello{
 *     public static void main(String[] args){
 *         System.out.println("Hello from the Java module");
 *     }
 * }
 * Save this file inside src/com.javatpoint/com/javatpoint/ with Hello.java name.
 *کد منبع جاوا:
 * اکنون ، یک فایل جاوا را برای کامپایل و اجرای ماژول ایجاد کنید.
 * در مثال ما یک فایل Hello.java داریم که کد زیر را در بر می گیرد.
 * class Hello{
 *     public static void main(String[] args){
 *         System.out.println("Hello from the Java module");
 *     }
 * }
 * این پرونده را درون src / com.javatpoint / com / javatpoint / با نام Hello.java ذخیره کنید
 *
 * Compile Java Module:
 * To compile the module use the following command.
 * javac -d mods --module-source-path src/ --module com.javatpoint
 * Now, we have a compiled module that can be just run.
 *کامپایل ماژول جاوا:
 * برای کامپایل ماژول از دستور زیر استفاده کنید.
 * javac -d mods --module-source-path src/ --module com.javatpoint
 * اکنون ما یک ماژول کامپایل شده داریم که می تواند فقط اجرا شود.
 *
 * Run Module:
 * To run the compiled module, use the following command.
 * java --module-path mods/ --module com.javatpoint/com.javatpoint.Hello
 * Well, we have successfully created, compiled and executed Java module.
 *اجرای ماژول:
 * برای اجرای ماژول کامپایل شده ، از دستور زیر استفاده کنید.
 * java --module-path mods/ --module com.javatpoint/com.javatpoint.Hello
 * خوب ، ما با موفقیت ماژول جاوا را ایجاد ، کامپایل و اجرا کردیم.
 *
 * Look inside compiled Module Descriptor:
 * To see the compiled module descriptor use the following command.
 * javap mods/com.javatpoint/module-info.class
 * This command will show the following code to the console.
 * Compiled from "module-info.java"
 * module com.javatpoint {
 *   requires java.base;
 * }
 * See, we created an empty module but it contains a java.base module.
 * Why? Because all Java modules are linked to java.base module and it is default module.
 * در توصیف کننده ماژول وارد شده به داخل نگاه کنید:
 * برای دیدن توصیف کننده ماژول کامپایل شده از دستور زیر استفاده کنید.
 * javap mods/com.javatpoint/module-info.class
 * این دستور کد زیر را به کنسول نشان می دهد.
 * Compiled from "module-info.java"
 * module com.javatpoint {
 *   requires java.base;
 * }
 * ببینید ، ما یک ماژول خالی ایجاد کردیم اما حاوی یک ماژول java.base است.
 * چرا؟ زیرا همه ماژول های جاوا با ماژول java.base مرتبط هستند و این ماژول پیش فرض است.
 */
public class Java9ModuleSystem {
}
