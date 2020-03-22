package com.motaharinia.designpattern.behavioral.state;

public interface MobileAlertState {

    /**
     * متد آلارم ویبره یا سایلنت گوشی
     *
     * @param ctx ضمینه وضعیت موبایل
     * @return خروجی: برای تست نوع آلارم را خروجی میدهد
     */
    public String alert(AlertStateContext ctx);
}
