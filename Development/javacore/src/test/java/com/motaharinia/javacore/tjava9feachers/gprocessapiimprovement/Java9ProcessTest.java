package com.motaharinia.javacore.tjava9feachers.gprocessapiimprovement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-9-process-api-improvement
 */
public class Java9ProcessTest {
    //متغیر تست
    Java9Process java9Process;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9Process = new  Java9Process();
    }

    /**
     * این متد ،Process را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9ProcessTest() throws Exception {
        java9Process.getProcessMap().entrySet().forEach(entry->{
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
        Assertions.assertEquals("class java.lang.ProcessHandleImpl", java9Process.getProcessMap().get("Class name"));
    }
}
