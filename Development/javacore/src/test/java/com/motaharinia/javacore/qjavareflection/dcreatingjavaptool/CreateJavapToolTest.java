package com.motaharinia.javacore.qjavareflection.dcreatingjavaptool;

import com.motaharinia.javacore.qjavareflection.ecreatingappletviewer.CustomApplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CreateJavapToolTest {
    //متغیر تست
    CreateJavapTool createJavapTool;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        createJavapTool = new CreateJavapTool();
    }

    /**
     * این متد پیاده سازی Javap در جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void createJavapToolTest() throws Exception {
        Assertions.assertEquals("firstName,lastName,getFirstName,getLastName,com.motaharinia.javacore.qjavareflection.dcreatingjavaptool.CreateJavapToolSample,", createJavapTool.getMetadata(CreateJavapToolSample.class));
    }
}
