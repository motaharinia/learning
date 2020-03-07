package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.objectpool.ExportingProcess;
import com.motaharinia.designpattern.creational.objectpool.ExportingResult;
import com.motaharinia.designpattern.creational.objectpool.ExportingTask;
import com.motaharinia.designpattern.creational.objectpool.ObjectPool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolTest {
    //استخر اشیا
    private ObjectPool<ExportingProcess> pool;
    //شماره پردازش
    private AtomicLong processNo;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        ExportingResult.doneCount=0;
        processNo = new AtomicLong(0);
        //ایجاد یک استخر اشیا از کلاس ExportingProcess با حداقل تعداد 4 شیی و حداکثر 10 شیی با دوره 5 ثانبه
        //اگر دوره را منفی بدهیم هیچ بررسی دوره ای انجام نخواهد شد
        pool = new ObjectPool<ExportingProcess>(4, 10, 5L) {
            protected ExportingProcess createObject() {
                //ایجاد یک شیی تستی که برای ایجاد شدن کمی زمان میبرد
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    /**
     * این متد  Object Pool Design Pattern را تست میکند
     */
    @Test
    void objectPoolTest() {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        // اجرای 8 تسک ExportingTask در نخ های جداگانه
        //هر ExportingTask یک آبجکت ExportingProcess را از استخر اشیا قرض میگیرد ، استفاده میکند و دوباره به استخر بر میگرداند
        //و کار استخر اشیا این است که در زمان بندی مشخص اگر تعداد اشیا داخل خودش را بین تعداد حداقل و حداکثر داده شده آماده داشته باشد
        executor.execute(new ExportingTask(pool, 1));
        executor.execute(new ExportingTask(pool, 2));
        executor.execute(new ExportingTask(pool, 3));
        executor.execute(new ExportingTask(pool, 4));
        executor.execute(new ExportingTask(pool, 5));
        executor.execute(new ExportingTask(pool, 6));
        executor.execute(new ExportingTask(pool, 7));
        executor.execute(new ExportingTask(pool, 8));


        //با shutdown کردن اجرا کننده ، دیگر اجرا کننده تسک جدید قبول نمی کند و خود را برای اتمام عملیات تسکها آمده میکند
        executor.shutdown();
        try {
            //به اجراکننده میگوییم تا زمان اجرای کامل تسکها یا زمان timeout که دادیم راجرای ادامه برنامه را متوقف کند
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //استخر اشیا را خاموش میکنیم
        pool.shutdown();
        Assertions.assertEquals(8, ExportingResult.doneCount);
    }

}
