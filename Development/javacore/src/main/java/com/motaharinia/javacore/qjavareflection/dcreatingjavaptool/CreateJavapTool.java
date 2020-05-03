package com.motaharinia.javacore.qjavareflection.dcreatingjavaptool;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * https://www.javatpoint.com/creating-javap-tool
 * Following methods of java.lang.Class class can be used to display the metadata of a class.
 * public Field[] getDeclaredFields()throws SecurityException:
 * returns an array of Field objects reflecting all the fields declared by the class or interface represented by this Class object.
 * public Constructor[] getDeclaredConstructors()throws SecurityException:
 * returns an array of Constructor objects reflecting all the constructors declared by the class represented by this Class object.
 * public Method[] getDeclaredMethods()throws SecurityException:
 * returns an array of Method objects reflecting all the methods declared by the class or interface represented by this Class object.
 * از متدهای زیر کلاس java.lang.Class می توان برای نمایش metadata از یک کلاس استفاده کرد.
 * public Field[] getDeclaredFields()throws SecurityException:
 * مجموعه ای از اشیاء فیلد را بازتاب می کند که تمام زمینه های اعلام شده توسط کلاس یا رابط ارائه شده توسط این شیء کلاس را نشان می دهد.
 * public Constructor[] getDeclaredConstructors()throws SecurityException:
 * مجموعه ای از اشیاء سازنده را بازتاب می دهد و تمام سازنده های اعلام شده توسط کلاس را نشان می دهد که توسط این شی کلاس بیان شده است.
 * public Method[] getDeclaredMethods()throws SecurityException:
 * مجموعه ای از اشیاء متد را بازتاب می دهد و تمام متد های اعلام شده توسط کلاس یا رابط ارائه شده توسط این شیء Class را بازگرداند.
 */
public class CreateJavapTool {
    public String getMetadata(Class clazz) {
        String result = "";
        String[] stringArray;

        Field[] declaredFields= clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++)
            result += declaredFields[i].getName() + ",";

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++)
            result += declaredMethods[i].getName() + ",";

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++)
            result += declaredConstructors[i].getName() + ",";

        return result;
    }
}


