package com.motaharinia.javacore.tjava9feachers.binterfaceprivatemethods;

/**
 * https://www.javatpoint.com/java-9-interface-private-methods
 * In Java 9, we can create private methods inside an interface.
 * Interface allows us to declare private methods that help to share common code between non-abstract methods.
 * Before Java 9, creating private methods inside an interface cause a compile time error.
 * The following example is compiled using Java 8 compiler and throws a compile time error.
 * در جاوا 9 می توانیم متدهای خصوصی را درون یک رابط ایجاد کنیم.
 * رابط به ما این امکان را می دهد که متدهای خصوصی را برای کمک به اشتراک گذاری کد مشترک بین متدهای غیر انتزاعی اعلام کنیم.
 * قبل از جاوا 9 ، ایجاد متد های خصوصی در داخل رابط باعث ایجاد خطای زمان کامپایل می شود.
 *
 */
public class Java9PrivateInterfaceMethods implements Sayable{

}

/**
 * Java 9 Private Interface Methods Example:
 */
interface Sayable{
    default String say() {
        String result="";
        result+=saySomething(); // Calling private method
        result+=sayPolitely(); //  Calling private static method
        return result;
    }
    // Private method inside interface
    private String saySomething() {
        return("I'm private method.");
    }
    // Private static method inside interface
    private static String sayPolitely() {
        return ("I'm private static method.");
    }
}
