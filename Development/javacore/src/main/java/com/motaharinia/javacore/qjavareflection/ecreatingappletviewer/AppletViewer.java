package com.motaharinia.javacore.qjavareflection.ecreatingappletviewer;

import java.applet.Applet;
import java.awt.*;

/**
 * https://www.javatpoint.com/creating-appletviewer-tool
 * Creating your own appletviewer
 * As you know well that appletviewer tool creates a frame and displays the output of applet in the frame.
 * You can also create your frame and display the applet output.
 * ایجاد اپلیکیشن شخصی شما
 * همانطور که به خوبی می دانید ابزار Appletviewer یک فریم ایجاد می کند و خروجی اپلت را در قاب نمایش می دهد.
 * همچنین می توانید فریم خود را ایجاد کرده و خروجی اپلت را نمایش دهید.
 */
public class AppletViewer extends Frame {
    public Boolean view(Class clazz ) throws Exception {
        AppletViewer appletViewer = new AppletViewer();
        appletViewer.setSize(400, 400);
        appletViewer.setLayout(null);
        appletViewer.setVisible(true);

        /**
         * Java applet is deprecated since java 9
         * https://web.archive.org/web/20170210035213/http://www.oracle.com/technetwork/java/javase/migratingfromapplets-2872444.pdf
         *
         */
        Applet applet = (Applet) clazz.newInstance();
        applet.start();
        Graphics g = appletViewer.getGraphics();
        applet.paint(g);
        Thread.sleep(2000);
        applet.stop();
        return true;
    }
}


