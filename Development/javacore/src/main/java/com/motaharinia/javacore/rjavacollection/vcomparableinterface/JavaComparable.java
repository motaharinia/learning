package com.motaharinia.javacore.rjavacollection.vcomparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/Comparable-interface-in-collection-framework
 * Java Comparable interface is used to order the objects of the user-defined class.
 * This interface is found in java.lang package and contains only one method named compareTo(Object).
 * It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 * For example, it may be rollno, name, age or anything else.
 * رابط Comparable Java برای ترتیب اشیاء کلاس تعریف شده توسط کاربر استفاده می شود.
 * این رابط در بسته java.lang یافت می شود و تنها یک متد به نام compareTo (Object) دارد.
 * این فقط یک ترتیب مرتب سازی واحد ارائه می دهد ، یعنی شما می توانید عناصر را بر اساس تنها عضو داده واحد مرتب کنید.
 * به عنوان مثال ، ممکن است rollno ، نام ، سن یا هر چیز دیگری باشد.
 * <p>
 * compareTo method:
 * public int compareTo(Object obj):
 * It is used to compare the current object with the specified object. It returns
 * positive integer, if the current object is greater than the specified object.
 * negative integer, if the current object is less than the specified object.
 * zero, if the current object is equal to the specified object.
 * متد compareTo:
 * public int compareTo (Object obj):
 * برای مقایسه شی فعلی با شی مشخص شده استفاده می شود. برمی گردد
 * عدد صحیح مثبت ، اگر جسم فعلی از جسم مشخص شده بیشتر باشد.
 * عدد صحیح منفی ، اگر جسم فعلی کمتر از جسم مشخص شده باشد.
 * اگر جسم فعلی برابر با شیء مشخص شده باشد صفر است.
 * <p>
 * We can sort the elements of:
 * String objects
 * Wrapper class objects
 * User-defined class objects
 * ما می توانیم عناصر زیر را مرتب کنیم:
 * اشیاء رشته ای
 * اشیاء کلاس بسته بندی
 * اشیاء کلاس تعریف شده توسط کاربر
 * <p>
 * Collections class:
 * Collections class provides static methods for sorting the elements of collections.
 * If collection elements are of Set or Map, we can use TreeSet or TreeMap.
 * However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
 * کلاس Collections:
 * کلاس Collections روش های ایستایی برای مرتب سازی عناصر مجموعه ها ارائه می دهند.
 * اگر عناصر مجموعه از مجموعه یا نقشه باشند ، می توانیم از TreeSet یا TreeMap استفاده کنیم.
 * با این حال ، ما نمی توانیم عناصر لیست را مرتب سازی کنیم. کلاس Collections متدهایی را برای مرتب سازی عناصر عناصر نوع فهرست فراهم می کند.
 * <p>
 * Method of Collections class for sorting List elements:
 * public void sort(List list):
 * It is used to sort the elements of List. List elements must be of the Comparable type.
 * متد کلاس Collections برای مرتب سازی عناصر لیست:
 * public void sort(List list):
 * از آن برای مرتب کردن عناصر List استفاده می شود. عناصر لیست باید از نوع Comparable باشند
 */
public class JavaComparable {
    public String sortUserDefinedObject(){
        ArrayList<JavaComparableStudent> studentArrayList=new ArrayList<JavaComparableStudent>();
        studentArrayList.add(new JavaComparableStudent(101,"Motaharinia",23));
        studentArrayList.add(new JavaComparableStudent(106,"Ajay",27));
        studentArrayList.add(new JavaComparableStudent(105,"Jai",21));

        Collections.sort(studentArrayList,Collections.reverseOrder());
        return studentArrayList.stream().map(e->e.name).collect(Collectors.joining(","));
    }
}


class JavaComparableStudent implements Comparable<JavaComparableStudent> {
    Integer rollno;
    String name;
    Integer age;

    JavaComparableStudent(Integer rollno, String name, Integer age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(JavaComparableStudent student) {
        if (age.equals(student.age))
            return 0;
        else if (age > student.age)
            return 1;
        else
            return -1;
    }
}