package com.motaharinia.javacore.rjavacollection.iqueuepriorityqueue;

import java.util.PriorityQueue;

/**
 * https://www.javatpoint.com/java-priorityqueue
 * Java Queue Interface:
 * Java Queue interface orders the element in FIFO(First In First Out) manner.
 * In FIFO, first element is removed first and last element is removed at last
 * رابط صف جاوا:
 * رابط صف جاوا عنصر را به روش FIFO (اولین داخل اولین بیرون) سفارش می دهد.
 * در FIFO ، اولین عنصر ابتدا حذف می شود و آخرین عنصر در آخر حذف می شود
 *
 * Queue Interface declaration:
 * public interface Queue<E> extends Collection<E>
 *
 * Methods of Java Queue Interface:
 * boolean add(object):
 * It is used to insert the specified element into this queue and return true upon success.
 * boolean offer(object):
 * It is used to insert the specified element into this queue.
 * Object remove():
 * It is used to retrieves and removes the head of this queue.
 * Object poll():
 * It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
 * Object element():
 * It is used to retrieves, but does not remove, the head of this queue.
 * Object peek():
 * It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 *متد های رابط جاوای صف:
 *boolean add(object):
 * برای قرار دادن عنصر مشخص شده در این صف و بازگشت به موفقیت پس از موفقیت استفاده می شود.
 *boolean offer(object):
 * برای قرار دادن عنصر مشخص شده در این صف استفاده می شود.
 *Object remove():
 * برای بازیابی و برداشتن سر این صف استفاده می شود.
 *Object poll():
 * برای بازیابی و برداشتن سر این صف استفاده می شود یا اگر این صف خالی باشد تهی است.
 *Object element():
 * از آن برای بازیابی استفاده می شود ، اما حذف نمی شود ، سر این صف است.
 *Object peek():
 * برای بازیابی استفاده می شود ، اما سر این صف را حذف نمی کند ، یا اگر این صف خالی باشد تهی است.
 *
 * PriorityQueue class:
 * The PriorityQueue class provides the facility of using queue.
 * But it does not orders the elements in FIFO manner.
 * It inherits AbstractQueue class.
 * کلاس PriorityQueue:
 * کلاس PriorityQueue امکان استفاده از صف را فراهم می کند.
 * اما این عناصر را به روش FIFO سفارش نمی دهد.
 * این کلاس AbstractQueue را به ارث می برد.
 *
 * PriorityQueue class declaration:
 * public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable
 */
public class JavaQueueInterface {
    public String queueElement(PriorityQueue<String> priorityQueue){
        return priorityQueue.element();
    }

    public String queueRemove(PriorityQueue<String> priorityQueue){
        return priorityQueue.remove();
    }
}
