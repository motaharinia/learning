package com.motaharinia.javacore.inheritance;

//Multilevel Inheritance:
//When there is a chain of inheritance, it is known as multilevel inheritance.
//وقتی زنجیره ای از ارث بری وجود دارد ، به عنوان وراثت چند سطحی شناخته می شود.
public class BabyDog extends Dog {
    /**
     * گریه کردن سگبچه
     */
    void weep() {
        this.energy = this.energy - 2;
    }
}
