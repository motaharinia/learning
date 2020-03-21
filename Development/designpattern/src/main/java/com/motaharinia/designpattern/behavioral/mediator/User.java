package com.motaharinia.designpattern.behavioral.mediator;

//Colleague Class
public abstract class User {
    //میانجی
    private IChatRoom mediator;

    //شناسه کاربری
    private String id;
    //نام کاربر
    private String name;
    //آخرین پیام دریافتی
    protected String lastRecievedMessage;

    /**
     * متد سازنده کاربر که کاربر را با اتاق چت و شناسه و نام ایجاد میکند
     *
     * @param room اتاق چت
     * @param id   شناسه کاربر
     * @param name نام کاربر
     */
    public User(IChatRoom room, String id, String name) {
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    /**
     * این متد پیامی را به شناسه کاربر دلخواه ارسال میکند
     *
     * @param msg    پیام
     * @param userId شناسه کاربر
     */
    public abstract void send(String msg, String userId);

    /**
     * این متد یک پیام را دریافت میکند
     *
     * @param msg پیام
     */
    public abstract void receive(String msg);

    /**
     * این متد میانجی کاربر را خروجی میدهد
     *
     * @return خروجی: میانجی کاربر
     */
    public IChatRoom getMediator() {
        return mediator;
    }

    /**
     * این متد شناسه کاربر را خروجی میدهد
     *
     * @return خروجی: شناسه کاربر
     */
    public String getId() {
        return id;
    }

    /**
     * این متد نام کاربر را خروجی میدهد
     *
     * @return خروجی: نام کاربر
     */
    public String getName() {
        return name;
    }


    /**
     * این متد آخرین پیام دریافتی کاربر را خروجی میدهد
     *
     * @return خروجی:  آخرین پیام دریافتی کاربر
     */
    public String getLastRecievedMessage() {
        return lastRecievedMessage;
    }

}
