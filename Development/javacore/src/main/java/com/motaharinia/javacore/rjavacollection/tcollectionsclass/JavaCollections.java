package com.motaharinia.javacore.rjavacollection.tcollectionsclass;

/**
 * https://www.javatpoint.com/java-collections-class
 * Java Collections class:
 * Java collection class is used exclusively with static methods that operate on or return collections.
 * It inherits Object class.
 * کلاس مجموعه جاوا:
 * کلاس مجموعه جاوا منحصراً با روش های استاتیک که روی مجموعه ها کار می کنند یا برمی گردند استفاده می شود.
 * این کلاس Object را به ارث می برد.
 *
 * The important points about Java Collections class are:
 * Java Collection class supports the polymorphic algorithms that operate on collections.
 * Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.
 * نکات مهم در مورد کلاس مجموعه جاوا عبارتند از:
 * کلاس Java Collection از الگوریتم های polymorphic که در مجموعه ها کار می کنند پشتیبانی می کند.
 * اگر کلاس مجموعه یا اشیاء کلاس ارائه شده به آنها تهی باشد ، کلاس مجموعه جاوا  NullPointerException را پرتاب می کند.
 *
 * Collections class declaration:
 * public class Collections extends Object
 *
 *
 * 1)	static <T> boolean addAll():
 * It is used to adds all of the specified elements to the specified collection.
 * 2)	static <T> Queue<T>	asLifoQueue():
 * It returns a view of a Deque as a Last-in-first-out (LIFO) Queue.
 * 3)	static <T> int	binarySearch():
 * It searches the list for the specified object and returns their position in a sorted list.
 * 4)	static <E> Collection<E>	checkedCollection():
 * It is used to returns a dynamically typesafe view of the specified collection.
 * 5)	static <E> List<E>	checkedList():
 * It is used to returns a dynamically typesafe view of the specified list.
 * 6)	static <K,V> Map<K,V>	checkedMap():
 * It is used to returns a dynamically typesafe view of the specified map.
 * 7)	static <K,V> NavigableMap<K,V>	checkedNavigableMap():
 * It is used to returns a dynamically typesafe view of the specified navigable map.
 * 8)	static <E> NavigableSet<E>	checkedNavigableSet():
 * It is used to returns a dynamically typesafe view of the specified navigable set.
 * 9)	static <E> Queue<E>	checkedQueue():
 * It is used to returns a dynamically typesafe view of the specified queue.
 * 10)	static <E> Set<E>	checkedSet():
 * It is used to returns a dynamically typesafe view of the specified set.
 * 11)	static <K,V> SortedMap<K,V>	checkedSortedMap():
 * It is used to returns a dynamically typesafe view of the specified sorted map.
 * 12)	static <E> SortedSet<E>	checkedSortedSet():
 * It is used to returns a dynamically typesafe view of the specified sorted set.
 * 13)	static <T> void	copy():
 * It is used to copy all the elements from one list into another list.
 * 14)	static boolean	disjoint():
 * It returns true if the two specified collections have no elements in common.
 * 15)	static <T> Enumeration<T>	emptyEnumeration():
 * It is used to get an enumeration that has no elements.
 * 16)	static <T> Iterator<T>	emptyIterator():
 * It is used to get an Iterator that has no elements.
 * 17)	static <T> List<T>	emptyList():
 * It is used to get a List that has no elements.
 * 18)	static <T> ListIterator<T>	emptyListIterator():
 * It is used to get a List Iterator that has no elements.
 * 19)	static <K,V> Map<K,V>	emptyMap():
 * It returns an empty map which is immutable.
 * 20)	static <K,V> NavigableMap<K,V>	emptyNavigableMap():
 * It returns an empty navigable map which is immutable.
 *21)	static <E> NavigableSet<E>	emptyNavigableSet():
 * It is used to get an empty navigable set which is immutable in nature.
 * 22)	static <T> Set<T>	emptySet():
 * It is used to get the set that has no elements.
 * 23)	static <K,V> SortedMap<K,V>	emptySortedMap():
 * It returns an empty sorted map which is immutable.
 * 24)	static <E> SortedSet<E>	emptySortedSet():
 * It is used to get the sorted set that has no elements.
 * 25)	static <T> Enumeration<T>	enumeration():
 * It is used to get the enumeration over the specified collection.
 * 26)	static <T> void	fill():
 * It is used to replace all of the elements of the specified list with the specified elements.
 * 27)	static int	frequency():
 * It is used to get the number of elements in the specified collection equal to the specified object.
 * 28)	static int	indexOfSubList():
 * It is used to get the starting position of the first occurrence of the specified target list within the specified source list. It returns -1 if there is no such occurrence in the specified list.
 * 29)	static int	lastIndexOfSubList():
 * It is used to get the starting position of the last occurrence of the specified target list within the specified source list. It returns -1 if there is no such occurrence in the specified list.
 * 30)	static <T> ArrayList<T>	list():
 * It is used to get an array list containing the elements returned by the specified enumeration in the order in which they are returned by the enumeration.
 * 31)	static <T extends Object & Comparable<? super T>> T	max():
 * It is used to get the maximum value of the given collection, according to the natural ordering of its elements.
 * 32)	static <T extends Object & Comparable<? super T>> T	min():
 * It is used to get the minimum value of the given collection, according to the natural ordering of its elements.
 * 33)	static <T> List<T>	nCopies():
 * It is used to get an immutable list consisting of n copies of the specified object.
 * 34)	static <E> Set<E>	newSetFromMap():
 * It is used to return a set backed by the specified map.
 * 35)	static <T> boolean	replaceAll():
 * It is used to replace all occurrences of one specified value in a list with the other specified value.
 * 36)	static void	reverse():
 * It is used to reverse the order of the elements in the specified list.
 * 37)	static <T> Comparator<T>	reverseOrder():
 * It is used to get the comparator that imposes the reverse of the natural ordering on a collection of objects which implement the Comparable interface.
 * 38)	static void	rotate():
 * It is used to rotate the elements in the specified list by a given distance.
 * 39)	static void	shuffle():
 * It is used to randomly reorders the specified list elements using a default randomness.
 * 40)	static <T> Set<T>	singleton():
 * It is used to get an immutable set which contains only the specified object.
 * 41)	static <T> List<T>	singletonList():
 * It is used to get an immutable list which contains only the specified object.
 * 42)	static <K,V> Map<K,V>	singletonMap():
 * It is used to get an immutable map, mapping only the specified key to the specified value.
 * 43)	static <T extends Comparable<? super T>>void	sort():
 * It is used to sort the elements presents in the specified list of collection in ascending order.
 * 44)	static void	swap():
 * It is used to swap the elements at the specified positions in the specified list.
 * 45)	static <T> Collection<T>	synchronizedCollection():
 * It is used to get a synchronized (thread-safe) collection backed by the specified collection.
 * 46)	static <T> List<T>	synchronizedList():
 * It is used to get a synchronized (thread-safe) collection backed by the specified list.
 * 47)	static <K,V> Map<K,V>	synchronizedMap():
 * It is used to get a synchronized (thread-safe) map backed by the specified map.
 * 48)	static <K,V> NavigableMap<K,V>	synchronizedNavigableMap():
 * It is used to get a synchronized (thread-safe) navigable map backed by the specified navigable map.
 * 49)	static <T> NavigableSet<T>	synchronizedNavigableSet():
 * It is used to get a synchronized (thread-safe) navigable set backed by the specified navigable set.
 * 50)	static <T> Set<T>	synchronizedSet():
 * It is used to get a synchronized (thread-safe) set backed by the specified set.
 * 51)	static <K,V> SortedMap<K,V>	synchronizedSortedMap():
 * It is used to get a synchronized (thread-safe) sorted map backed by the specified sorted map.
 * 52)	static <T> SortedSet<T>	synchronizedSortedSet():
 * It is used to get a synchronized (thread-safe) sorted set backed by the specified sorted set.
 * 53)	static <T> Collection<T>	unmodifiableCollection():
 * It is used to get an unmodifiable view of the specified collection.
 * 54)	static <T> List<T>	unmodifiableList():
 * It is used to get an unmodifiable view of the specified list.
 * 55)	static <K,V> Map<K,V>	unmodifiableMap():
 * It is used to get an unmodifiable view of the specified map.
 * 56)	static <K,V> NavigableMap<K,V>	unmodifiableNavigableMap():
 * It is used to get an unmodifiable view of the specified navigable map.
 * 57)	static <T> NavigableSet<T>	unmodifiableNavigableSet():
 * It is used to get an unmodifiable view of the specified navigable set.
 * 58)	static <T> Set<T>	unmodifiableSet():
 * It is used to get an unmodifiable view of the specified set.
 * 59)	static <K,V> SortedMap<K,V>	unmodifiableSortedMap():
 * It is used to get an unmodifiable view of the specified sorted map.
 * 60	static <T> SortedSet<T>	unmodifiableSortedSet():
 * It is used to get an unmodifiable view of the specified sorted set.
 *
 * 1)	static <T> boolean addAll():
 * برای اضافه کردن تمام عناصر مشخص شده به مجموعه مشخص شده استفاده می شود
 * 2)	static <T> Queue<T>	asLifoQueue():
 * این نمایی از یک Deque را به عنوان یک صف آخرین-در اولین مرحله (LIFO) برمی گرداند.
 * 3)	static <T> int	binarySearch():
 * این لیست در مورد شیء مشخص شده جستجو می کند و موقعیت آنها را در لیست مرتب شده برمی گرداند.
 * 4)	static <E> Collection<E>	checkedCollection():
 * از آن برای بازگرداندن یک نمای پویا از نوع مجموعه مشخص شده استفاده می شود.
 * 5)	static <E> List<E>	checkedList():
 * برای برگرداندن نمای پویا از لیست مشخص شده استفاده می شود.
 * 6)	static <K,V> Map<K,V>	checkedMap():
 * از آن برای بازگرداندن یک نمای پویا از نوع نقشه مشخص استفاده می شود.
 * 7)	static <K,V> NavigableMap<K,V>	checkedNavigableMap():
 * از آن برای بازگرداندن یک نمای پویا به طور پویا از نقشه مشخص شده ناوبری استفاده می شود.
 * 8)	static <E> NavigableSet<E>	checkedNavigableSet():
 * از آن برای بازگرداندن یک نمای پویا به طور پویا از مجموعه مشخص شده ناوبری استفاده می شود.
 * 9)	static <E> Queue<E>	checkedQueue():
 * از آن برای برگرداندن نمای پویا typafe از صف مشخص شده استفاده می شود.
 * 10)	static <E> Set<E>	checkedSet():
 * از آن برای بازگرداندن یک نمای پویا از نوع مجموعه مشخص شده استفاده می شود.
 * 11)	static <K,V> SortedMap<K,V>	checkedSortedMap():
 * از آن برای بازگرداندن یک نمای پویا از نوع نقشه مرتب شده مشخص استفاده می شود.
 * 12)	static <E> SortedSet<E>	checkedSortedSet():
 * از آن برای بازگرداندن یک نمای پویا typafe از مجموعه مرتب شده مشخص استفاده می شود.
 * 13)	static <T> void	copy():
 * برای کپی کردن همه عناصر از یک لیست به لیست دیگر استفاده می شود.
 * 14)	static boolean	disjoint():
 * اگر دو مجموعه مشخص شده هیچ عنصر مشترکی نداشته باشند ، برمی گردد.
 * 15)	static <T> Enumeration<T>	emptyEnumeration():
 * از آن برای گرفتن شماری استفاده می شود که عنصری ندارد.
 * 16)	static <T> Iterator<T>	emptyIterator():
 * از آن برای به دست آوردن یک Iterator استفاده می شود که هیچ عنصر ندارد.
 * 17)	static <T> List<T>	emptyList():
 * برای دریافت لیستی استفاده می شود که عنصری ندارد.
 * 18)	static <T> ListIterator<T>	emptyListIterator():
 * از آن برای به دست آوردن List Iterator استفاده می شود که هیچ عنصری ندارد.
 * 19)	static <K,V> Map<K,V>	emptyMap():
 * این یک نقشه خالی که غیرقابل تغییر است برمی گرداند.
 * 20)	static <K,V> NavigableMap<K,V>	emptyNavigableMap():
 * این یک نقشه ناوبری خالی که غیرقابل تغییر است برمی گرداند.
 *21)	static <E> NavigableSet<E>	emptyNavigableSet():
 * از آن برای بدست آوردن یک مجموعه ناوبری خالی استفاده می شود که در طبیعت تغییر ناپذیر است.
 * 22)	static <T> Set<T>	emptySet():
 * برای بدست آوردن مجموعه ای که هیچ عنصر ندارد استفاده می شود.
 * 23)	static <K,V> SortedMap<K,V>	emptySortedMap():
 * این نقشه مرتب سازی شده خالی را که غیرقابل تغییر است برمی گرداند.
 * 24)	static <E> SortedSet<E>	emptySortedSet():
 * برای بدست آوردن مجموعه مرتب شده ای که هیچ عنصر ندارد استفاده می شود.
 * 25)	static <T> Enumeration<T>	enumeration():
 * از آن برای بدست آوردن استناد به مجموعه مشخص شده استفاده می شود.
 * 26)	static <T> void	fill():
 * برای جایگزینی کلیه عناصر لیست مشخص شده با عناصر مشخص شده استفاده می شود.
 * 27)	static int	frequency():
 * برای بدست آوردن تعداد عناصر موجود در مجموعه مشخص شده برابر با شیء مشخص شده استفاده می شود.
 * 28)	static int	indexOfSubList():
 * برای بدست آوردن موقعیت شروع اولین وقوع لیست هدف مشخص شده در فهرست منبع مشخص شده استفاده می شود. اگر چنین اتفاقی در لیست مشخص نشده باشد -1 را برمی گرداند.
 * 29)	static int	lastIndexOfSubList():
 * برای بدست آوردن موقعیت شروع آخرین وقوع لیست هدف مشخص شده در فهرست منبع مشخص شده استفاده می شود. اگر چنین اتفاقی در لیست مشخص نشده باشد -1 را برمی گرداند.
 * 30)	static <T> ArrayList<T>	list():
 * برای بدست آوردن لیست آرایه ای شامل عناصر برگردانده شده توسط شمارش مشخص به ترتیب بازگرداندن آنها توسط شمارش استفاده می شود.
 * 31)	static <T extends Object & Comparable<? super T>> T	max():
 * برای بدست آوردن حداکثر مقدار مجموعه داده ، مطابق ترتیب طبیعی عناصر آن ، استفاده می شود.
 * 32)	static <T extends Object & Comparable<? super T>> T	min():
 * برای بدست آوردن حداقل مقدار مجموعه داده ، مطابق ترتیب طبیعی عناصر آن ، استفاده می شود.
 * 33)	static <T> List<T>	nCopies():
 * برای دریافت یک لیست تغییرناپذیر متشکل از n نسخه های شی مشخص شده استفاده می شود.
 * 34)	static <E> Set<E>	newSetFromMap():
 * برای بازگشت مجموعه ای با نقشه مشخص شده استفاده می شود.
 * 35)	static <T> boolean	replaceAll():
 * برای جایگزینی تمامی وقایع یک مقدار مشخص در یک لیست با مقدار مشخص شده دیگر استفاده می شود.
 * 36)	static void	reverse():
 * برای معکوس کردن ترتیب عناصر موجود در لیست مشخص شده استفاده می شود.
 * 37)	static <T> Comparator<T>	reverseOrder():
 * از آن برای بدست آوردن مقایسه ای استفاده می شود که معکوس سفارش طبیعی را بر مجموعه ای از اشیاء که واسط مقایسه ای را پیاده سازی می کنند تحمیل می کند.
 * 38)	static void	rotate():
 * برای چرخش عناصر در لیست مشخص شده با فاصله مشخص استفاده می شود.
 * 39)	static void	shuffle():
 * این مورد برای تنظیم مجدد عناصر لیست مشخص شده با استفاده از تصادفی پیش فرض استفاده می شود.
 * 40)	static <T> Set<T>	singleton():
 * از آن برای بدست آوردن یک مجموعه تغییرناپذیر استفاده می شود که فقط شامل شیء مشخص شده است.
 * 41)	static <T> List<T>	singletonList():
 * از آن برای بدست آوردن لیست تغییرناپذیری استفاده می شود که فقط شامل شیء مشخص شده است.
 * 42)	static <K,V> Map<K,V>	singletonMap():
 * برای گرفتن نقشه غیرقابل تغییر استفاده می شود و فقط از کلید مشخص شده به مقدار مشخص شده نقشه برداری می کند.
 * 43)	static <T extends Comparable<? super T>>void	sort():
 * برای مرتب سازی عناصر ارائه شده در لیست مشخص شده مجموعه به ترتیب صعودی استفاده می شود.
 * 44)	static void	swap():
 * برای مبادله عناصر در موقعیت های مشخص شده در لیست مشخص شده استفاده می شود.
 * 45)	static <T> Collection<T>	synchronizedCollection():
 * این برای بدست آوردن یک مجموعه هماهنگ (بدون ایمن موضوع) با پشتیبانی از مجموعه مشخص شده استفاده می شود.
 * 46)	static <T> List<T>	synchronizedList():
 * برای بدست آوردن یک مجموعه هماهنگ (بدون ایمن موضوع) با پشتیبانی از لیست مشخص شده ، استفاده می شود.
 * 47)	static <K,V> Map<K,V>	synchronizedMap():
 * برای تهیه نقشه هماهنگ شده (بدون ایمن موضوع) که توسط نقشه مشخص شده پشتیبانی می شود ، استفاده می شود.
 * 48)	static <K,V> NavigableMap<K,V>	synchronizedNavigableMap():
 * از آن برای به دست آوردن نقشه قابل مرور هماهنگ (بدون ایمن موضوع) پشتیبانی شده توسط نقشه مشخص شده جهت یابی استفاده می شود.
 * 49)	static <T> NavigableSet<T>	synchronizedNavigableSet():
 * از آن برای به دست آوردن یک مجموعه ناوبری هماهنگ (بدون ایمن) پشتیبانی شده توسط مجموعه مشخص شده در حالت ناوبری استفاده می شود.
 * 50)	static <T> Set<T>	synchronizedSet():
 * برای بدست آوردن یک مجموعه هماهنگ شده (ایمن از نخ) با پشتیبان مجموعه مشخص شده استفاده می شود.
 * 51)	static <K,V> SortedMap<K,V>	synchronizedSortedMap():
 * از آن برای به دست آوردن نقشه مرتب شده هماهنگ (بدون ایمن موضوع) پشتیبانی شده توسط نقشه مرتب شده مشخص استفاده می شود.
 * 52)	static <T> SortedSet<T>	synchronizedSortedSet():
 * از آن برای بدست آوردن یک مجموعه مرتب شده هماهنگ (بدون ایمن موضوع) با پشتیبانی از مجموعه مرتب شده مشخص استفاده می شود.
 * 53)	static <T> Collection<T>	unmodifiableCollection():
 * برای بدست آوردن نمایی غیرقابل اصلاح از مجموعه مشخص شده استفاده می شود.
 * 54)	static <T> List<T>	unmodifiableList():
 * برای بدست آوردن نمایی غیرقابل اصلاح از لیست مشخص شده استفاده می شود.
 * 55)	static <K,V> Map<K,V>	unmodifiableMap():
 * از آن برای بدست آوردن نمایی غیرقابل تغییر از نقشه مشخص شده استفاده می شود.
 * 56)	static <K,V> NavigableMap<K,V>	unmodifiableNavigableMap():
 * از آن برای بدست آوردن یک منظره تغییرناپذیر از نقشه مشخص شده ناوبری استفاده می شود.
 * 57)	static <T> NavigableSet<T>	unmodifiableNavigableSet():
 * از آن برای بدست آوردن نمایی غیرقابل اصلاح از مجموعه پیمایش شده مشخص استفاده می شود.
 * 58)	static <T> Set<T>	unmodifiableSet():
 * برای بدست آوردن نمایی غیرقابل اصلاح از مجموعه مشخص شده استفاده می شود.
 * 59)	static <K,V> SortedMap<K,V>	unmodifiableSortedMap():
 * از آن برای بدست آوردن یک نمای اصلاح نشده از نقشه مرتب شده مشخص استفاده می شود.
 * 60	static <T> SortedSet<T>	unmodifiableSortedSet():
 * از آن برای بدست آوردن یک نمای اصلاح نشده از مجموعه مرتب شده مشخص استفاده می شود.
 */
public class JavaCollections {
}
