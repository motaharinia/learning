package com.motaharinia.javacore.tjava9feachers.esafevarargsannotation;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/java-9-safevarargs-annotation
 * It is an annotation which applies on a method or constructor that takes varargs parameters.
 * It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
 * It was included in Java7 and can only be applied on
 * Final methods
 * Static methods
 * Constructors
 * From Java 9, it can also be used with private instance methods.
 * این انوتیشن است که در مورد یک متد یا سازنده که پارامترهای varargs را می گیرد صدق می کند.
 * استفاده می شود تا اطمینان حاصل شود که این متد عملیات ناامن را بر روی پارامترهای varargs خود انجام نمی دهد.
 * این در Java7 گنجانده شده است و فقط روی موارد زیر قابل استفاده است
 * متد های نهایی
 * متد های استاتیک
 * سازندگان
 * از Java 9 می توان روی متد های نمونه خصوصی نیز استفاده کرد.
 * <p>
 * Note: The @SafeVarargs annotation can be applied only to methods that cannot be overridden. Applying to the other methods will throw a compile time error.
 * توجه: انوتیشن SafeVarargs فقط در متدهایی قابل استفاده است که نتواند overridden شود. استفاده از متدهای دیگر خطای زمان کامپایل را پرت می کند.
 */
public class Java9SafeVarargs {
    public String display1(List<String>... productList) { // Not using @SafeVarargs
        return this.display(productList);
    }


    @SafeVarargs
    private String display(List<String>... productList) {
        String result = "";
        for (List<String> productListInLoop : productList) {
            for(String product : productListInLoop){
                result += product;
            }
        }
        return result;
    }
}
