package com.motaharinia.javacore.tjava9feachers.fcollectionfactorymethods;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/java-9-factory-methods
 * Java 9 Collection library includes static factory methods for List, Set and Map interface.
 * These methods are useful to create small number of collection.
 * Suppose, if we want to create a list of 5 elements.
 * add method is called repeatedly for each list element, while in Java 9 we can do it in single line of code using factory methods.
 * کتابخانه مجموعه جاوا 9 شامل متد های کارخانه ایستا برای رابط List ، Set و Map است.
 * این متد ها برای ایجاد تعداد کمی از مجموعه مفید هستند.
 * فرض کنید اگر بخواهیم لیستی از 5 عنصر ایجاد کنیم.
 * متد add برای هر عنصر لیست به طور مکرر فراخوانی می شود ، در حالی که در جاوا 9 می توانیم آن را به صورت تک خط کد با استفاده از متد های کارخانه انجام دهیم
 * <p>
 * Factory Methods for Collection
 * Factory methods are special type of static methods that are used to create unmodifiable instances of collections.
 * It means we can use these methods to create list, set and map of small number of elements.
 * It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException.
 * متد کارخانه برای Collection
 * متد های کارخانه نوع خاصی از متد های استاتیک است که برای ایجاد موارد غیر قابل اصلاح از مجموعه ها استفاده می شود.
 * این بدان معنی است که ما می توانیم از این متدها برای ایجاد لیست ، مجموعه و نقشه تعداد کمی از عناصر استفاده کنیم.
 * غیر قابل اصلاح است ، بنابراین با اضافه کردن عنصر جدید ، java.lang.UnsupportedOperationException را پرتاب خواهد کرد
 * <p>
 * Each interface has it's own factory methods, we are listing all the methods in the following tables.
 * static <E> List<E>	Of():
 * It It returns an immutable list containing zero elements.
 * static <E> List<E>	of(E e1):
 * It It returns an immutable list containing one element.
 * static <E> List<E>	of(E... elements):
 * It It returns an immutable list containing an arbitrary number of elements.
 * static <E> List<E>	of(E e1, E e2):
 * It It returns an immutable list containing two elements.
 * static <E> List<E>	of(E e1, E e2, E e3):
 * It It returns an immutable list containing three elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4):
 * It It returns an immutable list containing four elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5):
 * It It returns an immutable list containing five elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6):
 * It It returns an immutable list containing six elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7):
 * It It returns an immutable list containing seven elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8):
 * It It returns an immutable list containing eight elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9):
 * It It returns an immutable list containing nine elements.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10):
 * It It returns an immutable list containing ten elements.
 * هر رابط متد های کارخانه ای خاص خود را دارد ، ما در جدول های زیر تمامی متد ها را ذکر می کنیم.
 * static <E> List<E>	Of():
 * این یک لیست تغییرناپذیر حاوی عناصر صفر را برمی گرداند.
 * static <E> List<E>	of(E e1):
 * این یک لیست تغییرناپذیر حاوی یک عنصر را برمی گرداند.
 * static <E> List<E>	of(E... elements):
 * این یک لیست تغییرناپذیر حاوی تعداد دلخواه از عناصر را برمی گرداند.
 * static <E> List<E>	of(E e1, E e2):
 * این یک لیست تغییرناپذیر حاوی دو عنصر را برمی گرداند.
 * static <E> List<E>	of(E e1, E e2, E e3):
 * این یک لیست غیرقابل تغییر است که شامل سه عنصر است.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4):
 * این یک لیست غیرقابل تغییر است که شامل چهار عنصر است.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5):
 * این یک لیست غیرقابل تغییر است که شامل پنج عنصر است.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6):
 * این یک لیست غیرقابل تغییر است که شامل شش عنصر است.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7):
 * این یک لیست غیرقابل تغییر است که شامل هفت عنصر است.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8):
 * این یک لیست تغییرناپذیر حاوی هشت عنصر را برمی گرداند.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9):
 * این یک لیست تغییرناپذیر حاوی نه عنصر را برمی گرداند.
 * static <E> List<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10):
 * این یک لیست غیرقابل تغییر است که شامل ده عنصر است.
 * <p>
 * Java 9 Set Interface:
 * Java Set interface provides a Set.of() static factory method which is used to create immutable set.
 * The set instance created by this method has the following characteristcis
 * It is immutable
 * No null elements
 * It is serializable if all elements are serializable.
 * No duplicate elements.
 * The iteration order of set elements is unspecified and is subject to change.
 * رابط جاوا 9 Set:
 * رابط جاوا ست یک متد کارخانه ایستا Set.of () را ارائه می دهد که برای ایجاد ست غیرقابل تغییر استفاده می شود.
 * نمونه ایجاد شده توسط این متد مشخصه های زیر را دارد
 * تغییر ناپذیر است
 * هیچ عنصر تهی وجود ندارد
 * اگر همه عناصر سریالی باشند قابل سریال شدن است.
 * عناصر تکراری وجود ندارد.
 * ترتیب تکرار عناصر مجموعه مشخص نیست و در معرض تغییر است.
 * <p>
 * Java 9 Set Interface Factory Methods:
 * static <E> Set<E>	of():
 * It It returns an immutable set containing zero elements.
 * static <E> Set<E>	of(E e1):
 * It It returns an immutable set containing one element.
 * static <E> Set<E>	of(E... elements):
 * It It returns an immutable set containing an arbitrary number of elements.
 * static <E> Set<E>	of(E e1, E e2):
 * It It returns an immutable set containing two elements.
 * static <E> Set<E>	of(E e1, E e2, E e3):
 * It It returns an immutable set containing three elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4):
 * It It returns an immutable set containing four elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5):
 * It It returns an immutable set containing five elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6):
 * It It returns an immutable set containing six elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7):
 * It It returns an immutable set containing seven elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8):
 * It It returns an immutable set containing eight elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9):
 * It It returns an immutable set containing nine elements.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10):
 * It It returns an immutable set containing ten elements.
 * متد های کارخانه رابط جاوا 9 Set:
 * static <E> Set<E>	of():
 * این ست غیرقابل تغییر که حاوی عناصر صفر است را برمی گرداند.
 * static <E> Set<E>	of(E e1):
 * این ست غیرقابل تغییر را شامل یک عنصر می گرداند.
 * static <E> Set<E>	of(E... elements):
 * این ست تغییر ناپذیر را در بر می گیرد که حاوی تعداد دلخواه عناصر است.
 * static <E> Set<E>	of(E e1, E e2):
 * این ست غیرقابل تغییر را شامل دو عنصر می گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3):
 * این ست غیرقابل تغییر را شامل سه عنصر می گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4):
 * این ست غیرقابل تغییر را شامل چهار عنصر می گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5):
 * این ست غیرقابل تغییر را شامل پنج عنصر می گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6):
 * ست غیرقابل تغییر را شامل شش عنصر می دهد.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7):
 * این ست غیرقابل تغییر را شامل هفت عنصر برمی گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8):
 * این ست غیرقابل تغییر را شامل هشت عنصر می گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9):
 * این ست غیرقابل تغییر را شامل نه عنصر برمی گرداند.
 * static <E> Set<E>	of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10):
 * این ست غیرقابل تغییر را شامل ده عنصر برمی گرداند.
 * <p>
 * Java 9 Map Interface Factory Methods:
 * In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods that provide a convenient way to creae immutable maps.
 * Map created by these methods has the following characteristics.
 * It is immutable
 * It does not allow null keys and values
 * It is serializable if all keys and values are serializable
 * It rejects duplicate keys at creation time
 * The iteration order of mappings is unspecified and is subject to change.
 * متد کارخانه رابط نقشه جاوا 9:
 * در جاوا 9 ، Map شامل Map.of () و Map.ofEntries () متد کارخانه ایستا است که متدی مناسب برای ایجاد نقشه های تغییرناپذیر را فراهم می کند.
 * نقشه ایجاد شده توسط این متدها دارای مشخصات زیر است.
 * تغییر ناپذیر است
 * این کلیدها و مقادیر تهی را نمی دهد
 * اگر کلیه کلیدها و مقادیر serializable باشند ، سریال می شود
 * این کلیدهای تکراری را در زمان ایجاد رد می کند
 * ترتیب تکرار نقشه ها مشخص نیست و در معرض تغییر است.
 * <p>
 * Java 9 Map Interface Factory Methods:
 * static <K,V> Map<K,V>	of():
 * It returns an immutable map containing zero mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1):
 * It returns an immutable map containing a single mapping.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2):
 * It returns an immutable map containing two mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3):
 * It returns an immutable map containing three mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4):
 * It returns an immutable map containing four mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5):
 * It returns an immutable map containing five mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6):
 * It returns an immutable map containing six mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7):
 * It returns an immutable map containing seven mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8):
 * It returns an immutable map containing eight mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9):
 * It returns an immutable map containing nine mappings.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10):
 * It returns an immutable map containing ten mappings.
 * static <K,V> Map<K,V>	ofEntries(Map.Entry<? extends K,? extends V>... entries):
 * It returns an immutable map containing keys and values extracted from the given entries.
 * متد کارخانه رابط نقشه جاوا 9:
 * static <K,V> Map<K,V>	of():
 * این یک نقشه تغییرناپذیر حاوی نگاشتهای صفر را برمی گرداند.
 * static <K,V> Map<K,V>	of(K k1, V v1):
 * این یک نقشه تغییرناپذیر را شامل یک نقشه برداری مجدد برمی گرداند.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2):
 * این یک نقشه غیرقابل تغییر است که شامل دو نقشه برداری است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3):
 * این یک نقشه غیرقابل تغییر است که شامل سه نقشه برداری است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4):
 * این یک نقشه تغییرناپذیر شامل چهار نگاشت را برمی گرداند.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5):
 * این یک نقشه غیرقابل تغییر است که شامل پنج نقشه‌برداری است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6):
 * این یک نقشه تغییرناپذیر است که حاوی شش نگاشت است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7):
 * این یک نقشه غیرقابل تغییر است که شامل هفت نقشه نگاری است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8):
 * این یک نقشه تغییرناپذیر حاوی هشت نگاشت را برمی گرداند.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9):
 * این یک نقشه تغییرناپذیر است که حاوی نه نقشه‌برداری است.
 * static <K,V> Map<K,V>	of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10):
 * این یک نقشه تغییرناپذیر است که حاوی ده نگاشت است.
 * static <K,V> Map<K,V>	ofEntries(Map.Entry<? extends K,? extends V>... entries):
 * این یک نقشه تغییرناپذیر حاوی کلیدها و مقادیر استخراج شده از ورودی های داده شده را برمی گرداند.
 * <p>
 * In Java 9, apart from static Map.of() methods, Map interface includes one more static method Map.ofEntries().
 * This method is used to create a map of Map.Entry instances.
 * در جاوا 9 ، جدا از متد های استاتیک Map.of () ، رابط نقشه شامل یک متد استاتیک دیگر Map.ofEntries () است.
 * از این متد برای ایجاد نقشه Map.Entry نمونه استفاده می شود.
 */
public class Java9FactoryMethods {
    public String collectionFactoryList() {
        List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "Jsp");
        return list.stream().sorted().map(e -> e.toString()).collect(Collectors.joining(","));
    }

    public String collectionFactorySet() {
        Set<String> set = Set.of("Java", "JavaFX", "Spring", "Hibernate", "Jsp");
        return set.stream().sorted().map(e -> e.toString()).collect(Collectors.joining(","));
    }

    public String collectionFactoryMap() {
        Map<Integer, String> map = Map.of(101, "Java", 102, "JavaFX", 103, "Spring", 104, "Hibernate", 105, "Jsp");
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).map(e -> e.getValue()).collect(Collectors.joining(","));
    }

    public String collectionFactoryMapOfEntries() {
        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "JavaFX");
        Map.Entry<Integer, String> e3 = Map.entry(103, "Spring");
        Map.Entry<Integer, String> e4 = Map.entry(104, "Hibernate");
        Map.Entry<Integer, String> e5 = Map.entry(105, "Jsp");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1, e2, e3, e4, e5);
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).map(e -> e.getValue()).collect(Collectors.joining(","));
    }

}
