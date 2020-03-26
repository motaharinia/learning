package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.strategy.Context;
import com.motaharinia.designpattern.javacore.behavioral.strategy.StrategyAddition;
import com.motaharinia.designpattern.javacore.behavioral.strategy.StrategyMultiplication;
import com.motaharinia.designpattern.javacore.behavioral.strategy.StrategySubtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/strategy-pattern
//A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".
//The Strategy Pattern is also known as Policy.
//یک الگوی استراتژی می گوید: "یک خانواده عملکرد را تعریف می کند ، هر یک را محاصره می کند و آنها را قابل تعویض می کند".
//الگوی استراتژی به عنوان خط مشی نیز شناخته می شود.
public class BehavioralStrategyTest {
    //ضمینه محاسباتی
    Context context;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
         context = null;
    }

    /**
     * این متد Strategy Design Pattern را در حالت جمع تست میکند
     */
    @Test
    void strategyAdditionTest() {
        context = new Context(new StrategyAddition());
        Assertions.assertEquals(Float.valueOf(16), context.executeStrategy(10f,6f));
    }

    /**
     * این متد Strategy Design Pattern را در حالت تفریق تست میکند
     */
    @Test
    void strategySubtractionTest() {
        context = new Context(new StrategySubtraction());
        Assertions.assertEquals(Float.valueOf(4), context.executeStrategy(10f,6f));
    }

    /**
     * این متد Strategy Design Pattern را در حالت ضرب تست میکند
     */
    @Test
    void strategyMultiplicationTest() {
        context = new Context(new StrategyMultiplication());
        Assertions.assertEquals(Float.valueOf(60), context.executeStrategy(10f,6f));
    }
}
