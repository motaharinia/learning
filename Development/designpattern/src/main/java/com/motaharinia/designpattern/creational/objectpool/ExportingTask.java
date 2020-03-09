package com.motaharinia.designpattern.creational.objectpool;

public class ExportingTask implements Runnable {
    //استخر اشیا
    private ObjectPool<ExportingProcess> pool;

    //شماره نخ
    private Integer threadNo;

    /**
     * متد سازنده تسک
     *
     * @param pool     استخر اشیا
     * @param threadNo شماره نخ
     */
    public ExportingTask(ObjectPool<ExportingProcess> pool, Integer threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    public void run() {
        // یک شیی را از استخر اشیا قرض میگیرد
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was borrowed");

        //کار مورد نظر را با شیی قرض گرفته شده انجام میدهیم مثلا به یک متغیر استاتیک یکی اضافه میکنیم
        ExportingResult.doneCount++;

        // کار ما با شیی قرض گرفته شده تمام شده و آن را به استخر اشیا برمیگردانیم
        pool.returnObject(exportingProcess);

        System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was returned");
    }
}
