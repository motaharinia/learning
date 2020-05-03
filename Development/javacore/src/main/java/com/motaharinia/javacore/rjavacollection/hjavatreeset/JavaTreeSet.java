package com.motaharinia.javacore.rjavacollection.hjavatreeset;

import java.util.TreeSet;

/**
 * https://www.javatpoint.com/java-treeset
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 * It inherits AbstractSet class and implements the NavigableSet interface.
 * The objects of the TreeSet class are stored in ascending order.
 * The important points about Java TreeSet class are:
 * Java TreeSet class contains unique elements only like HashSet.
 * Java TreeSet class access and retrieval times are quiet fast.
 * Java TreeSet class doesn't allow null element.
 * Java TreeSet class is non synchronized.
 * Java TreeSet class maintains ascending order.
 * کلاس Java TreeSet واسط تنظیماتی را که از درخت برای ذخیره سازی استفاده می کند ، پیاده سازی می کند.
 * این کلاس AbstractSet را به ارث می برد و رابط NavigableSet را پیاده سازی می کند.
 * اشیاء از کلاس TreeSet به ترتیب صعودی ذخیره می شوند.
 * نکات مهم در مورد کلاس Java TreeSet عبارتند از:
 * کلاس Java TreeSet شامل عناصر منحصر به فرد فقط مانند HashSet است.
 * زمان دسترسی و بازیابی کلاس TreeSet کاملا سریع است.
 * کلاس Java TreeSet به عنصر تهی اجازه نمی دهد.
 * کلاس Java TreeSet هماهنگ نیست.
 * کلاس Java TreeSet ترتیب صعودی را حفظ می کند.
 * <p>
 * Hierarchy of TreeSet class:
 * As shown in the above diagram, Java TreeSet class implements the NavigableSet interface.
 * The NavigableSet interface extends SortedSet, Set, Collection and Iterable interfaces in hierarchical order.
 * سلسله مراتب از کلاس TreeSet:
 * همانطور که در نمودار بالا نشان داده شده است ، کلاس Java TreeSet رابط NavigableSet را پیاده سازی می کند.
 * رابط NavigableSet رابط SortedSet ، Set ، Collection و Iterable را به ترتیب سلسله مراتبی گسترش می دهد.
 * <p>
 * TreeSet class declaration:
 * Let's see the declaration for java.util.TreeSet class.
 * public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
 * <p>
 * Constructors of Java TreeSet class:
 * TreeSet():
 * It is used to construct an empty tree set that will be sorted in ascending order according to the natural order of the tree set.
 * TreeSet(Collection<? extends E> c):
 * It is used to build a new tree set that contains the elements of the collection c.
 * TreeSet(Comparator<? super E> comparator):
 * It is used to construct an empty tree set that will be sorted according to given comparator.
 * TreeSet(SortedSet<E> s):
 * It is used to build a TreeSet that contains the elements of the given SortedSet.
 * سازندگان کلاس Java TreeSet:
 * TreeSet ():
 * از آن برای ساخت یک مجموعه درخت خالی استفاده می شود که طبق ترتیب طبیعی مجموعه درخت طبق ترتیب صعودی مرتب می شوند.
 * TreeSet(Collection<? extends E> c):
 * برای ساخت یک مجموعه درخت جدید که شامل عناصر مجموعه c است ، استفاده می شود.
 * TreeSet(Comparator<? super E> comparator):
 * از آن برای ساخت یک مجموعه درخت خالی استفاده می شود که مطابق با مقایسه سازنده مرتب می شود.
 * TreeSet(SortedSet<E> s):
 * برای ساختن یک TreeSet استفاده می شود که شامل عناصر SortedSet داده شده است.
 * <p>
 * Methods of Java TreeSet class:
 * boolean add(E e):
 * It is used to add the specified element to this set if it is not already present.
 * boolean addAll(Collection<? extends E> c):
 * It is used to add all of the elements in the specified collection to this set.
 * E ceiling(E e):
 * It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
 * Comparator<? super E> comparator():
 * It returns comparator that arranged elements in order.
 * Iterator descendingIterator():
 * It is used iterate the elements in descending order.
 * NavigableSet descendingSet():
 * It returns the elements in reverse order.
 * E floor(E e):
 * It returns the equal or closest least element of the specified element from the set, or null there is no such element.
 * SortedSet headSet(E toElement):
 * It returns the group of elements that are less than the specified element.
 * NavigableSet headSet(E toElement, boolean inclusive):
 * It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
 * E higher(E e):
 * It returns the closest greatest element of the specified element from the set, or null there is no such element.
 * Iterator iterator():
 * It is used to iterate the elements in ascending order.
 * E lower(E e):
 * It returns the closest least element of the specified element from the set, or null there is no such element.
 * E pollFirst():
 * It is used to retrieve and remove the lowest(first) element.
 * E pollLast():
 * It is used to retrieve and remove the highest(last) element.
 * Spliterator spliterator():
 * It is used to create a late-binding and fail-fast spliterator over the elements.
 * NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive):
 * It returns a set of elements that lie between the given range.
 * SortedSet subSet(E fromElement, E toElement)):
 * It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
 * SortedSet tailSet(E fromElement):
 * It returns a set of elements that are greater than or equal to the specified element.
 * NavigableSet tailSet(E fromElement, boolean inclusive):
 * It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
 * boolean contains(Object o):
 * It returns true if this set contains the specified element.
 * boolean isEmpty():
 * It returns true if this set contains no elements.
 * boolean remove(Object o):
 * It is used to remove the specified element from this set if it is present.
 * void clear():
 * It is used to remove all of the elements from this set.
 * Object clone():
 * It returns a shallow copy of this TreeSet instance.
 * E first():
 * It returns the first (lowest) element currently in this sorted set.
 * E last():
 * It returns the last (highest) element currently in this sorted set.
 * int size():
 * It returns the number of elements in this set.
 * <p>
 * روشهای کلاس Java TreeSet:
 * boolean add(E e):
 * در صورت عدم وجود عنصر مشخص شده در این مجموعه استفاده می شود.
 * boolean addAll(Collection<? extends E> c):
 * برای اضافه کردن تمام عناصر موجود در مجموعه مشخص شده به این مجموعه استفاده می شود.
 * E ceiling(E e):
 * این عنصر مساوی یا نزدیکترین بزرگترین عنصر مشخص شده را از مجموعه برمی گرداند ، یا تهی چنین عنصری را ندارد.
 * Comparator<? super E> comparator():
 * این مقایسه کننده را که عناصر مرتب شده را به ترتیب باز می گرداند.
 * Iterator descendingIterator():
 * از این عناصر به ترتیب نزولی استفاده می شود.
 * NavigableSet descendingSet():
 * این عناصر را به ترتیب معکوس برمی گرداند.
 * E floor(E e):
 * این عنصر برابر یا نزدیکترین کمترین عنصر مشخص را از مجموعه برمی گرداند ، یا تهی وجود ندارد که چنین عنصری داشته باشد.
 * SortedSet headSet(E toElement):
 * این گروه عناصر کمتری از عنصر مشخص شده را برمی گرداند.
 * NavigableSet headSet(E toElement, boolean inclusive):
 * این عنصر مشخص شده را کمتر یا مساوی می کند (در صورت صحیح بودن).
 * E higher(E e):
 * این نزدیکترین بزرگترین عنصر مشخص شده را از مجموعه باز می گرداند ، یا اصلاً چنین عنصری وجود ندارد.
 * Iterator iterator():
 * برای تکرار عناصر به ترتیب صعودی استفاده می شود.
 * E lower(E e):
 * این نزدیکترین کمترین عنصر مشخص شده را از مجموعه برمی گرداند ، یا اصلاً چنین عنصری وجود ندارد.
 * E pollFirst():
 * برای بازیابی و حذف پایین ترین (اولین) عنصر استفاده می شود.
 * E pollLast():
 * برای بازیابی و حذف بالاترین (آخرین) عنصر استفاده می شود.
 * Spliterator spliterator():
 * از آن برای ایجاد یک تقسیم کننده تقسیم کننده و اتصال سریع به سرعت بر روی عناصر استفاده می شود.
 * NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive):
 * این مجموعه ای از عناصر را که بین دامنه داده شده قرار دارد برمی گرداند.
 * SortedSet subSet(E fromElement, E toElement)):
 * این مجموعه ای از عناصر را که بین دامنه معین قرار دارد ، باز می گرداند که شامل عنصر (EELE) و خارج از (EM) است.
 * SortedSet tailSet(E fromElement):
 * مجموعه ای از عناصر را که بیشتر یا مساوی عنصر مشخص شده است برمی گرداند.
 * NavigableSet tailSet(E fromElement, boolean inclusive):
 * این مجموعه عناصر را که بزرگتر از یا مساوی هستند (در صورت صحیح بودن) عنصر مشخص شده را برمی گرداند.
 * boolean contains(Object o):
 * اگر این مجموعه شامل عنصر مشخص شده باشد ، درست برمی گردد.
 * boolean isEmpty():
 * اگر این مجموعه حاوی عناصری نباشد ، درست برمی گردد.
 * boolean remove(Object o)
 * در صورت وجود عنصر مشخص شده از این مجموعه استفاده می شود.
 * void clear():
 * برای حذف کلیه عناصر از این مجموعه استفاده می شود.
 * Object clone():
 * این یک کپی کم عمق از این نمونه TreeSet را برمی گرداند.
 * E first():
 * این اولین (پایین ترین) عنصر موجود در این مجموعه مرتب شده را برمی گرداند.
 * E last():
 * آخرین (بالاترین) عنصر فعلی در این مجموعه مرتب شده را برمی گرداند.
 * int size():
 * تعداد عناصر موجود در این مجموعه را برمی گرداند.
 */
public class JavaTreeSet {
    public String navigableSet() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");

        //[A, B, C, D, E, F, G]
        System.out.println(set.toString());
        String result = set
                .descendingSet() //[G, F, E, D, C, B, A]
                .headSet("B", true) //[G, F, E, D, C, B]
                .subSet("F", false, "B", true) //[E, D, C, B]
                .tailSet("D", false)//[C, B]
                .toString();
        return result;
    }
}
