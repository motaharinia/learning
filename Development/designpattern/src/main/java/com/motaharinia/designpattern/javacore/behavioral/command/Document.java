package com.motaharinia.designpattern.javacore.behavioral.command;

public class Document {
    /**
     * این متد سندی را باز میکند
     */
    public String open() {
        return("Document Opened");
    }

    /**
     * این متد سندی را ذخیره میکند
     */
    public String save() {
        return("Document Saved");
    }
}
