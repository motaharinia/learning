package com.motaharinia.javacore.tjava9feachers.lstreamapiimprovement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.javatpoint.com/java-9-stream-api-improvement
 */
public class Java9StreamTest {
    //متغیر تست
    Java9Stream java9Stream;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9Stream = new  Java9Stream();
    }

    /**
     * این متد  TakeWhile را در Stream جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9StreamTakeWhile1Test() throws Exception {
        Assertions.assertEquals("", java9Stream.streamTakeWhileExample1());
    }

    /**
     * این متد  TakeWhile را در Stream جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9StreamTakeWhile2Test() throws Exception {
        Assertions.assertEquals("2,2", java9Stream.streamTakeWhileExample2());
    }

    /**
     * این متد  DropWhile را در Stream جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9StreamDropWhileTest() throws Exception {
        Assertions.assertEquals("3,4,5,6,7,8,9,10", java9Stream.streamDropWhileExample());
    }


    /**
     * این متد  Iterate را در Stream جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9StreamIterateTest() throws Exception {
        Assertions.assertEquals("1,3,9", java9Stream.streamIterateExample());
    }
}
