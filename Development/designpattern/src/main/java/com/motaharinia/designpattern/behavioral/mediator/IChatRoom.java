package com.motaharinia.designpattern.behavioral.mediator;

//Mediator Interface
public interface IChatRoom {
    /**
     * این متد پیامی را به کاربر با شناسه مورد نظر ارسال میکند
     * @param msg پیام
     * @param userId شناسه کاربر
     */
    public void sendMessage(String msg, String userId);

    /**
     * این متد یک کاربر را اضافه میکند
     * @param user کاربر
     */
    void addUser(User user);
}
