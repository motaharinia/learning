package com.motaharinia.msutility.captcha;

import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ObjectUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Random;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 02:31:29<br>
 * Description:<br>
 * کلاس کپچا ابزارهای لازم برای ساخت تصویر کپچای تصادفی را ارائه مینماید
 */
public class Captcha {

    /**
     * رنگ تصویر پس زمینه
     */
    private final Color backgroundColor = new Color(250, 250, 250);
    /**
     * رنگ خطهایی که تصادفی تولید میشوند
     */
    private final Color linesColor = new Color(86, 86, 86);
    /**
     * رنگ نقطه هایی که تصادفی تولید میشوند
     */
    private final Color dotsColor = new Color(0, 0, 0);
    /**
     * رنگ متن پیش فرض حروفی که تصادفی تولید میشوند
     */
    private final Color defaultTextColor = new Color(0, 0, 0);

    /**
     * آیا تصویر کپچا تولیدی خط تصادفی هم داشته باشد؟
     */
    private final boolean hasLines = false;
    /**
     * تعداد خطهای تصادفی جهت تولید
     */
    private final int numberOfLines = 20;

    /**
     * آیا تصویر کپچا تولیدی نقطه تصادفی هم داشته باشد؟
     */
    private final boolean hasDots = false;
    /**
     * تعداد نقطه های تصادفی جهت تولید
     */
    private final int numberOfDots = 1000;

    /**
     * عرض تصویر مورد نظر جهت تولید
     */
    private final int width = 450;
    /**
     * اندازه پیکسلی عرض فونت برای جا شدن تعداد حروف در تصویر
     */
    private final int fontSize = (width / 6) - 10;
    /**
     * طول تصویر مورد نظر جهت تولید
     */
    private final int height = 100;
    /**
     * آیا حروف کپچا رنگی باشند؟
     */
    private final boolean colorful = false;
    /**
     * اگرحروف کپچا قرار هست رنگی باشند از چه رنگهایی ایجاد شوند
     */
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

    /**
     * آیا حروف کپچا از چند فونت ایجاد شوند؟
     */
    private final boolean multiFont = false;
    /**
     * ایندکس فایل فونت پیش فرض در ریسورس
     */
    private final int defaultFontIndex = 12;

    /**
     * آیا تصویر پیش زمینه متغیر باشد؟
     */
    private final boolean multiBackground = true;
    /**
     * ایندکس فایل تصویر پس زمینه پیش فرض در ریسورس
     */
    private final int defaultBackgroundIndex = 9;

    /**
     * تعداد فایلهای فونت موجود در ریسورس
     */
    private final int fontCount = 13;
    /**
     * تعداد فایلهای تصویر پس زمینه موجود در ریسورس
     */
    private final int backgroundCount = 26;

    /**
     * کلاس رندوم برای تولید اعداد اتفاقی
     */
    private Random random;

    public Captcha() {

    }

    /**
     * ایت متد کد اتفاقی و مسیر پیش فرض و نوع تصویر مورد نظر را از ورودی دریافت میکند و یک تصویر کپچا مطابق با آنها خروجی میدهد
     *
     * @param code      کد اتفاقی
     * @param imageType BufferedImage.TYPE_INT_** (Default:BufferedImage.TYPE_INT_RGB)
     * @return خروجی: تصویر کپچا
     * @throws Exception
     */
    @NotNull
    public BufferedImage generateCaptcha(@NotNull String code, @NotNull Integer imageType) throws Exception {
        if (ObjectUtils.isEmpty(code)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "code");
        }
        if (ObjectUtils.isEmpty(imageType)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "imageType");
        }
        InputStream inputStream;
        random = new Random();
        int fontIndex;
        if (multiFont) {
            fontIndex = random.nextInt(fontCount) + 1;
        } else {
            fontIndex = defaultFontIndex;
        }
//        Font font = new Font("Monospaced", Font.ITALIC | Font.BOLD, fontSize);

        inputStream = this.getClass().getClassLoader().getResourceAsStream("static/captcha/font/" + fontIndex + ".ttf");
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(getFontSize(fontIndex));

//        URL fontUrl = new URL(contextPath + "/vutility/resources/fonts/captcha/" + fontIndex + ".ttf");
//        Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream()).deriveFont(getFontSize(fontIndex));

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
        } else {
            backgroundIndex = defaultBackgroundIndex;
        }
        inputStream = this.getClass().getClassLoader().getResourceAsStream("static/captcha/background/" + backgroundIndex + ".png");
        BufferedImage back = ImageIO.read(inputStream);
//        BufferedImage back = ImageIO.read(new URL(contextPath + "/vutility/resources/img/captcha/background/" + backgroundIndex + ".png"));
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


    /**
     * متدی که مقدار عددی لبه بالا(1) یا راست(2) یا پایین(3) یا چپ(4) را دریافت میکند و بر اساس طول و عرض تصویر کپچا مختصات نقطه ای اتفاقی را در لبه مورد نظر خروجی میدهد
     *
     * @param direction مقدار عددی لبه بالا(1) یا راست(2) یا پایین(3) یا چپ(4)
     * @return خروجی: مختصات نقطه ای اتفاقی در لبه مورد نظر
     */
    @NotNull
    public int[] getCoordinates(@NotNull Integer direction) throws Exception {
        if (ObjectUtils.isEmpty(direction)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "direction");
        }
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


    /**
     * متدی که طبق اندیس فایل فونت موجود در ریسورس اندازه قلم متناسب با آن فابل فونت را خروجی میدهد
     *
     * @param fontIndex اندیس فایل فونت موجود در ریسورس
     * @return خروجی: اندازه قلم متناسب با فابل فونت
     */
    @NotNull
    private Float getFontSize(@NotNull Integer fontIndex) {
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


}
