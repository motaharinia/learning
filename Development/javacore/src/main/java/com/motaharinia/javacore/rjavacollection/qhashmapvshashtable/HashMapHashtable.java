package com.motaharinia.javacore.rjavacollection.qhashmapvshashtable;

/**
 *https://www.javatpoint.com/difference-between-hashmap-and-hashtable
 * Difference between HashMap and Hashtable:
 * HashMap and Hashtable both are used to store data in key and value form.
 * Both are using hashing technique to store unique keys.
 * But there are many differences between HashMap and Hashtable classes that are given below
 * 1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.
 * Hashtable is synchronized. It is thread-safe and can be shared with many threads.
 * 2) HashMap allows one null key and multiple null values.
 * Hashtable doesn't allow any null key or value.
 * 3) HashMap is a new class introduced in JDK 1.2.
 * Hashtable is a legacy class.
 * 4) HashMap is fast.
 * Hashtable is slow.
 * 5) We can make the HashMap as synchronized by calling this code
 * Map m = Collections.synchronizedMap(hashMap);
 * Hashtable is internally synchronized and can't be unsynchronized.
 * 6) HashMap is traversed by Iterator.
 * Hashtable is traversed by Enumerator and Iterator.
 * 7) Iterator in HashMap is fail-fast.
 * Enumerator in Hashtable is not fail-fast.
 * 8) HashMap inherits AbstractMap class.
 * Hashtable inherits Dictionary class.
 * تفاوت بین HashMap و Hashtable:
 * HashMap و Hashtable از هر دو برای ذخیره داده ها به صورت کلید و مقدار استفاده می شوند.
 * هر دو برای ذخیره کلیدهای بی نظیر از تکنیک hashing استفاده می کنند.
 * اما تفاوتهای زیادی بین کلاس های HashMap و Hashtable وجود دارد که در زیر آورده شده است
 * 1) HashMap هماهنگ نیست. بدون امنیت متن است و نمی توان بین بسیاری از موضوعات بدون کد هماهنگی مناسب به اشتراک گذاشت.
 * هشتگ همزمان است. از نوع نخ محافظ است و می تواند با موضوعات بسیاری به اشتراک گذاشته شود.
 * 2) کلاس HashMap به یک کلید تهی و مقادیر تهی چندگانه اجازه می دهد.
 *  کلاس Hashtable هیچ کلید یا مقدار خالی را اجازه نمی دهد.
 * 3)  کلاس HashMap کلاس جدیدی است که در JDK 1.2 معرفی شده است.
 * کلاس Hashtable یک کلاس میراث است.
 * 4)  کلاس HashMap سریع است.
 * کلاس Hashtable کند است.
 * 5) ما می توانیم با فراخوانی این کد HashMap را به صورت همگام سازی کنیم
 *Map m = Collections.synchronizedMap(hashMap);
 * کلاس Hashtable داخلی همگام سازی شده است و نمی تواند همزمان نباشد.
 * 6)  کلاس HashMap توسط Iterator عبور می کند.
 * کلاس Hashtable توسط Enumerator و Iterator عبور می کند.
 * 7) Iterator در HashMap سریع انجام می شود.
 * ثبت کننده در Hashtable سریع نیست.
 * 8)  کلاس HashMap کلاس AbstractMap را به ارث می برد.
 * کلاس Hashtable کلاس Dictionary را به ارث می برد.
 *
 *
 */
public class HashMapHashtable {
}
