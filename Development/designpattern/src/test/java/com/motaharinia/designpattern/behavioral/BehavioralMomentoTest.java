package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.momento.Caretaker;
import com.motaharinia.designpattern.behavioral.momento.Originator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/memento-pattern
//A Memento Pattern says that "to restore the state of an object to its previous state".
//But it must do this without violating Encapsulation. Such case is useful in case of error or failure.
//The Memento pattern is also known as Token.
//Undo or backspace or ctrl+z is one of the most used operation in an editor.
//Memento design pattern is used to implement the undo operation.
//This is done by saving the current state of the object as it changes state.
//الگوی یادآوری می گوید "بازگرداندن وضعیت یک شی به حالت قبلی خود".
// اما باید این کار را بدون نقض Encapsulation انجام دهد. چنین موردی در صورت بروز خطا یا عدم موفقیت مفید است.
//الگوی Memento به Token نیز معروف است.
//واگرد یا backspace یا ctrl + z یکی از پرکاربردترین عملکردها در یک ویرایشگر است.
// الگوی طراحی یادمان برای اجرای عملیات خنثی سازی استفاده می شود.
// این با صرفه جویی در وضعیت فعلی جسم با تغییر حالت انجام می شود.
public class BehavioralMomentoTest {
    Originator originator = new Originator();
    Caretaker careTaker = new Caretaker();

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
         originator = new Originator();
         careTaker = new Caretaker();
    }

    /**
     * این متد Momento Design Pattern را تست میکند
     */
    @Test
    void momentoTest() {
        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        originator.getStateFromMemento(careTaker.get(1));
        Assertions.assertEquals("State #2", originator.getState());
    }
}
