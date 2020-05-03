package com.motaharinia.javacore.rjavacollection.acollectionframework;

import java.util.*;

/**
 * https://www.javatpoint.com/collections-in-java
 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 * Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
 * Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
 * مجموعه در جاوا چارچوبی است که معماری را برای ذخیره و دستکاری گروه اشیاء فراهم می کند.
 * مجموعه های جاوا می توانند به کلیه عملیاتی که انجام می دهید بر روی داده هایی مانند جستجو ، مرتب سازی ، درج ، دستکاری و حذف دست یابند.
 * مجموعه جاوا به معنی واحد تکی از اشیاء است. چارچوب مجموعه جاوا مجموعه واسطهای زیادی (ست ، لیست ، صف ، دایك) و کلاس ها (ArrayList ، Vector ، LinkedList ، PriorityQueue ، HashSet ، LinkedHashSet ، TreeSet) را در اختیار شما قرار می دهد.
 * <p>
 * What is Collection in Java:
 * A Collection represents a single unit of objects, i.e., a group.
 * What is a framework in Java:
 * It provides readymade architecture.
 * It represents a set of classes and interfaces.
 * It is optional.
 * What is Collection framework:
 * The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
 * 1.Interfaces and its implementations, i.e., classes
 * 2.Algorithm
 * مجموعه در جاوا چیست:
 * یک مجموعه نمایانگر یک واحد تکی از اشیاء است ، مثلا یک گروه.
 * چارچوب در جاوا چیست:
 * این معماری آماده را ارائه می دهد.
 * این مجموعه ای از کلاس ها و رابط ها را نشان می دهد.
 * اختیاری است
 * چارچوب مجموعه چیست:
 * چارچوب مجموعه یک معماری یکپارچه برای ذخیره و دستکاری گروهی از اشیاء را نشان می دهد. این دارد:
 * 1- رابطها و پیاده سازیهای آن ، یعنی کلاسها
 * 2. الگوریتم
 * <p>
 * Methods of Collection interface:
 * 1	public boolean add(E e):
 * It is used to insert an element in this collection.
 * 2	public boolean addAll(Collection<? extends E> c):
 * It is used to insert the specified collection elements in the invoking collection.
 * 3	public boolean remove(Object element):
 * It is used to delete an element from the collection.
 * 4	public boolean removeAll(Collection<?> c):
 * It is used to delete all the elements of the specified collection from the invoking collection.
 * 5	default boolean removeIf(Predicate<? super E> filter):
 * It is used to delete all the elements of the collection that satisfy the specified predicate.
 * 6	public boolean retainAll(Collection<?> c):
 * It is used to delete all the elements of invoking collection except the specified collection.
 * 7	public int size():
 * It returns the total number of elements in the collection.
 * 8	public void clear():
 * It removes the total number of elements from the collection.
 * 9	public boolean contains(Object element):
 * It is used to search an element.
 * 10	public boolean containsAll(Collection<?> c):
 * It is used to search the specified collection in the collection.
 * 11	public Iterator iterator():
 * It returns an iterator.
 * 12	public Object[] toArray():
 * It converts collection into array.
 * 13	public <T> T[] toArray(T[] a):
 * It converts collection into array. Here, the runtime type of the returned array is that of the specified array.
 * 14	public boolean isEmpty():
 * It checks if collection is empty.
 * 15	default Stream<E> parallelStream():
 * It returns a possibly parallel Stream with the collection as its source.
 * 16	default Stream<E> stream():
 * It returns a sequential Stream with the collection as its source.
 * 17	default Spliterator<E> spliterator():
 * It generates a Spliterator over the specified elements in the collection.
 * 18	public boolean equals(Object element):
 * It matches two collections.
 * 19	public int hashCode():
 * It returns the hash code number of the collection.
 * متد های رابط مجموعه:
 * 1	public boolean add(E e):
 * برای درج یک عنصر در این مجموعه استفاده می شود.
 * 2	public boolean addAll(Collection<? extends E> c):
 * برای قرار دادن عناصر مجموعه مشخص شده در مجموعه فراخوان استفاده می شود.
 * 3	public boolean remove(Object element):
 * برای حذف یک عنصر از مجموعه استفاده می شود.
 * 4	public boolean removeAll(Collection<?> c):
 * برای حذف کلیه عناصر مجموعه مشخص شده از مجموعه فراخوان استفاده می شود.
 * 5	default boolean removeIf(Predicate<? super E> filter):
 * از آن برای حذف کلیه عناصر مجموعه که گزاره مشخص شده را راضی می کنند استفاده می شود.
 * 6	public boolean retainAll(Collection<?> c):
 * برای حذف کلیه عناصر فراخوانی مجموعه به جز مجموعه مشخص شده استفاده می شود.
 * 7	public int size():
 * تعداد کل عناصر موجود در مجموعه را برمی گرداند.
 * 8	public void clear():
 * تعداد کل عناصر را از مجموعه حذف می کند.
 * 9	public boolean contains(Object element):
 * برای جستجوی یک عنصر استفاده می شود.
 * 10	public boolean containsAll(Collection<?> c):
 * برای جستجوی مجموعه مشخص شده در مجموعه استفاده می شود.
 * 11	public Iterator iterator():
 * یک تکرار کننده را برمی گرداند.
 * 12	public Object[] toArray():
 * این مجموعه را به آرایه تبدیل می کند.
 * 13	public <T> T[] toArray(T[] a):
 * این مجموعه را به آرایه تبدیل می کند. در اینجا ، نوع زمان اجرای آرایه بازده همان آرایه مشخص شده است.
 * 14	public boolean isEmpty():
 * بررسی می کند اگر مجموعه خالی باشد.
 * 15	default Stream<E> parallelStream():
 * این یک جریان احتمالاً موازی با مجموعه را به عنوان منبع خود برمی گرداند.
 * 16	default Stream<E> stream():
 * این یک جریان متوالی را با مجموعه به عنوان منبع خود برمی گرداند.
 * 17	default Spliterator<E> spliterator():
 * تقسیم کننده را بر روی عناصر مشخص شده در مجموعه تولید می کند.
 * 18	public boolean equals(Object element):
 * این دو مجموعه مطابقت دارد.
 * 19	public int hashCode():
 * شماره کد هش مجموعه را برمی گرداند.
 * <p>
 * Iterator interface:
 * Iterator interface provides the facility of iterating the elements in a forward direction only.
 * Methods of Iterator interface:
 * 1	public boolean hasNext():
 * It returns true if the iterator has more elements otherwise it returns false.
 * 2	public Object next():
 * It returns the element and moves the cursor pointer to the next element.
 * 3	public void remove():
 * It removes the last elements returned by the iterator. It is less used.
 * رابط Iterator:
 * رابط Iterator امکان تکرار عناصر را فقط در جهت رو به جلو فراهم می کند.
 * متد های رابط Iterator:
 * 1	public boolean hasNext():
 * اگر تکرار کننده عناصر بیشتری داشته باشد ، صادق است ، در غیر این صورت نادرست باز می گردد.
 * 2	public Object next():
 * این عنصر را برمی گرداند و نشانگر مکان نما را به عنصر بعدی منتقل می کند.
 * 3	public void remove():
 * آخرین عناصر بازگشت داده شده توسط تکرار را حذف می کند. کمتر استفاده می شود.
 * <p>
 * Iterable Interface
 * The Iterable interface is the root interface for all the collection classes.
 * The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.
 * It contains only one abstract method.
 * Iterator<T> iterator()
 * It returns the iterator over the elements of type T.
 * رابط Iterable:
 * رابط Iterable واسط اصلی برای کلیه کلاسهای مجموعه است.
 * رابط مجموعه رابط Iterable را گسترش می دهد و بنابراین تمام زیر کلاس های رابط Collection رابط Iterable را نیز پیاده سازی می کند.
 * فقط یک روش انتزاعی دارد.
 * Iterator<T> iterator()
 * این iterator را بر روی عناصر نوع T برمی گرداند.
 * <p>
 * Collection Interface
 * The Collection interface is the interface which is implemented by all the classes in the collection framework.
 * It declares the methods that every collection will have.
 * In other words, we can say that the Collection interface builds the foundation on which the collection framework depends.
 * Some of the methods of Collection interface are Boolean add ( Object obj), Boolean addAll ( Collection c), void clear(), etc.
 * which are implemented by all the subclasses of Collection interface.
 * رابط مجموعه
 * رابط مجموعه واسط است که توسط کلیه کلاسها در چارچوب مجموعه اجرا می شود.
 * این متدهایی را که هر مجموعه خواهد داشت اعلام می کند.
 * به عبارت دیگر ، می توان گفت که رابط مجموعه پایه ای را که بستگی به مجموعه آن دارد ، می سازد.
 * برخی از متدهای رابط مجموعه عبارتند از:Boolean add ( Object obj), Boolean addAll ( Collection c), void clear() و غیره
 * که توسط همه زیرمجموعه های رابط مجموعه اجرا می شود
 * <p>
 * List Interface:
 * List interface is the child interface of Collection interface.
 * It inhibits a list type data structure in which we can store the ordered collection of objects.
 * It can have duplicate values.
 * List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
 * To instantiate the List interface, we must use :
 * List <data-type> list1= new ArrayList();
 * List <data-type> list2 = new LinkedList();
 * List <data-type> list3 = new Vector();
 * List <data-type> list4 = new Stack();
 * There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
 * The classes that implement the List interface are given below.
 * رابط لیست:
 * رابط لیست رابط کودک رابط مجموعه است.
 * این یک ساختار داده از نوع لیست را مهار می کند که در آن می توان مجموعه سفارش داده شده اشیاء را ذخیره کرد.
 * می تواند مقادیر تکراری داشته باشد.
 * رابط لیست توسط کلاسهای ArrayList ، LinkedList ، Vector و Stack پیاده سازی می شود.
 * برای نمونه گیری کردن رابط List ، باید از موارد زیر استفاده کنیم:
 * List <data-type> list1= new ArrayList();
 * List <data-type> list2 = new LinkedList();
 * List <data-type> list3 = new Vector();
 * List <data-type> list4 = new Stack();
 * متد های مختلفی در رابط List وجود دارد که می توان از آنها برای درج ، حذف و دسترسی به عناصر از لیست استفاده کرد.
 * کلاسهایی که رابط List را پیاده سازی می کنند در زیر آورده شده است.
 * <p>
 * ArrayList:
 * The ArrayList class implements the List interface.
 * It uses a dynamic array to store the duplicate element of different data types.
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed.
 * ArrayList:
 * کلاس ArrayList رابط List را پیاده سازی می کند.
 * از یک آرایه پویا برای ذخیره عنصر تکراری انواع مختلف داده استفاده می کند.
 * کلاس ArrayList ترتیب درج را حفظ می کند و همزمان نیست.
 * به عناصر ذخیره شده در کلاس ArrayList می توان به طور تصادفی دسترسی داشت.
 * <p>
 * LinkedList:
 * LinkedList implements the Collection interface.
 * It uses a doubly linked list internally to store the elements.
 * It can store the duplicate elements.
 * It maintains the insertion order and is not synchronized.
 * In LinkedList, the manipulation is fast because no shifting is required.
 * LinkedList:
 * کلاس LinkedList رابط مجموعه را پیاده سازی می کند.
 * برای ذخیره عناصر از یک لیست مضاعف به هم پیوسته استفاده می کند.
 * این می تواند عناصر تکراری را ذخیره کند.
 * این دستور ترتیب درج را حفظ می کند و همزمان نمی باشد.
 * در LinkedList ، دستکاری سریع است زیرا نیازی به تغییر نیست.
 * <p>
 * Vector:
 * Vector uses a dynamic array to store the data elements.
 * It is similar to ArrayList.
 * However, It is synchronized and contains many methods that are not the part of Collection framework.
 * وکتور:
 * وکتور برای ذخیره عناصر داده از یک آرایه پویا استفاده می کند.
 * این شبیه به ArrayList است.
 * با این حال ، این همگام سازی است و شامل متد های بسیاری است که جزئی از چارچوب Collection نیست.
 * <p>
 * Stack:
 * The stack is the subclass of Vector.
 * It implements the last-in-first-out data structure, i.e., Stack.
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
 * پشته:
 * پشته زیرکلاس وکتور است.
 * این ساختار داده last-in-first-out ، برای مثال Stack را پیاده سازی می کند.
 * پشته شامل کلیه متدهای کلاس وکتور می باشد و همچنین متدهای آن مانند boolean push(), boolean peek(), boolean push(object o) را ارائه می دهد که خواص آن را تعریف می کند.
 * <p>
 * Queue Interface:
 * Queue interface maintains the first-in-first-out order.
 * It can be defined as an ordered list that is used to hold the elements which are about to be processed.
 * There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
 * Queue interface can be instantiated as:
 * Queue<String> q1 = new PriorityQueue();
 * Queue<String> q2 = new ArrayDeque();
 * There are various classes that implement the Queue interface, some of them are given below.
 * رابط صف:
 * رابط کاربری صف نظم first-in-first-out  را حفظ می کند.
 * می توان آن را به عنوان یک لیست مرتب شده تعریف کرد که برای نگه داشتن عناصر مورد پردازش مورد استفاده قرار می گیرد.
 * کلاسهای مختلفی مانند PriorityQueue ، Deque و ArrayDeque وجود دارد که رابط Queue را پیاده سازی می کند.
 * نمونه گیری از رابط صف به صورت زیر میتواند انجام شود:
 * Queue<String> q1 = new PriorityQueue();
 * Queue<String> q2 = new ArrayDeque();
 * کلاسهای مختلفی وجود دارد که رابط Queue را پیاده سازی می کند ، برخی از آنها در زیر آورده شده است.
 * <p>
 * PriorityQueue:
 * The PriorityQueue class implements the Queue interface.
 * It holds the elements or objects which are to be processed by their priorities.
 * PriorityQueue doesn't allow null values to be stored in the queue.
 * PriorityQueue:
 * کلاس PriorityQueue رابط Queue را پیاده سازی می کند.
 * این عناصر یا اشیایی را که باید با اولویت هایشان پردازش شوند ، در اختیار دارد.
 * کلاس PriorityQueue اجازه نمی دهد مقادیر تهی در صف ذخیره شوند.
 * <p>
 * Deque Interface:
 * Deque interface extends the Queue interface.
 * In Deque, we can remove and add the elements from both the side.
 * Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
 * رابط Deque:
 * رابط کاربری Deque رابط Queue را گسترش می دهد.
 * در Deque می توانیم از هر دو طرف عناصر را حذف کرده و اضافه کنیم.
 * کلاس Deque مخفف صف دو انتهایی است که ما را قادر می سازد عملیات را در هر دو انتها انجام دهیم.
 * <p>
 * ArrayDeque:
 * ArrayDeque class implements the Deque interface.
 * It facilitates us to use the Deque.
 * Unlike queue, we can add or delete the elements from both the ends.
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 * ArrayDeque:
 * کلاس ArrayDeque رابط Deque را پیاده سازی می کند.
 * این ما را به استفاده از Deque تسهیل می کند.
 * بر خلاف صف ، می توانیم عناصر را از هر دو انتها اضافه یا حذف کنیم.
 * کلاس ArrayDeque سریعتر از ArrayList و Stack است و محدودیت ظرفیتی ندارد.
 * <p>
 * Set Interface:
 * Set Interface in Java is present in java.util package.
 * It extends the Collection interface.
 * It represents the unordered set of elements which doesn't allow us to store the duplicate items.
 * We can store at most one null value in Set.
 * Set is implemented by HashSet, LinkedHashSet, and TreeSet.
 * رابط ست:
 * رابط ست در جاوا در بسته java.util موجود است.
 * این رابط مجموعه را گسترش می دهد.
 * ست عناصر بدون هماهنگی را نشان می دهد که به ما امکان نمی دهد موارد تکراری را ذخیره کنیم.
 * ما می توانیم حداکثر یک مقدار صفر را در ست ذخیره کنیم.
 * ست توسط HashSet ، LinkedHashSet و TreeSet پیاده سازی شده است.
 * <p>
 * HashSet:
 * HashSet class implements Set Interface.
 * It represents the collection that uses a hash table for storage.
 * Hashing is used to store the elements in the HashSet.
 * It contains unique items.
 * HashSet:
 * کلاس HashSet رابط ست را پیاده سازی میکند.
 * این مجموعه ای است که از یک جدول هش برای ذخیره سازی استفاده می کند.
 * از hashing برای ذخیره عناصر در HashSet استفاده می شود.
 * این شامل موارد منحصر به فرد است.
 * <p>
 * LinkedHashSet:
 * LinkedHashSet class represents the LinkedList implementation of Set Interface.
 * It extends the HashSet class and implements Set interface.
 * Like HashSet, It also contains unique elements.
 * It maintains the insertion order and permits null elements.
 * LinkedHashSet:
 * کلاس LinkedHashSet بیانگر اجرای LinkedList از Set Interface است.
 * این کلاس HashSet را گسترش می دهد و رابط Set را پیاده سازی می کند.
 * مانند HashSet ، این عناصر همچنین حاوی عناصر منحصر به فرد است.
 * این دستور نظم درج را حفظ می کند و به عناصر null اجازه می دهد.
 * <p>
 * SortedSet Interface:
 * SortedSet is the alternate of Set interface that provides a total ordering on its elements.
 * The elements of the SortedSet are arranged in the increasing (ascending) order.
 * The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
 * The SortedSet can be instantiated as:
 * SortedSet<data-type> set = new TreeSet();
 * رابط SortedSet:
 * یک SortedSet جایگزین رابط Set است که ترتیب کاملی از عناصر آن ارائه می دهد.
 * عناصر SortedSet به ترتیب در حال افزایش (صعودی) مرتب می شوند.
 * در SortedSet متدهای اضافی را فراهم می آورد که مانع ترتیب طبیعی عناصر می شود.
 * نمونه گیری از رابط SortedSet به صورت زیر میتواند انجام شود:
 * SortedSet<data-type> set = new TreeSet();
 * <p>
 * TreeSet:
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 * Like HashSet, TreeSet also contains unique elements.
 * However, the access and retrieval time of TreeSet is quite fast.
 * The elements in TreeSet stored in ascending order.
 * TreeSet:
 * کلاس Java TreeSet رابط ست را که از درخت برای ذخیره سازی استفاده می کند ، پیاده سازی می کند.
 * مانند HashSet ، TreeSet همچنین حاوی عناصر منحصر به فرد است.
 * با این حال ، زمان دستیابی و بازیابی TreeSet بسیار سریع است.
 * عناصر موجود در TreeSet به ترتیب صعودی ذخیره می شوند.
 */
