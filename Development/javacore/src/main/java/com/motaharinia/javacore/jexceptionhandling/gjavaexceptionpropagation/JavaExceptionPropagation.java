package com.motaharinia.javacore.jexceptionhandling.gjavaexceptionpropagation;

/**
 * https://www.javatpoint.com/exception-propagation
 * Java Exception propagation:
 * An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method,
 * If not caught there, the exception again drops down to the previous method,
 * and so on until they are caught or until they reach the very bottom of the call stack.This is called exception propagation.
 * انتشار استثناء جاوا:
 * یک استثناء ابتدا از بالای پشته پرتاب می شود و اگر caught نشود ، پشته call stack را به متد قبلی پایین می آورد ،
 * اگر در آنجا caught نشود ، استثنا دوباره به متد قبلی فرو می رود ،
 * و مواردی از این قبیل تا زمانی که caught شود یا تا رسیدن به انتهای call stack. این به عنوان انتشار استثنا نامیده می شود.
 */
public class JavaExceptionPropagation {
    private Integer uncheckedRuntimeMethod3() {
        Integer data = 50 / 0;
        return data;
    }

    private Integer uncheckedRuntimeMethod2() {
        return this.uncheckedRuntimeMethod3();
    }

    public Integer uncheckedRuntimeMethod1() {
        try {
            return this.uncheckedRuntimeMethod2();
        } catch (Exception e) {
            return null;
        }
    }


//    //این قسمت خطای کامپایل خواهد داشت چون خود جاوا خطاهای checked Exception را propagate نمیکند
//    //مگر اینکه ما در انتهای متدها آن را به صورت زیر تعریف کنیم
//    //throws Exception
//    private Integer checkedIoMethod3() {
//        throw new java.io.IOException("device error");//checked exception (compile time error)
//    }
//
//    private Integer checkedIoMethod2() {
//        return this.checkedIoMethod3();
//    }
//
//    public Integer checkedIoMethod1() {
//        try {
//            return this.checkedIoMethod2();
//        } catch (Exception e) {
//            return null;
//        }
//    }

}
