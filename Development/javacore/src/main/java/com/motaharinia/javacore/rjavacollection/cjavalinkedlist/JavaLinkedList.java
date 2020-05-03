package com.motaharinia.javacore.rjavacollection.cjavalinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * https://www.javatpoint.com/java-linkedlist
 * Java LinkedList class uses a doubly linked list to store the elements.
 * It provides a linked-list data structure.
 * It inherits the AbstractList class and implements List and Deque interfaces.
 * The important points about Java LinkedList are:
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 * Java LinkedList class can be used as a list, stack or queue.
 * کلاس Java LinkedList برای ذخیره عناصر از یک لیست لینک شده Doubly استفاده می کند.
 * این یک ساختار داده با لیست مرتبط را ارائه می دهد.
 * این کلاس AbstractList را به ارث می برد و رابط های List و Deque را پیاده سازی می کند.
 * نکات مهم در مورد Java LinkedList عبارتند از:
 * کلاس Java LinkedList می تواند شامل عناصر تکراری باشد.
 * کلاس Java LinkedList ترتیب درج را حفظ می کند.
 * کلاس Java LinkedList کلاس synchronized نیست.
 * در کلاس Java LinkedList ، دستکاری سریع است زیرا نیازی به تغییر نیست.
 * کلاس Java LinkedList را می توان به عنوان یک لیست ، پشته یا صف استفاده کرد.
 * <p>
 * Doubly Linked List:
 * In the case of a doubly linked list, we can add or remove elements from both sides.
 * لیست لینک شده Doubly:
 * در یک لیست لینک شده Doubly ، می توانیم عناصر را از دو طرف اضافه یا حذف کنیم.
 * <p>
 * LinkedList class declaration:
 * public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
 * <p>
 * Constructors of Java LinkedList:
 * LinkedList():
 * It is used to construct an empty list.
 * LinkedList(Collection<? extends E> c):
 * It is used to construct a list containing the elements of the specified collection, in the order, they are returned by the collection's iterator.
 * سازندگان Java LinkedList:
 * LinkedList ():
 * برای ساخت یک لیست خالی استفاده می شود.
 * LinkedList(Collection<? extends E> c):
 * برای ساخت لیستی از عناصر مجموعه مشخص شده استفاده می شود ، به ترتیب ، آنها توسط تکرار کننده مجموعه بازگردانده می شوند.
 * <p>
 * Methods of Java LinkedList:
 * boolean add(E e):
 * It is used to append the specified element to the end of a list.
 * void add(int index, E element):
 * It is used to insert the specified element at the specified position index in a list.
 * boolean addAll(Collection<? extends E> c):
 * It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
 * boolean addAll(Collection<? extends E> c):
 * It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
 * boolean addAll(int index, Collection<? extends E> c):
 * It is used to append all the elements in the specified collection, starting at the specified position of the list.
 * void addFirst(E e):
 * It is used to insert the given element at the beginning of a list.
 * void addLast(E e):
 * It is used to append the given element to the end of a list.
 * void clear():
 * It is used to remove all the elements from a list.
 * Object clone():
 * It is used to return a shallow copy of an ArrayList.
 * boolean contains(Object o):
 * It is used to return true if a list contains a specified element.
 * Iterator<E> descendingIterator():
 * It is used to return an iterator over the elements in a deque in reverse sequential order.
 * E element():
 * It is used to retrieve the first element of a list.
 * E get(int index):
 * It is used to return the element at the specified position in a list.
 * E getFirst():
 * It is used to return the first element in a list.
 * E getLast():
 * It is used to return the last element in a list.
 * int indexOf(Object o):
 * It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
 * int lastIndexOf(Object o):
 * It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
 * ListIterator<E> listIterator(int index):
 * It is used to return a list-iterator of the elements in proper sequence, starting at the specified position in the list.
 * boolean offer(E e):
 * It adds the specified element as the last element of a list.
 * boolean offerFirst(E e):
 * It inserts the specified element at the front of a list.
 * boolean offerLast(E e):
 * It inserts the specified element at the end of a list.
 * E peek():
 * It retrieves the first element of a list
 * E peekFirst():
 * It retrieves the first element of a list or returns null if a list is empty.
 * E peekLast():
 * It retrieves the last element of a list or returns null if a list is empty.
 * E poll():
 * It retrieves and removes the first element of a list.
 * E pollFirst():
 * It retrieves and removes the first element of a list, or returns null if a list is empty.
 * E pollLast():
 * It retrieves and removes the last element of a list, or returns null if a list is empty.
 * E pop():
 * It pops an element from the stack represented by a list.
 * void push(E e):
 * It pushes an element onto the stack represented by a list.
 * E remove():
 * It is used to retrieve and removes the first element of a list.
 * E remove(int index):
 * It is used to remove the element at the specified position in a list.
 * boolean remove(Object o):
 * It is used to remove the first occurrence of the specified element in a list.
 * E removeFirst():
 * It removes and returns the first element from a list.
 * boolean removeFirstOccurrence(Object o):
 * It is used to remove the first occurrence of the specified element in a list (when traversing the list from head to tail).
 * E removeLast():
 * It removes and returns the last element from a list.
 * boolean removeLastOccurrence(Object o):
 * It removes the last occurrence of the specified element in a list (when traversing the list from head to tail).
 * E set(int index, E element):
 * It replaces the element at the specified position in a list with the specified element.
 * Object[] toArray():
 * It is used to return an array containing all the elements in a list in proper sequence (from first to the last element).
 * <T> T[] toArray(T[] a):
 * It returns an array containing all the elements in the proper sequence (from first to the last element); the runtime type of the returned array is that of the specified array.
 * int size():
 * It is used to return the number of elements in a list.
 * <p>
 * <p>
 * متدهای Java LinkedList:
 * boolean add(E e):
 * برای اضافه کردن عنصر مشخص شده در انتهای لیست استفاده می شود.
 * void add(int index, E element):
 * برای قرار دادن عنصر مشخص شده در فهرست موقعیت مشخص شده در یک لیست استفاده می شود.
 * boolean addAll(Collection<? extends E> c):
 * استفاده می شود برای اضافه کردن تمام عناصر موجود در مجموعه مشخص شده در انتهای این لیست ، به ترتیبی که توسط مجری مجموعه مشخص شده برگردانده شود.
 * boolean addAll(int index, Collection<? extends E> c):
 * برای اضافه کردن کلیه عناصر موجود در مجموعه مشخص شده ، از موقعیت مشخص شده لیست استفاده می شود.
 * void addFirst(E e):
 * برای قرار دادن عنصر داده شده در ابتدای لیست استفاده می شود.
 * void addLast(E e):
 * برای اضافه کردن عنصر داده شده در انتهای لیست استفاده می شود.
 * void clear():
 * برای حذف کلیه عناصر از لیست استفاده می شود.
 * Object clone():
 * برای بازگشت یک نسخه کم عمق از ArrayList استفاده می شود.
 * boolean contains(Object o):
 * اگر لیستی حاوی یک عنصر مشخص باشد ، برای بازگشت درست استفاده می شود.
 * Iterator<E> descendingIterator():
 * برای بازگشت یک تکرارکننده بر روی عناصر به صورت پی در پی به ترتیب متوالی استفاده می شود.
 * E element():
 * برای بازیابی عنصر اول لیست استفاده می شود.
 * E get(int index):
 * برای بازگشت عنصر در موقعیت مشخص شده در یک لیست استفاده می شود.
 * E getFirst():
 * برای بازگشت اولین عنصر در یک لیست استفاده می شود.
 * E getLast():
 * برای بازگشت آخرین عنصر در یک لیست استفاده می شود.
 * int indexOf(Object o):
 * برای برگرداندن فهرست در لیستی از اولین وقوع عنصر مشخص شده یا -1 اگر این لیست فاقد عنصری باشد ، استفاده می شود.
 * int lastIndexOf(Object o):
 * برای برگرداندن فهرست در لیستی از آخرین وقوع عنصر مشخص شده یا -1 در صورت عدم وجود عنصر در لیست استفاده می شود.
 * ListIterator<E> listIterator(int index):
 * برای بازگشت یک تکرار کننده فهرست از عناصر به ترتیب مناسب ، با شروع از موقعیت مشخص شده در لیست استفاده می شود.
 * boolean offer(E e):
 * این عنصر مشخص شده را به عنوان آخرین عنصر یک لیست اضافه می کند.
 * boolean offerFirst(E e):
 * عنصر مشخص شده را در قسمت جلوی لیست وارد می کند.
 * boolean offerLast(E e):
 * عنصر مشخص شده را در انتهای لیست وارد می کند.
 * E peek():
 * اولین عنصر یک لیست را بازیابی می کند
 * E peekFirst():
 * اولین عنصر یک لیست را بازیابی می کند یا در صورت خالی بودن لیست ، تهی بر می گرداند.
 * E peekLast():
 * این آخرین عنصر یک لیست را بازیابی می کند یا اگر یک لیست خالی باشد ، تهی بر می گردد.
 * E poll():
 * این عنصر اول لیست را بازیابی و حذف می کند.
 * E pollFirst():
 * این عنصر اول لیست را بازیابی و حذف می کند یا اگر یک لیست خالی باشد تهی است.
 * E pollLast():
 * آخرین عنصر لیست را بازیابی و حذف می کند یا اگر یک لیست خالی باشد تهی است.
 * E pop():
 * این عنصر را از پشته نشان می دهد که توسط یک لیست نشان داده می شود.
 * void push(E e):
 * این عنصر را روی پشته نشان می دهد که توسط یک لیست مشخص شده است.
 * E remove():
 * برای بازیابی و حذف اولین عنصر یک لیست استفاده می شود.
 * E remove(int index):
 * برای حذف عنصر در موقعیت مشخص شده در یک لیست استفاده می شود.
 * boolean remove(Object o):
 * برای حذف اولین مورد از عنصر مشخص شده در یک لیست استفاده می شود.
 * E removeFirst():
 * اولین عنصر را از لیست حذف کرده و برمی گرداند.
 * boolean removeFirstOccurrence(Object o):
 * برای حذف اولین مورد از عنصر مشخص شده در یک لیست استفاده می شود (هنگام عبور از لیست به سر تا دم).
 * E removeLast():
 * آخرین عنصر را از لیست حذف کرده و برمی گرداند.
 * boolean removeLastOccurrence(Object o):
 * این آخرین رخداد عنصر مشخص شده در یک لیست را حذف می کند (هنگام عبور لیست از سر به دم).
 * E set(int index, E element):
 * این عنصر را در یک موقعیت مشخص در یک لیست با عنصر مشخص جایگزین می کند.
 * Object[] toArray():
 * برای بازگشت آرایه ای شامل تمام عناصر موجود در یک لیست به ترتیب مناسب (از اول تا آخرین عنصر) استفاده می شود.
 * <T> T[] toArray(T[] a):
 * این مجموعه آرایه ای را شامل می شود که شامل همه عناصر در دنباله مناسب (از اول تا آخرین عنصر) است. نوع زمان اجرای آرایه بازده همان آرایه مشخص شده است.
 * int size():
 * برای بازگشت تعداد عناصر موجود در یک لیست استفاده می شود.
 */
public class JavaLinkedList {

    public String reverseIterator() {
        String result = "";
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Motaharinia");
        linkedList.add("Vijay");
        linkedList.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            result += iterator.next() + ",";
        }
        return result;
    }
}
