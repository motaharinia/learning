package com.motaharinia.designpattern.javacore.creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {
    /**
     * استخر بر اساس ConcurrentLinkedQueue از پکیج java.util.concurrent پیاده سازی شده است
     * کلاس ConcurrentLinkedQueue یک صف thread-safe روی نودهای به هم لینک شده است
     * بخاطر اینکه صف تکنیک FIFO (اولین ورود - اولین خروج) را پیروی میکند
     */
    private ConcurrentLinkedQueue<T> pool;

    /**
     * این سرویس یک تسک ویژه را در یک نخ جداگانه شروع میکند و حداقل و حداکثر تعداد اشیا را در زمان مشخص به صورت دوره ای(با پارامتر validationInterval) در استخر مشاهده میکند
     * *                          وقتی که تعداد اشیا از تعداد حداقل کمتر بشود تعداد نمونه های کمبود ایجاد خواهند شد
     * *                             وقتی که تعداد اشیا از تعداد حداکثر بیشتر بشود تعداد نمونه های اضافی حذف خواهند شد
     * این بعضی اوقات برای بالانس کردن اشیا مصرف کننده حافظه در استخر مفید است
     */
    private ScheduledExecutorService executorService;

    /**
     * این متد استخر را می سازد
     *
     * @param minObjects حداقل تعداد اشیا برای اقامت در استخر
     */
    public ObjectPool(final int minObjects) {
        // راه اندازی اولیه استخر
        initialize(minObjects);
    }

    /**
     * این متد استخر را می سازد
     *
     * @param minObjects          حداقل تعداد اشیا برای اقامت در استخر
     * @param maxObjects          حداکثر تعداد اشیا برای اقامت در استخر
     * @param validationInterval: زمان به ثانیه برای بررسی دوره ای از شرایط حداقل و حداکثر تعداد اشیا در یک نخ جداگانه
     *                            وقتی که تعداد اشیا از تعداد حداقل کمتر بشود تعداد نمونه های کمبود ایجاد خواهند شد
     *                            وقتی که تعداد اشیا از تعداد حداکثر بیشتر بشود تعداد نمونه های اضافی حذف خواهند شد
     */
    public ObjectPool(final Integer minObjects, final Integer maxObjects, final Long validationInterval) {
        // راه اندازی اولیه استخر
        initialize(minObjects);
        //بررسی شرایط استخر در یک نخ جداگانه
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(
                // annonymous کلاس
                new Runnable() {
                    @Override
                    public void run() {
                        Integer size = pool.size();

                        if (size < minObjects) {
                            Integer sizeToBeAdded = minObjects - size;
                            for (Integer i = 0; i < sizeToBeAdded; i++) {
                                pool.add(createObject());
                            }
                        } else if (size > maxObjects) {
                            int sizeToBeRemoved = size - maxObjects;
                            for (Integer i = 0; i < sizeToBeRemoved; i++) {
                                pool.poll();
                            }
                        }
                    }
                }, validationInterval, validationInterval, TimeUnit.SECONDS);
    }

    /**
     * شیی آزاد بعدی در استخر را خروجی میدهد. اگر استخر هیچ شیی نداشته باشد
     * یک شیی جدید ایجاد میکند و به فراخوانی کننده متد برمیگرداند
     *
     * @return خروجی: شیی از نوع T
     */
    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null) {
            object = createObject();
        }
        return object;
    }

    /**
     * شیی را به درون استخر بر میگرداند
     *
     * @param object شیی که میخواهیم به استخر برگردد
     */
    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }

    /**
     * این متد سرویس اجرا کننده استخر اشیا را خاموش میکند
     */
    public void shutdown() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /**
     * این متد یک شیی از نوع T ساخته و خروجی میدهد
     *
     * @return خروجی: شیی از نوع T
     */
    protected abstract T createObject();

    /**
     * این متد استخر اشیا را با تعداد حداقل شیی راه اندازی میکند
     *
     * @param minObjects تعداد حداقل شیی
     */
    private void initialize(final int minObjects) {
        //یک استخر جدید از نوع T ایجاد میکنیم
        pool = new ConcurrentLinkedQueue<T>();
        //به تعداد حداقل شیی ورودی داخل استخر شیی از نوع T ایجاد میکنیم
        for (Integer  i = 0; i < minObjects; i++) {
            pool.add(createObject());
        }
    }
}
