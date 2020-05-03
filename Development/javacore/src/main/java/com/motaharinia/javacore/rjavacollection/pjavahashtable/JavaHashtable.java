package com.motaharinia.javacore.rjavacollection.pjavahashtable;

/**
 * https://www.javatpoint.com/java-hashtable
 * Java Hashtable class implements a hashtable, which maps keys to values.
 * It inherits Dictionary class and implements the Map interface
 *کلاس Java Hashtable یک hashtable را اجرا می کند ، که کلیدهای مقادیر را Map برداری می کند.
 * این کلاس Dictionary را به ارث می برد و رابط Map را پیاده سازی می کند
 *
 * Points to remember:
 * A Hashtable is an array of a list. Each list is known as a bucket.
 * The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
 * Java Hashtable class contains unique elements.
 * Java Hashtable class doesn't allow null key or value.
 * Java Hashtable class is synchronized.
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 * نکاتی که باید به خاطر بسپارید:
 * یک Hashtable آرایه ای از لیست است. هر لیست به عنوان bucket شناخته می شود.
 * با استفاده از متد hashcode موقعیت bucket مشخص می شود. یک Hashtable حاوی مقادیر مبتنی بر کلید است.
 * کلاس Java Hashtable شامل عناصر منحصر به فرد است.
 * کلاس Java Hashtable کلید یا مقدار تهی را مجاز نمی کند.
 * کلاس Java Hashtable همزمان است.
 * ظرفیت پیش فرض اولیه کلاس Hashtable 11 است در حالی که loadFactor 0.75 است.
 *
 * Hashtable class declaration:
 * public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable
 *
 * Hashtable class Parameters:
 * K: It is the type of keys maintained by this map.
 * V: It is the type of mapped values.
 * پارامترهای کلاس Hashtable:
 * K: این نوع کلیدهای حفظ شده توسط این Map است.
 * V: این نوع مقادیر Map برداری شده است.
 *
 * Constructors of Java Hashtable class:
 * Hashtable():
 * It creates an empty hashtable having the initial default capacity and load factor.
 * Hashtable(int capacity):
 * It accepts an integer parameter and creates a hash table that contains a specified initial capacity.
 * Hashtable(int capacity, float loadFactor):
 * It is used to create a hash table having the specified initial capacity and loadFactor.
 * Hashtable(Map<? extends K,? extends V> t):
 * It creates a new hash table with the same mappings as the given Map.
 * سازندگان کلاس Java Java Hashtable:
 * Hashtable():
 * با داشتن ظرفیت پیش فرض اولیه و عامل بار ، یک هشتگ خالی ایجاد می کند.
 * Hashtable(int capacity):
 * این یک پارامتر عدد صحیح را می پذیرد و یک جدول هش ایجاد می کند که دارای ظرفیت اولیه مشخصی است.
 * Hashtable(int capacity, float loadFactor):
 * برای ایجاد یک جدول هش با ظرفیت اولیه مشخص شده و loadFactor استفاده می شود.
 * Hashtable(Map<? extends K,? extends V> t):
 * این یک جدول hash جدید با Map های مشابه Map داده شده ایجاد می کند.
 *
 * Methods of Java Hashtable class:
 * void clear():
 * It is used to reset the hash table.
 * Object clone():
 * It returns a shallow copy of the Hashtable.
 * V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction):
 * It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.
 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
 * Enumeration elements():
 * It returns an enumeration of the values in the hash table.
 * Set<Map.Entry<K,V>> entrySet():
 * It returns a set view of the mappings contained in the map.
 * boolean equals(Object o):
 * It is used to compare the specified Object with the Map.
 * void forEach(BiConsumer<? super K,? super V> action):
 * It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
 * V getOrDefault(Object key, V defaultValue):
 * It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
 * int hashCode():
 * It returns the hash code value for the Map
 * Enumeration<K> keys():
 * It returns an enumeration of the keys in the hashtable.
 * Set<K> keySet():
 * It returns a Set view of the keys contained in the map.
 * V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction):
 * If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
 * V put(K key, V value):
 * It inserts the specified value with the specified key in the hash table.
 * void putAll(Map<? extends K,? extends V> t)):
 * It is used to copy all the key-value pair from map to hashtable.
 * V putIfAbsent(K key, V value):
 * If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
 * boolean remove(Object key, Object value):
 * It removes the specified values with the associated specified keys from the hashtable.
 * V replace(K key, V value):
 * It replaces the specified value for a specified key.
 * boolean replace(K key, V oldValue, V newValue):
 * It replaces the old value with the new value for a specified key.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 * String toString():
 * It returns a string representation of the Hashtable object.
 * Collection values():
 * It returns a collection view of the values contained in the map.
 * boolean contains(Object value):
 * This method returns true if some value equal to the value exists within the hash table, else return false.
 * boolean containsValue(Object value):
 * This method returns true if some value equal to the value exists within the hash table, else return false.
 * boolean containsKey(Object key):
 * This method return true if some key equal to the key exists within the hash table, else return false.
 * boolean isEmpty():
 * This method returns true if the hash table is empty; returns false if it contains at least one key.
 * protected void rehash():
 * It is used to increase the size of the hash table and rehashes all of its keys.
 * V get(Object key):
 * This method returns the object that contains the value associated with the key.
 * V remove(Object key):
 * It is used to remove the key and its value. This method returns the value associated with the key.
 * int size():
 * This method returns the number of entries in the hash table.
 * متدهای کلاس Java Hashtable:
 * void clear():
 * برای تنظیم مجدد جدول هش استفاده می شود.
 * Object clone():
 * نسخه کم عمق Hashtable را برمی گرداند.
 * V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * از آن برای محاسبه Map برداری برای کلید مشخص شده و مقدار Map برداری شده فعلی آن استفاده می شود (یا در صورت عدم وجود Map برداری فعلی ، تهی است).
 * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction):
 * برای محاسبه مقدار آن با استفاده از تابع Map برداری داده شده استفاده می شود ، اگر كلید مشخص شده در حال حاضر با یك مقدار مرتبط نباشد (یا برای null Map كشیده شده باشد) ، و آن را وارد این Map می كند مگر اینكه تهی باشد.
 * V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction):
 * در صورت وجود مقدار برای کلید مشخص شده و غیر تهی ، از آن برای محاسبه یك Map یابی جدید استفاده می شود.
 * Enumeration elements():
 * این شمارش مقادیر را در جدول هش برمی گرداند.
 * Set<Map.Entry<K,V>> entrySet():
 * این نمای مجموعه ای از Map های موجود در Map را برمی گرداند.
 * boolean equals(Object o):
 * برای مقایسه شیء مشخص شده با Map استفاده می شود.
 * void forEach(BiConsumer<? super K,? super V> action):
 * این عمل داده شده را برای هر ورودی در Map انجام می دهد تا زمانی که تمام ورودی ها پردازش شده یا یک عمل یک استثناء را حذف کند.
 * V getOrDefault(Object key, V defaultValue):
 * این مقدار را که Map مشخص شده در آن Map برداری شده است ، یا پیش فرض Value اگر Map حاوی Map برداری برای این کلید نیست ، باز می گرداند.
 * int hashCode():
 * مقدار کد هش را برای Map برمی گرداند
 * Enumeration<K> keys():
 * این شمارش کلیدها را در هشتگ برمی گرداند.
 * Set<K> keySet():
 * نمای مجموعه ای از کلیدهای موجود در Map را برمی گرداند.
 * V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction):
 * اگر کلید مشخص شده قبلاً با یک مقدار همراه نبوده یا با null همراه نیست ، آن را با مقدار غیر null داده شده مرتبط می کند.
 * V put(K key, V value):
 * مقدار مشخص شده را با كليد مشخص شده در جدول هش درج مي كند.
 * void putAll(Map<? extends K,? extends V> t)):
 * از آن برای کپی کردن همه جفت های مقدار کلیدی از Map به هشتگ استفاده می شود.
 * V putIfAbsent(K key, V value):
 * اگر کلید مشخص شده قبلاً با یک مقدار همراه نباشد (یا برای تهی Map برداری شده باشد) آن را با مقدار داده شده مرتبط می کند و تهی را برمی گرداند ، در غیر این صورت مقدار فعلی را برمی گرداند.
 * boolean remove(Object key, Object value):
 * مقادیر مشخص شده را با کلیدهای مشخص شده همراه از هشتگ حذف می کند.
 * V replace(K key, V value):
 * مقدار مشخص شده را برای یک کلید مشخص جایگزین می کند.
 * boolean replace(K key, V oldValue, V newValue):
 * این مقدار قدیمی را با مقدار جدید برای یک کلید مشخص جایگزین می کند.
 * void replaceAll(BiFunction<? super K,? super V,? extends V> function):
 * این مقدار هر ورودی را با نتیجه فراخوانی تابع داده شده در آن ورودی جایگزین می کند تا زمانی که تمام ورودی ها پردازش شوند یا این تابع یک استثناء را حذف کند.
 * String toString():
 * این یک بازنمایی رشته ای از موضوع Hashtable را برمی گرداند.
 * Collection values():
 * نمای مجموعه ای از مقادیر موجود در Map را برمی گرداند.
 * boolean contains(Object value):
 * اگر مقداری برابر با مقدار در جدول هش وجود داشته باشد ، این متد درست است.
 * boolean containsValue(Object value):
 * اگر مقداری برابر با مقدار در جدول هش وجود داشته باشد ، این متد درست است.
 * boolean containsKey(Object key):
 * اگر برخی از کلیدهای برابر با کلید در جدول هش وجود داشته باشد ، این متد درست است.
 * boolean isEmpty():
 * اگر جدول هش خالی باشد ، این متد درست است. اگر حداقل دارای یک کلید باشد ، غلط برمی گردد.
 * protected void rehash():
 * از آن برای افزایش اندازه جدول هش استفاده می شود و همه کلیدهای آن را دوباره شلیک می کند.
 * V get(Object key):
 * این متد شیء حاوی مقدار مرتبط با کلید را برمی گرداند.
 * V remove(Object key):
 * برای حذف کلید و مقدار آن استفاده می شود. این متد مقدار مرتبط با کلید را برمی گرداند.
 * int size():
 * این متد تعداد ورودی های موجود در جدول هش را برمی گرداند.
 */
public class JavaHashtable {

}
