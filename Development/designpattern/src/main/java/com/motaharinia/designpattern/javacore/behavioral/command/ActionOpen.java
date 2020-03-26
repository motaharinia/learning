package com.motaharinia.designpattern.javacore.behavioral.command;

public class ActionOpen implements ActionListenerCommand {

    //سند
    private Document doc;

    /**
     * متد سازنده که سند مورد نظر را نیز ورودی میگیرد
     *
     * @param doc
     */
    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    /**
     * این متد فعالیت درخواست شده را اجرا میکند
     */
    @Override
    public String execute() {
      return  doc.open();
    }
}
