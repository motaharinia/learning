package com.motaharinia.msutility.fso;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.motaharinia.msutility.customfield.CustomDate;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-22<br>
 * Time: 12:43:42<br>
 * Description:<br>
 * کلاس مدل فایل جهت ارسال به کلاینت
 */
public class FileViewModel {

    /**
     * نام فایل
     * example:"2019-06-12_10-39-29_dsa - Copy (2)"
     */
    private String name;
    /**
     * پسوند فایل
     * example:"png"
     */
    private String extension;
    /**
     * نام کامل فایل با پسوند
     * example:"2019-06-12_10-39-29_dsa - Copy (2).png"
     */
    private String fullName;
    /**
     * مسیر کامل دایرکتوری به همراه نام فایل
     * example:"/70755/personality/2019-06-12_10-39-29_dsa - Copy (2).png"
     */
    @JsonIgnore
    private String fullPath;
    /**
     * قسمت هش شده ای از مسیر کامل دایرکتوری به همراه نام فایل
     * example:"LzcwNzU1L3BlcnNvbmFsaXR5LzIwMTktMDYtMTJfMTAtMzktMjlfZHNhIC0gQ29weSAoMikucG5n"
     */
    private String hashedPath;
    /**
     * تاریخ آخرین تغییر فایل
     * example:{year:1398,month:10,day:25}
     */
    private CustomDate lastModifiedDate;
    /**
     * حجم فایل
     * example:12109
     */
    private long size;
    /**
     * نوع MIMEType فایل
     * example:"image/png"
     */
    private String MIMEType;
    /**
     * درصورتی که فایل جدید آپلود شده باشد این فیلد پر میشود
     */
    private String fileKey;
    /**
     * وضعیت فایل
     * example: ADDED,DELETED,EXISTED
     */
    private FileViewModelStatusEnum statusEnum = FileViewModelStatusEnum.EXISTED;


    @Override
    public String toString() {
        return "FileViewModel{" + "name=" + name + ", extension=" + extension + ", fullName=" + fullName + ", realPath=" + fullPath + ", hashedPath=" + hashedPath + ", lastModifiedDate=" + lastModifiedDate + ", size=" + size + ", MIMEType=" + MIMEType + ", fileKey=" + fileKey + '}';
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

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getHashedPath() {
        return hashedPath;
    }

    public void setHashedPath(String hashedPath) {
        this.hashedPath = hashedPath;
    }

    public CustomDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(CustomDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getMIMEType() {
        return MIMEType;
    }

    public void setMIMEType(String MIMEType) {
        this.MIMEType = MIMEType;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public FileViewModelStatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(FileViewModelStatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }


}
