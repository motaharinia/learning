package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.command.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/command-pattern
//A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object.
//Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".
//الگوی Command Pattern می گوید: "یک درخواست را در زیر یک موضوع به عنوان دستور محصور کنید و آن را به شیء invoker منتقل کنید.
// فاکتور Invoker به دنبال شی مناسب می شود که بتواند این دستور را انجام دهد و فرمان را به شیء مربوطه منتقل کند و آن شی دستور را اجرا کند".
public class BehavioralCommandTest {
    Document doc;
    ActionListenerCommand clickOpen;
    ActionListenerCommand clickSave;
    MenuOptions menu;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
         doc = new Document();
         clickOpen = new ActionOpen(doc);
         clickSave = new ActionSave(doc);
         menu = new MenuOptions(clickOpen, clickSave);
    }

    /**
     * این متد Command Design Pattern را در حالت باز کردن سند تست میکند
     */
    @Test
    void commandOpenTest() {
        String result = menu.clickOpen();
        Assertions.assertEquals("Document Opened", result);
    }

    /**
     * این متد Command Design Pattern را در حالت باز کردن سند تست میکند
     */
    @Test
    void commandSaveTest() {
        String result = menu.clickSave();
        Assertions.assertEquals("Document Saved", result);
    }
}
