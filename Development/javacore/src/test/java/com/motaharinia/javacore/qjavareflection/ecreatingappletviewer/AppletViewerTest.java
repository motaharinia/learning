package com.motaharinia.javacore.qjavareflection.ecreatingappletviewer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/creating-appletviewer-tool
 */
public class AppletViewerTest {
    //متغیر تست
    AppletViewer appletViewer;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        appletViewer = new AppletViewer();
    }

    /**
     * این متد AppletViewer جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void appletViewerTest() throws Exception {
        Assertions.assertEquals(true, appletViewer.view(CustomApplet.class));
    }
}