public class CollectionFramework {
    public Boolean checkValueIsExistInArrayList(String value) {
        //Creating ArrayList
        ArrayList<String> list = new ArrayList<String>();
        //Adding object in arraylist
        list.add("Motaharinia");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }


    public Boolean checkValueIsExistInLinkedList(String value) {
        //Creating LinkedList
        LinkedList<String> list=new LinkedList<String>();
        //Adding object in arraylist
        list.add("Motaharinia");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkValueIsExistInVector(String value) {
        //Creating Vector
        Vector<String> vector=new Vector<String>();
        //Adding object in arraylist
        vector.add("Motaharinia");
        vector.add("Vijay");
        vector.add("Ravi");
        vector.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = vector.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkValueIsExistInStack(String value) {
        //Creating Stack
        Stack<String> stack = new Stack<String>();
        //Adding object in arraylist
        stack.add("Motaharinia");
        stack.add("Vijay");
        stack.add("Ravi");
        stack.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = stack.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }


    public Boolean checkValueIsExistInPriorityQueue(String value) {
        //Creating PriorityQueue
        PriorityQueue<String> priorityQueue=new PriorityQueue<String>();
        //Adding object in arraylist
        priorityQueue.add("Motaharinia");
        priorityQueue.add("Vijay");
        priorityQueue.add("Ravi");
        priorityQueue.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkValueIsExistInArrayDeque(String value) {
        //Creating ArrayDeque
        Deque<String> deque = new ArrayDeque<String>();
        //Adding object in arraylist
        deque.add("Motaharinia");
        deque.add("Vijay");
        deque.add("Ravi");
        deque.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = deque.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }


    public Boolean checkValueIsExistInHashSet(String value) {
        //Creating HashSet
        HashSet<String> hashSet=new HashSet<String>();
        //Adding object in arraylist
        hashSet.add("Motaharinia");
        hashSet.add("Vijay");
        hashSet.add("Ravi");
        hashSet.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }


    public Boolean checkValueIsExistInLinkedHashSet(String value) {
        //Creating LinkedHashSet
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        //Adding object in arraylist
        linkedHashSet.add("Motaharinia");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = linkedHashSet.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }


    public Boolean checkValueIsExistInTreeSet(String value) {
        //Creating TreeSet
        TreeSet<String> treeSet=new TreeSet<String>();
        //Adding object in arraylist
        treeSet.add("Motaharinia");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = treeSet.iterator();
        while (itr.hasNext()) {
            if (value.equals(itr.next())) {
                return true;
            }
        }
        return false;
    }
}
