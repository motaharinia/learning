package com.motaharinia.javacore.inheritance;

public class Animal {
    protected Integer energy = 0;

    void eat() {
        this.energy = this.energy + 10;
    }

    public Integer getEnergy(){
        return this.energy;
    }
}
