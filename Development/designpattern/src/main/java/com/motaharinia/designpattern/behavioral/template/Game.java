package com.motaharinia.designpattern.behavioral.template;

public abstract class Game {

    //وضعیت بازی
    public String status = "";

    /**
     * متد اماده سازی اولیه بازی
     */
    abstract void initialize();

    /**
     * متد شروع بازی
     */
    abstract void start();

    /**
     * متد پایان بازی
     */
    abstract void end();

    /**
     * متد اجرای کامل بازی
     */
    public final void play() {

        //initialize the game
        initialize();

        //start game
        start();

        //end game
        end();
    }
}
