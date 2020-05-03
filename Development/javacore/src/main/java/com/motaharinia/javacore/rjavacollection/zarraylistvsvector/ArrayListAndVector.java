package com.motaharinia.javacore.rjavacollection.zarraylistvsvector;

/**
 * https://www.javatpoint.com/difference-between-arraylist-and-vector
 * Difference between ArrayList and Vector:
 * ArrayList and Vector both implements List interface and maintains insertion order.
 * However, there are many differences between ArrayList and Vector classes that are given below.
 * 1) ArrayList is not synchronized.
 * Vector is synchronized.
 * 2) ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
 * Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
 * 3) ArrayList is not a legacy class. It is introduced in JDK 1.2.
 * Vector is a legacy class.
 * 4) ArrayList is fast because it is non-synchronized.
 * Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the object.
 * 5) ArrayList uses the Iterator interface to traverse the elements.
 * A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
 * تفاوت بین ArrayList و وکتور:
 * کلاس ArrayList و وکتور هر دو رابط لیست را اجرا می کنند و ترتیب درج را حفظ می کنند.
 * با این حال ، تفاوتهای زیادی بین کلاسهای ArrayList و وکتور وجود دارد که در زیر آورده شده است.
 * 1) کلاس ArrayList  هماهنگ نیست.
 * وکتور هماهنگ است.
 * 2) کلاس ArrayList  اگر تعداد عناصر از ظرفیت آن فراتر رود ، 50٪ از اندازه آرایه فعلی را افزایش می دهد.
 * افزایش بردار 100٪ به معنای دو برابر شدن در اندازه آرایه است اگر تعداد کل عناصر از ظرفیت آن فراتر رود.
 * 3) کلاس ArrayList  یک کلاس میراث نیست. در JDK 1.2 معرفی شده است.
 * وکتور یک کلاس میراث است.
 * 4) کلاس ArrayList  سریع است زیرا غیر هماهنگ است.
 * وکتور آهسته است ، زیرا همزمان در یک محیط چند رشته ای ، موضوعات دیگر را در حالت قابل اجرا یا غیر قابل جابجایی نگه می دارد تا زمانی که موضوع فعلی قفل جسم را آزاد کند.
 * 5) کلاس ArrayList  برای عبور از عناصر از رابط Iterator استفاده می کند.
 * یک وکتور می تواند از رابط Iterator یا رابط Enumeration برای گذر از عناصر استفاده کند.
 */
public class ArrayListAndVector {
}
