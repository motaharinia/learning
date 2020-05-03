package com.motaharinia.javacore.rjavacollection.jdequearraydeque;

/**
 * https://www.javatpoint.com/java-deque-arraydeque
 * Java Deque Interface is a linear collection that supports element insertion and removal at both ends.
 * Deque is an acronym for "double ended queue".
 *رابط Java Deque  یک مجموعه خطی است که از درج عناصر و حذف در هر دو انتها پشتیبانی می کند.
 * کلمه Deque مخفف "صف دوبل" است.
 *
 * Deque Interface declaration:
 * public interface Deque<E> extends Queue<E>
 *
 * Methods of Java Deque Interface:
 * boolean add(object):
 * It is used to insert the specified element into this deque and return true upon success.
 * boolean offer(object):
 * It is used to insert the specified element into this deque.
 * Object remove():
 * It is used to retrieves and removes the head of this deque.
 * Object poll():
 * It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
 * Object element():
 * It is used to retrieves, but does not remove, the head of this deque.
 * Object peek():
 * It is used to retrieves, but does not remove, the head of this deque, or returns null if this deque is empty.
 *متد های رابط جاوا Deque:
 *boolean add(object):
 * از آن برای وارد کردن عنصر مشخص شده در این دیواره استفاده می شود و پس از موفقیت به حقیقت باز می گردد.
 *boolean offer(object):
 * برای قرار دادن عنصر مشخص شده در این دیواره استفاده می شود.
 *Object remove():
 * برای بازیابی و برداشتن سر این دیک استفاده می شود.
 * Object poll():
 * از آن برای بازیابی و برداشتن سر این دیواره استفاده می شود ، یا در صورت خالی بودن  ، تهی برمی گردد.
 *Object element():
 * از آن برای بازیابی استفاده می شود ، اما حذف نمی شود ، سر این دیک است.
 *Object peek():
 * از آن برای بازیابی استفاده می شود ، اما سر آن را جدا نمی کند ، یا اگر این گوزن خالی باشد ، تهی برمی گردد
 *
 * ArrayDeque class:
 * The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.
 * کلاس ArrayDeque:
 * کلاس ArrayDeque امکان استفاده از آرایه های deque و resizable را فراهم می کند. این کلاس AbstractCollection را به ارث می برد و رابط Deque را پیاده سازی می کند.
 *
 * The important points about ArrayDeque class are:
 * 1.Unlike Queue, we can add or remove elements from both sides.
 * 2.Null elements are not allowed in the ArrayDeque.
 * 3.ArrayDeque is not thread safe, in the absence of external synchronization.
 * 4.ArrayDeque has no capacity restrictions.
 * 5.ArrayDeque is faster than LinkedList and Stack.
 * نکات مهم در مورد کلاس ArrayDeque عبارتند از:
 * 1.برخلاف صف ، ما می توانیم عناصر را از دو طرف اضافه یا حذف کنیم.
 * 2. عناصر Null در ArrayDeque مجاز نیست.
 * 3.کلاس ArrayDeque در صورت عدم هماهنگی خارجی ، نخ کاملاً ایمن نیست.
 * 4.کلاس ArrayDeque محدودیت ظرفیتی ندارد.
 * 5.کلاس ArrayDeque سریعتر از LinkedList و Stack است.
 *
 * ArrayDeque Hierarchy:
 * The hierarchy of ArrayDeque class is given in the figure displayed at the right side of the page.
 * سلسله مراتب ArrayDeque:
 * سلسله مراتب کلاس ArrayDeque در شکل نشان داده شده در سمت راست صفحه آورده شده است.
 *
 * ArrayDeque class declaration:
 * public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
 *
 */
public class JavaDequeInterface {
}
