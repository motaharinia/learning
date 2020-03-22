package com.motaharinia.designpattern.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    //خبر
    private String news;

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.news=((String) evt.getNewValue());
    }

    /**
     * این متد خبر را خروجی میدهد
     * @return خروجی: خبر
     */
    public String getNews() {
        return news;
    }
}
