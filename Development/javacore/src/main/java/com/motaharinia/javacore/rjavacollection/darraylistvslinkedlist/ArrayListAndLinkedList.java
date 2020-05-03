package com.motaharinia.javacore.rjavacollection.darraylistvslinkedlist;

/**
 * https://www.javatpoint.com/difference-between-arraylist-and-linkedlist
 * Difference between ArrayList and LinkedList:
 * ArrayList and LinkedList both implements List interface and maintains insertion order.
 * Both are non synchronized classes.
 * However, there are many differences between ArrayList and LinkedList classes that are given below.
 * 1) ArrayList internally uses a dynamic array to store the elements.
 * LinkedList internally uses a doubly linked list to store the elements.
 * 2) Manipulation with ArrayList is slow because it internally uses an array.
 * If any element is removed from the array, all the bits are shifted in memory.
 * Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
 * 3) An ArrayList class can act as a list only because it implements List only.
 * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
 * 4) ArrayList is better for storing and accessing data.
 * LinkedList is better for manipulating data.
 *تفاوت بین ArrayList و LinkedList:
 * هر دو ArrayList و LinkedList لیست را پیاده سازی می کنند و ترتیب درج را حفظ می کنند.
 * هر دو کلاس غیر هماهنگ هستند.
 * با این حال ، تفاوتهای زیادی بین کلاسهای ArrayList و LinkedList وجود دارد که در زیر آورده شده است.
 * 1) کلاس ArrayList در داخل از یک آرایه پویا برای ذخیره عناصر استفاده می کند.
 * کلاس LinkedList در داخل از یک لیست مضاعف مرتبط برای ذخیره عناصر استفاده می کند.
 * 2) دستکاری با ArrayList کند است زیرا در داخل از یک آرایه استفاده می کند.
 * اگر هر عنصری از آرایه حذف شود ، تمام بیت ها در حافظه منتقل می شوند.
 * دستکاری با LinkedList سریعتر از ArrayList است زیرا از یک لیست مضاعف مرتبط استفاده می کند ، بنابراین نیازی به جابجایی کمی در حافظه دارذ.
 * 3) یک کلاس ArrayList فقط به دلیل اینکه  لیست را پیاده سازی می کند می تواند به عنوان یک لیست عمل کند.
 * کلاس LinkedList می تواند به عنوان لیست و صف هر دو عمل کند زیرا این برنامه رابط های List و Deque را پیاده سازی می کند.
 * 4) کلاس ArrayList برای ذخیره سازی و دسترسی به داده ها بهتر است.
 * کلاس LinkedList برای دستکاری داده ها بهتر است.
 *
 *
 */
public class ArrayListAndLinkedList {
}
