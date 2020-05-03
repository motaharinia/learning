package com.motaharinia.javacore.rjavacollection.usortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 *https://www.javatpoint.com/Sorting-in-collection-framework
 * We can sort the elements of:
 * 1. String objects
 * 2. Wrapper class objects
 * 3. User-defined class objects
 * ما می توانیم عناصر زیر را مرتب کنیم:
 * 1. اشیاء رشته ای
 * 2. اشیاء کلاس بسته بندی
 * 3. اشیاء کلاس تعریف شده توسط کاربر
 *
 * Collections class provides static methods for sorting the elements of a collection.
 * If collection elements are of a Set type, we can use TreeSet.
 * However, we cannot sort the elements of List.
 * Collections class provides methods for sorting the elements of List type elements.
 * کلاس Collections متد های ایستایی برای مرتب سازی عناصر یک مجموعه ارائه می دهند.
 * اگر عناصر مجموعه از نوع Set باشند ، می توانیم از TreeSet استفاده کنیم.
 * با این حال ، ما نمی توانیم عناصر لیست را مرتب سازی کنیم.
 *کلاس Collections متد های را برای مرتب سازی عناصر عناصر نوع فهرست فراهم می کند.
 *
 * Method of Collections class for sorting List elements:
 * public void sort(List list):
 * is used to sort the elements of List. List elements must be of the Comparable type.
 * متد کلاس مجموعه ها برای مرتب سازی عناصر لیست:
 *public void sort(List list):
 * برای مرتب سازی عناصر لیست استفاده می شود. عناصر لیست باید از نوع Comparable باشند
 *
 *
 */
public class SortingInCollection {
    public String sortUserDefinedObject(){
        ArrayList<Student> studentArrayList=new ArrayList<Student>();
        studentArrayList.add(new Student("Motaharinia"));
        studentArrayList.add(new Student("Saurav"));
        studentArrayList.add(new Student("Mukesh"));
        studentArrayList.add(new Student("Tahir"));

        Collections.sort(studentArrayList,Collections.reverseOrder());
        return studentArrayList.stream().map(e->e.getName()).collect(Collectors.joining(","));
    }
}


class Student implements Comparable<Student> {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public int compareTo(Student person) {
        return name.compareTo(person.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


