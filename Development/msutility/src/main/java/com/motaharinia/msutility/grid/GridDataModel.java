package com.motaharinia.msutility.grid;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.motaharinia.msutility.calendar.CalDateTime;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.json.deserializer.JsonDeserializerGridDataRows;
import com.motaharinia.msutility.json.serializer.JsonSerializerGridDataRows;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس مدل برای ارسال اطلاعات گرید از سرور به کلاینت طراحی شده است
 */
public class GridDataModel implements Serializable {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);

    /**
     * شماره صفحه فعلی در حال استفاده در گرید
     */
    public Integer page;

    /**
     * تعداد کل سطرهای قابل نمایش در گرید که صفحه بندی شده اند و به صفحات کوچکتر تبدیل شده اند
     */
    public Long records;

    /**
     * لیست سطرهای داده گرید
     */
    private List<Object[]> rows;

    /**
     * تعداد صفحات صفحه بندی اطلاعات که در زیر گرید نمایش داده میشود
     */
    public Long total;

    /**
     * برای ارسال اطلاعات اضافی از سمت سرور به کلاینت مورد استفاده قرار میگیرد
     */
    public Object userData;

    /**
     * متد سازنده
     *
     * @param page  شماره صفحه فعلی در حال استفاده در گرید
     * @param records  تعداد کل سطرهای قابل نمایش در گرید که صفحه بندی شده اند و به صفحات کوچکتر تبدیل شده اند
     * @param total  تعداد صفحات صفحه بندی اطلاعات که در زیر گرید نمایش داده میشود
     * @param rows  لیست سطرهای داده گرید
     * @param userData  برای ارسال اطلاعات اضافی از سمت سرور به کلاینت مورد استفاده قرار میگیرد
     */
    public GridDataModel(int page, Long records, Long total, List<Object[]> rows, Object userData) {
        this.userData = userData;
        this.page = page;
        this.total = total;
        this.records = records;
        this.rows = (ObjectUtils.isEmpty(rows)) ? new ArrayList<>() : rows;
    }

    public GridDataModel() {
    }

    public GridDataModel GridDataFixForExcel(GridDataModel gridData, List<GridColModel> pageGridColModelList, MessageSource messageSource, HashMap<String, List<Object[]>> formatters) throws Exception {
        if (ObjectUtils.isEmpty(gridData) || ObjectUtils.isEmpty(pageGridColModelList)) {
            throw new UtilityException(CalDateTime.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "");
        }


        List<Object[]> objList = gridData.getRows();
        Object[] obj;
        String tmp = "";

        if (objList != null) {
            for (int i = 0; i < objList.size(); i++) {
                obj = objList.get(i);
                for (int j = 0; j < pageGridColModelList.size(); j++) {

                    if (formatters != null && formatters.containsKey(pageGridColModelList.get(j).getName())) {
                        List<Object[]> formatterList = formatters.get(pageGridColModelList.get(j).getName());
                       obj[j] = fixFormatter(formatterList, obj[j]);
                    } else {
                       if ("date".equals(pageGridColModelList.get(j).getSortType())) {
                           obj[j] =  CalDateTime.fixToLocaleDate((Date) obj[j],"/",LocaleContextHolder.getLocale());
                        } else if ("dateTime".equals(pageGridColModelList.get(j).getSortType())) {
                           obj[j] =  CalDateTime.fixToLocaleDateTime((Date) obj[j],"/",LocaleContextHolder.getLocale());
                        }
                        tmp = pageGridColModelList.get(j).getName();
                        if (".langKey".equals(tmp.substring(Math.max(tmp.length() - 8, 0)))) {
                            obj[j] = fixLangKey((String) obj[j], messageSource);
                        }
                    }

                    objList.set(i, obj);
                }
            }
        }
        return gridData;
    }



    //لیستی از فرمترهای گرید و یک داده را دریافت میکند و اگر آن داده ورودی با یکی از داده های لیست فرمترها بخواند مقدار فرمت شده فرمتر را بجای داده خروجی میدهد 
    public String fixFormatter(List<Object[]> formatterList, Object data) {
        for (int i = 0; i < formatterList.size(); i++) {
             if (formatterList.get(i)[0].toString().equals(data + "")) {
                return formatterList.get(i)[1].toString();
            }
        }
        return "";
    }

    //مطابق با زبان سیستم در صورت نیاز کلید لاتین را به متن فارسی معادل آن ترجمه میکند و خروجی میدهد
    public String fixLangKey(String langKey, MessageSource messageSource) {
        if(!StringUtils.isEmpty(langKey)){
            return messageSource.getMessage(langKey, new Object[]{}, LocaleContextHolder.getLocale());
        }else{
            return "";
        }
    }

//    @Override
//    public String toString() {
//        return "GridDataModel{\n\t" + "page=" + page + ", \n\trecords=" + records + ", \n\trows=\n\t{\n\t" + ToStringHelper.listOfObjectArray(rows) + "}, \n\ttotal=" + total + ", \n\tuserdata=" + userData + "\n}";
//    }




    //getter-setter
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }

    @JsonSerialize(using = JsonSerializerGridDataRows.class)
    public List<Object[]> getRows() {
        return rows;
    }

    @JsonDeserialize(using = JsonDeserializerGridDataRows.class)
    public void setRows(List<Object[]> rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object userData) {
        this.userData = userData;
    }
}
