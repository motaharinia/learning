package com.motaharinia.javacore.jexceptionhandling.ljavacustomexceptions;

/**
 * https://www.javatpoint.com/custom-exception
 * Java Custom Exception:
 * If you are creating your own Exception that is known as custom exception or user-defined exception.
 * Java custom exceptions are used to customize the exception according to user need.
 * By the help of custom exception, you can have your own exception and message.
 * استثناء سفارشی جاوا:
 * اگر شما در حال ایجاد استثناء خود هستید که به عنوان استثناء سفارشی یا استثنائی تعریف شده توسط کاربر شناخته می شود.
 * استثنائات سفارشی جاوا برای سفارشی کردن استثناء با توجه به نیاز کاربر استفاده می شود.
 * با کمک استثناء سفارشی ، می توانید استثنا و پیام خود را داشته باشید.
 *
 * class InvalidAgeException extends Exception{
 * InvalidAgeException(String s){
 * super(s);
 * }
 * }
 */
public class CustomException extends Exception {
    /**
     * متد سازنده
     *
     * @param s پیام
     */
    CustomException(String s) {
        super(s);
    }


    /**
     * متد اعتبار سنجی سن
     *
     * @param age سن ورودی
     * @throws CustomException در صورت بروز خطای اعتبارسنجی بیرون بدهد
     */
    public void validate(Integer age) throws CustomException {
        if (age < 0 || age > 200) {
            throw new CustomException("not valid");
        }
    }
}
