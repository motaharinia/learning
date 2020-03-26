package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.template.Chess;
import com.motaharinia.designpattern.javacore.behavioral.template.Game;
import com.motaharinia.designpattern.javacore.behavioral.template.Soccer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/template-pattern
//A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".
//الگوی الگو می گوید "فقط اسكلت یك تابع را در یك عمل تعریف كنید ، و برخی مراحل را به زیر كلاس های خود تغییر دهید."
public class BehavioralTemplateTest {
    //بازی
    Game game;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        game = null;
    }

    /**
     * این متد Template Design Pattern را در حالت شطرنج تست میکند
     */
    @Test
    void templateChessTest() {
        game = new Chess();
        game.play();
        Assertions.assertEquals("Chess,initialize,start,end", game.status);
    }

    /**
     * این متد Template Design Pattern را در حالت فوتبال تست میکند
     */
    @Test
    void templateSoccerTest() {
        game = new Soccer();
        game.play();
        Assertions.assertEquals("Soccer,initialize,start,end", game.status);
    }

}
