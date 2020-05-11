package com.motaharinia.javacore.tjava9feachers.ijshellrepl;

/**
 * https://www.javatpoint.com/java-shell-tool
 * Java Shell Tool (JShell):
 * It is an interactive Java Shell tool, it allows us to execute Java code from the shell and shows output immediately.
 * JShell is a REPL (Read Evaluate Print Loop) tool and run from the command line.
 *ابزار جاوا شل (JShell):
 * این یک ابزار جاوا شل تعاملی است ، این امکان را به ما می دهد تا کد جاوا را از پوسته اجرا کنیم و سریعاً خروجی را نشان می دهد.
 * JShell ابزاری REPL (Read Evaluate Print Loop) است و از خط فرمان اجرا می شود
 *
 * Advantages of JShell:
 * Jshell has reduced all the efforts that are required to run a Java program and test a business logic.
 * If we don't use Jshell, creating of Java program involves the following steps.
 * Open editor and write program
 * Save the program
 * Compile the program
 * Edit if any compile time error
 * Run the program
 * Edit if any runtime error
 * Repeat the process
 * Jshell does not require above steps.
 * We can evaluate statements, methods and classes, even can write hello program without creating class.
 * مزایای JShell:
 * ابزار Jshell تمام تلاشهایی را که برای اجرای یک برنامه جاوا و آزمایش منطق تجارت لازم است ، کاهش داده است.
 * اگر از Jshell استفاده نکنیم ، ایجاد برنامه جاوا مراحل زیر را شامل می شود.
 * ویرایشگر را باز کنید و برنامه بنویسید
 * برنامه را ذخیره کنید
 * برنامه را کامپایل کنید
 * در صورت بروز خطای زمان کامپایل ، ویرایش کنید
 * برنامه را اجرا کنید
 * اگر خطایی در زمان اجرا باشد ویرایش کنید
 * روند را تکرار کنید
 * ابزار Jshell به مراحل بالا احتیاج ندارد.
 * ما می توانیم بیانیه ها ، متد ها و کلاس ها را ارزیابی کنیم ، حتی می توانیم بدون ایجاد کلاس برنامه سلام را بنویسیم
 *
 * How to Start JShell:
 * To start Jshell, first we must have installed Java 9 then open terminal in Linux or command prompt in windows and type
 * jshell -v
 * It will start jshell session and displays a welcome message to the console.
 *نحوه شروع JShell:
 * برای شروع Jshell ، ابتدا باید Java 9 را نصب کرده و سپس ترمینال را در لینوکس باز کنیم یا فرمان در ویندوز و تایپ کنید
 * jshell -v
 * جلسه jshell را شروع می کند و یک پیام خوش آمدید به کنسول نشان می دهد
 *
 * Hello Java Message:
 * To display a simple "Hello Java" message, write print command without creating class and hit enter.
 * System.out.println("Hello Java")
 * سلام پیام جاوا:
 * برای نمایش پیام ساده "سلام جاوا" ، دستور print را بدون ایجاد کلاس بنویسید و کلید enter را بزنید.
 *System.out.println("Hello Java")
 *
 * Variables:
 * We can declare variables and use anywhere throughout Jshell session. Semicolon (;) is optional
 *متغیرها:
 * ما می توانیم متغیرها را اعلام کنیم و در هرجای جلسه Jshell استفاده کنیم. Semicolon (؛) اختیاری است
 *
 * Scratch Variables:
 * If we don't provide variable name, Java create implicit variable to store the value.
 * These variables start with $ sign.
 * We can use these variable by specifying implicit variable, as we did in the in the following screen-shot.
 *متغیرهای ضمنی:
 * اگر نام متغیری ارائه ندهیم ، جاوا متغیر ضمنی را برای ذخیره مقدار ایجاد می کند.
 * این متغیرها با علامت $ شروع می شوند.
 * ما می توانیم از این متغیرها با تعیین متغیر ضمنی استفاده کنیم ، همانطور که در تصویر زیر مشاهده کردیم.
 *
 * Methods:
 * To test method business logic, create an method and get result immediately
 * متد ها:
 * برای آزمایش متد منطق کسب و کار ، متدی ایجاد کنید و بلافاصله نتیجه بگیرید
 *
 * Package Imports:
 * By default, 10 packages are imported and can also be imported any package by using import statement.
 *واردات پکیج:
 * به طور پیش فرض ، 10 پکیج وارد شده است و همچنین می توانید هر پکیج را با استفاده از دستور import وارد کنید
 *
 * Jshell Commands:
 * Jshell provides various useful commands that we can use to modify environment, manage code and to get code related information. Following are the useful information.
 * /import :
 * To see, default import packages, we can use following command
 * /vars :
 * Command /vars to show variables.
 * /list :
 * To get all written source code
 * دستورات Jshell:
 * Jshell دستورات مفیدی مختلف را ارائه می دهد که ما می توانیم از آنها برای تغییر محیط ، مدیریت کد و دریافت اطلاعات مرتبط با کد استفاده کنیم. در زیر اطلاعات مفیدی وجود دارد.
 * /import :
 * برای دیدن بسته های واردات پیش فرض ، می توانیم از دستور زیر استفاده کنیم
 * /vars :
 * دستور / متغیر برای نشان دادن متغیرها.
 * /list :
 * برای دریافت کلیه کد منبع کتبی
 *
 */
public class Java9ShellTool {
}
