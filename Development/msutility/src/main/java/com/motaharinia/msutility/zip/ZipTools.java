package com.motaharinia.msutility.zip;


import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import net.lingala.zip4j.ZipFile;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.FileOutputStream;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * اینترفیس متدهای ابزاری کار با فایلهای فشرده
 */
public interface ZipTools {


    /**
     * این متد آرایه بایت داده فایل زیپ و مسیری برای استخراج فایل زیپ و رمز استخراج فایل زیپ را از ورودی دریافت میکند و در مسیر آن را استخراج مینماید
     *
     * @param sourceByteArray              آرایه بایت داده فایل زیپ
     * @param destinationDirectoryForUnzip مسیری برای استخراج فایل زیپ
     * @param password                     رمز استخراج فایل زیپ
     * @throws Exception
     */
    static void unzipFromByteArray(@NotNull byte[] sourceByteArray, @NotNull String destinationDirectoryForUnzip, String password) throws Exception {
        if (ObjectUtils.isEmpty(sourceByteArray)) {
            throw new UtilityException(ZipTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "sourceByteArray");
        }
        if (ObjectUtils.isEmpty(destinationDirectoryForUnzip)) {
            throw new UtilityException(ZipTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "destinationDirectoryForUnzip");
        }
        File tempFile = File.createTempFile("tmp", ".zip", null);
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(sourceByteArray);
        ZipFile zipFile = new ZipFile(tempFile);
        if (zipFile.isEncrypted() && !ObjectUtils.isEmpty(password)) {
            zipFile.setPassword(password.toCharArray());
        }
        zipFile.extractAll(destinationDirectoryForUnzip);
    }

    /**
     * این متد مسیر فایل زیپ و مسیری برای استخراج فایل زیپ و رمز استخراج فایل زیپ را از ورودی دریافت میکند و در مسیر آن را استخراج مینماید
     *
     * @param sourceZipFilePath            مسیر فایل زیپ
     * @param destinationDirectoryForUnzip مسیری برای استخراج فایل زیپ
     * @param password                     رمز استخراج فایل زیپ
     * @throws Exception
     */
    static void unzip(@NotNull String sourceZipFilePath, @NotNull String destinationDirectoryForUnzip, String password) throws Exception {
        if (ObjectUtils.isEmpty(sourceZipFilePath)) {
            throw new UtilityException(ZipTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "sourceZipFilePath");
        }
        if (ObjectUtils.isEmpty(destinationDirectoryForUnzip)) {
            throw new UtilityException(ZipTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "destinationDirectoryForUnzip");
        }
        ZipFile zipFile = new ZipFile(sourceZipFilePath);
        if (zipFile.isEncrypted() && !ObjectUtils.isEmpty(password)) {
            zipFile.setPassword(password.toCharArray());
        }
        zipFile.extractAll(destinationDirectoryForUnzip);
    }

}
