package com.motaharinia.javacore.rjavacollection.ljavahashmap;

/**
 * https://www.javatpoint.com/java-hashmap
 *
 * Java HashMap:
 * Java HashMap class implements the map interface by using a hash table. It inherits AbstractMap class and implements Map interface.
 * جاوا HashMap:
 * کلاس Java HashMap رابط Map را با استفاده از جدول هش پیاده سازی می کند. این کلاس AbstractMap را به ارث می برد و رابط Map را پیاده سازی می کند.
 *
 * Points to remember:
 * Java HashMap class contains values based on the key.
 * Java HashMap class contains only unique keys.
 * Java HashMap class may have one null key and multiple null values.
 * Java HashMap class is non synchronized.
 * Java HashMap class maintains no order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 * نکاتی که باید به خاطر بسپارید:
 * کلاس Java HashMap دارای مقادیر بر اساس کلید است.
 * کلاس Java HashMap فقط دارای کلیدهای منحصر به فرد است.
 * کلاس Java HashMap ممکن است دارای یک کلید تهی و چند مقدار null باشد.
 * کلاس Java HashMap هماهنگ نیست.
 * کلاس Java HashMap نظمی ندارد.
 * ظرفیت پیش فرض اولیه کلاس Java HashMap 16 با ضریب بار 75/0 است
 *
 * Hierarchy of HashMap class:
 * HashMap class extends AbstractMap class and implements Map interface.
 * سلسله مراتب کلاس HashMap:
 * کلاس HashMap کلاس AbstractMap را گسترش می دهد و رابط Map را پیاده سازی می کند.
 *
 * HashMap class declaration:
 * public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
 *
 * HashMap class Parameters:
 * K: It is the type of keys maintained by this map.
 * V: It is the type of mapped values.
 * پارامترهای کلاس HashMap:
 * پارامتر K: این نوع کلیدهای حفظ شده توسط این Map است.
 * پارامتر V: این نوع مقادیر Map شده است.
 *
 * Constructors of Java HashMap class:
 * HashMap():
 * It is used to construct a default HashMap.
 * HashMap(Map<? extends K,? extends V> m):
 * It is used to initialize the hash map by using the elements of the given Map object m.
 * HashMap(int capacity):
 * It is used to initializes the capacity of the hash map to the given integer value, capacity.
 * HashMap(int capacity, float loadFactor):
 * It is used to initialize both the capacity and load factor of the hash map by using its arguments.
 * سازندگان کلاس Java HashMap:
 * HashMap():
 * برای ساختن HashMap پیش فرض استفاده می شود.
 * HashMap(Map<? extends K,? extends V> m):
 * برای اولیه سازی Map هش با استفاده از عناصر شی Map داده شده m استفاده می شود.
 * HashMap(int capacity):
 * برای اولیه سازی ظرفیت Map هش به مقدار عدد صحیح ، ظرفیت استفاده می شود.
 * HashMap(int capacity, float loadFactor):
 * برای شروع هر دو ظرفیت و ضریب بار Map هش با استفاده از آرگومان های آن استفاده می شود.
 *
 * Methods of Java HashMap class:
 * void clear():
 * It is used to remove all of the mappings from this map.
 * boolean isEmpty():
 * It is used to return true if this map contains no key-value mappings.
 * Object clone():
 * It is used to return a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
 * Set entrySet():
 * It is used to return a collection view of the mappings contained in this map.
 * Set keySet():
 * It is used to return a set view of the keys contained in this map.
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
 * Collection<V> values():
 * It returns a collection view of the values contained in the map.
 * int size():
 * This method returns the number of entries in the map.
 * متدهای کلاس Java HashMap:
 *void clear():
 * برای حذف کلیه Map ها از این Map استفاده می شود.
 * boolean isEmpty():
 * اگر این Map حاوی Map‌برداری با کلید باشد ، برای بازگشت درست استفاده می شود.
 *Object clone():
 * برای بازگشت یک نسخه کم عمق از این نمونه HashMap استفاده می شود: کلیدها و مقادیر خود کلون نمی شوند.
 *Set entrySet():
 * برای بازگشت نمای مجموعه از Map‌های موجود در این Map ، استفاده شده است.
 *Set keySet():
 * برای بازگشت نمای مجموعه ای از کلیدهای موجود در این Map ، استفاده می شود.
 * V put(Object key, Object value):
 * برای قرار دادن یک ورودی در Map استفاده می شود.
 * void putAll(Map map):
 * برای درج Map مشخص شده در Map استفاده می شود.
 *V putIfAbsent(K key, V value):
 * فقط مقدار مشخص شده را با كليد مشخص شده در Map درج مي كند ، در صورتي كه قبلاً مشخص نشده باشد.
 *V remove(Object key):
 * از آن برای حذف یک ورودی برای کلید مشخص شده استفاده می شود.
 * boolean remove(Object key, Object value):
 * مقادیر مشخص شده را با کلیدهای مشخص شده همراه از Map حذف می کند.
 *V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * از آن برای محاسبه Map برداری برای کلید مشخص شده و مقدار Map برداری شده فعلی آن استفاده می شود (یا در صورت عدم وجود Map برداری فعلی ، تهی است).
 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction):
 * برای محاسبه مقدار آن با استفاده از تابع Map برداری داده شده استفاده می شود ، اگر كلید مشخص شده در حال حاضر با یك مقدار مرتبط نباشد (یا برای null Map كشیده شده باشد) ، و آن را وارد این Map می كند مگر اینكه تهی باشد.
 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * در صورت وجود مقدار برای کلید مشخص شده و غیر تهی ، از آن برای محاسبه یك Map یابی جدید استفاده می شود.
 * boolean containsValue(Object value):
 * اگر مقداری برابر با مقدار موجود در Map وجود داشته باشد ، این متد درست است ، در غیر این صورت غلط باز می گردد.
 * boolean containsKey(Object key):
 * اگر برخی از کلیدهای برابر با کلید در Map وجود داشته باشد ، این متد درست است ، در غیر این صورت نادرست باز می گردد.
 *boolean equals(Object o):
 * برای مقایسه شیء مشخص شده با Map استفاده می شود.
 * void forEach(BiConsumer<? super K,? super V> action):
 * این عمل داده شده را برای هر ورودی در Map انجام می دهد تا زمانی که تمام ورودی ها پردازش شده یا یک عمل استثنائی را حذف کند.
 * V get(Object key):
 * در این متد شیئی که حاوی مقدار مرتبط با کلید است را برمی گرداند.
 * V getOrDefault(Object key, V defaultValue):
 * این مقدار را که Map مشخص شده در آن Map برداری شده است ، یا پیش فرض Value اگر Map حاوی Map نویسی برای این کلید باشد ، برمی گرداند.
 * boolean isEmpty():
 * اگر این Map خالی باشد ، این متد درست می شود. اگر حداقل دارای یک کلید باشد ، غلط برمی گردد.
 *V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction):
 * اگر کلید مشخص شده قبلاً با یک مقدار همراه نبوده یا با null همراه نیست ، آن را با مقدار غیر null داده شده مرتبط می کند.
 *V replace(K key, V value):
 * مقدار مشخص شده را برای یک کلید مشخص جایگزین می کند.
 * boolean replace(K key, V oldValue, V newValue):
 * این مقدار قدیمی را با مقدار جدید برای یک کلید مشخص جایگزین می کند.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * این مقدار هر ورودی را با نتیجه فراخوانی تابع داده شده در آن ورودی جایگزین می کند تا اینکه تمام مدخل ها پردازش شده یا این عملکرد یک استثناء را حذف می کند.
 *Collection<V> values():
 * نمای مجموعه ای از مقادیر موجود در Map را برمی گرداند.
 *int size():
 * این متد تعداد ورودی های Map را برمی گرداند.
 *
 * Difference between HashSet and HashMap:
 * HashSet contains only values whereas HashMap contains an entry(key and value).
 * تفاوت بین HashSet و HashMap:
 * یک HashSet فقط دارای مقادیر است در حالی که HashMap دارای یک ورودی (کلید و مقدار) است.
 */
public class JavaHashMap {
}
