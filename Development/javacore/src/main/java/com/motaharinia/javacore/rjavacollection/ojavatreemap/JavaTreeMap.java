package com.motaharinia.javacore.rjavacollection.ojavatreemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://www.javatpoint.com/java-treemap
 * Java TreeMap class is a red-black tree based implementation.
 * It provides an efficient means of storing key-value pairs in sorted order.
 * کلاس Java TreeMap یک اجرای درخت قرمز-سیاه است.
 * این یک وسیله کارآمد برای ذخیره جفت هایkey-value  مرتب شده فراهم می کند.
 * <p>
 * The important points about Java TreeMap class are:
 * Java TreeMap class contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 * Java TreeMap class contains only unique elements.
 * Java TreeMap class cannot have a null key but can have multiple null values.
 * Java TreeMap class is non synchronized.
 * Java TreeMap class maintains ascending order.
 * نکات مهم در مورد کلاس Java TreeMap عبارتند از:
 * کلاس Java TreeMap شامل مقادیر بر اساس کلید است. این رابط NavigableMap را پیاده سازی می کند و کلاس AbstractMap را گسترش می دهد.
 * کلاس Java TreeMap فقط عناصر منحصر به فرد را در بر می گیرد.
 * کلاس Java TreeMap نمی تواند دارای کلید null داشته باشد اما می تواند چند مقدار null داشته باشد.
 * کلاس Java TreeMap هماهنگ نیست.
 * کلاس Java TreeMap ترتیب صعودی را حفظ می کند
 * <p>
 * TreeMap class declaration:
 * public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable
 * <p>
 * TreeMap class Parameters:
 * K: It is the type of keys maintained by this map.
 * V: It is the type of mapped values.
 * پارامترهای کلاس TreeMap:
 * K: این نوع کلیدهای حفظ شده توسط این Map است.
 * V: این نوع مقادیر Map برداری شده است.
 * <p>
 * Constructors of Java TreeMap class:
 * TreeMap():
 * It is used to construct an empty tree map that will be sorted using the natural order of its key.
 * TreeMap(Comparator<? super K> comparator):
 * It is used to construct an empty tree-based map that will be sorted using the comparator comp.
 * TreeMap(Map<? extends K,? extends V> m):
 * It is used to initialize a treemap with the entries from m, which will be sorted using the natural order of the keys.
 * TreeMap(SortedMap<K,? extends V> m):
 * It is used to initialize a treemap with the entries from the SortedMap sm, which will be sorted in the same order as sm.
 * سازندگان کلاس Java TreeMap:
 * TreeMap():
 * برای ساخت Map درخت خالی استفاده می شود که با استفاده از نظم طبیعی کلید آن مرتب می شود.
 * TreeMap(Comparator<? super K> comparator):
 * از آن برای ساخت Map خالی بر پایه درخت استفاده می شود که با استفاده از مقایسه مقایسه کننده مرتب می شود.
 * TreeMap(Map<? extends K,? extends V> m):
 * از آن برای شروع اولیه ترسیم با ورودی از m استفاده می شود که با استفاده از ترتیب طبیعی کلیدها مرتب می شوند.
 * TreeMap(SortedMap<K,? extends V> m):
 * از آن برای اولیه سازی یک نقش برجسته با ورودی های مربوط به SortedMap sm استفاده می شود ، که به همان ترتیب sm مرتب می شوند.
 * <p>
 * Methods of Java TreeMap class:
 * Map.Entry<K,V> ceilingEntry(K key):
 * It returns the key-value pair having the least key, greater than or equal to the specified key, or null if there is no such key.
 * K ceilingKey(K key):
 * It returns the least key, greater than the specified key or null if there is no such key.
 * void clear():
 * It removes all the key-value pairs from a map.
 * Object clone():
 * It returns a shallow copy of TreeMap instance.
 * Comparator<? super K> comparator():
 * It returns the comparator that arranges the key in order, or null if the map uses the natural ordering.
 * NavigableSet<K> descendingKeySet():
 * It returns a reverse order NavigableSet view of the keys contained in the map.
 * NavigableMap<K,V> descendingMap():
 * It returns the specified key-value pairs in descending order.
 * Map.Entry firstEntry():
 * It returns the key-value pair having the least key.
 * Map.Entry<K,V> floorEntry(K key):
 * It returns the greatest key, less than or equal to the specified key, or null if there is no such key.
 * void forEach(BiConsumer<? super K,? super V> action):
 * It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
 * SortedMap<K,V> headMap(K toKey):
 * It returns the key-value pairs whose keys are strictly less than toKey.
 * NavigableMap<K,V> headMap(K toKey, boolean inclusive):
 * It returns the key-value pairs whose keys are less than (or equal to if inclusive is true) toKey.
 * Map.Entry<K,V> higherEntry(K key):
 * It returns the least key strictly greater than the given key, or null if there is no such key.
 * K higherKey(K key):
 * It is used to return true if this map contains a mapping for the specified key.
 * Set keySet():
 * It returns the collection of keys exist in the map.
 * Map.Entry<K,V> lastEntry():
 * It returns the key-value pair having the greatest key, or null if there is no such key.
 * Map.Entry<K,V> lowerEntry(K key):
 * It returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key.
 * K lowerKey(K key):
 * It returns the greatest key strictly less than the given key, or null if there is no such key.
 * NavigableSet<K> navigableKeySet():
 * It returns a NavigableSet view of the keys contained in this map.
 * Map.Entry<K,V> pollFirstEntry():
 * It removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
 * Map.Entry<K,V> pollLastEntry():
 * It removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
 * V put(K key, V value):
 * It inserts the specified value with the specified key in the map.
 * void putAll(Map<? extends K,? extends V> map):
 * It is used to copy all the key-value pair from one map to another map.
 * V replace(K key, V value):
 * It replaces the specified value for a specified key.
 * boolean replace(K key, V oldValue, V newValue):
 * It replaces the old value with the new value for a specified key.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 * NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive):
 * It returns key-value pairs whose keys range from fromKey to toKey.
 * SortedMap<K,V> subMap(K fromKey, K toKey):
 * It returns key-value pairs whose keys range from fromKey, inclusive, to toKey, exclusive.
 * SortedMap<K,V> tailMap(K fromKey):
 * It returns key-value pairs whose keys are greater than or equal to fromKey.
 * NavigableMap<K,V> tailMap(K fromKey, boolean inclusive):
 * It returns key-value pairs whose keys are greater than (or equal to, if inclusive is true) fromKey.
 * boolean containsKey(Object key):
 * It returns true if the map contains a mapping for the specified key.
 * boolean containsValue(Object value):
 * It returns true if the map maps one or more keys to the specified value.
 * K firstKey():
 * It is used to return the first (lowest) key currently in this sorted map.
 * V get(Object key):
 * It is used to return the value to which the map maps the specified key.
 * K lastKey():
 * It is used to return the last (highest) key currently in the sorted map.
 * V remove(Object key):
 * It removes the key-value pair of the specified key from the map.
 * Set<Map.Entry<K,V>> entrySet():
 * It returns a set view of the mappings contained in the map.
 * int size():
 * It returns the number of key-value pairs exists in the hashtable.
 * Collection values():
 * It returns a collection view of the values contained in the map.
 * متدهای کلاس Java TreeMap:
 * Map.Entry<K,V> ceilingEntry(K key):
 * این جفت مقدار کلید را با کمترین کلید ، بزرگتر یا مساوی با کلید مشخص شده ، یا تهی بودن در صورت وجود چنین کلید ، برمی گرداند.
 * K ceilingKey(K key):
 * در صورت وجود چنین کلید کمترین کلید ، بزرگتر از کلید مشخص شده یا تهی را برمی گرداند.
 * void clear():
 * همه جفت های ارزش کلیدی را از روی Map حذف می کند.
 * Object clone():
 * این یک نسخه کم عمق از نمونه TreeMap را برمی گرداند.
 * Comparator<? super K> comparator():
 * این مقایسه‌ای را که ترتیب آن را به ترتیب تنظیم کرده است ، برمی گرداند یا اگر از Map از ترتیب طبیعی استفاده کند ، تهی است.
 * NavigableSet<K> descendingKeySet():
 * این یک نمایش معکوس NavigableSet از کلیدهای موجود در Map را برمی گرداند.
 * NavigableMap<K,V> descendingMap():
 * این جفت های مشخص شده مقدار کلیدی را به ترتیب نزولی باز می گرداند.
 * Map.Entry firstEntry():
 * این جفت ارزش کلیدی را با کمترین کلید برمی گرداند.
 * Map.Entry<K,V> floorEntry(K key):
 * این بزرگترین کلید ، کمتر یا مساوی با کلید مشخص شده را برمی گرداند ، یا در صورت وجود چنین کلید ، تهی است.
 * void forEach(BiConsumer<? super K,? super V> action):
 * این عمل داده شده را برای هر ورودی در Map انجام می دهد تا زمانی که تمام ورودی ها پردازش شده یا یک عمل استثنائی را حذف کند.
 * SortedMap<K,V> headMap(K toKey):
 * این جفت های با ارزش کلیدی را که کلید آنها کاملاً کمتر از toKey است ، برمی گرداند.
 * NavigableMap<K,V> headMap(K toKey, boolean inclusive):
 * این جفت های با ارزش کلیدی را که کلیدهای آنها کمتر از (یا برابر با اگر صحیح بودن باشد) toKey می گرداند.
 * Map.Entry<K,V> higherEntry(K key):
 * این حداقل کلید را به شدت بزرگتر از کلید داده شده باز می گرداند ، یا در صورت وجود چنین کلید ، تهی است.
 * K higherKey(K key):
 * اگر این Map شامل Map ای برای کلید مشخص شده باشد ، برای بازگشت درست استفاده می شود.
 * Set keySet():
 * این مجموعه کلیدهای موجود در Map را برمی گرداند.
 * Map.Entry<K,V> lastEntry():
 * در صورت وجود چنین کلید ، جفت ارزش کلیدی را که دارای بزرگترین کلید است ، تهی می کند.
 * Map.Entry<K,V> lowerEntry(K key):
 * این Map برداری با مقدار کلیدی را که مربوط به بزرگترین کلید است ، به سختی کمتر از کلید داده شده باز می گرداند ، یا در صورت وجود چنین کلید ، تهی است.
 * K lowerKey(K key):
 * این بزرگترین کلید را به سختی کمتر از کلید داده شده باز می گرداند ، یا در صورت وجود چنین کلید ، تهی است.
 * NavigableSet<K> navigableKeySet():
 * این یک نمایش NavigableSet از کلیدهای موجود در این Map را برمی گرداند.
 * Map.Entry<K,V> pollFirstEntry():
 * این یک Map برداری با ارزش کلیدی مرتبط با حداقل کلید در این Map را حذف و برمی گرداند و اگر Map خالی است ، تهی است.
 * Map.Entry<K,V> pollLastEntry():
 * این یک Map برداری با ارزش کلیدی مرتبط با بزرگترین کلید در این Map را حذف و برمی گرداند و اگر Map خالی است ، تهی است.
 * V put(K key, V value):
 * مقدار مشخص شده را با کلید مشخص شده در Map وارد می کند.
 * void putAll(Map<? extends K,? extends V> map):
 * برای کپی کردن همه جفت ارزش کلیدی از یک Map به Map دیگر استفاده می شود.
 * V replace(K key, V value):
 * مقدار مشخص شده را برای یک کلید مشخص جایگزین می کند.
 * boolean replace(K key, V oldValue, V newValue):
 * این مقدار قدیمی را با مقدار جدید برای یک کلید مشخص جایگزین می کند.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * این مقدار هر ورودی را با نتیجه فراخوانی تابع داده شده در آن ورودی جایگزین می کند تا اینکه تمام مدخل ها پردازش شده یا این عملکرد یک استثناء را حذف می کند.
 * NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive):
 * این جفت های با ارزش کلیدی را که کلید های آنها از KK به toKey متغیر است ، برمی گرداند.
 * SortedMap<K,V> subMap(K fromKey, K toKey):
 * این جفت های با ارزش کلیدی را که کلید های آنها از KK ، شامل ، به toKey ، منحصر به فرد است ، برمی گرداند.
 * SortedMap<K,V> tailMap(K fromKey):
 * این جفت های ارزش کلیدی را که کلید های آنها بزرگتر یا مساوی با key هستند ، برمی گرداند.
 * NavigableMap<K,V> tailMap(K fromKey, boolean inclusive):
 * این جفت های با ارزش کلیدی را که کلیدهای آنها بزرگتر از (یا برابر با ، در صورت صحیح بودن) از key است ، برمی گرداند.
 * boolean containsKey(Object key):
 * اگر Map حاوی Map برداری برای کلید مشخص شده باشد ، درست می آید.
 * boolean containsValue(Object value):
 * اگر Map یک یا چند کلید را به مقدار مشخص شده برگرداند ، صحیح است.
 * K firstKey():
 * برای بازگشت اولین (پایین ترین) کلید موجود در این Map مرتب شده استفاده می شود.
 * V get(Object key):
 * برای برگرداندن مقداری که Map کلید مشخص شده را نشان می دهد ، استفاده می شود.
 * K lastKey():
 * برای بازگشت آخرین (بالاترین) کلید موجود در Map مرتب شده استفاده می شود.
 * V remove(Object key):
 * این زوج مقدار اصلی کلید مشخص شده را از روی Map حذف می کند.
 * Set<Map.Entry<K,V>> entrySet():
 * این نمای مجموعه ای از Map های موجود در Map را برمی گرداند.
 * int size():
 * این تعداد جفت های ارزش کلیدی موجود در هشتگ را برمی گرداند.
 * Collection values():
 * نمای مجموعه ای از مقادیر موجود در Map را برمی گرداند.
 *
 * What is difference between HashMap and TreeMap?
 * 1) HashMap class can contain one null key.	TreeMap cannot contain any null key.
 * 2) HashMap class maintains no order.	TreeMap maintains ascending order.
 * تفاوت بین HashMap و TreeMap چیست؟
 * 1) کلاس HashMap می تواند دارای یک کلید تهی باشد. TreeMap هیچ کلید تهی ندارد.
 * 2) کلاس HashMap نظمی ندارد. TreeMap ترتیب صعودی را حفظ می کند.
 */
public class JavaTreeMap {

    public String navigableMap() {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "B");
        map.put(1, "A");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        //{1=A, 2=B, 3=C, 4=D, 5=E, 6=F, 7=G}
        System.out.println(map.toString());
        String result = map
                .descendingMap() //{7=G, 6=F, 5=E, 4=D, 3=C, 2=B, 1=A}
                .headMap(2, true) //{7=G, 6=F, 5=E, 4=D, 3=C, 2=B}
                .subMap(6, false, 2, true) //{5=E, 4=D, 3=C, 2=B}
                .tailMap(4, false)//{3=C, 2=B}
                .toString();
        return result;
    }


    public String sortedMap() {
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(2, "B");
        map.put(1, "A");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        //{1=A, 2=B, 3=C, 4=D, 5=E, 6=F, 7=G}
        System.out.println(map.toString());
        String result = map
                .headMap(7) //{1=A, 2=B, 3=C, 4=D, 5=E, 6=F}
                .subMap(2, 6) //{2=B, 3=C, 4=D, 5=E}
                .tailMap(4)//{4=D, 5=E}
                .toString();
        return result;
    }
}
