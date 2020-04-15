package com.motaharinia.javacore.jexceptionhandling.kexceptionhandlingwithmethodoverriding;

import java.io.IOException;

/**
 * https://www.javatpoint.com/exception-handling-with-method-overriding
 * ExceptionHandling with MethodOverriding in Java:
 * There are many rules if we talk about methodoverriding with exception handling. The Rules are as follows:
 * If the superclass method does not declare an exception,
 * subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
 * If the superclass method declares an exception,
 * subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 * مدیریت استثناء با استفاده از methodoverriding در جاوا
 * قوانین زیادی وجود دارد اگر ما در مورد نحوه استفاده از methodoverriding صحبت کنیم. قوانین به شرح زیر است:
 * اگرمتد superclass استثنائی اعلام نكرد ،
 * متد overridden زیرکلاس نمی تواند استثناء بررسی شده را اعلام کند اما می تواند استثناء بررسی نشده را اعلام کند.
 * اگر متد superclass یک استثنا را اعلام کند ،
 * متد overridden زیرکلاس می تواند یک استثناء یکسان یا سطح پایین تر را اعلام کند یا هیچ استثناء را اعلام نکند اما نمیتواند استثنا سطح بالاتر را اعلام کند.
 */
public class ExceptionHandlingMethodOverriding {
    /**
     * اگرمتد superclass استثنائی اعلام نكرد
     */
    void methodWithoutException() {
        System.out.println("parent");
    }

    /**
     * اگرمتد superclass استثنائی اعلام كرد
     */
    void methodWithException() throws ArithmeticException {
        System.out.println("parent");
    }


    /**
     * اگرمتد superclass استثنائی اعلام كرد
     */
    void methodWithException2() throws Exception {
        System.out.println("parent");
    }
}


class ExceptionHandlingMethodOverridingChild extends ExceptionHandlingMethodOverriding {
//    /**
//     *  متد overridden زیرکلاس نمی تواند استثناء بررسی شده را اعلام کند
//     * (Compile Time Error)
//     * @throws IOException
//     */
//    void methodWithoutException()throws IOException {
//        System.out.println("TestExceptionChild");
//    }

    /**
     * متد overridden زیرکلاس می تواند استثناء بررسی نشده را اعلام کند
     *
     * @throws IOException
     */
    void methodWithoutException() throws ArithmeticException {
        System.out.println("TestExceptionChild");
    }


//    /**
//     *  متد overridden زیرکلاس  نمیتواند استثنا سطح بالاتر را اعلام کند
//     * (Compile Time Error)
//     * @throws IOException
//     */
//    void methodWithException()throws Exception{
//        System.out.println("child");
//    }


    /**
     * متد overridden زیرکلاس می تواند استثناء یکسان را اعلام کند
     *
     * @throws IOException
     */
    void methodWithException() throws ArithmeticException {
        System.out.println("parent");
    }



    /**
     *
     *  متد overridden زیرکلاس می تواند استثناء سطح پایینتر را اعلام کند
     *
     * @throws IOException
     */
    void methodWithException2() throws ArithmeticException {
        System.out.println("parent");
    }
}