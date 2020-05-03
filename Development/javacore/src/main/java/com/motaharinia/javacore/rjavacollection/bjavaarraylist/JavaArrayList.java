package com.motaharinia.javacore.rjavacollection.bjavaarraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * https://www.javatpoint.com/java-arraylist
 * Java ArrayList class uses a dynamic array for storing the elements.
 * It inherits AbstractList class and implements List interface.
 * The important points about Java ArrayList class are:
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because array works at the index basis.
 * In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
 * کلاس Java ArrayList از یک آرایه پویا برای ذخیره عناصر استفاده می کند.
 * این کلاس AbstractList را به ارث می برد و رابط List را پیاده سازی می کند.
 * نکات مهم در مورد کلاس Java ArrayList عبارتند از:
 * کلاس Java ArrayList می تواند شامل عناصر تکراری باشد.
 * کلاس Java ArrayList ترتیب درج را حفظ می کند.
 * کلاس Java ArrayList هماهنگ نیست.
 * جاوا ArrayList دسترسی تصادفی را امکان پذیر می کند زیرا آرایه بر اساس شاخص کار می کند.
 * در کلاس Java ArrayList ، دستکاری بسیار کند است زیرا در صورت حذف هر عنصر از لیست آرایه ها ، تغییرات زیادی لازم است.
 * <p>
 * Hierarchy of ArrayList class:
 * As shown in the above diagram, Java ArrayList class extends AbstractList class which implements List interface.
 * The List interface extends the Collection and Iterable interfaces in hierarchical order.
 * ArrayList class declaration:
 * Let's see the declaration for java.util.ArrayList class.
 * public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 * سلسله مراتب از کلاس ArrayList:
 * همانطور که در نمودار فوق نشان داده شده است ، کلاس Java ArrayList کلاس AbstractList را گسترش می دهد که رابط List را پیاده سازی می کند.
 * رابط List مجموعه و رابط های Iterable را به ترتیب سلسله مراتبی گسترش می دهد.
 * اعلامیه کلاس ArrayList:
 * بیایید بیانیه مربوط به کلاس java.util.ArrayList را ببینیم.
 * public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 * <p>
 * Constructors of Java ArrayList:
 * ArrayList():
 * It is used to build an empty array list.
 * ArrayList(Collection<? extends E> c):
 * It is used to build an array list that is initialized with the elements of the collection c.
 * ArrayList(int capacity):
 * It is used to build an array list that has the specified initial capacity.
 * سازندگان Java ArrayList:
 * ArrayList ():
 * برای ساخت یک لیست آرایه خالی استفاده می شود.
 * ArrayList(Collection<? extends E> c):
 * از آن برای ساختن لیست آرایه ای استفاده می شود که با عناصر مجموعه c آغاز می شود.
 * ArrayList(int capacity):
 * برای ساختن لیست آرایه ای استفاده می شود که دارای ظرفیت اولیه مشخصی باشد.
 * <p>
 * Methods of Java ArrayList:
 * void add(int index, E element):
 * It is used to insert the specified element at the specified position in a list.
 * boolean add(E e):
 * It is used to append the specified element at the end of a list.
 * boolean addAll(Collection<? extends E> c):
 * It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
 * boolean addAll(int index, Collection<? extends E> c):
 * It is used to append all the elements in the specified collection, starting at the specified position of the list.
 * void clear():
 * It is used to remove all of the elements from this list.
 * void ensureCapacity(int requiredCapacity):
 * It is used to enhance the capacity of an ArrayList instance.
 * E get(int index):
 * It is used to fetch the element from the particular position of the list.
 * boolean isEmpty():
 * It returns true if the list is empty, otherwise false.
 * int lastIndexOf(Object o):
 * It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
 * Object[] toArray():
 * It is used to return an array containing all of the elements in this list in the correct order.
 * <T> T[] toArray(T[] a):
 * It is used to return an array containing all of the elements in this list in the correct order.
 * Object clone():
 * It is used to return a shallow copy of an ArrayList.
 * boolean contains(Object o):
 * It returns true if the list contains the specified element
 * int indexOf(Object o):
 * It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
 * E remove(int index):
 * It is used to remove the element present at the specified position in the list.
 * boolean remove(Object o):
 * It is used to remove the first occurrence of the specified element.
 * boolean removeAll(Collection<?> c):
 * It is used to remove all the elements from the list.
 * boolean removeIf(Predicate<? super E> filter):
 * It is used to remove all the elements from the list that satisfies the given predicate.
 * protected void removeRange(int fromIndex, int toIndex):
 * It is used to remove all the elements lies within the given range.
 * void replaceAll(UnaryOperator<E> operator):
 * It is used to replace all the elements from the list with the specified element.
 * void retainAll(Collection<?> c):
 * It is used to retain all the elements in the list that are present in the specified collection.
 * E set(int index, E element):
 * It is used to replace the specified element in the list, present at the specified position.
 * void sort(Comparator<? super E> c):
 * It is used to sort the elements of the list on the basis of specified comparator.
 * Spliterator<E> spliterator():
 * It is used to create spliterator over the elements in a list.
 * List<E> subList(int fromIndex, int toIndex):
 * It is used to fetch all the elements lies within the given range.
 * int size()	It is used to return the number of elements present in the list.
 * void trimToSize():
 * It is used to trim the capacity of this ArrayList instance to be the list's current size.
 * <p>
 * متدهای Java ArrayList:
 * void add(int index, E element):
 * برای قرار دادن عنصر مشخص شده در موقعیت مشخص شده در یک لیست استفاده می شود.
 * boolean add(E e):
 * برای اضافه کردن عنصر مشخص شده در انتهای لیست استفاده می شود.
 * boolean addAll(Collection<? extends E> c):
 * استفاده می شود برای اضافه کردن تمام عناصر موجود در مجموعه مشخص شده در انتهای این لیست ، به ترتیبی که توسط مجری مجموعه مشخص شده برگردانده شود.
 * boolean addAll(int index, Collection<? extends E> c):
 * برای اضافه کردن کلیه عناصر موجود در مجموعه مشخص شده ، از موقعیت مشخص شده لیست استفاده می شود.
 * void clear():
 * برای حذف همه عناصر از این لیست استفاده می شود.
 * void ensureCapacity(int requiredCapacity):
 * از آن برای افزایش ظرفیت نمونه ArrayList استفاده می شود.
 * E get(int index):
 * برای واکشی عنصر از موقعیت خاص لیست استفاده می شود.
 * boolean isEmpty():
 * اگر لیست خالی باشد درست برمی گردد ، در غیر این صورت نادرست.
 * int lastIndexOf(Object o):
 * برای برگرداندن شاخص در این لیست از آخرین وقوع عنصر مشخص شده استفاده می شود ، یا اگر این لیست شامل این عنصر نباشد.
 * Object[] toArray():
 * از آن برای بازگرداندن آرایه ای شامل همه عناصر موجود در این لیست به ترتیب صحیح استفاده می شود.
 * <T> T[] toArray(T[] a):
 * از آن برای بازگرداندن آرایه ای شامل همه عناصر موجود در این لیست به ترتیب صحیح استفاده می شود.
 * Object clone():
 * برای بازگشت یک نسخه کم عمق از ArrayList استفاده می شود.
 * boolean contains(Object o):
 * اگر لیست شامل عنصر مشخص شده باشد ، درست برمی گردد
 * int indexOf(Object o):
 * برای برگرداندن شاخص در این لیست برای اولین بار از عنصر مشخص شده استفاده می شود ، یا در صورت عدم وجود این عنصر در لیست -1.
 * E remove(int index):
 * برای حذف عنصر موجود در موقعیت مشخص شده در لیست استفاده می شود.
 * boolean remove(Object o):
 * برای از بین بردن اولین وقوع عنصر مشخص شده استفاده می شود.
 * boolean removeAll(Collection<?> c):
 * برای حذف کلیه عناصر از لیست استفاده می شود.
 * boolean removeIf(Predicate<? super E> filter):
 * برای حذف کلیه عناصر از لیستی که گزاره داده را برآورده می کند استفاده می شود.
 * protected void removeRange(int fromIndex, int toIndex):
 * این برای حذف تمام عناصر موجود در محدوده داده شده استفاده می شود.
 * void replaceAll(UnaryOperator<E> operator):
 * برای جایگزینی کلیه عناصر موجود در لیست با عنصر مشخص شده استفاده می شود.
 * void retainAll(Collection<?> c):
 * این برای حفظ تمام عناصر موجود در لیست موجود در مجموعه مشخص شده استفاده می شود.
 * E set(int index, E element):
 * از آن برای جایگزینی عنصر مشخص شده در لیست استفاده می شود ، که در موقعیت مشخص شده است.
 * void sort(Comparator<? super E> c):
 * از آن برای مرتب کردن عناصر لیست بر اساس مقایسه گر مشخص شده استفاده می شود.
 * Spliterator<E> spliterator():
 * از آن برای ایجاد تقسیم کننده بر روی عناصر موجود در یک لیست استفاده می شود.
 * List<E> subList(int fromIndex, int toIndex):
 * این برای واکشی تمام عناصر موجود در محدوده داده شده استفاده می شود.
 * int size()
 * برای بازگشت تعداد عناصر موجود در لیست استفاده می شود.
 * void trimToSize():
 * برای کم کردن ظرفیت این نمونه ArrayList به عنوان اندازه فعلی لیست استفاده می شود.
 * <p>
 * Java Non-generic Vs. Generic Collection:
 * Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
 * Java new generic collection allows you to have only one type of object in a collection.
 * Now it is type safe so typecasting is not required at runtime.
 * In a generic collection, we specify the type in angular braces.
 * Now ArrayList is forced to have the only specified type of objects in it.
 * If you try to add another type of object, it gives compile time error.
 * مجموعه غیر عمومی جاوا در مقابل مجموعه عمومی:
 * چارچوب مجموعه جاوا قبل از JDK 1.5 غیر عمومی بود. از 1.5 به بعد عمومی است.
 * مجموعه عمومی جدید جاوا به شما امکان می دهد فقط یک نوع شیء در یک مجموعه داشته باشید.
 * اکنون این نوع از نوع بی خطر است ، بنابراین تبدیل نوع در زمان اجرا لازم نیست.
 * در یک مجموعه عمومی نوع را در angular braces مشخص می کنیم.
 * اکنون ArrayList مجبور است تنها نوع مشخصی از اشیاء را در آن داشته باشد.
 * اگر سعی کنید نوع دیگری از شیء را اضافه کنید ، خطای زمان کامپایل را نشان می دهد.
 * <p>
 * Ways to iterate the elements of the collection in java
 * There are various ways to traverse the collection elements:
 * 1.By Iterator interface.
 * 2.By for-each loop.
 * 3.By ListIterator interface.
 * 4.By for loop.
 * 5.By forEach() method.
 * 6.By forEachRemaining() method.
 * راه های تکرار عناصر مجموعه در جاوا
 * روشهای مختلفی برای گذر از عناصر مجموعه وجود دارد:
 * 1.By Iterator interface.
 * 2.By for-each loop.
 * 3.By ListIterator interface.
 * 4.By for loop.
 * 5.By forEach() method.
 * 6.By forEachRemaining() method.
 */
public class JavaArrayList {
    public Boolean checkValueIsExistForEach(String value) {
        //Creating ArrayList
        ArrayList<String> list = new ArrayList<String>();
        //Adding object in arraylist
        list.add("Motaharinia");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        for (String obj : list) {
            if (value.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public List<String> serializeDeserialize(List<String> stringList) {
        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("javaArrayListSerializeDeserializeTest.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stringList);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis = new FileInputStream("javaArrayListSerializeDeserializeTest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            return (list);
        } catch (Exception e) {
            return null;
        }
    }

    public List<String> useRetainAll(List<String> stringList1, List<String> stringList2) {
        stringList1.retainAll(stringList2);
        return stringList1;
    }
}
