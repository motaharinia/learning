package com.motaharinia.msutility.captcha;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 02:31:29<br>
 * Description:<br>
 * کلاس کپچا ابزارهای لازم برای ساخت تصویر کپچای تصادفی را ارائه مینماید
 */
public class Captcha {

    private final Color backgroundColor = new Color(250, 250, 250);
    private final Color linesColor = new Color(86, 86, 86);
    private final Color dotsColor = new Color(0, 0, 0);
    private final Color defaultTextColor = new Color(0, 0, 0);

    private final boolean hasLines = false;
    private final int numberOfLines = 20;

    private final boolean hasDots = false;
    private final int numberOfDots = 1000;

    private final int width = 450;
    private final int fontSize = (width / 6) - 10;
    private final int height = 100;
    private final int numberOfCharacters = 6;
    private final String mode = "alphanumeric"; //alphanumeric | numeric | alphabetical
    private final boolean colorful = false;
    private final Color[] textColors = new Color[]{
        new Color(0, 0, 0), //black
        new Color(64, 64, 64), //gray
        new Color(0, 0, 255), //blue
        new Color(255, 0, 0), //red
        new Color(0, 255, 0), //green
        new Color(51, 0, 0), //brown
        new Color(255, 128, 0), //orange
        new Color(102, 0, 102), //purple
    };

    private final boolean multiFont = false;
    private final int defaultFontIndex = 12;

    private final boolean multiBackground = true;
    private final int defaultBackgroundIndex = 9;

    private final int fontCount = 13;
    private final int backgroundCount = 26;

    private String captcha;

    private Random random;

    public Captcha() {

    }

    public BufferedImage generateCaptcha(String code, String contextPath,Integer imageType) throws Exception {
        random = new Random();
        int fontIndex;
        if (multiFont) {
            fontIndex = random.nextInt(fontCount) + 1;
        }
        else {
            fontIndex = defaultFontIndex;
        }

        URL fontUrl = new URL(contextPath + "/vutility/resources/fonts/captcha/" + fontIndex + ".ttf");
        Font font = new Font("Monospaced", Font.ITALIC | Font.BOLD, fontSize);
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream()).deriveFont(getFontSize(fontIndex));

//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        ge.registerFont(customFont);
        BufferedImage img = new BufferedImage(width, height, imageType);
        Graphics2D g = img.createGraphics();

        g.setColor(backgroundColor);
        g.fillRect(0, 0, width, height);

        //انتخاب تصویر اتفاقی پس زمینه
        int backgroundIndex;
        if (multiBackground) {
            backgroundIndex = random.nextInt(backgroundCount) + 1;
        }
        else {
            backgroundIndex = defaultBackgroundIndex;
        }
        BufferedImage back = ImageIO.read(new URL(contextPath + "/vutility/resources/img/captcha/background/" + backgroundIndex + ".png"));
        g.drawImage(back, 0, 0, width, height, null);

        //تولید متن کپچا
        g.setColor(defaultTextColor);
        g.setFont(customFont);
        int angle = 0;
        int textPositionX = 30;
        int textPositionY = (int) (height / 1.5);
        for (int i = 0; i < code.length(); i++) {
            angle = random.nextInt(30 + 30) - 30;
            AffineTransform original = g.getTransform();
            Font theFont = g.getFont();
            original.rotate(angle * Math.PI / 180);
            Font theDerivedFont = theFont.deriveFont(original);
            g.setFont(theDerivedFont);
            if (colorful) {
                g.setColor(textColors[random.nextInt(8)]);
            }
            g.drawString(code.charAt(i) + "", textPositionX, textPositionY);
            g.setFont(theFont);
            textPositionX += fontSize + 5;
        }

        //تولید خطهای تصادفی
        if (hasLines) {
            int rand, dest;
            int[] sourceCordinates;
            int[] destCordinates;
            g.setColor(linesColor);
            for (int i = 0; i < numberOfLines; i++) {
                rand = random.nextInt(4) + 1;
                sourceCordinates = getCoordinates(rand);
                dest = rand + random.nextInt(3) + 1;
                destCordinates = getCoordinates(dest);
                g.drawLine(sourceCordinates[0], sourceCordinates[1], destCordinates[0], destCordinates[1]);
            }
        }

        //تولید نقطه های تصادفی
        if (hasDots) {
            int randomX = 0, randomY = 0;
            g.setColor(dotsColor);
            for (int i = 0; i < numberOfDots; i++) {
                randomX = random.nextInt(width);
                randomY = random.nextInt(height);
                g.drawLine(randomX, randomY, randomX + 1, randomY + 1);
            }
        }

//        System.out.println("testttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
        return img;
    }

    public String generateRandomCode() {
        String alphanumeric = "ABCDEFGHIJKLMNPQRSTUVWXYZ123456789";
        String numeric = "123456789";
        String alphabetical = "ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String result = "";
        String code = "";
        Random rand = new Random();

        if (mode.equals("alphanumeric")) {
            code = alphanumeric;
        }
        else if (mode.equals("numeric")) {
            code = numeric;
        }
        else {
            code = alphabetical;
        }
        int index = 0;
        int randomNum = 0;
        while (index < numberOfCharacters) {
            randomNum = rand.nextInt(code.length() - 1);
            if (!result.contains("" + code.charAt(randomNum))) {
                result += code.charAt(randomNum);
                index++;
            }
        }

        return result;
    }

    public int[] getCoordinates(int direction) {
        int[] coordinates = new int[2];
        Random rand = new Random();
        switch (direction) {
            case 1: //لبه بالای مستطیل
                coordinates[0] = rand.nextInt(width);
                coordinates[1] = 0;
                break;

            case 2: //لبه راست مستطیل
                coordinates[0] = width;
                coordinates[1] = rand.nextInt(height);
                break;

            case 3: //لبه پایین مستطیل
                coordinates[0] = rand.nextInt(width);
                coordinates[1] = height;
                break;

            case 4: //لبه چپ مستطیل
                coordinates[0] = 0;
                coordinates[1] = rand.nextInt(height);
                break;
        }
        return coordinates;
    }



    private Float getFontSize(int fontIndex) {
        Float result = 0f;
        switch (fontIndex) {
            case 1:
                result = 50f;
                break;
            case 2:
                result = 60f;
                break;
            case 3:
                result = 100f;
                break;
            case 4:
                result = 60f;
                break;
            case 5:
                result = 60f;
                break;
            case 6:
                result = 50f;
                break;
            case 7:
                result = 60f;
                break;
            case 8:
                result = 50f;
                break;
            case 9:
                result = 50f;
                break;
            case 10:
                result = 60f;
                break;
            case 11:
                result = 50f;
                break;
            case 12:
                result = 70f;
                break;
            case 13:
                result = 50f;
                break;
        }
        return result;
    }



    //getter-setter:
    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
