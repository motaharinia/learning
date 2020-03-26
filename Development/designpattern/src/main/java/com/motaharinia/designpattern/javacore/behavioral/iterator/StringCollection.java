package com.motaharinia.designpattern.javacore.behavioral.iterator;

public class StringCollection implements Iterator {
    private String nameArray[];
    private Integer i=0;

    public StringCollection(String[] nameArray) {
        this.nameArray = nameArray;
    }

    @Override
    public Boolean hasNext() {
        if (i < this.nameArray.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.nameArray[i++];
        }
        return null;
    }
}
