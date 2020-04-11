package com.motaharinia.javacore.jexceptionhandling.hjavathrowskeyword;

import java.io.IOException;

/**
 * https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws
 * Java throws keyword:
 * The Java throws keyword is used to declare an exception.
 * It gives an information to the programmer that there may occur an exception
 * so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.
 * Exception Handling is mainly used to handle the checked exceptions.
 * If there occurs any unchecked exception such as NullPointerException,
 * it is programmers fault that he is not performing check up before the code being used.
 * کلیدواژه throws جاوا:
 * كليد واژه throws جاوا براي اعلام يك استثناء استفاده مي شود.
 * این اطلاعات را به برنامه نویس می دهد که ممکن است یک استثنا وجود داشته باشد
 * بنابراین بهتر است برنامه نویس کد مدیریت استثنا را تهیه کند تا جریان عادی حفظ شود.
 * مدیریت استثناء عمدتاً برای رسیدگی به استثنائات بررسی شده استفاده می شود.
 * در صورت بروز هر گونه استثناء بدون بررسی مانند NullPointerException ،
 * این تقصیر برنامه نویسان است که وی قبل از استفاده از کد ، چک را انجام نمی دهد.
 * <p>
 * Syntax of java throws:
 * return_type method_name() throws exception_class_name{
 * //method code
 * }
 * <p>
 * Which exception should be declared
 * checked exception only, because:
 * unchecked Exception: under your control so correct your code.
 * error: beyond your control e.g. you are unable to do anything if there occurs VirtualMachineError or StackOverflowError.
 * کدام استثنا باید اعلام شود
 * استثناء بررسی شده ، زیرا:
 * استثنا کنترل نشده: تحت کنترل کد خودتان است کد را اصلاح کنید.
 * خطا: فراتر از کنترل شما است به عنوان مثال در صورت بروز VirtualMachineError یا StackOverflowError قادر به انجام کاری نیستید.
 * <p>
 * Advantage of Java throws keyword
 * Now Checked Exception can be propagated (forwarded in call stack).
 * It provides information to the caller of the method about the exception.
 * مزیت کلمه کلیدی throws جاوا:
 * اکنون استثنای Checked می تواند propagate شود (در call stack  ارسال می شود).
 * اطلاعات مربوط به استثناء را به فراخوانی کننده متد ارائه می دهد.
 * <p>
 * There are two cases:
 * Case1: You caught the exception i.e. handle the exception using try/catch:
 * In case you handle the exception, the code will be executed fine whether exception occurs during the program or not.
 * Case2: You declare the exception i.e. specifying throws with the method:
 * A)In case you declare the exception, if exception does not occur, the code will be executed fine.
 * B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.
 * دو مورد وجود دارد:
 * حالت1: شما استثنا را گرفتید ، یعنی استثنا را کنترل کردید
 * در صورت مدیریت استثناء ، کد خوب اجرا خواهد شد چه استثناء در طول برنامه رخ دهد یا نه.
 * حالت2: شما استثنا را اعلام می کنید ، یعنی مشخص کردن پرتاب ها با متد:
 * الف) در صورت اعلام استثنا ، اگر استثنائی رخ ندهد ، کد به خوبی اجرا می شود.
 * ب) در صورت اعلام استثناء در صورت وقوع استثنا ، استثناء در زمان اجرا پرتاب می شود زیرا throws استثناء را مدیریت نمی کند.
 * <p>
 * Can we rethrow an exception?
 * Yes, by throwing same exception in catch block.
 * آیا می توانیم یک استثنا را دوباره پرتاب مجدد کنیم؟
 * بله ، با پرتاب همین استثنا در بلوک catch.
 */
public class JavaThrowsKeyword {
    /**
     * امکان اعلام استثنائات checked با استفاده از throws
     *
     * @throws IOException
     */
    private Integer checkedIoMethod3() throws IOException {
        throw new java.io.IOException("device error");//checked exception (compile time error)
    }

    private Integer checkedIoMethod2() throws IOException {
        return this.checkedIoMethod3();
    }

    public Integer checkedIoMethod1() {
        try {
            return this.checkedIoMethod2();
        } catch (Exception e) {
            return null;
        }
    }
}
