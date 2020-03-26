package com.motaharinia.designpattern.javacore.behavioral.command;

public class ActionSave implements ActionListenerCommand {

    //سند
    private Document doc;

    /**
     * متد سازنده که سند مورد نظر را نیز ورودی میگیرد
     *
     * @param doc
     */
    public ActionSave(Document doc) {
        this.doc = doc;
    }

    /**
     * این متد فعالیت درخواست شده را اجرا میکند
     */
    @Override
    public String execute() {
        return doc.save();
    }
}
