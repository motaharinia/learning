package com.motaharinia.designpattern.javacore.behavioral.mediator;

//Concrete Colleagues
public class ChatUser extends User  {



    /**
     * متد سازنده کاربر چت
     * @param room اتاق چت
     * @param id شناسه کاربر
     * @param name نام کاربر
     */
    public ChatUser(IChatRoom room, String id, String name) {
        super(room, id, name);
    }

    /**
     * این متد پیامی را به شناسه کاربر دلخواه ارسال میکند
     *
     * @param msg    پیام
     * @param userId شناسه کاربر
     */
    @Override
    public void send(String msg, String userId) {
        getMediator().sendMessage(msg, userId);
    }

    /**
     * این متد یک پیام را دریافت میکند
     *
     * @param msg پیام
     */
    @Override
    public void receive(String msg) {
        lastRecievedMessage=msg;
    }


}
