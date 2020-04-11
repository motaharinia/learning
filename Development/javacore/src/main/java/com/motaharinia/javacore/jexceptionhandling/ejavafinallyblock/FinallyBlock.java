package com.motaharinia.javacore.jexceptionhandling.ejavafinallyblock;

/**
 * https://www.javatpoint.com/finally-block-in-exception-handling
 * Java finally block is a block that is used to execute important code such as closing connection, stream etc.
 * Java finally block is always executed whether exception is handled or not.
 * Java finally block follows try or catch block.
 * Why use java finally
 * Finally block in java can be used to put "cleanup" code such as closing a file, closing connection etc.
 * بلاک finally جاوا بلوکی است که برای اجرای کد های مهم مانند بستن کانکشن ، استریم و غیره استفاده می شود.
 * بلاک finally جاوا همیشه اجرا می شود ، چه استثنائی مدیریت شود شود یا نشود.
 * بلاک finally بلاک try و بلاک catch را دنبال می کند
 * : چرا از بلاک finally جاوا استفاده می کنیم
 * بلاک finally در جاوا برای قرار دادن کد "پاکسازی" مانند بستن فایل ، بستن اتصال و غیره استفاده کرد.
 */
public class FinallyBlock {
    public Integer devide(Integer number1, Integer number2) {
        Integer result=0;
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
//            result=50;
            return null;
        }finally{
            result++;
            return result;
        }
//        return result;
    }
}
