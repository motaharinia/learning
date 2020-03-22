package com.motaharinia.designpattern.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//observable
public class PCLNewsAgency {
    //خبر
    private String news;

    //شیی باخبرکننده تغییرات اشیاء
    private PropertyChangeSupport support;

    /**
     * متد سازنده که شیی باخبرکننده را میسازد
     */
    public PCLNewsAgency() {
        support = new PropertyChangeSupport(this);
    }

    /**
     * این متد یک شنونده را به شیی باخبرکننده اضافه میکند
     *
     * @param pcl شنونده
     */
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    /**
     * این متد یک شنونده را از شیی باخبرکننده حذف میکند
     *
     * @param pcl شنونده
     */
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    /**
     * این متد خبر جدید را به باخبرکننده میدهد و در فیلد خبر کلاس ست میکند
     * @param value خبر
     */
    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
