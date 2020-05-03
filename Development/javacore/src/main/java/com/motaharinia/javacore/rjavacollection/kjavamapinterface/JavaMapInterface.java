package com.motaharinia.javacore.rjavacollection.kjavamapinterface;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/java-map
 * Java Map Interface:
 * A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry.
 * A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * رابط Map جاوا:
 * یک Map شامل مقادیر بر اساس کلید ، یعنی کلید اصلی و جفت ارزش است. هر جفت کلید و مقدار به عنوان ورودی شناخته می شود.
 * یک Map شامل کلیدهای منحصر به فرد است.
 * اگر مجبور باشید عناصر را بر اساس یک کلید جستجو ، به روزرسانی یا حذف کنید ،یک Map مفید است.
 * <p>
 * Java Map Hierarchy:
 * There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.
 * سلسله مراتب Map جاوا:
 * دو رابط برای اجرای Map در جاوا وجود دارد: Map و SortedMap و سه کلاس: HashMap ، LinkedHashMap و TreeMap
 * <p>
 * A Map doesn't allow duplicate keys, but you can have duplicate values.
 * HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
 * A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
 * یک Map کلیدهای تکراری را مجاز نمی کند ، اما می توانید مقادیر تکراری داشته باشید.
 * هردو HashMap و LinkedHashMap به کلیدها و مقادیر تهی اجازه می دهند ، اما TreeMap هیچ کلید یا مقدار تهی را اجازه نمی دهد.
 * با استفاده از متد keySet یا entrySet می توانید آن را به مجموعه تبدیل کنید.
 * <p>
 * HashMap:
 * HashMap is the implementation of Map, but it doesn't maintain any order.
 * LinkedHashMap:
 * LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
 * TreeMap:
 * TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
 * HashMap:
 * یک HashMap پیاده سازی Map است ، اما هیچ نظمی را حفظ نمی کند.
 * LinkedHashMap:
 * یک LinkedHashMap پیاده سازی Map است. این کلاس HashMap را به ارث می برد. این تزتیب درج را حفظ می کند.
 * TreeMap:
 * یک TreeMap پیاده سازی Map و SortedMap است. نظم صعودی را حفظ می کند.
 * <p>
 * <p>
 * Useful methods of Map interface:
 * V put(Object key, Object value):
 * It is used to insert an entry in the map.
 * void putAll(Map map):
 * It is used to insert the specified map in the map.
 * V putIfAbsent(K key, V value):
 * It inserts the specified value with the specified key in the map only if it is not already specified.
 * V remove(Object key):
 * It is used to delete an entry for the specified key.
 * boolean remove(Object key, Object value):
 * It removes the specified values with the associated specified keys from the map.
 * Set keySet():
 * It returns the Set view containing all the keys.
 * Set<Map.Entry<K,V>> entrySet():
 * It returns the Set view containing all the keys and values.
 * void clear():
 * It is used to reset the map.
 * V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction):
 * It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.
 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
 * boolean containsValue(Object value):
 * This method returns true if some value equal to the value exists within the map, else return false.
 * boolean containsKey(Object key):
 * This method returns true if some key equal to the key exists within the map, else return false.
 * boolean equals(Object o):
 * It is used to compare the specified Object with the Map.
 * void forEach(BiConsumer<? super K,? super V> action):
 * It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
 * V get(Object key):
 * This method returns the object that contains the value associated with the key.
 * V getOrDefault(Object key, V defaultValue):
 * It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
 * int hashCode():
 * It returns the hash code value for the Map
 * boolean isEmpty():
 * This method returns true if the map is empty; returns false if it contains at least one key.
 * V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction):
 * If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
 * V replace(K key, V value):
 * It replaces the specified value for a specified key.
 * boolean replace(K key, V oldValue, V newValue):
 * It replaces the old value with the new value for a specified key.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 * Collection values():
 * It returns a collection view of the values contained in the map.
 * int size():
 * This method returns the number of entries in the map.
 * <p>
 * متد های مفید رابط Map:
 * V put(Object key, Object value):
 * برای قرار دادن یک ورودی در Map استفاده می شود.
 * void putAll(Map map):
 * برای درج Map مشخص شده در Map استفاده می شود.
 * V putIfAbsent(K key, V value):
 * فقط مقدار مشخص شده را با كليد مشخص شده در Map درج مي كند ، در صورتي كه قبلاً مشخص نشده باشد.
 * V remove(Object key):
 * از آن برای حذف یک ورودی برای کلید مشخص شده استفاده می شود.
 * boolean remove(Object key, Object value):
 * مقادیر مشخص شده را با کلیدهای مشخص شده همراه از Map حذف می کند.
 * Set keySet():
 * نمای مجموعه شامل تمام کلیدها را برمی گرداند.
 * Set<Map.Entry<K,V>> entrySet():
 * نمای مجموعه شامل تمام کلیدها و مقادیر را برمی گرداند.
 * void clear():
 * برای تنظیم مجدد Map استفاده می شود.
 * V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * از آن برای محاسبه Map برداری برای کلید مشخص شده و مقدار Map برداری شده فعلی آن استفاده می شود (یا در صورت عدم وجود Map برداری فعلی ، تهی است).
 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction):
 * برای محاسبه مقدار آن با استفاده از تابع Map برداری داده شده استفاده می شود ، اگر كلید مشخص شده در حال حاضر با یك مقدار مرتبط نباشد (یا برای null Map كشیده شده باشد) ، و آن را وارد این Map می كند مگر اینكه تهی باشد.
 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * در صورت وجود مقدار برای کلید مشخص شده و غیر تهی ، از آن برای محاسبه یك Map یابی جدید استفاده می شود.
 * boolean containsValue(Object value):
 * اگر مقداری برابر با مقدار موجود در Map وجود داشته باشد ، این متد درست است ، در غیر این صورت غلط باز می گردد.
 * boolean containsKey(Object key):
 * اگر برخی از کلیدهای برابر با کلید در Map وجود داشته باشد ، این متد درست است ، در غیر این صورت نادرست باز می گردد.
 * boolean equals(Object o):
 * برای مقایسه شیء مشخص شده با Map استفاده می شود.
 * void forEach(BiConsumer<? super K,? super V> action):
 * این عمل داده شده را برای هر ورودی در Map انجام می دهد تا زمانی که تمام ورودی ها پردازش شده یا یک عمل استثنائی را حذف کند.
 * V get(Object key):
 * این متد شیء حاوی مقدار مرتبط با کلید را برمی گرداند.
 * V getOrDefault(Object key, V defaultValue):
 * این مقدار را که Map مشخص شده در آن Map برداری شده است ، یا پیش فرض Value اگر Map حاوی Map نویسی برای این کلید باشد ، برمی گرداند.
 * int hashCode():
 * مقدار کد هش را برای Map برمی گرداند
 * boolean isEmpty():
 * اگر این Map خالی باشد ، این متد درست می شود. اگر حداقل دارای یک کلید باشد ، غلط برمی گردد.
 * V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction):
 * اگر کلید مشخص شده قبلاً با یک مقدار همراه نبوده یا با null همراه نیست ، آن را با مقدار غیر null داده شده مرتبط می کند.
 * V replace(K key, V value):
 * مقدار مشخص شده را برای یک کلید مشخص جایگزین می کند.
 * boolean replace(K key, V oldValue, V newValue):
 * این مقدار قدیمی را با مقدار جدید برای یک کلید مشخص جایگزین می کند.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * این مقدار هر ورودی را با نتیجه فراخوانی تابع داده شده در آن ورودی جایگزین می کند تا اینکه تمام مدخل ها پردازش شده یا این عملکرد یک استثناء را حذف می کند.
 * Collection values():
 * نمای مجموعه ای از مقادیر موجود در Map را برمی گرداند.
 * int size():
 * این متد تعداد ورودی های Map را برمی گرداند.
 * <p>
 * Map.Entry Interface:
 * Entry is the subinterface of Map.
 * So we will be accessed it by Map.Entry name.
 * It returns a collection-view of the map, whose elements are of this class.
 * It provides methods to get key and value.
 * رابط Map.Entry :
 * یک Entry زیر مجموعه Map است.
 * بنابراین با نام Map.Entry به آن دسترسی پیدا خواهیم کرد.
 * این نمای مجموعه ای از Map را نشان می دهد ، که عناصر آن از این کلاس هستند.
 * این متد ها را برای به دست آوردن کلید و ارزش فراهم می کند.
 * <p>
 * Methods of Map.Entry interface:
 * K getKey():
 * It is used to obtain a key.
 * V getValue():
 * It is used to obtain value.
 * int hashCode():
 * It is used to obtain hashCode.
 * V setValue(V value):
 * It is used to replace the value corresponding to this entry with the specified value.
 * boolean equals(Object o):
 * It is used to compare the specified object with the other existing objects.
 * static <K extends Comparable<? super K>,V> Comparator<Map.Entry<K,V>> comparingByKey():
 * It returns a comparator that compare the objects in natural order on key.
 * static <K,V> Comparator<Map.Entry<K,V>> comparingByKey(Comparator<? super K> cmp):
 * It returns a comparator that compare the objects by key using the given Comparator.
 * static <K,V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue():
 * It returns a comparator that compare the objects in natural order on value.
 * static <K,V> Comparator<Map.Entry<K,V>> comparingByValue(Comparator<? super V> cmp):
 * It returns a comparator that compare the objects by value using the given Comparator.
 * متدهای رابط Map.Entry :
 * K getKey ():
 * برای بدست آوردن کلید استفاده می شود.
 * V getValue ():
 * برای بدست آوردن ارزش استفاده می شود.
 * int hashCode ():
 * برای بدست آوردن hashCode استفاده می شود.
 * V setValue(V value):
 * از آن برای جایگزینی مقدار متناسب با این ورودی با مقدار مشخص شده استفاده می شود.
 * boolean equals(Object o):
 * برای مقایسه شی مشخص شده با سایر اشیاء موجود استفاده می شود.
 * static <K extends Comparable<? super K>,V> Comparator<Map.Entry<K,V>> comparingByKey():
 * این مقایسه‌ای را برمی گرداند که اشیاء را به ترتیب طبیعی با کلید مقایسه می کند.
 * static <K,V> Comparator<Map.Entry<K,V>> comparingByKey(Comparator<? super K> cmp):
 * این یک مقایسه کننده را می دهد که اشیاء را با کلید با استفاده از مقایسه کننده داده شده مقایسه می کند.
 * static <K,V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue():
 * این مقایسه‌ای را برمی‌گرداند که اشیاء را به ترتیب طبیعی با ارزش مقایسه می کند.
 * static <K,V> Comparator<Map.Entry<K,V>> comparingByValue(Comparator<? super V> cmp):
 * این مقایسهای را با استفاده از مقایسه کننده داده شده با مقایسه اشیاء برمی گرداند
 */
