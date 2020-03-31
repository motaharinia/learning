package com.motaharinia.javacore.inheritance;

import com.motaharinia.javacore.inheritance.aggregation.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/aggregation-in-java
public class AggregationTest {

    //دایره
    Circle circle;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        circle = new Circle();
    }

    /**
     * این متد Aggregation را تست میکند
     */
    @Test
    void aggregationTest() {
        Double result = circle.area(5);
        Assertions.assertEquals(5 * 5 * 3.14, result);
    }
}
