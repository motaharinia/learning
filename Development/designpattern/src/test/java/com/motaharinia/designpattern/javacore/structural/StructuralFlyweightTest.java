package com.motaharinia.designpattern.javacore.structural;

import com.motaharinia.designpattern.javacore.structural.flyweight.CounterTerrorist;
import com.motaharinia.designpattern.javacore.structural.flyweight.Player;
import com.motaharinia.designpattern.javacore.structural.flyweight.PlayerFactory;
import com.motaharinia.designpattern.javacore.structural.flyweight.Terrorist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/flyweight-pattern
//A Flyweight Pattern says that just "to reuse already existing similar kind of objects by storing them and create new object when no matching object is found".
//یک الگوی Flyweight می گوید فقط "برای استفاده مجدد از اشیاء مشابه موجود از قبل با ذخیره کردن آنها و ایجاد جسم جدید در هنگام یافتن هیچ جسم مطابقت".
public class StructuralFlyweightTest {

    Player player1;
    Player player2;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        player1 = new Terrorist();
        player2 = new CounterTerrorist();
    }

    /**
     * این متد Flyweight Design Pattern را تست میکند
     * تست بازیکن Terrorist
     */
    @Test
    void flyweightTerroristTest() {
        player1 =  PlayerFactory.getPlayer("Terrorist");
        player1.assignWeapon("AK-47");
        player2 =  PlayerFactory.getPlayer("Terrorist");
        player2.assignWeapon("AK-47");
        Assertions.assertEquals(player1, player2);
    }


    /**
     * این متد Flyweight Design Pattern را تست میکند
     * تست بازیکن CounterTerrorist
     */
    @Test
    void flyweightCounterTerroristTest() {
        player1 =  PlayerFactory.getPlayer("CounterTerrorist");
        player1.assignWeapon("AK-47");
        player2 =  PlayerFactory.getPlayer("CounterTerrorist");
        player2.assignWeapon("AK-47");
        Assertions.assertEquals(player1, player2);
    }
}
