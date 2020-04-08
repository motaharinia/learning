package com.motaharinia.javacore.gjavaoopsmisc.fcallbyvalue;

//https://www.javatpoint.com/call-by-value-and-call-by-reference-in-java
//There is only call by value in java, not call by reference.
//If we call a method passing a value, it is known as call by value.
//The changes being done in the called method, is not affected in the calling method.
//در جاوا فقط فراخوانی با مقدار انجام می شود و فراخوانی با ارجاع انجام نمی شود.
//اگر متدی را با پاس دادن مقداری به آن فراخوانی کنیم ، به عنوان فراخوانی با مقدار شناخته می شود.
//تغییراتی که در متد فراخوانی شده انجام می شود ، در متد فراخوانی کننده تأثیر نمی گذارد.
//
//
public class CallByValueReference {
    //مقدار پیش فرض
    public Integer data = 50;

    /**
     * متد تغییر دهنده مقدار در درون خود برای تست فراخوانی با مقدار
     *
     * @param data مقدار
     */
    void callByValue(int data) {
        data = data + 100;
    }


    /**
     * متد تغییر دهنده مقدار در درون خود برای تست فراخوانی با مقدار
     *
     * @param callByValueReference شیی ورودی
     */
    void callByReference(CallByValueReference callByValueReference) {
        callByValueReference.data = callByValueReference.data + 100;
    }

}
