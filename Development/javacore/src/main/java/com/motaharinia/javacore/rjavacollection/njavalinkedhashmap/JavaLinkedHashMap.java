package com.motaharinia.javacore.rjavacollection.njavalinkedhashmap;

import java.util.Map;

/**
 * https://www.javatpoint.com/java-linkedhashmap
 * <p>
 * Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order.
 * It inherits HashMap class and implements the Map interface.
 * کلاس Java LinkedHashMap اجرای لیست Hashtable و Linked از رابط Map است ، با ترتیب تکرار قابل پیش بینی.
 * این کلاس HashMap را به ارث می برد و رابط Map را پیاده سازی می کند.
 * <p>
 * Points to remember:
 * Java LinkedHashMap class contains values based on the key.
 * Java LinkedHashMap class contains unique elements.
 * Java LinkedHashMap class may have one null key and multiple null values.
 * Java LinkedHashMap class is non synchronized.
 * Java LinkedHashMap class maintains insertion order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 * نکاتی برای به خاطر سپردن:
 * کلاس Java LinkedHashMap شامل مقادیر بر اساس کلید است.
 * کلاس Java LinkedHashMap شامل عناصر منحصر به فرد است.
 * کلاس Java LinkedHashMap ممکن است دارای یک کلید تهی و چند مقدار null باشد.
 * کلاس Java LinkedHashMap هماهنگ نیست.
 * کلاس Java LinkedHashMap ترتیب درج را حفظ می کند.
 * ظرفیت پیش فرض اولیه کلاس Java HashMap 16 با ضریب بار 75/0 است.
 * <p>
 * LinkedHashMap class declaration:
 * public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
 * <p>
 * LinkedHashMap class Parameters:
 * K: It is the type of keys maintained by this map.
 * V: It is the type of mapped values.
 * پارامترهای کلاس LinkedHashMap:
 * K: این نوع کلیدهای حفظ شده توسط این Map است.
 * V: این نوع مقادیر Map برداری شده است.
 * <p>
 * Constructors of Java LinkedHashMap class:
 * LinkedHashMap():
 * It is used to construct a default LinkedHashMap.
 * LinkedHashMap(int capacity):
 * It is used to initialize a LinkedHashMap with the given capacity.
 * LinkedHashMap(int capacity, float loadFactor):
 * It is used to initialize both the capacity and the load factor.
 * LinkedHashMap(int capacity, float loadFactor, boolean accessOrder):
 * It is used to initialize both the capacity and the load factor with specified ordering mode.
 * LinkedHashMap(Map<? extends K,? extends V> m):
 * It is used to initialize the LinkedHashMap with the elements from the given Map class m.
 * سازندگان کلاس Java LinkedHashMap:
 * LinkedHashMap ():
 * برای ساختن یک پیش فرض LinkedHashMap استفاده می شود.
 * LinkedHashMap(int capacity):
 * برای شروع اولیه LinkedHashMap با ظرفیت داده شده استفاده می شود.
 * LinkedHashMap(int capacity, float loadFactor):
 * برای شروع اولیه هم ظرفیت و هم عامل بار استفاده می شود.
 * LinkedHashMap(int capacity, float loadFactor, boolean accessOrder):
 * برای شروع هر دو ظرفیت و ضریب بار با حالت سفارش مشخص شده استفاده می شود.
 * LinkedHashMap(Map<? extends K,? extends V> m):
 * برای شروع اولیه LinkedHashMap با عناصر موجود در کلاس Map داده شده m استفاده می شود.
 * <p>
 * Methods of Java LinkedHashMap class:
 * V get(Object key):
 * It returns the value to which the specified key is mapped.
 * void clear():
 * It removes all the key-value pairs from a map.
 * boolean containsValue(Object value):
 * It returns true if the map maps one or more keys to the specified value.
 * Set<Map.Entry<K,V>> entrySet():
 * It returns a Set view of the mappings contained in the map.
 * void forEach(BiConsumer<? super K,? super V> action):
 * It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
 * V getOrDefault(Object key, V defaultValue):
 * It returns the value to which the specified key is mapped or defaultValue if this map contains no mapping for the key.
 * Set<K> keySet():
 * It returns a Set view of the keys contained in the map
 * protected boolean removeEldestEntry(Map.Entry<K,V> eldest):
 * It returns true on removing its eldest entry.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 * Collection<V> values():
 * It returns a Collection view of the values contained in this map.
 * متدهای کلاس Java LinkedHashMap:
 * V get(Object key):
 * این مقدار را که کلید مشخص شده در آن ترسیم شده است ، برمی گرداند.
 * void clear():
 * همه جفت های ارزش کلیدی را از روی Map حذف می کند.
 * boolean containsValue(Object value):
 * اگر Map یک یا چند کلید را به مقدار مشخص شده برگرداند ، صحیح است.
 * Set<Map.Entry<K,V>> entrySet():
 * این نمایش مجموعه ای از Map های موجود در Map را نشان می دهد.
 * void forEach(BiConsumer<? super K,? super V> action):
 * این عمل داده شده را برای هر ورودی در Map انجام می دهد تا زمانی که تمام ورودی ها پردازش شده یا یک عمل استثنائی را حذف کند.
 * V getOrDefault (کلید هدف ، V defaultValue):
 * اگر این Map حاوی Map نویسی برای کلید باشد ، مقداری را که Map مشخص شده در آن Map برداری شده یا پیش فرض Value را برمی گرداند.
 * Set<K> keySet():
 * نمای مجموعه ای از کلیدهای موجود در Map را برمی گرداند
 * protected boolean removeEldestEntry(Map.Entry<K,V> eldest):
 * با حذف قدیمی ترین ورودی خود صادق است.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * این مقدار هر ورودی را با نتیجه فراخوانی تابع داده شده در آن ورودی جایگزین می کند تا اینکه تمام مدخل ها پردازش شده یا این عملکرد یک استثناء را حذف می کند.
 * Collection<V> values():
 * نمای مجموعه ای از مقادیر موجود در این Map را برمی گرداند.
 */
public class JavaLinkedHashMap {
    public String getKeySet(Map<Integer, String> map) {
        String result = "";
        for (Integer key : map.keySet()) {
            result += key.toString();
        }
        return result;
    }

    public String getValueSet(Map<Integer, String> map) {
        String result = "";
        for (String value : map.values()) {
            result += value.toString();
        }
        return result;
    }

    public String getObjectValueSet(Map<Integer,JavaLinkedHashMapBook> map){
        String result = "";
        for (JavaLinkedHashMapBook value : map.values()) {
            result += value.getName();
        }
        return result;
    }
}


class JavaLinkedHashMapBook {
    Integer id;
    String name;

    public JavaLinkedHashMapBook(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
