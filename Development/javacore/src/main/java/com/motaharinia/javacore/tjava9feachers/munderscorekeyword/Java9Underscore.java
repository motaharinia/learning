package com.motaharinia.javacore.tjava9feachers.munderscorekeyword;

/**
 * https://www.javatpoint.com/java-9-underscore-keyword
 * Java 9 Underscore:
 * In earlier versions of Java, underscore can be used as identifier and to create variable name also.
 * But in Java 9 release, underscore is a keyword and can't be used as an identifier or variable name.
 * If we use the underscore character ("_") as an identifier, our source code can no longer be compiled.
 * Let's see some examples that explain, how the use of underscore is changed version after after.
 *جاوا 9 Underscore:
 * در نسخه های اولیه جاوا می توان از Underscore به عنوان شناسه استفاده کرد و نام متغیر نیز ایجاد کرد.
 * اما در نسخه جاوا 9 ، Underscore یک کلمه کلیدی است و نمی توان از آن به عنوان شناسه یا نام متغیر استفاده کرد.
 * اگر از کارکتر Underscore ("_") به عنوان شناسه استفاده کنیم ، کد منبع ما دیگر نمی تواند کامپایل شود.
 * بیایید چند نمونه را توضیح دهیم که نحوه استفاده از Underscore بعد از نسخه تغییر می کند.
 *
 * In Java 7, we can use underscore like the following:
 * در جاوا 7 می توان از موارد زیر مانند زیر استفاده کرد:
 * public class UnderScoreExample {
 *     public static void main(String[] args) {
 *         int _ = 10; // creating variable
 *         System.out.println(_);
 *     }
 * }
 * If we compile the same program in Java 8, it will compile but throws a warning message.
 * In Java 9, program fails to compile and throws compile time error because now it is a keyword and can't be use as a variable name.
 * اگر همان برنامه را در جاوا 8 کامپایل کنیم ، کامپایل می شود اما یک پیام warning را پرتاب می کند.
 * در جاوا 9 ، برنامه نمیتواند کامپایل شودو  خطای زمان کامپایل را پرتاب میکند زیرا اکنون این کلمه کلیدی است و نمی تواند به عنوان یک متغیر از آن استفاده شود
 */
public class Java9Underscore {
}
