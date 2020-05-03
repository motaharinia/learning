package com.motaharinia.javacore.rjavacollection.mworkingofhashmap;

/**
 * https://www.javatpoint.com/working-of-hashmap-in-java
 *
 * What is Hashing:
 * It is the process of converting an object into an integer value.
 * The integer value helps in indexing and faster searches.
 * هاشینگ چیست:
 * این فرآیند تبدیل یک شی به یک عدد صحیح است.
 * مقدار عدد صحیح به فهرست بندی و جستجوی سریعتر کمک می کند.
 *
 * What is HashMap:
 * HashMap is a part of the Java collection framework.
 * It uses a technique called Hashing.
 * It implements the map interface.
 * It stores the data in the pair of Key and Value.
 * HashMap contains an array of the nodes, and the node is represented as a class.
 * It uses an array and LinkedList data structure internally for storing Key and Value.
 * There are four fields in HashMap.
 * یک HashMap چیست:
 * یک HashMap بخشی از چارچوب مجموعه جاوا است.
 * از متدی به نام هاشینگ استفاده می کند.
 * این رابط Map را پیاده سازی می کند.
 * این داده ها را در جفت Key و Value ذخیره می کند.
 * یک HashMap شامل آرایه ای از گره ها است ، و گره به عنوان یک کلاس نشان داده می شود.
 * از یک ساختار داده و پیوند داده شده LinkedList در داخل برای ذخیره سازی Key و Value استفاده می کند.
 * چهار قسمت در HashMap وجود دارد.
 *
 * Before understanding the internal working of HashMap, you must be aware of hashCode() and equals() method:
 * equals():
 * It checks the equality of two objects. It compares the Key, whether they are equal or not.
 * It is a method of the Object class. It can be overridden.
 * If you override the equals() method, then it is mandatory to override the hashCode() method.
 * hashCode():
 * This is the method of the object class. It returns the memory reference of the object in integer form.
 * The value received from the method is used as the bucket number.
 * The bucket number is the address of the element inside the map. Hash code of null Key is 0.
 * Buckets:
 * Array of the node is called buckets. Each node has a data structure like a LinkedList.
 * More than one node can share the same bucket. It may be different in capacity.
 *قبل از درک کار داخلی HashMap ، باید از متد hashCode و equals استفاده کنید:
 * equals():
 * این برابری دو شی را بررسی می کند. این کلید را با هم مقایسه می کند ، چه آنها برابر باشند یا نه.
 * این یک متد از کلاس Object است. می توان آن را نادیده گرفت.
 * اگر از متد equals استفاده کنید ، override کردن متد hashCode الزامی است.
 * hashCode():
 * این متد کلاس object است. مرجع حافظه جسم را به صورت عدد صحیح باز می گرداند.
 * مقدار دریافت شده از متد به عنوان شماره bucket استفاده می شود.
 * شماره bucket آدرس عنصر موجود در Map است. کد هش برای کلید null صفر است.
 * Buckets:
 * آرایه گره ها Buckets نامیده می شود. هر گره از ساختار داده مانند LinkedList برخوردار است.
 * بیش از یک گره می تواند یک Buckets یکسان را به اشتراک بگذارد. از نظر ظرفیت ممکن است متفاوت باشد.
 *
 * Insert Key, Value pair in HashMap:
 * We use put() method to insert the Key and Value pair in the HashMap. The default size of HashMap is 16 (0 to 15).
 * درج کلید و جفت ارزش در HashMap:
 * ما از روش put () برای وارد کردن جفت Key و Value در HashMap استفاده می کنیم. اندازه پیش فرض HashMap 16 (0 تا 15) است.
 *
 * Calculating Index:
 * Index minimizes the size of the array. The Formula for calculating the index is:
 * Index = hashcode(Key) & (n-1)
 * Where n is the size of the array. Hence the index value for "Aman" is:
 * Index = 2657860 & (16-1) = 4
 * The value 4 is the computed index value where the Key and value will store in HashMap.
 * شاخص محاسبه:
 * ایندکس اندازه آرایه را به حداقل می رساند. فرمول محاسبه این شاخص:
 * Index = hashcode(Key) & (n-1)
 * عدد n اندازه آرایه است. از این رو مقدار شاخص برای "Aman" است:
 * Index = 2657860 & (16-1) = 4
 * مقدار 4 مقدار شاخص محاسبه شده است که در آن Key و مقدار در HashMap ذخیره می شود.
 *
 * Hash Collision:
 * This is the case when the calculated index value is the same for two or more Keys.
 * Let's calculate the hash code for another Key "Sunny."
 * Suppose the hash code for "Sunny" is 63281940.
 * To store the Key in the memory, we have to calculate index by using the index formula.
 * Index=63281940 & (16-1) = 4
 * The value 4 is the computed index value where the Key will be stored in HashMap.
 * In this case, equals() method check that both Keys are equal or not.
 * If Keys are same, replace the value with the current value.
 * Otherwise, connect this node object to the existing node object through the LinkedList.
 * Hence both Keys will be stored at index 4.
 * Similarly, we will store the Key "Ritesh." Suppose hash code for the Key is 2349873.
 * The index value will be 1. Hence this Key will be stored at index 1.
 *برخورد هش:
 * این در شرایطی است که مقدار index محاسبه شده برای دو یا چند کلید یکسان است.
 * بیایید کد هش را برای کلید دیگری "Sunny" محاسبه کنیم.
 * فرض کنید کد هش برای "Sunny" برابر 63281940 است.
 * برای ذخیره کلید در حافظه ، باید شاخص را با استفاده از فرمول index محاسبه کنیم.
 * Index=63281940 & (16-1) = 4
 * مقدار 4 مقدار index محاسبه شده است که در آن Key در HashMap ذخیره خواهد شد.
 * در این حالت ، متد equals برابر است که هر دو کلید برابر هستند یا خیر.
 * اگر کلیدها یکسان هستند ، مقدار را با مقدار فعلی جایگزین کنید.
 * در غیر این صورت ، این شیء گره را از طریق LinkedList به شیء گره موجود وصل کنید.
 * از این رو هر دو کلید در فهرست شماره 4 ذخیره می شوند.
 * به طور مشابه ، ما کلید "Ritesh" را ذخیره می کنیم. فرض کنید کد هش برای Key 2349873 است.
 * مقدار شاخص 1 خواهد بود. از این رو این کلید در فهرست 1 ذخیره می شود.
 *
 * get() method in HashMap:
 * get() method is used to get the value by its Key.
 * It will not fetch the value if you don't know the Key.
 * When get(K Key) method is called, it calculates the hash code of the Key.
 * Suppose we have to fetch the Key "Aman." The following method will be called.
 * map.get(new Key("Aman"));
 * It generates the hash code as 2657860.
 * Now calculate the index value of 2657860 by using index formula.
 * The index value will be 4, as we have calculated above.
 * get() method search for the index value 4. It compares the first element Key with the given Key.
 * If both keys are equal, then it returns the value else check for the next element in the node if it exists.
 * In our scenario, it is found as the first element of the node and return the value 19.
 * Let's fetch another Key "Sunny."
 * The hash code of the Key "Sunny" is 63281940.
 * The calculated index value of 63281940 is 4, as we have calculated for put() method.
 * Go to index 4 of the array and compare the first element's Key with the given Key. It also compares Keys.
 * In our scenario, the given Key is the second element, and the next of the node is null.
 * It compares the second element Key with the specified Key and returns the value 29.
 * It returns null if the next of the node is null.
 *  متد get در HashMap:
 * از متد get برای بدست آوردن مقدار توسط کلید آن استفاده می شود.
 * اگر کلید را بلد نباشید ، این مقدار را به دست نمی آورد.
 * هنگامی که متد get(K Key)  خوانده می شود ، کد هش کلید را محاسبه می کند.
 * فرض کنید باید کلید "Aman" را واگذار کنیم. متد زیر فراخوانی خواهد شد.
 * map.get(new Key("Aman"));
 * کد هش را به عنوان 2657860 تولید می کند.
 * اکنون با استفاده از فرمول فهرست ، مقدار شاخص 2657860 را محاسبه کنید.
 * مقدار شاخص 4 خواهد بود ، همانطور که در بالا محاسبه کردیم.
 * متد get برای به دست آوردن مقدار شاخص 4 جستجو میکند. اولین کلید اصلی را با کلید داده شده مقایسه می کند.
 * اگر هر دو کلید برابر باشند ، مقدار دیگری را برای وجود عنصر بعدی در گره بررسی می کند.
 * در سناریوی ما ، به عنوان اولین عنصر گره یافت می شود و مقدار 19 را برمی گرداند.
 * بیایید کلید دیگری "Sunny" بگیریم.
 * کد هش کلید "Sunny" برابر 63281940 است.
 * مقدار شاخص محاسبه شده 63281940 برابر 4 است ، همانطور که برای متد put محاسبه کرده ایم.
 * به فهرست 4 آرایه بروید و کلید اصلی عنصر اول را با کلید داده شده مقایسه کنید. همچنین Keys را با هم مقایسه می کند.
 * در سناریوی ما ، کلید داده شده عنصر دوم و قسمت بعدی گره تهی است.
 * دومین عنصر Key را با کلید مشخص شده مقایسه می کند و مقدار 29 را برمی گرداند.
 * اگر قسمت بعدی گره تهی باشد ، تهی است.
 */
public class WorkingOfHashMap {
}
