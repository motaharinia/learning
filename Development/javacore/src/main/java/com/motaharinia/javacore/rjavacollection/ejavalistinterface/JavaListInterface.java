package com.motaharinia.javacore.rjavacollection.ejavalistinterface;

/**
 * https://www.javatpoint.com/java-list
 * Java List Interface:
 * List Interface is the subinterface of Collection.
 * It contains index-based methods to insert and delete elements.
 * It is a factory of ListIterator interface.
 *رابط لیست جاوا:
 * رابط لیست زیررابط مجموعه است.
 * این شامل متدهای مبتنی بر فهرست برای درج و حذف عناصر است.
 * این کارخانه رابط ListIterator است.
 *
 * List Interface declaration:
 * public interface List<E> extends Collection<E>
 *
 * Methods of Java List Interface:
 * void add(int index, E element):
 * It is used to insert the specified element at the specified position in a list.
 * boolean add(E e):
 * It is used to append the specified element at the end of a list.
 * boolean addAll(Collection<? extends E> c):
 * It is used to append all of the elements in the specified collection to the end of a list.
 * boolean addAll(int index, Collection<? extends E> c):
 * It is used to append all the elements in the specified collection, starting at the specified position of the list.
 * void clear():
 * It is used to remove all of the elements from this list.
 * boolean equals(Object o):
 * It is used to compare the specified object with the elements of a list.
 * int hashcode():
 * It is used to return the hash code value for a list.
 * E get(int index):
 * It is used to fetch the element from the particular position of the list.
 * boolean isEmpty():
 * It returns true if the list is empty, otherwise false.
 * int lastIndexOf(Object o):
 * It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
 * Object[] toArray():
 * It is used to return an array containing all of the elements in this list in the correct order.
 * T[] toArray(T[] a):
 * It is used to return an array containing all of the elements in this list in the correct order.
 * boolean contains(Object o):
 * It returns true if the list contains the specified element
 * boolean containsAll(Collection<?> c):
 * It returns true if the list contains all the specified element
 * int indexOf(Object o):
 * It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
 * E remove(int index):
 * It is used to remove the element present at the specified position in the list.
 * boolean remove(Object o):
 * It is used to remove the first occurrence of the specified element.
 * boolean removeAll(Collection<?> c):
 * It is used to remove all the elements from the list.
 * void replaceAll(UnaryOperator operator):
 * It is used to replace all the elements from the list with the specified element.
 * void retainAll(Collection<?> c):
 * It is used to retain all the elements in the list that are present in the specified collection.
 * E set(int index, E element):
 * It is used to replace the specified element in the list, present at the specified position.
 * void sort(Comparator<? super E> c):
 * It is used to sort the elements of the list on the basis of specified comparator.
 * Spliterator spliterator():
 * It is used to create spliterator over the elements in a list.
 * List<E> subList(int fromIndex, int toIndex):
 * It is used to fetch all the elements lies within the given range.
 * int size():
 * It is used to return the number of elements present in the list.
 *
 * متد های رابط لیست جاوا:
 * void add(int index, E element):
 * برای قرار دادن عنصر مشخص شده در موقعیت مشخص شده در یک لیست استفاده می شود.
 * boolean add(E e):
 *برای اضافه کردن عنصر مشخص شده در انتهای لیست استفاده می شود.
 * boolean addAll(Collection<? extends E> c):
 * برای اضافه کردن همه عناصر موجود در مجموعه مشخص شده در انتهای یک لیست استفاده می شود.
 * boolean addAll(int index, Collection<? extends E> c):
 * برای اضافه کردن کلیه عناصر موجود در مجموعه مشخص شده ، از موقعیت مشخص شده لیست استفاده می شود.
 * void clear():
 * برای حذف همه عناصر از این لیست استفاده می شود.
 * boolean equals(Object o):
 * برای مقایسه شیء مشخص شده با عناصر یک لیست استفاده می شود.
 * int hashcode():
 * برای برگرداندن مقدار کد هش برای لیست استفاده می شود.
 * E get(int index):
 * برای واکشی عنصر از موقعیت خاص لیست استفاده می شود.
 * boolean isEmpty():
 * اگر لیست خالی باشد ، در غیر این صورت نادرست ، درست برمی گردد.
 * int lastIndexOf(Object o):
 * برای برگرداندن فهرست در این لیست از آخرین وقوع عنصر مشخص شده استفاده می شود ، یا اگر این لیست شامل این عنصر نباشد.
 * Object[] toArray():
 *از آن برای بازگرداندن آرایه ای شامل همه عناصر موجود در این لیست به ترتیب صحیح استفاده می شود.
 * T[] toArray(T[] a):
 * از آن برای بازگرداندن آرایه ای شامل همه عناصر موجود در این لیست به ترتیب صحیح استفاده می شود.
 * boolean contains(Object o):
 * اگر لیست شامل عنصر مشخص شده باشد ، درست برمی گردد
 * boolean containsAll(Collection<?> c):
 * اگر لیست شامل تمام عنصر مشخص شده باشد صحیح برمی گردد
 * int indexOf(Object o):
 * برای برگرداندن فهرست در این لیست برای اولین بار از عنصر مشخص شده استفاده می شود ، یا در صورت عدم وجود این عنصر در لیست -1.
 * E remove(int index):
 * برای حذف عنصر موجود در موقعیت مشخص شده در لیست استفاده می شود.
 * boolean remove(Object o):
 * برای از بین بردن اولین وقوع عنصر مشخص شده استفاده می شود.
 * boolean removeAll(Collection<?> c):
 * برای حذف کلیه عناصر از لیست استفاده می شود.
 * void replaceAll(UnaryOperator operator):
 * برای جایگزینی کلیه عناصر موجود در لیست با عنصر مشخص شده استفاده می شود.
 * void retainAll(Collection<?> c):
 * این برای حفظ تمام عناصر موجود در لیست موجود در مجموعه مشخص شده استفاده می شود.
 * E set(int index, E element):
 * از آن برای جایگزینی عنصر مشخص شده در لیست استفاده می شود ، که در موقعیت مشخص شده است.
 * void sort(Comparator<? super E> c):
 * از آن برای مرتب کردن عناصر لیست بر اساس مقایسه گر مشخص شده استفاده می شود.
 * Spliterator spliterator():
 * از آن برای ایجاد تقسیم کننده بر روی عناصر موجود در یک لیست استفاده می شود.
 * List<E> subList(int fromIndex, int toIndex):
 * این برای واکشی تمام عناصر موجود در محدوده داده شده استفاده می شود.
 * int size():
 * برای بازگشت تعداد عناصر موجود در لیست استفاده می شود.
 *
 * Java ListIterator Interface:
 * ListIterator Interface is used to traverse the element in a backward and forward direction.
 *رابط Java ListIterator:
 * رابط ListIterator برای عبور عنصر در جهت عقب و رو به جلو استفاده می شود.
 *
 * ListIterator Interface declaration:
 * public interface ListIterator<E> extends Iterator<E>
 *
 * Methods of Java ListIterator Interface:
 * void add(E e):
 * This method inserts the specified element into the list.
 * boolean hasNext():
 * This method returns true if the list iterator has more elements while traversing the list in the forward direction.
 * E next():
 * This method returns the next element in the list and advances the cursor position.
 * int nextIndex():
 * This method returns the index of the element that would be returned by a subsequent call to next()
 * boolean hasPrevious():
 * This method returns true if this list iterator has more elements while traversing the list in the reverse direction.
 * E previous():
 * This method returns the previous element in the list and moves the cursor position backward.
 * E previousIndex():
 * This method returns the index of the element that would be returned by a subsequent call to previous().
 * void remove():
 * This method removes the last element from the list that was returned by next() or previous() methods
 * void set(E e):
 * This method replaces the last element returned by next() or previous() methods with the specified element.
 *
 * متدهای رابط Java ListIterator:
 * void add(E e):
 * این متد عنصر مشخص شده را در لیست وارد می کند.
 * boolean hasNext():
 * در صورت پیمودن لیست در جهت رو به جلو ، این متد درست است.
 * E next():
 * این متد عنصر بعدی را در لیست برمی گرداند و موقعیت مکان نما را پیش می برد.
 * int nextIndex():
 * این متد شاخص عنصری را که با یک تماس بعدی به مرحله بعدی برگردانده می شود ()
 * boolean hasPrevious():
 * در صورت پیمایش لیست در جهت معکوس ، این تکرارکننده لیست عناصر بیشتری دارد.
 * E previous():
 * این متد عنصر قبلی را در لیست برمی گرداند و موقعیت مکان نما را به عقب منتقل می کند.
 * E previousIndex():
 * این متد شاخص عنصری را که با یک تماس بعدی به قبلی  برگشت داده می شود ، باز می گرداند.
 * void remove():
 * این متد آخرین عنصر را از لیستی که با متد های بعدی  یا قبلی  برگشت داده شده ، حذف می کند
 * void set(E e):
 * این متد آخرین عنصر برگشت داده شده توسط متدهای بعدی  یا قبلی  را با عنصر مشخص شده جایگزین می کند.
 */
public class JavaListInterface {
}
