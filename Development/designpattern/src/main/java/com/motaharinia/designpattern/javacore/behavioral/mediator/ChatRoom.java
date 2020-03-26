package com.motaharinia.designpattern.javacore.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

//Concrete Mediator
public class ChatRoom implements IChatRoom {

    private Map<String, User> usersMap = new HashMap<>();

    /**
     * این متد پیامی را به کاربر با شناسه مورد نظر ارسال میکند
     *
     * @param msg    پیام
     * @param userId شناسه کاربر
     */
    @Override
    public void sendMessage(String msg, String userId) {
        User user = usersMap.get(userId);
        user.receive(msg);
    }

    /**
     * این متد یک کاربر را اضافه میکند
     *
     * @param user کاربر
     */
    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
