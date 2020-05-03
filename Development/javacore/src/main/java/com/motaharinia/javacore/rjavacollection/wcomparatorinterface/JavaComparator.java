package com.motaharinia.javacore.rjavacollection.wcomparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/Comparator-interface-in-collection-framework
 * Java Comparator interface is used to order the objects of a user-defined class.
 * This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
 * It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member, for example, rollno, name, age or anything else.
 * رابط جاوا Comparator برای مرتب سازی اشیاء کلاس تعریف شده توسط کاربر استفاده می شود.
 * این رابط در بسته java.util یافت می شود و شامل 2 متد compare (Object obj1 ، Object obj2) و equals (عنصر Object) است.
 * این توالی مرتب سازی چندگانه را ارائه می دهد ، یعنی ، شما می توانید عناصر را بر اساس هر عضو داده مرتب کنید ، به عنوان مثال ، rollno ، نام ، سن یا هر چیز دیگر
 * <p>
 * Methods of Java Comparator Interface:
 * public int compare(Object obj1, Object obj2):
 * It compares the first object with the second object.
 * public boolean equals(Object obj):
 * It is used to compare the current object with the specified object.
 * متد های واسط مقایسه ای جاوا:
 * public int compare(Object obj1, Object obj2):
 * اولین شیء را با جسم دوم مقایسه می کند.
 * public boolean equals(Object obj):
 * برای مقایسه شی فعلی با شی مشخص شده استفاده می شود.
 * <p>
 * Collections class:
 * Collections class provides static methods for sorting the elements of a collection.
 * If collection elements are of Set or Map, we can use TreeSet or TreeMap.
 * However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements also.
 * کلاس Collections:
 * کلاس Collections متد های ایستایی برای مرتب سازی عناصر یک مجموعه ارائه می دهند.
 * اگر عناصر مجموعه از مجموعه یا نقشه باشند ، می توانیم از TreeSet یا TreeMap استفاده کنیم.
 * با این حال ، ما نمی توانیم عناصر لیست را مرتب سازی کنیم. کلاس Collections متدهایی را برای مرتب سازی عناصر عناصر نوع List نیز فراهم می کند
 * <p>
 * Method of Collections class for sorting List elements:
 * public void sort(List list, Comparator c):
 * is used to sort the elements of List by the given Comparator.
 * متد کلاس Collections برای مرتب سازی عناصر لیست:
 * public void sort(List list, Comparator c):
 * برای مرتب کردن عناصر لیست توسط مقایسه کننده داده شده استفاده می شود.
 * <p>
 * Java 8 Comparator interface:
 * Java 8 Comparator interface is a functional interface that contains only one abstract method.
 * Now, we can use the Comparator interface as the assignment target for a lambda expression or method reference.
 * رابط مقایسه کننده جاوا 8:
 * رابط مقایسه گر Java 8 یک رابط کاربری است که تنها یک متد انتزاعی دارد.
 * اکنون می توانیم از رابط مقایسه کننده به عنوان هدف انتساب یک عبارت lambda یا مرجع متد استفاده کنیم.
 * <p>
 * Methods of Java 8 Comparator Interface:
 * int compare(T o1, T o2):
 * It compares the first object with second object.
 * static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor):
 * It accepts a function that extracts a Comparable sort key from a type T, and returns a Comparator that compares by that sort key.
 * static <T,U> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator):
 * It accepts a function that extracts a sort key from a type T, and returns a Comparator that compares by that sort key using the specified Comparator.
 * static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor):
 * It accepts a function that extracts a double sort key from a type T, and returns a Comparator that compares by that sort key.
 * static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor):
 * It accepts a function that extracts an int sort key from a type T, and returns a Comparator that compares by that sort key.
 * static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor):
 * It accepts a function that extracts a long sort key from a type T, and returns a Comparator that compares by that sort key.
 * boolean equals(Object obj):
 * It is used to compare the current object with the specified object.
 * static <T extends Comparable<? super T>> Comparator<T> naturalOrder():
 * It returns a comparator that compares Comparable objects in natural order.
 * static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator):
 * It returns a comparator that treats null to be less than non-null elements.
 * static <T> Comparator<T> nullsLast(Comparator<? super T> comparator):
 * It returns a comparator that treats null to be greater than non-null elements.
 * default Comparator<T> reversed():
 * It returns comparator that contains reverse ordering of the provided comparator.
 * static <T extends Comparable<? super T>> Comparator<T> reverseOrder():
 * It returns comparator that contains reverse of natural ordering.
 * default Comparator<T> thenComparing(Comparator<? super T> other):
 * It returns a lexicographic-order comparator with another comparator.
 * default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor):
 * It returns a lexicographic-order comparator with a function that extracts a Comparable sort key.
 * default <U> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator):
 * It returns a lexicographic-order comparator with a function that extracts a key to be compared with the given Comparator.
 * default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor):
 * It returns a lexicographic-order comparator with a function that extracts a double sort key.
 * default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor):
 * It returns a lexicographic-order comparator with a function that extracts a int sort key.
 * default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor):
 * It returns a lexicographic-order comparator with a function that extracts a long sort key.
 * متد های رابط مقایسه ای Java 8:
 * int compare(T o1, T o2):
 * اولین شیء را با آبجکت دوم مقایسه می کند.
 * static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor):
 * این تابعی را می پذیرد که یک کلید مرتب سازی قابل مقایسه را از نوع T استخراج می کند ، و یک مقایسه کننده را که با آن کلید مرتب سازی مقایسه می کند ، برمی گرداند.
 * static <T,U> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator):
 * این تابعی را می پذیرد که یک کلید مرتب سازی را از نوع T استخراج می کند ، و یک مقایسه کننده را که با استفاده از آن کلید مرتب سازی با استفاده از مقایسه کننده مشخص شده مقایسه می کند ، بازمی گرداند.
 * static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor):
 * این تابعی را می پذیرد که یک کلید مرتب سازی مرتب شده از نوع T استخراج می کند ، و یک مقایسه کننده را که با آن کلید مرتب سازی مقایسه می کند ، برمی گرداند.
 * static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor):
 * این تابعی را می پذیرد که یک کلید int مرتب سازی از نوع T استخراج می کند ، و یک مقایسه کننده را که با آن کلید مرتب سازی مقایسه می کند ، برمی گرداند.
 * static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor):
 * این تابعی را می پذیرد که یک کلید مرتب سازی بلند را از نوع T استخراج می کند ، و یک مقایسه کننده را که با آن کلید مرتب سازی مقایسه می کند ، برمی گرداند.
 * boolean equals(Object obj):
 * برای مقایسه شی فعلی با شی مشخص شده استفاده می شود.
 * static <T extends Comparable<? super T>> Comparator<T> naturalOrder():
 * این مقایسه‌ای را برمی‌گرداند که اجسام قابل مقایسه را به ترتیب طبیعی مقایسه می‌کند.
 * static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator):
 * این یک مقایسه کننده را که با تهی بودن رفتار می کند کمتر از عناصر غیر تهی است.
 * static <T> Comparator<T> nullsLast(Comparator<? super T> comparator):
 * این یک مقایسه کننده را نشان می دهد که با تهی بودن رفتار می کند از عناصر غیر تهی بزرگتر باشد.
 * default Comparator<T> reversed():
 * این مقایسه کننده را که شامل ترتیب معکوس مقایسه کننده ارائه شده است ، برمی گرداند.
 * static <T extends Comparable<? super T>> Comparator<T> reverseOrder():
 * این مقایسه کننده را که حاوی معکوس از سفارش طبیعی است ، برمی گرداند.
 * default Comparator<T> thenComparing(Comparator<? super T> other):
 * این یک مقایسه کننده مرتبه واژگان با مقایسه کننده دیگر را برمی گرداند.
 * default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor):
 * این یک مقایسه کننده مرتب سازی واژگونی را با عملکردی که یک کلید مرتب سازی قابل مقایسه استخراج می کند ، برمی گرداند.
 * default <U> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator):
 * این یک مقایسه کننده مرتب سازی واژگان با عملکردی را استخراج می کند که یک کلید را برای مقایسه با مقایسه کننده داده شده استخراج می کند.
 * default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor):
 * این یک مقایسه کننده مرتب سازی واژگونی را با عملکردی که یک کلید مرتب سازی دوگانه را استخراج می کند ، برمی گرداند.
 * default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor):
 * این یک مقایسه کننده مرتبه واژگان را با عملکردی که یک کلید مرتب سازی int استخراج می کند ، برمی گرداند.
 * default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor):
 * این یک مقایسه کننده مرتب سازی واژگان را با عملکردی که یک کلید مرتب سازی طولانی استخراج می کند ، برمی گرداند.
 */
