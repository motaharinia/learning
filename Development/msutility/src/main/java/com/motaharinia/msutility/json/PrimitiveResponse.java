package com.motaharinia.msutility.json;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای تبدیل به رشته جیسون شدن نوع داده هایی در خروجی متد کنترلر به سمت کلاینت است که تک مقدار هستند و فیلد ندارند مانند نوع داده بولین
 */
public class PrimitiveResponse {

    private Object response;

    public PrimitiveResponse(Object response) {
        this.response = response;
    }

    public PrimitiveResponse() {
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

}
