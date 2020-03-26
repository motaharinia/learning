package com.motaharinia.designpattern.javacore.behavioral.template;

public class Soccer extends Game {

    /**
     * متد سازنده
     */
    public Soccer() {
        this.status = "Soccer";
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
