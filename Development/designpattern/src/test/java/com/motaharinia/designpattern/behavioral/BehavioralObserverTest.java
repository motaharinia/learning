package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.observer.PCLNewsAgency;
import com.motaharinia.designpattern.behavioral.observer.PCLNewsChannel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.baeldung.com/java-observer-pattern
//https://www.javatpoint.com/observer-pattern
//An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically".
//The Memento pattern is also known as Dependents or Publish-Subscribe.
//الگوی Observer می گوید "فقط یک وابستگی یک به یک را تعیین کنید تا وقتی یک شی تغییر حالت داد ، تمام وابستگانش به طور خودکار مطلع و به روز شوند".
//الگوی Memento به عنوان Dependents یا Publish-Subscribe نیز شناخته می شود.
public class BehavioralObserverTest {

    //شیی قابل رصد
    PCLNewsAgency observable;
    //شیی رصد کننده
    PCLNewsChannel observer;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        observable = new PCLNewsAgency();
        observer = new PCLNewsChannel();
    }

    /**
     * این متد Observer Design Pattern را تست میکند
     */
    @Test
    void observerTest() {
        observable.addPropertyChangeListener(observer);
        observable.setNews("news");
        Assertions.assertEquals("news", observer.getNews());
    }
}
