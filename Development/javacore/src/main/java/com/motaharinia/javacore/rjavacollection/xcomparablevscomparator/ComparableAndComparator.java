package com.motaharinia.javacore.rjavacollection.xcomparablevscomparator;

/**
 * https://www.javatpoint.com/difference-between-comparable-and-comparator
 * Difference between Comparable and Comparator:
 * Comparable and Comparator both are interfaces and can be used to sort collection elements.
 * However, there are many differences between Comparable and Comparator interfaces that are given below.
 * 1) Comparable provides a single sorting sequence.
 * In other words, we can sort the collection on the basis of a single element such as id, name, and price.
 * The Comparator provides multiple sorting sequences.
 * In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
 * 2) Comparable affects the original class, i.e., the actual class is modified.
 * Comparator doesn't affect the original class, i.e., the actual class is not modified.
 * 3) Comparable provides compareTo() method to sort elements.
 * Comparator provides compare() method to sort elements.
 * 4) Comparable is present in java.lang package.
 * A Comparator is present in the java.util package.
 * 5) We can sort the list elements of Comparable type by Collections.sort(List) method.
 * We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 *
 * تفاوت بین Comparable و Comparator:
 *  هر دو رابط هستند و می توان برای مرتب سازی عناصر مجموعه استفاده کرد.
 * با این حال ، تفاوت های بسیاری بین رابط های Comparator و Comparable وجود دارد که در زیر آورده شده است.
 * 1) رابط Comparable  یک دنباله مرتب سازی واحد ارائه می دهد.
 * به عبارت دیگر ، می توانیم این مجموعه را بر اساس یک عنصر واحد مانند شناسه ، نام و قیمت مرتب کنیم.
 * رابط Comparator توالی مرتب سازی چندگانه را ارائه می دهد.
 * به عبارت دیگر ، می توانیم این مجموعه را بر اساس چندین عنصر مانند شناسه ، نام و قیمت و غیره مرتب کنیم.
 * 2) رابط Comparable  قابل مقایسه با کلاس اصلی است ، یعنی کلاس واقعی اصلاح می شود.
 * رابط Comparator کلاس اصلی را تحت تأثیر قرار نمی دهد ، یعنی کلاس واقعی اصلاح نشده است.
 * 3) رابط Comparable  متد compareTo () را برای مرتب سازی عناصر فراهم می کند.
 * رابط Comparator متد compare () برای مرتب سازی عناصر را ارائه می دهد.
 * 4) رابط Comparable  در بسته java.lang موجود است.
 * رابط Comparator در بسته java.util موجود است.
 * 5) می توانیم عناصر لیست از نوع Comparable را با متد Collections.sort (List) طبقه بندی کنیم.
 * ما می توانیم عناصر لیست از نوع Comparator را با متد Collections.sort(List, Comparator) مرتب سازی کنیم.
 */
public class ComparableAndComparator {
}
