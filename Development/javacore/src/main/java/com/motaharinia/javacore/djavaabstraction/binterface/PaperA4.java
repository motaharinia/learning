package com.motaharinia.javacore.djavaabstraction.binterface;

public class PaperA4 implements PrintableA4,Previewable,Showable,Drawable {
    /**
     * پیش نمایش
     *
     * @return خروجی: پیش نمایش
     */
    @Override
    public String preview() {
        return null;
    }

    /**
     * تنظیمات اندازه چاپ را برای واسط پرینتر میفرستد
     *
     * @return خروجی: نتیجه
     */
    @Override
    public String setPrinterSize() {
        return null;
    }

    /**
     * پرینت محتویات
     *
     * @return خروجی: نتیجه
     */
    @Override
    public String print() {
        return null;
    }
}
