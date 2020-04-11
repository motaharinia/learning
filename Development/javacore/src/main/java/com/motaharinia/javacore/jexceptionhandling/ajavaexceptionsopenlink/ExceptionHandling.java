package com.motaharinia.javacore.jexceptionhandling.ajavaexceptionsopenlink;

import org.junit.jupiter.api.Assertions;

/**
 * https://www.javatpoint.com/exception-handling-in-java
 * The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.
 * In this page, we will learn about Java exceptions, its type and the difference between checked and unchecked exceptions.
 * What is Exception in Java: Dictionary Meaning: Exception is an abnormal condition.
 * In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
 * What is Exception Handling:
 * Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 * Advantage of Exception Handling:
 * The core advantage of exception handling is to maintain the normal flow of the application.
 * An exception normally disrupts the normal flow of the application that is why we use exception handling.
 * Suppose there are 10 statements in your program and there occurs an exception at statement 5, the rest of the code will not be executed i.e. statement 6 to 10 will not be executed.
 * If we perform exception handling, the rest of the statement will be executed. That is why we use exception handling in Java.
 * مدیریت استثنائات در جاوا یکی از مکانیسم های قدرتمند برای رفع خطاهای زمان اجرا است تا بتوان جریان طبیعی نرم افزار را حفظ کرد.
 * در این صفحه با استثنائات جاوا ، نوع آن و تفاوت بین استثنائات بررسی شده و بدون بررسی ، آشنا می شویم.
 * استثنا در جاوا: معنی لغت نامه: استثناء یک وضعیت غیرطبیعی است.
 * در جاوا ، یک استثناء یک رویداد است که جریان طبیعی برنامه را مختل می کند. این یک شی است که در زمان اجرا پرتاب می شود.
 * مدیریت استثنائات چیست:
 * مدیریت استثنائات یک مکانیزم برای رسیدگی به خطاهای زمان اجرا مانند ClassNotFoundException ، IOException ، SQLException ، RemoteException و غیره است.
 * مزیت مدیریت استثنائات:
 * مهمترین مزیت مدیریت استثنائات ، حفظ جریان عادی برنامه است.
 * یک استثناء به طور معمول جریان طبیعی برنامه را مختل می کند به همین دلیل از هندلینگ استثنا استفاده می کنیم.
 * فرض کنید 10 خط در برنامه شما وجود دارد و در خط 5 یک استثنا وجود دارد ، بقیه کد اجرا نمی شود ، یعنی خطهای 6 تا 10 اجرا نمی شود.
 * اگر رسیدگی به استثنا را انجام دهیم ، بقیه عبارت ها اجرا می شوند. به همین دلیل است که از مدیریت استثنائات در جاوا استفاده می کنیم.
 * Difference between Checked and Unchecked Exceptions:
 * 1) Checked Exception
 * The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.
 * 2) Unchecked Exception
 * The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
 * Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 * 3) Error
 * Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.
 * تفاوت بین استثنائات Checked و Unchecked:
 * 1) استثناء بررسی شده:
 * کلاس هایی که به طور مستقیم از کلاس Throwable به جز RuntimeException و Error به ارث می برند ، به عنوان استثنائات بررسی شده به عنوان مثال شناخته شده اند. IOException ، SQLException و غیره استثنائات بررسی شده در زمان کامپایل بررسی می شوند.
 * 2) استثناء بدون بررسی:
 * کلاس هایی که RuntimeException را به ارث می برند به عنوان استثنائات بدون بررسی شناخته می شوند. به عنوان مثال ArithmeticException، NullPointerException، ArrayIndexOutOfBoundsException و غیره
 * استثنائات برطرف نشده در زمان کامپایل بررسی نمی شوند ، اما در زمان اجرا بررسی می شوند.
 * 3) خطا
 * خطا غیرقابل بازگشت است مثلاً OutOfMemoryError ، VirtualMachineError ، AssertionError و غیره
 *
 * Java Exception Keywords:
 * try:
 * The "try" keyword is used to specify a block where we should place exception code.
 * The try block must be followed by either catch or finally. It means, we can't use try block alone.
 * catch:
 * The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone.
 * It can be followed by finally block later.
 * finally:
 * The "finally" block is used to execute the important code of the program.
 * It is executed whether an exception is handled or not.
 * throw:
 * The "throw" keyword is used to throw an exception.
 * throws:
 * The "throws" keyword is used to declare exceptions. It doesn't throw an exception.
 * It specifies that there may occur an exception in the method. It is always used with method signature.
 * کلمات کلیدی استثنا جاوا:
 * try:
 * کلمه کلیدی "try" برای مشخص کردن بلوکی که در آن باید کد استثنا قرار دهیم استفاده می شود.
 * بلوک try باید با catch یا finally پیگیری شود. این بدان معناست که ، ما نمی توانیم به تنهایی از این  block استفاده کنیم.
 * catch:
 * بلوک "catch" برای رسیدگی به استثناء استفاده می شود. باید قبل از آن try بلوک انجام شود و این بدان معنی است که ما نمی توانیم به تنهایی از بلوک catch استفاده کنیم.
 * در نهایت بعداً میتواند توسط بلوک finally ادامه پیدا کند.
 * finally:
 * بلوک "finally" برای اجرای کد مهمی از برنامه استفاده می شود.
 * این اجرا می شود که آیا یک استثناء مدیریت شده است یا خیر.
 * throw:
 * کلمه "throw" برای پرتاب یک استثناء استفاده می شود.
 * throws:
 * کلید واژه "throws" برای اعلام استثناء استفاده می شود. این یک استثنا را پرت نمیکند.
 * مشخص می کند که ممکن است یک استثناء در متد اتفاق بیفتد. همیشه با امضای متد استفاده می شود.
 *
 * Common Scenarios of Java Exceptions:
 * 1) A scenario where ArithmeticException occurs:
 * If we divide any number by zero, there occurs an ArithmeticException.
 * 2) A scenario where NullPointerException occurs:
 * If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
 * 3) A scenario where NumberFormatException occurs:
 * The wrong formatting of any value may occur NumberFormatException.
 * Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.
 * 4) A scenario where ArrayIndexOutOfBoundsException occurs:
 * If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException
 * سناریوهای عمومی استثنائات جاوا:
 * 1) سناریویی که ArithmeticException در آن رخ می دهد:
 * اگر هر عدد را بر صفر تقسیم کنیم ، یک ArithmeticException رخ می دهد.
 * 2) سناریویی که NullPointerException در آن رخ می دهد:
 * اگر در هر متغیر مقدار null داشته باشیم ، انجام هر عملیاتی روی متغیر ، NullPointerException را پرتاب می کند.
 * 3) سناریویی که در آن NumberFormatException رخ می دهد:
 * قالب بندی اشتباه از هر مقدار ممکن است NumberFormatException رخ دهد.
 * فرض کنید من یک متغیر رشته ای داشته باشم که دارای کارکتر باشد ، با تبدیل این متغیر به رقم ، NumberFormatException رخ خواهد داد.
 * 4) سناریویی که در آن ArrayIndexOutOfBoundsException رخ می دهد:
 * اگر شما هر مقدار را در فهرست اشتباه وارد کنید ، منجر به ArrayIndexOutOfBoundsException خواهد شد
 *
 */
public class ExceptionHandling {
    public Integer devide(Integer number1, Integer number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            return null;
        }
    }
}
