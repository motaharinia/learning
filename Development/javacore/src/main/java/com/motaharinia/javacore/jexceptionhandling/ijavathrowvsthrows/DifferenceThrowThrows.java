package com.motaharinia.javacore.jexceptionhandling.ijavathrowvsthrows;

/**
 * https://www.javatpoint.com/difference-between-throw-and-throws-in-java
 * There are many differences between throw and throws keywords. A list of differences between throw and throws are given below:
 * 1)	Java throw keyword is used to explicitly throw an exception.	Java throws keyword is used to declare an exception.
 * 2)	Checked exception cannot be propagated using throw only.	Checked exception can be propagated with throws.
 * 3)	Throw is followed by an instance.	Throws is followed by class.
 * 4)	Throw is used within the method.	Throws is used with the method signature.
 * 5)	You cannot throw multiple exceptions.	You can declare multiple exceptions e.g.
 * public void method()throws IOException,SQLException.
 * 1) کلمه کلیدی throw جاوا برای پرتاب استثناء به صورت شفاف استفاده می شود. کلیدواژه throws جاوا برای تعریف استثناء استفاده می شود.
 * 2) استثناء بررسی شده با throw نمیتواند propagated شود. استثناء بررسی شده با throws میتواند propagated شود.
 * 3) یک Throw توسط یک نمونه شیی دنبال می شود. Throws توسط کلاس دنبال می شوند.
 * 4) یک Throw در داخل متد استفاده می شود. Throws با امضای متد استفاده می شود.
 * 5) شما نمی توانید استثنائات متعدد را پرتاب کنید. شما می توانید استثنائات متعدد را اعلام کنید مثال:.
 * public void method()throws IOException,SQLException.
 */
public class DifferenceThrowThrows {


    /**
     * Java throw and throws example
     *
     * @throws ArithmeticException
     */
    void test() throws ArithmeticException {
        throw new ArithmeticException("sorry");
    }
}
