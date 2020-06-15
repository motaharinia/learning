package com.motaharinia.msutility.grid.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.motaharinia.msutility.calendar.CalDateTime;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.grid.filter.GridColModel;
import com.motaharinia.msutility.json.deserializer.JsonDeserializerGridDataRows;
import com.motaharinia.msutility.json.serializer.JsonSerializerGridDataRows;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
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
     * لیست سطرهای داده گرید
     */
    @JsonProperty(value = "rows2")
    private List<GridRowModel> gridRowModelList;

    /**
     * تعداد صفحات صفحه بندی اطلاعات که در زیر گرید نمایش داده میشود
     */
    public Long total;

    /**
     * برای ارسال اطلاعات اضافی از سمت سرور به کلاینت مورد استفاده قرار میگیرد
     */
    @JsonProperty(value = "userdata")
    public Object userData;

    /**
     * متد سازنده
     *
     * @param page     شماره صفحه فعلی در حال استفاده در گرید
     * @param records  تعداد کل سطرهای قابل نمایش در گرید که صفحه بندی شده اند و به صفحات کوچکتر تبدیل شده اند
     * @param total    تعداد صفحات صفحه بندی اطلاعات که در زیر گرید نمایش داده میشود
     * @param gridRowModelList     لیست سطرهای داده گرید
     * @param userData برای ارسال اطلاعات اضافی از سمت سرور به کلاینت مورد استفاده قرار میگیرد
     */
//    public GridDataModel(Integer page, Long records, Long total, List<GridRowModel> gridRowModelList, Object userData) {
//        this.userData = userData;
//        this.page = page;
//        this.total = total;
//        this.records = records;
//        this.gridRowModelList = (ObjectUtils.isEmpty(gridRowModelList)) ? new ArrayList<>() : gridRowModelList;
//    }
    public GridDataModel(Integer page, Long records, Long total, List<Object[]> rows, Object userData) {
        this.userData = userData;
        this.page = page;
        this.total = total;
        this.records = records;
        this.rows = (ObjectUtils.isEmpty(rows)) ? new ArrayList<>() : rows;
    }

    public GridDataModel() {
    }

    public GridDataModel GridDataFixForExcel(@NotNull  GridDataModel gridData, @NotNull List<GridColModel> pageGridColModelList, @NotNull MessageSource messageSource,@NotNull  HashMap<String, List<Object[]>> formatters) throws Exception {
        if (ObjectUtils.isEmpty(gridData) || ObjectUtils.isEmpty(pageGridColModelList)) {
            throw new UtilityException(CalDateTime.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "");
        }
        List<Object[]> objectArrayList = gridData.getRows();
        Object[] objectArray;
        String colModelName = "";
        if (objectArrayList != null) {
            for (int i = 0; i < objectArrayList.size(); i++) {
                objectArray = objectArrayList.get(i);
                for (int j = 0; j < pageGridColModelList.size(); j++) {
                    colModelName = pageGridColModelList.get(j).getName();
                    if (formatters != null && formatters.containsKey(colModelName)) {
                        List<Object[]> formatterArrayList = formatters.get(colModelName);
                        objectArray[j] = fixFormatter(formatterArrayList, objectArray[j]);
                    } else {
                        if (".langKey".equals(colModelName.substring(Math.max(colModelName.length() - 8, 0)))) {
                            objectArray[j] = fixLangKey((String) objectArray[j], messageSource);
                        } else {
                            switch (pageGridColModelList.get(j).getSortType()) {
                                case "date":
                                    objectArray[j] = CalDateTime.fixToLocaleDate((Date) objectArray[j], "/", LocaleContextHolder.getLocale());
                                    break;
                                case "dateTime":
                                    objectArray[j] = CalDateTime.fixToLocaleDateTime((Date) objectArray[j], "/", LocaleContextHolder.getLocale());
                                    break;
                            }
                        }
                    }
                    objectArrayList.set(i, objectArray);
                }
            }
        }
        return gridData;
    }


    //لیستی از فرمترهای گرید و یک داده را دریافت میکند و اگر آن داده ورودی با یکی از داده های لیست فرمترها بخواند مقدار فرمت شده فرمتر را بجای داده خروجی میدهد
    public String fixFormatter(List<Object[]> formatterArrayList, Object object) {
        for (int i = 0; i < formatterArrayList.size(); i++) {
            if (formatterArrayList.get(i)[0].toString().equals(object + "")) {
                return formatterArrayList.get(i)[1].toString();
            }
        }
        return "";
    }

    //مطابق با زبان سیستم در صورت نیاز کلید لاتین را به متن فارسی معادل آن ترجمه میکند و خروجی میدهد
    public String fixLangKey(String langKey, MessageSource messageSource) {
        if (!StringUtils.isEmpty(langKey)) {
            return messageSource.getMessage(langKey, new Object[]{}, LocaleContextHolder.getLocale());
        } else {
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


    public List<GridRowModel> getGridRowModelList() {
        return gridRowModelList;
    }

    public void setGridRowModelList(List<GridRowModel> gridRowModelList) {
        this.gridRowModelList = gridRowModelList;
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