public class JavaComparator {
    public String nonGenericOldStyleSortByAge(ArrayList<JavaComparatorStudent> arrayList) {
        Collections.sort(arrayList, new NonGenericAgeComparator());
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String nonGenericOldStyleSortByName(ArrayList<JavaComparatorStudent> arrayList) {
        Collections.sort(arrayList, new NonGenericNameComparator());
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String genericNewStyleSortByAge(ArrayList<JavaComparatorStudent> arrayList) {
        Collections.sort(arrayList, new GenericAgeComparator());
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String genericNewStyleSortByName(ArrayList<JavaComparatorStudent> arrayList) {
        Collections.sort(arrayList, new GenericNameComparator());
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String java8SortByAge(ArrayList<JavaComparatorStudent> arrayList) {
        Comparator<JavaComparatorStudent> studentComparator = Comparator.comparing(JavaComparatorStudent::getAge);
        Collections.sort(arrayList, studentComparator);
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String java8SortByName(ArrayList<JavaComparatorStudent> arrayList) {
        Comparator<JavaComparatorStudent> studentComparator = Comparator.comparing(JavaComparatorStudent::getName);
        Collections.sort(arrayList, studentComparator);
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }

    public String java8NullsFirstSortByName(ArrayList<JavaComparatorStudent> arrayList) {
        Comparator<JavaComparatorStudent> studentComparator = Comparator.comparing(JavaComparatorStudent::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(arrayList, studentComparator);
        return arrayList.stream().map(e -> e.name).collect(Collectors.joining(","));
    }
}


class NonGenericAgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        JavaComparatorStudent s1 = (JavaComparatorStudent) o1;
        JavaComparatorStudent s2 = (JavaComparatorStudent) o2;
        if (s1.age.equals(s2.age))
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

class NonGenericNameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        JavaComparatorStudent s1 = (JavaComparatorStudent) o1;
        JavaComparatorStudent s2 = (JavaComparatorStudent) o2;
        return s1.name.compareTo(s2.name);
    }
}


class GenericAgeComparator implements Comparator<JavaComparatorStudent> {
    public int compare(JavaComparatorStudent s1, JavaComparatorStudent s2) {
        if (s1.age.equals(s2.age))
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}


class GenericNameComparator implements Comparator<JavaComparatorStudent> {
    public int compare(JavaComparatorStudent s1, JavaComparatorStudent s2) {
        return s1.name.compareTo(s2.name);
    }
}