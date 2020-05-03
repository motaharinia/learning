package com.motaharinia.javacore.rjavacollection.wcomparatorinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * https://www.javatpoint.com/Comparator-interface-in-collection-framework
 */
public class JavaComparatorTest {
    //متغیر تست
    JavaComparator javaComparator;
    ArrayList<JavaComparatorStudent> studentArrayList;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaComparator = new JavaComparator();
        studentArrayList=new ArrayList<JavaComparatorStudent>();
        studentArrayList.add(new JavaComparatorStudent(101,"Motaharinia",23));
        studentArrayList.add(new JavaComparatorStudent(106,"Ajay",27));
        studentArrayList.add(new JavaComparatorStudent(105,"Jai",21));
    }

    /**
     * این متد sort non generic روی فیلد سن لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorNonGenericSortByAgeTest() throws Exception {
        Assertions.assertEquals("Jai,Motaharinia,Ajay", javaComparator.nonGenericOldStyleSortByAge(studentArrayList));
    }

    /**
     * این متد sort non generic روی فیلد نام لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorNonGenericSortByNameTest() throws Exception {
        Assertions.assertEquals("Ajay,Jai,Motaharinia", javaComparator.nonGenericOldStyleSortByName(studentArrayList));
    }


    /**
     * این متد sort generic روی فیلد سن لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorGenericSortByAgeTest() throws Exception {
        Assertions.assertEquals("Jai,Motaharinia,Ajay", javaComparator.genericNewStyleSortByAge(studentArrayList));
    }



    /**
     * این متد sort generic روی فیلد نام لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorGenericSortByNameTest() throws Exception {
        Assertions.assertEquals("Ajay,Jai,Motaharinia", javaComparator.genericNewStyleSortByName(studentArrayList));
    }


    /**
     * این متد sort java8 روی فیلد سن لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorJava8SortByAgeTest() throws Exception {
        Assertions.assertEquals("Jai,Motaharinia,Ajay", javaComparator.java8SortByAge(studentArrayList));
    }



    /**
     * این متد sort java8 روی فیلد نام لیستی از اشیا را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorJava8SortByNameTest() throws Exception {
        Assertions.assertEquals("Ajay,Jai,Motaharinia", javaComparator.java8SortByName(studentArrayList));
    }


    /**
     * این متد sort java8 روی فیلد نام لیستی از اشیا با داشتن مقدار null را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparatorJava8NullsFirstSortByNameTest() throws Exception {
        studentArrayList.add(new JavaComparatorStudent(108,null,28));
        Assertions.assertEquals("null,Ajay,Jai,Motaharinia", javaComparator.java8NullsFirstSortByName(studentArrayList));
    }
}
