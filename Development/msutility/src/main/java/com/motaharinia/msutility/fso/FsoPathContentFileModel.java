package com.motaharinia.msutility.fso;

import java.util.Date;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-22<br>
 * Time: 12:56:41<br>
 * Description:<br>
 * کلاس مدل اطلاعات فایل
 */
public class FsoPathContentFileModel {
    /**
     * نام فایل
     */
    private String name;
    /**
     * پسوند فایل
     */
    private String extension;
    /**
     * نام کامل فایل با پسوند
     */
    private String fullName;
    /**
     * مسیر دایرکتوری والد
     */
    private String directoryPath;
    /**
     * مسیر کامل دایرکتوری به همراه نام فایل
     */
    private String fullPath;
    /**
     * تاریخ آخرین تغییر
     */
    private Date lastModified;
    /**
     * رشته تاریخ آخرین تغییر
     */
    private String lastModifiedString;
    /**
     * حجم دایرکتوری
     */
    private Long size;

    /**
     * متد سازنده پیش فرض
     */
    public FsoPathContentFileModel() {
    }

    /**
     * متد سازنده که با دریافت مشخصات مدل را میسازد
     *
     * @param name               نام فایل
     * @param extension          پسوند فایل
     * @param fullName           نام کامل فایل با پسوند
     * @param directoryPath      مسیر دایرکتوری والد
     * @param fullPath  مسیر کامل دایرکتوری به همراه نام فایل
     * @param lastModified       تاریخ آخرین تغییر
     * @param lastModifiedString رشته تاریخ آخرین تغییر
     * @param size               حجم دایرکتوری
     */
    public FsoPathContentFileModel(String name, String extension, String fullName, String directoryPath, String fullPath, Date lastModified, String lastModifiedString, Long size) {
        this.name = name;
        this.extension = extension;
        this.fullName = fullName;
        this.directoryPath = directoryPath;
        this.fullPath = fullPath;
        this.lastModified = lastModified;
        this.lastModifiedString = lastModifiedString;
        this.size = size;
    }

    @Override
    public String toString() {
        return "FsoPathContentFileModel{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", fullName='" + fullName + '\'' +
                ", directoryPath='" + directoryPath + '\'' +
                ", fullPath='" + fullPath + '\'' +
                ", lastModified=" + lastModified +
                ", lastModifiedString='" + lastModifiedString + '\'' +
                ", size=" + size +
                '}';
    }

    //getter-setter:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedString() {
        return lastModifiedString;
    }

    public void setLastModifiedString(String lastModifiedString) {
        this.lastModifiedString = lastModifiedString;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
