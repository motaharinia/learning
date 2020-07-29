package com.motaharinia.msutility.image;


import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.fso.FsoTools;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ObjectUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * اینترفیس متدهای ابزاری کار با تصاویر
 */
public interface ImageTools {


    /**
     * این متد یک مسیر دایرکتوری و نام کامل فایل تصویر و ارتفاع و عرض تصویر را از ورودی دریافت میکند و تصویر بندانگشتی فایل تصویر را با طول و عرض داده شده ثبت مینماید
     *
     * @param directoryPath مسیر دایرکتوری
     * @param fileFullName  نام کامل فایل
     * @param height        ارتفاع تصویر
     * @param width         عرض تصویر
     * @throws Exception این متد ممکن است اکسپشن داشته باشد
*/
    static void createThumb(@NotNull String directoryPath, @NotNull String fileFullName, @NotNull Integer height, @NotNull Integer width) throws Exception {
        if (ObjectUtils.isEmpty(directoryPath)) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "directoryPath");
        }
        if (ObjectUtils.isEmpty(fileFullName)) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "fileFullName");
        }
        if (ObjectUtils.isEmpty(height)) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "height");
        }
        if (ObjectUtils.isEmpty(width)) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "width");
        }
        if (height < 1) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_ZERO_OR_NEGATIVE, "height:" + height);
        }
        if (width < 1) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_ZERO_OR_NEGATIVE, "width:" + width);
        }
        Float z = 0f;
        Integer newWidth = 0;
        Integer newHeight = 0;
        BufferedImage originalImage = ImageIO.read(new File(directoryPath + "/" + fileFullName));
        if (ObjectUtils.isEmpty(originalImage)) {
            throw new UtilityException(ImageTools.class, UtilityExceptionKeyEnum.IMAGE_ORGINAL_READ_PROBLEM, "originalImage is null");
        }
        Integer originalWidth = originalImage.getWidth();
        Integer originalHeight = originalImage.getHeight();
        if ((originalWidth <= width) && (originalHeight <= height)) {
            newHeight = originalHeight;
            newWidth = originalWidth;
        } else {
            if ((originalWidth > width) && (originalHeight > height)) {
                if (originalWidth >= originalHeight) {
                    z = (float) width / originalWidth;
                } else {
                    z = (float) height / originalHeight;
                }
            } else if ((originalWidth > width) && (originalHeight <= height)) {
                z = (float) width / originalWidth;
            } else if ((originalWidth <= width) && (originalHeight > height)) {
                z = (float) height / originalHeight;
            }
            newHeight = (int) (originalHeight * z);
            newWidth = (int) (originalWidth * z);
        }
        int imageType = originalImage.getType();
        if (imageType == 0) {
            imageType = BufferedImage.TYPE_INT_RGB;
        }
        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, imageType);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        ImageIO.write(resizedImage, FsoTools.getFileExtension(fileFullName), new File(directoryPath + "/"+ fileFullName + "-" + width + ".thumb"));
    }
}
