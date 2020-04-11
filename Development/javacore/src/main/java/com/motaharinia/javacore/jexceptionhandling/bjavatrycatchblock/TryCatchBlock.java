package com.motaharinia.javacore.jexceptionhandling.bjavatrycatchblock;

/**
 * https://www.javatpoint.com/try-catch-block
 * Java try block:
 * Java try block is used to enclose the code that might throw an exception. It must be used within the method.
 * If an exception occurs at the particular statement of try block, the rest of the block code will not execute.
 * So, it is recommended not to keeping the code in try block that will not throw an exception.
 * Java try block must be followed by either catch or finally block.
 * بلوک try در جاوا:
 * بلوک try در جاوا برای محصور کردن کدی که ممکن است یک استثنا داشته باشد ، استفاده می شود. باید در متد استفاده شود.
 * اگر یک استثناء در جمله خاصی از بلوک try رخ دهد ، بقیه کد بلاک try اجرا نمی شود.
 * بنابراین ، توصیه می شود که کدی که برای آن استثنائی ایجاد نمیشود را در بلوک try نگه ندارید.
 * بلوک try در جاوا باید با بلوک catch یا بلاک finally پیگیری شود.
 *
 * Syntax of Java try-catch:
 * try{
 * //code that may throw an exception
 * }catch(Exception_class_Name ref){}
 *
 *Syntax of try-finally block:
 * try{
 * //code that may throw an exception
 * }finally{}
 *
 * Java catch block:
 * Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
 * The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type.
 * However, the good approach is to declare the generated type of exception.
 * The catch block must be used after the try block only.
 * You can use multiple catch block with a single try block.
 * بلوک catch جاوا با اعلام نوع استثناء در پارامتر ، برای مدیریت Exception استفاده می شود.
 * استثنائات اعلام شده باید استثناء کلاس والدین باشد (برای مثال کلاس Exception) یا نوع استثناء تولید شده.
 * با این حال ، رویکرد خوب اعلام نوع استثناء است.
 * بلوک catch فقط باید بعد از بلوک try استفاده شود.
 * می توانید از بلوک catch چندگانه با یک بلوک try استفاده کنید.
 *
 *Internal working of java try-catch block:
 * The JVM firstly checks whether the exception is handled or not.
 * If exception is not handled, JVM provides a default exception handler that performs the following tasks:
 * Prints out exception description.
 * Prints the stack trace (Hierarchy of methods where the exception occurred).
 * Causes the program to terminate.
 * But if exception is handled by the application programmer, normal flow of the application is maintained i.e. rest of the code is executed.
 *کار داخلی بلوک try-catch جاوا:
 * ابتدا JVM بررسی می کند که آیا استثناء کنترل شده است یا نه.
 * در صورت عدم مدیریت استثنا ، JVM یک کنترل کننده استثنائی پیش فرض را ارائه می دهد که کارهای زیر را انجام می دهد:
 * توضیحات استثنا را چاپ می کند.
 * ردیاب پشته را چاپ می کند (سلسله مراتب متدهایی که استثنا در آن رخ داده است).
 * برنامه را خاتمه می دهد.
 * اما اگر استثناء توسط برنامه نویس برنامه اعمال شود ، جریان عادی برنامه حفظ می شود یعنی بقیه کد اجرا می شود.
 */
public class TryCatchBlock {

}
