package com.motaharinia.javacore.polymorphism;

//The covariant return type specifies that the return type may vary in the same direction as the subclass.
//Before Java5, it was not possible to override any method by changing the return type.
//But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type.
//نوع برگشت کوواریت مشخص می کند که نوع بازگشت ممکن است در همان جهت subclass فرق کند.
//قبل از Java5 ، امکان تغییر هر متد با تغییر نوع برگشت امکان پذیر نبود.
// اما اکنون ، از Java5 ، می توان با تغییر دادن نوع بازگشت ، اگر روش فراتر از هر روش که نوع بازگشت آن غیر Primitive باشد ، رد کرد و نوع بازگشت آن را به نوع فرعی تغییر داد.
public class CovariantReturnType {
    CovariantReturnType get(){return this;}
}

class CovariantReturnTypeChild extends CovariantReturnType{
    CovariantReturnTypeChild get(){return this;}
}