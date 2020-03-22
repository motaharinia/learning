package com.motaharinia.designpattern.behavioral.state;

public class AlertStateContext {
    //وضعیت آلارم موبایل
    private MobileAlertState currentState;

    /**
     * متد سازنده با وضعیت اولیه ویبره
     */
    public AlertStateContext() {
        currentState = new Vibration();
    }

    /**
     * این متد وضعیت جدید را تنظیم مینماید
     *
     * @param state وضعیت جدید
     */
    public void setState(MobileAlertState state) {
        currentState = state;
    }


    /**
     * متد آلارم بر اساس وضعیت فعلی آلارم میدهد که میتواند ویبره یا سایلنت باشد
     *
     * @return خروجی: نتیجه آلارم
     */
    public String alert() {
        return currentState.alert(this);
    }
}
