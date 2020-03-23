package com.motaharinia.designpattern.behavioral.template;

public class Chess extends Game {

    /**
     * متد سازنده
     */
    public Chess() {
        this.status = "Chess";
    }

    /**
     * متد اماده سازی اولیه بازی
     */
    @Override
    void initialize() {
        this.status += ",initialize";
    }

    /**
     * متد شروع بازی
     */
    @Override
    void start() {
        this.status += ",start";
    }

    /**
     * متد پایان بازی
     */
    @Override
    void end() {
        this.status += ",end";
    }
}
