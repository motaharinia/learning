package com.motaharinia.designpattern.creational.factorymethod.plan;

public enum PlanEnum {
    DOMESTIC_PLAN("DOMESTIC_PLAN"),
    COMMERCIAL_PLAN("COMMERCIAL_PLAN"),
    INSTITUTIONAL_PLAN("INSTITUTIONAL_PLAN");

    //مقدار ثابت طرح مصرف برق
    private String value;

    /**
     * مقدار ثابت طرح مصرف برق را خروجی میدهد
     *
     * @return خروجی: مقدار ثابت طرح مصرف برق
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت طرح مصرف برق از روی مقدار ثابت آن
     *
     * @param value مقدار ثابت طرح مصرف برق
     */
    PlanEnum(String value) {
        this.value = value;
    }
}
