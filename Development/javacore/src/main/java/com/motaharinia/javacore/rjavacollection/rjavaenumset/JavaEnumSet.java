package com.motaharinia.javacore.rjavacollection.rjavaenumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://www.javatpoint.com/java-enumset
 * Java EnumSet class:
 * Java EnumSet class is the specialized Set implementation for use with enum types.
 * It inherits AbstractSet class and implements the Set interface.
 * کلاس Java EnumSet:
 * کلاس Java EnumSet عبارت است از پیاده سازی تخصصی مجموعه برای استفاده با انواع enum.
 * این کلاس AbstractSet را به ارث می برد و رابط Set را پیاده سازی می کند
 * <p>
 * EnumSet class declaration:
 * public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, Serializable
 * <p>
 * Methods of Java EnumSet class:
 * static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType):
 * It is used to create an enum set containing all of the elements in the specified element type.
 * static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c):
 * It is used to create an enum set initialized from the specified collection.
 * static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType):
 * It is used to create an empty enum set with the specified element type.
 * static <E extends Enum<E>> EnumSet<E> of(E e):
 * It is used to create an enum set initially containing the specified element.
 * static <E extends Enum<E>> EnumSet<E> range(E from, E to):
 * It is used to create an enum set initially containing the specified elements.
 * EnumSet<E> clone():
 * It is used to return a copy of this set.
 * متدهای کلاس Java EnumSet:
 * static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType):
 * برای ایجاد یک مجموعه enum شامل همه عناصر در نوع عنصر مشخص شده استفاده می شود.
 * static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c):
 * از آن برای ایجاد مجموعه Enum اولیه از مجموعه مشخص شده استفاده می شود.
 * static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType):
 * از آن برای ایجاد مجموعه ای از enum خالی با نوع عنصر مشخص استفاده می شود.
 * static <E extends Enum<E>> EnumSet<E> of(E e):
 * برای ایجاد یک مجموعه enum در ابتدا حاوی عنصر مشخص شده استفاده می شود.
 * static <E extends Enum<E>> EnumSet<E> range(E from, E to):
 * برای ایجاد یک مجموعه enum در ابتدا شامل عناصر مشخص شده استفاده می شود.
 * EnumSet<E> clone():
 * برای بازگشت یک نسخه از این مجموعه استفاده می شود.
 */
public class JavaEnumSet {
    public String allOfNoneOf() {
        String result = "";
        Set<JavaEnumSetDays> set1 = EnumSet.of(JavaEnumSetDays.TUESDAY, JavaEnumSetDays.WEDNESDAY);
        Set<JavaEnumSetDays> set2 = EnumSet.allOf(JavaEnumSetDays.class);
        Set<JavaEnumSetDays> set3 = EnumSet.noneOf(JavaEnumSetDays.class);

        result += "set1:[";
        Iterator<JavaEnumSetDays> iterator = set1.iterator();
        while (iterator.hasNext()) {
            result += iterator.next() + ",";
        }
        result += "]";

        result += "set2:[";
        iterator = set2.iterator();
        while (iterator.hasNext()) {
            result += iterator.next() + ",";
        }
        result += "]";

        result += "set3:[";
        iterator = set3.iterator();
        while (iterator.hasNext()) {
            result += iterator.next() + ",";
        }
        result += "]";

//        System.out.println( result);
        return result;

    }
}


enum JavaEnumSetDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}