package com.motaharinia.javacore.rjavacollection.sjavaenummap;

import java.util.EnumMap;
import java.util.Map;

/**
 * https://www.javatpoint.com/java-enummap
 * Java EnumMap class:
 * Java EnumMap class is the specialized Map implementation for enum keys.
 * It inherits Enum and AbstractMap classes.
 * کلاس Java EnumMap:
 * کلاس Java EnumMap اجرای تخصصی Map برای کلیدهای enum است.
 * کلاس های Enum و AbstractMap را به ارث می برد.
 * <p>
 * EnumMap class declaration:
 * public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V> implements Serializable, Cloneable
 * <p>
 * EnumMap class Parameters:
 * K: It is the type of keys maintained by this map.
 * V: It is the type of mapped values.
 * پارامترهای کلاس EnumMap:
 * K: این نوع کلیدهای حفظ شده توسط این Map است.
 * V: این نوع مقادیر Map برداری شده است.
 * <p>
 * Constructors of Java EnumMap class:
 * EnumMap(Class<K> keyType):
 * It is used to create an empty enum map with the specified key type.
 * EnumMap(EnumMap<K,? extends V> m):
 * It is used to create an enum map with the same key type as the specified enum map.
 * EnumMap(Map<K,? extends V> m):
 * It is used to create an enum map initialized from the specified map.
 * سازندگان کلاس Java EnumMap:
 * EnumMap(Class<K> keyType):
 * از آن برای ایجاد Map Enum خالی با نوع کلید مشخص شده استفاده می شود.
 * EnumMap(EnumMap<K,? extends V> m):
 * از آن برای ایجاد Map enum با همان کلید اصلی به عنوان Map enum مشخص استفاده می شود.
 * EnumMap(Map<K,? extends V> m):
 * از آن برای ایجاد Map enum اولیه در Map مشخص شده استفاده می شود.
 * <p>
 * Methods of Java EnumMap class:
 * 1	clear():
 * It is used to clear all the mapping from the map.
 * 2	clone():
 * It is used to copy the mapped value of one map to another map.
 * 3	containsKey():
 * It is used to check whether a specified key is present in this map or not.
 * 4	containsValue():
 * It is used to check whether one or more key is associated with a given value or not.
 * 5	entrySet():
 * It is used to create a set of elements contained in the EnumMap.
 * 6	equals():
 * It is used to compare two maps for equality.
 * 7	get():
 * It is used to get the mapped value of the specified key.
 * 8	hashCode():
 * It is used to get the hashcode value of the EnumMap.
 * 9	keySet():
 * It is used to get the set view of the keys contained in the map.
 * 10	size():
 * It is used to get the size of the EnumMap.
 * 11	Values():
 * It is used to create a collection view of the values contained in this map.
 * 12	put():
 * It is used to associate the given value with the given key in this EnumMap.
 * 13	putAll():
 * It is used to copy all the mappings from one EnumMap to a new EnumMap.
 * 14	remove():
 * It is used to remove the mapping for the given key from EnumMap if the given key is present.
 * متدهای کلاس Java EnumMap:
 * 1	clear():
 * برای پاک کردن کلیه Map برداری از Map استفاده می شود.
 * 2	clone():
 * برای کپی کردن مقدار Map برداری شده از یک Map به Map دیگر استفاده می شود.
 * 3	containsKey():
 * برای بررسی اینکه آیا یک کلید مشخص شده در این Map وجود دارد یا خیر ، استفاده می شود.
 * 4	containsValue():
 * برای بررسی اینکه آیا یک یا چند کلید با یک مقدار معین مرتبط است یا نه استفاده می شود.
 * 5	entrySet():
 * برای ایجاد مجموعه ای از عناصر موجود در EnumMap استفاده می شود.
 * 6	equals():
 * برای مقایسه دو Map برای برابری استفاده می شود.
 * 7	get():
 * برای بدست آوردن مقدار Map برداری شده از کلید مشخص شده استفاده می شود.
 * 8	hashCode():
 * برای بدست آوردن مقدار hashcode از EnumMap استفاده می شود.
 * 9	keySet():
 * برای بدست آوردن نمای مجموعه ای از کلیدهای موجود در Map استفاده می شود.
 * 10	size():
 * برای بدست آوردن اندازه EnumMap استفاده می شود.
 * 11	Values():
 * برای ایجاد نمای مجموعه از مقادیر موجود در این Map استفاده می شود.
 * 12	put():
 * برای ارتباط مقدار داده شده با کلید داده شده در این EnumMap استفاده می شود.
 * 13	putAll():
 * این برای کپی کردن تمام Map ها از یک EnumMap به یک EnumMap جدید استفاده می شود.
 * 14	remove():
 * در صورت وجود کلید داده شده ، از آن برای حذف Map برداری برای کلید داده شده از EnumMap استفاده می شود.
 */
public class JavaEnumMap {
    public String iteration() {
        String result = "";
        EnumMap<JavaEnumMapDays, String> map = new EnumMap<JavaEnumMapDays, String>(JavaEnumMapDays.class);
        map.put(JavaEnumMapDays.MONDAY, "1");
        map.put(JavaEnumMapDays.TUESDAY, "2");
        map.put(JavaEnumMapDays.WEDNESDAY, "3");
        map.put(JavaEnumMapDays.THURSDAY, "4");

        for (Map.Entry m : map.entrySet()) {
            result += m.getKey() + ":" + m.getValue() + ",";
        }
        return result;
    }
}


enum JavaEnumMapDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}