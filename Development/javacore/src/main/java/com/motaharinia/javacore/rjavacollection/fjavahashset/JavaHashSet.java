package com.motaharinia.javacore.rjavacollection.fjavahashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://www.javatpoint.com/java-hashset
 * Java HashSet class is used to create a collection that uses a hash table for storage.
 * It inherits the AbstractSet class and implements Set interface.
 * The important points about Java HashSet class are:
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non synchronized.
 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
 * HashSet is the best approach for search operations.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
 * از کلاس Java HashSet برای ایجاد مجموعه ای استفاده می شود که از یک میز هش برای ذخیره سازی استفاده می کند.
 * این کلاس AbstractSet را به ارث می برد و رابط Set را پیاده سازی می کند.
 * نکات مهم در مورد کلاس Java HashSet عبارتند از:
 * کلاس HashSet عناصر را با استفاده از مکانیسمی بنام hashing ذخیره می کند.
 * کلاس HashSet فقط شامل عناصر منحصر به فرد است.
 * کلاس HashSet مقدار null را مجاز می کند.
 * کلاس HashSet هماهنگ نیست.
 * کلاس HashSet ترتیب دستور درج را حفظ نمی کند. در اینجا ، عناصر بر اساس کد رمزگذاری شده درج می شوند.
 * کلاس HashSet بهترین روش برای عملیات جستجو است.
 * ظرفیت پیش فرض اولیه آن 16 و ضریب بار 0.75 است.
 * <p>
 * Difference between List and Set:
 * A list can contain duplicate elements whereas Set contains unique elements only.
 * Hierarchy of HashSet class:
 * The HashSet class extends AbstractSet class which implements Set interface.
 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.
 * HashSet class declaration:
 * Let's see the declaration for java.util.HashSet class.
 * public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
 * تفاوت بین لیست و ست:
 * یک لیست می تواند شامل عناصر تکراری باشد در حالی که ست فقط شامل عناصر منحصر به فرد است.
 * سلسله مراتب از کلاس HashSet:
 * کلاس HashSet کلاس AbstractSet را گسترش می دهد که رابط Set را پیاده سازی می کند.
 * رابط Set به ترتیب سلسله مراتبی از رابط های مجموعه و Iterable به ارث می برد.
 * اعلامیه کلاس HashSet:
 * public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
 * <p>
 * Constructors of Java HashSet class:
 * 1)	HashSet():
 * It is used to construct a default HashSet.
 * 2)	HashSet(int capacity):
 * It is used to initialize the capacity of the hash set to the given integer value capacity. The capacity grows automatically as elements are added to the HashSet.
 * 3)	HashSet(int capacity, float loadFactor):
 * It is used to initialize the capacity of the hash set to the given integer value capacity and the specified load factor.
 * 4)	HashSet(Collection<? extends E> c):
 * It is used to initialize the hash set by using the elements of the collection c.
 * سازندگان کلاس Java HashSet:
 * 1) HashSet ():
 * برای ساختن پیش فرض HashSet استفاده می شود.
 * 2) HashSet(int capacity):
 * برای شروع اولیه ظرفیت هش تنظیم شده به ظرفیت مقدار داده شده عدد صحیح استفاده می شود. با افزودن عناصر به HashSet ، این ظرفیت بطور خودکار رشد می کند.
 * 3) HashSet(int capacity, float loadFactor):
 * برای اولیه سازی ظرفیت هش تنظیم شده به ظرفیت مقدار داده شده عدد صحیح و ضریب بار مشخص شده استفاده می شود.
 * 4) HashSet(Collection<? extends E> c):
 * برای اولیه سازی هش تنظیم شده با استفاده از عناصر مجموعه c استفاده می شود.
 * <p>
 * Methods of Java HashSet class:
 * 1)	boolean	add(E e):
 * It is used to add the specified element to this set if it is not already present.
 * 2)	void	clear():
 * It is used to remove all of the elements from the set.
 * 3)	object	clone():
 * It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
 * 4)	boolean	contains(Object o):
 * It is used to return true if this set contains the specified element.
 * 5)	boolean	isEmpty():
 * It is used to return true if this set contains no elements.
 * 6)	Iterator<E>	iterator():
 * It is used to return an iterator over the elements in this set.
 * 7)	boolean	remove(Object o):
 * It is used to remove the specified element from this set if it is present.
 * 8)	int	size():
 * It is used to return the number of elements in the set.
 * 9)	Spliterator<E>	spliterator():
 * It is used to create a late-binding and fail-fast Spliterator over the elements in the set.
 * متدهای کلاس Java HashSet:
 * 1)	boolean	add(E e):
 * در صورت عدم وجود عنصر مشخص شده به این مجموعه استفاده می شود.
 * 2)	void	clear():
 * برای حذف همه عناصر از مجموعه استفاده می شود.
 * 3)	object	clone():
 * برای بازگشت یک نسخه کم عمق از این نمونه HashSet استفاده می شود: عناصر خود کلون نمی شوند.
 * 4)	boolean	contains(Object o):
 * اگر این مجموعه شامل عنصر مشخص شده باشد ، برای بازگشت درست استفاده می شود.
 * 5) boolean isEmpty ():
 * اگر این مجموعه فاقد عناصر باشد ، برای بازگشت درست استفاده می شود.
 * 6)	Iterator<E>	iterator():
 * برای بازگشت یک تکرارکننده بر روی عناصر موجود در این مجموعه استفاده می شود.
 * 7)	boolean	remove(Object o):
 * در صورت وجود عنصر مشخص شده از این مجموعه استفاده می شود.
 * 8)	int	size():
 * برای بازگشت تعداد عناصر موجود در مجموعه استفاده می شود.
 * 9)	Spliterator<E>	spliterator():
 * از آن برای ایجاد دستگاه تقسیم کننده اواخر اتصال و شکست سریع بر روی عناصر موجود در مجموعه استفاده می شود.
 */
public class JavaHashSet {

    public Integer ignoringDuplicateElements() {
        Set<String> set = new HashSet<>();
        set.add("Motaharinia");
        set.add("Motaharinia");
        set.add("Motaharinia");
        return set.size();
    }

    public Integer useRemoveIf(){
        Set<String> set = new HashSet<>();
        set.add("Motaharinia");
        set.add("Motahari ");
        set.add("Shima Motaharinia");
        set.add("Shima");
        set.removeIf(str->str.contains("Motahari"));
        return set.size();
    }
}
