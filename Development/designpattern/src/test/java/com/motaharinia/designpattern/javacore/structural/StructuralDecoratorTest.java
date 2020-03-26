package com.motaharinia.designpattern.javacore.structural;

import com.motaharinia.designpattern.javacore.structural.decorator.Shape;
import com.motaharinia.designpattern.javacore.structural.decorator.concerete.Circle;
import com.motaharinia.designpattern.javacore.structural.decorator.concerete.Rectangle;
import com.motaharinia.designpattern.javacore.structural.decorator.shapedecorator.ColorEnum;
import com.motaharinia.designpattern.javacore.structural.decorator.shapedecorator.FillColorDecorator;
import com.motaharinia.designpattern.javacore.structural.decorator.shapedecorator.BorderColorDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://dzone.com/articles/decorator-design-pattern-in-java
//The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects in the same class.
//We use inheritance to extend the behavior of the class. This takes place at compile time, and all of the instances of that class get the extended behavior.
//Decorator design patterns allow us to add functionality to an object (not the class) at runtime,
// and we can apply this customized functionality to an individual object based on our requirement and choice.
//الگوی طراحی دکوراتور به ما این امکان را می دهد تا بدون اینکه روی رفتار سایر اشیاء موجود در همان کلاس تأثیر بگذارد ، عملکرد و رفتار را به صورت پویا اضافه کنیم.
//ما از وراثت برای گسترش رفتار طبقه استفاده می کنیم. این اتفاق در زمان کامپایل رخ می دهد و همه موارد آن کلاس رفتار گسترده ای را تجربه می کند.
//الگوهای طراحی دکوراتور به ما این امکان را می دهد که در زمان اجرا عملکردی را به یک شی (نه کلاس) اضافه کنیم ،
// و می توانیم بر اساس نیاز و انتخاب خود ، این قابلیت سفارشی شده را روی یک شیء خاص اعمال کنیم.
public class StructuralDecoratorTest {
    Shape circle;
    Shape rectangle;
    Shape circleBorderByColor;
    Shape circleFilledByColor;
    Shape circleBorderAndFilledByColor;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        circle = null;
        rectangle = null;
        circleBorderByColor = null;
        circleFilledByColor = null;
    }


    /**
     * این متد Decorator Design Pattern را تست میکند
     * تست کلاس Concrete دایره
     */
    @Test
    void decoratorConcreteCircleTest() {
        circle = new Circle();
        Assertions.assertEquals("circle", circle.getName().toLowerCase());
    }

    /**
     * این متد Decorator Design Pattern را تست میکند
     * تست کلاس Concrete مستطیل
     */
    @Test
    void decoratorConcreteRectengleTest() {
        rectangle = new Rectangle();
        Assertions.assertEquals("rectangle", rectangle.getName().toLowerCase());
    }


    /**
     * این متد Decorator Design Pattern را تست میکند
     * تست کلاس Decorator دایره با Border رنگی
     */
    @Test
    void decoratorDecoratorCircleBorderByColorTest() {
        circleBorderByColor = new BorderColorDecorator(new Circle(), ColorEnum.RED);
        Assertions.assertEquals("Circle BorderColor: " + ColorEnum.RED.getValue(), circleBorderByColor.getName());
    }


    /**
     * این متد Decorator Design Pattern را تست میکند
     * تست کلاس Decorator دایره با محتوای رنگی
     */
    @Test
    void decoratorDecoratorCircleFilledByColorTest() {
        circleFilledByColor = new FillColorDecorator(new Circle(), ColorEnum.RED);
        Assertions.assertEquals("Circle FillColor: " + ColorEnum.RED.getValue(), circleFilledByColor.getName());
    }


    /**
     * این متد Decorator Design Pattern را تست میکند
     * تست کلاس Decorator دایره با Burder و محتوای رنگی
     */
    @Test
    void decoratorDecoratorCircleBorderAndFilledByColorTest() {
        circleBorderAndFilledByColor = new BorderColorDecorator(new FillColorDecorator(new Circle(), ColorEnum.RED), ColorEnum.RED);
        Assertions.assertEquals("Circle FillColor: " + ColorEnum.RED.getValue() + " BorderColor: " + ColorEnum.RED.getValue(), circleBorderAndFilledByColor.getName());
    }
}
