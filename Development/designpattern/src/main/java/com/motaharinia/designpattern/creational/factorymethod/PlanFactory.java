package com.motaharinia.designpattern.creational.factorymethod;

import com.motaharinia.designpattern.creational.factorymethod.plan.*;

public class PlanFactory {
    /**
     * این متد فکتوری طرح مصرف برق میباشد از طریق ثابت طرح مصرف برق مورد نظر آبجکت طرح مصرف برق مورد نظر را خروجی میدهد
     *
     * @param planEnum ثابت طرح مصرف برق مورد نظر
     * @return خروجی: آبجکت طرح مصرف برق
     */
    public Plan getPlan(PlanEnum planEnum) {
        if (planEnum == null) {
            return null;
        } else {
            switch (planEnum) {
                case COMMERCIAL_PLAN:
                    return new CommercialPlan();
                case DOMESTIC_PLAN:
                    return new DomesticPlan();
                case INSTITUTIONAL_PLAN:
                    return new InstitutionalPlan();
                default:
                    return null;
            }
        }
    }
}