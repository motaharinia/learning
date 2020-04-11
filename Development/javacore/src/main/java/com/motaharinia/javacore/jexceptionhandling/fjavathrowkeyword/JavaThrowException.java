package com.motaharinia.javacore.jexceptionhandling.fjavathrowkeyword;

/**
 * https://www.javatpoint.com/throw-keyword
 *The Java throw keyword is used to explicitly throw an exception.
 * We can throw either checked or uncheked exception in java by throw keyword.
 * The throw keyword is mainly used to throw custom exception. We will see custom exceptions later.
 * Let's see the example of throw IOException:
 * throw new IOException("sorry device error");
 * کلمه کلیدی throw جاوا برای صراحت استثناء استفاده می شود.
 * ما می توانیم با استفاده از کلیدواژه throw، استثناء بررسی شده یا بدون بررسی را در جاوا پرتاب کنیم.
 * کلمه کلیدی throw عمدتاً برای پرتاب استثناء سفارشی استفاده می شود. بعدا استثنائات سفارشی را خواهیم دید.
 * بیایید نمونه پرتاب IOException را ببینید:
 * throw new IOException("sorry device error");
 */
public class JavaThrowException {

    static void validate(Integer age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
}
