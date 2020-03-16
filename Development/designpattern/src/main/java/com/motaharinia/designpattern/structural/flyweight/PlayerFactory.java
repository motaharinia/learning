package com.motaharinia.designpattern.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {

    //این Hashmap ارجاع به اشیا Terrorist یا CounterTerrorist را در خود نگه میدارد
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    /**
     * این متد یک بازیکن جدید را بر میگرداند
     * @param type نوع بازیکن
     * @return خروجی: بازیکن
     */
    public static Player getPlayer(String type) {
        Player p = null;

        //اگر از قبل از نوع CT یا TS شیی ایجاد شده باشد به سادگی آن را خروجی میدهیم
        if (hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            // برای اولین بار که شیی ایجاد شد آن را در HashMap میریزیم
            hm.put(type, p);
        }
        return p;
    }
}
