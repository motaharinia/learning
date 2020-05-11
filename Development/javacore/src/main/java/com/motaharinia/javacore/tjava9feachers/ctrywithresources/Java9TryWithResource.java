package com.motaharinia.javacore.tjava9feachers.ctrywithresources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * https://www.javatpoint.com/java-9-try-with-resources
 * Java introduced try-with-resource feature in Java 7 that helps to close resource automatically after being used.
 * In other words, we can say that we don't need to close resources (file, connection, network etc) explicitly, try-with-resource close that automatically by using AutoClosable interface.
 * In Java 7, try-with-resources has a limitation that requires resource to declare locally within its block.
 * جاوا ویژگی try-with-resource  را در Java 7 معرفی کرد که به شما کمک می کند تا پس از استفاده ، منابع را بطور خودکار ببندید.
 * به عبارت دیگر ، ما می توانیم بگوییم که نیازی به بستن منابع (پرونده ، اتصال ، شبکه و غیره) نداریم ، با استفاده از رابط AutoClosable بطور خودکار سعی کنید که منبع ببندید.
 * در جاوا 7 ، try-with-resources  محدودیتی دارد که به آن نیاز دارد تا منابع به صورت محلی در بلاک خود اعلام شوند.
 *
 *
 */
public class Java9TryWithResource {
    public void tryWithResourceOnFile() throws FileNotFoundException {
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");
        try(fileStream){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
