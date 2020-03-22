package com.motaharinia.designpattern.behavioral.state;

public class Vibration implements MobileAlertState {

    /**
     * متد آلارم ویبره یا سایلنت گوشی
     *
     * @param ctx ضمینه وضعیت موبایل
     * @return خروجی: برای تست نوع آلارم را خروجی میدهد
     */
    @Override
    public String alert(AlertStateContext ctx) {
        return ("vibration");
    }
}
