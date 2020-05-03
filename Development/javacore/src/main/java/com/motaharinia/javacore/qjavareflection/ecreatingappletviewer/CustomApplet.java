package com.motaharinia.javacore.qjavareflection.ecreatingappletviewer;

import java.applet.Applet;
import java.awt.*;

public class CustomApplet extends Applet {
    @Override
    public void paint(Graphics g){g.drawString("Welcome",50, 50);}
}
