package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.mediator.ChatRoom;
import com.motaharinia.designpattern.javacore.behavioral.mediator.ChatUser;
import com.motaharinia.designpattern.javacore.behavioral.mediator.IChatRoom;
import com.motaharinia.designpattern.javacore.behavioral.mediator.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/mediator-pattern
//https://howtodoinjava.com/design-patterns/behavioral/mediator-pattern/
//A Mediator Pattern says that "to define an object that encapsulates how a set of objects interact".
//I will explain the Mediator pattern by considering a problem.
//When we begin with development, we have a few classes and these classes interact with each other producing results.
//Now, consider slowly, the logic becomes more complex when functionality increases. Then what happens?
//We add more classes and they still interact with each other but it gets really difficult to maintain this code now. So, Mediator pattern takes care of this problem.
//Mediator pattern is used to reduce communication complexity between multiple objects or classes.
//This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintainability of the code by loose coupling.
//الگوی میانجی می گوید "یک شیء که چگونگی تعامل مجموعه ای از اشیاء را در بر می گیرد را تعریف کنید".
//من الگوی Mediator را با در نظر گرفتن مشکلی توضیح خواهم داد.
// هنگامی که با توسعه شروع می کنیم ، چند کلاس داریم و این کلاس ها با یکدیگر نتیجه می گیرند و نتیجه می دهند
// اکنون ، به آرامی در نظر بگیرید ، با افزایش قابلیت ها ، منطق پیچیده تر می شود. پس چه اتفاقی می افتد؟
// ما کلاسهای بیشتری را اضافه می کنیم و آنها هنوز هم با یکدیگر در تعامل هستند اما حفظ این کد در حال حاضر بسیار دشوار می شود. بنابراین ، الگوی واسطه مراقب این مشکل است.
//الگوی میانجی برای کاهش پیچیدگی ارتباطات بین اشیاء یا کلاسهای مختلف استفاده می شود.
// این الگوی یک کلاس واسطه را ارائه می دهد که بطور معمول کلیه ارتباطات بین طبقات مختلف را کنترل می کند و از قابلیت نگهداری آسان کد توسط جفت سست پشتیبانی می کند.
public class BehavioralMediatorTest {
    //اتاق چت - میانجی کاربران
    IChatRoom chatroom;

    //کاربران
    User user1;
    User user2;
    User user3;
    User user4;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        chatroom = new ChatRoom();
        user1 = new ChatUser(chatroom, "1", "Alex");
        user2 = new ChatUser(chatroom, "2", "Brian");
        user3 = new ChatUser(chatroom, "3", "Charles");
        user4 = new ChatUser(chatroom, "4", "David");
    }

    /**
     * این متد Mediator Design Pattern را تست میکند
     */
    @Test
    void iteratorTest() {
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);
        user1.send("Hello brian", "2");
        Assertions.assertEquals("Hello brian", user2.getLastRecievedMessage());
    }
}
