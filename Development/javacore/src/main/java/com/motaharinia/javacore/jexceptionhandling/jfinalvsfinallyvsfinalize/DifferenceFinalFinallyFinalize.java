package com.motaharinia.javacore.jexceptionhandling.jfinalvsfinallyvsfinalize;

/**
 * https://www.javatpoint.com/difference-between-final-finally-and-finalize
 * There are many differences between final, finally and finalize.
 * A list of differences between final, finally and finalize are given below:
 * 1)	Final is used to apply restrictions on class, method and variable.
 * Final class can't be inherited, final method can't be overridden and final variable value can't be changed.
 * Finally is used to place important code, it will be executed whether exception is handled or not.
 * Finalize is used to perform clean up processing just before object is garbage collected.
 * 2)	Final is a keyword.	Finally is a block.	Finalize is a method.
 * تفاوت های زیادی بین final ، finally و finalize وجود دارد.
 * لیست تفاوت های final ، finally و finalize در زیر آورده شده است:
 * 1) کلمه Final برای اعمال محدودیت در کلاس ، متد و متغیر استفاده می شود.
 * کلاس Final قابل ارث بری نیست ، متد Final قابل حذف نیست و مقدار متغیر Final قابل تغییر نیست.
 * بلوک Finally برای قرار دادن کد مهم استفاده می شود ، اجرا خواهد شد که آیا استثناء تحت کنترل است یا نه.
 * متد Finalize برای انجام عملیات تمیز کردن درست قبل از جمع آوری زباله مورد استفاده قرار می گیرد.
 * 2) کلمه Final یک کلمه کلیدی است. Finally یک بلوک است. Finalize یک متد است.
 */
public class DifferenceFinalFinallyFinalize {
    //final keyword
    final Integer x = 100;

    public void method1() {
        //finally block:
        try {
            Integer y = 300;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is executed");
        }
    }

    //finalize method
    public void finalize() {
        System.out.println("finalize called");
    }
}
