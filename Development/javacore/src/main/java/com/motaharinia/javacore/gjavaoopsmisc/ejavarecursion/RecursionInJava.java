package com.motaharinia.javacore.gjavaoopsmisc.ejavarecursion;

//https://www.javatpoint.com/recursion-in-java
//Recursion in java is a process in which a method calls itself continuously.
//A method in java that calls itself is called recursive method.
//It makes the code compact but complex to understand.
// بازگشت مجدد در جاوا فرایندی است که طی آن یک متد به طور مداوم خود را صدا می کند.
// متدی در جاوا که خود را صدا می کند ، متد بازگشتی نامیده می شود.
// این باعث می شود کد فشرده اما پیچیده باشد.
//
public class RecursionInJava {
    /**
     * به دست آوردن فاکتوریل عدد ورودی بر اساس متد بازگشتی
     * @param n عدد ورودی
     * @return خروجی: فاکتوریل عدد ورودی
     */
    static Integer factorial(Integer n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
