package com.motaharinia.javacore.rjavacollection.wcomparatorinterface;

public class JavaComparatorStudent {
    Integer rollno;
    String name;
    Integer age;

    JavaComparatorStudent(Integer rollno, String name, Integer age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
