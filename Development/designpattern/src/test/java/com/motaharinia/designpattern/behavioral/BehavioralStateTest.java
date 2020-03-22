package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.state.AlertStateContext;
import com.motaharinia.designpattern.behavioral.state.Silent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.geeksforgeeks.org/state-design-pattern/
//https://www.javatpoint.com/state-pattern
//A State Pattern says that "the class behavior changes based on its state".
// In State Pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
//The State Pattern is also known as Objects for States.
//الگوی وضعیت می گوید: "رفتار طبقاتی براساس حالت آن تغییر می کند".
// در الگوی وضعیت ، ما اشیاء را می سازیم که نمایانگر حالات مختلف و یک شیء متن است که با تغییر شیء حالت آن ، رفتار متفاوت است.
//الگوی وضعیت همچنین به عنوان اشیاء برای ایالت ها شناخته می شود.
public class BehavioralStateTest {

    //ضمینه وضعیت موبایل
    AlertStateContext stateContext;
    //نتیجه آلارم موبایل
    String alertResult;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        stateContext = new AlertStateContext();
        alertResult = "";
    }

    /**
     * این متد State Design Pattern را تست میکند
     */
    @Test
    void stateTest() {
        alertResult = stateContext.alert();
        stateContext.setState(new Silent());
        alertResult = stateContext.alert();
        Assertions.assertEquals("silent", alertResult);
    }
}