public class JavaMapInterface {
    /**
     * این متد پیمایش داخل Map را به روش قدیمی NonGeneric انجام میدهد
     *
     * @param map ورودی
     * @return خروجی: رشته چسبیده شده Map ورودی
     */
    public String nonGenericOldStyle(Map map) {
        String result = "";
        //Traversing Map
        Set entrySet = map.entrySet();//Converting to Set so that we can traverse
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) iterator.next();
            result += entry.getKey() + ":" + entry.getValue() ;
        }
        return result;
    }

    /**
     * این متد پیمایش داخل Map را به روش جدید Generic انجام میدهد
     *
     * @param map ورودی
     * @return خروجی: رشته چسبیده شده Map ورودی
     */
    public String genericNewStyle(Map<Integer, String> map) {
        String result = "";
        //Traversing Map
        for (Map.Entry entry : map.entrySet()) {
            result += entry.getKey() + ":" + entry.getValue() ;
        }
        return result;
    }

    /**
     * این متد پیمایش نزولی کلیدهای داخل Map را به روش Stream انجام میدهد
     *
     * @param map ورودی
     * @return خروجی: رشته چسبیده شده Map ورودی
     */
    public String comparingByKeyTest(Map<Integer, String> map) {
        //Returns a Set view of the mappings contained in this map
        String result = map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(","));
        return result;
    }

    /**
     * این متد پیمایش نزولی مقادیر داخل Map را به روش Stream انجام میدهد
     *
     * @param map ورودی
     * @return خروجی: رشته چسبیده شده Map ورودی
     */
    public String comparingByValueTest(Map<Integer, String> map) {
        //Returns a Set view of the mappings contained in this map
        String result = map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(","));
        return result;
    }
}
