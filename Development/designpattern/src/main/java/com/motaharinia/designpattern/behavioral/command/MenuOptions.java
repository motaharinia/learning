package com.motaharinia.designpattern.behavioral.command;

public class MenuOptions {
    //اجرا کننده بازکردن سند
    private ActionListenerCommand openCommand;
    //اجراکننده ذخیره سند
    private ActionListenerCommand saveCommand;

    /**
     * متد سازنده منو که اجراکننده های بازکننده و ذخیره کننده سند را به عنوان ورودی دریافت میکند
     *
     * @param open اجرا کننده بازکردن سند
     * @param save اجراکننده ذخیره سند
     */
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }

    /**
     * متدی که با کلیک بر روی منوی Open فراخوانی شده و اجرا کننده بازکردن سند را اجرا میکند
     */
    public String clickOpen() {
        return openCommand.execute();
    }

    /**
     * متدی که با کلیک بر روی منوی Save فراخوانی شده و اجرا کننده ذخیره کردن سند را اجرا میکند
     */
    public String clickSave() {
        return saveCommand.execute();
    }
}
