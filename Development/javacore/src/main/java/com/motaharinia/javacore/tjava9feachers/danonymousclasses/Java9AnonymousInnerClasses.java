package com.motaharinia.javacore.tjava9feachers.danonymousclasses;

/**
 * https://www.javatpoint.com/java-9-anonymous-classes
 * Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
 * Using the diamond with anonymous classes was not allowed in Java 7.
 * In Java 9, as long as the inferred type is denotable, we can use the diamond operator when we create an anonymous inner class.
 * Data types that can be written in Java program like int, String etc are called denotable types.
 * Java 9 compiler is enough smart and now can infer type.
 * جاوا 9 ویژگی جدیدی را معرفی کرد که به ما امکان استفاده از اپراتور الماس را با کلاس های ناشناس می دهد.
 * استفاده از الماس با کلاس های ناشناس در جاوا 7 مجاز نبود.
 * در جاوا 9 ، تا زمانی که نوع استنباطی قابل توصیف باشد ، می توانیم هنگام ایجاد یک کلاس داخلی ناشناس از عملگر الماس استفاده کنیم.
 * انواع داده هایی که می توانند در برنامه جاوا مانند int ، String و غیره نوشته شوند ، انواع قابل علامت گذاری هستند.
 * کامپایلر جاوا 9 به اندازه کافی هوشمند است و اکنون می توان از نوع استنباط شد.
 *
 * توضیحات در مورد اپراتور الماس:
 * Raw Types prior to Java 5(Problem: typecasting):
 * List arrayList = new ArrayList<>();
 *
 * Generics from Java 5(problem: long bad readable code):
 * List<String> list = new ArrayList<String>();
 * Map<String, List<Map<String, Map<String, Integer>>>> list2 = new HashMap<String, List<Map<String, Map<String, Integer>>>>();
 *
 * Diamond Operator from Java 7(problem: cannot use anonymous class):
 * List<Map<String, List<String>> stringList = new ArrayList<>();
 *
 * توضیحات بیشتر:
 * https://www.baeldung.com/java-diamond-operator
 *
 */
public class Java9AnonymousInnerClasses {
    public String useDiamondOperator(){
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a+b;
            }
        };

        ABCD<Integer> b = new ABCD<>() { // diamond operator is empty, compiler infer type
            Integer show(Integer a, Integer b) {
                return a*b;
            }
        };
        String result = a.show("Java","9");
        return(result);
    }
}


abstract class ABCD<T>{
    abstract T show(T a, T b);
}