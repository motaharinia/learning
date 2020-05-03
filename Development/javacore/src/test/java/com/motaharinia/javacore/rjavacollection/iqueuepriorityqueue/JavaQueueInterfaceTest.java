package com.motaharinia.javacore.rjavacollection.iqueuepriorityqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

/**
 * https://www.javatpoint.com/java-priorityqueue
 */
public class JavaQueueInterfaceTest {
    //متغیر تست
    JavaQueueInterface javaQueueInterface;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaQueueInterface = new JavaQueueInterface();
    }

    /**
     * این متد element و peek را ذر QueueInterface مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaQueueInterfaceElementPeekTest() throws Exception {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Motaharinia");
        priorityQueue.add("Vijay");
        priorityQueue.add("Karan");
        priorityQueue.add("Jai");
        priorityQueue.add("Rahul");
        Assertions.assertEquals(priorityQueue.peek(), javaQueueInterface.queueElement(priorityQueue));
    }

    /**
     * این متد remove و poll را ذر QueueInterface مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaQueueInterfaceRemovePullTest() throws Exception {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Motaharinia");
        System.out.println(priorityQueue.toString());
        priorityQueue.add("Vijay");
        System.out.println(priorityQueue.toString());
        priorityQueue.add("Karan");
        System.out.println(priorityQueue.toString());
        priorityQueue.add("Jai");
        System.out.println(priorityQueue.toString());
        priorityQueue.add("Rahul");
        System.out.println(priorityQueue.toString());
        String result = priorityQueue.peek();
        System.out.println("after peek:" + priorityQueue.toString());
        System.out.println(result);
        Assertions.assertEquals("Jai", javaQueueInterface.queueRemove(priorityQueue));
    }
}
