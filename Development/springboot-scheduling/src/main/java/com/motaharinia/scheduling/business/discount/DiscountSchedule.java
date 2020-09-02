package com.motaharinia.scheduling.business.discount;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-09-02<br>
 * Time: 15:02:05<br>
 * Description:<br>
 * کلاس زمان بندی تخفیفها
 */
@Component
public class DiscountSchedule {

    /**
     * شمارنده متد زمانبندی ثابت هر 5 میلی ثانیه یک بار
     */
    public AtomicInteger fixedDelayCount = new AtomicInteger(0);

    /**
     * متد زمان بندی ثابت هر 5 میلی ثانیه یک بار
     */
    @Scheduled(fixedDelay = 5)
    public void fixedDelay() {
        this.fixedDelayCount.incrementAndGet();
    }

    /**
     * متد زمان بندی که هر روز از ساعت 9 تا 9:59 فراخوانی میشود.
     */
    @Scheduled(cron = "0 * 9 * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }
}
