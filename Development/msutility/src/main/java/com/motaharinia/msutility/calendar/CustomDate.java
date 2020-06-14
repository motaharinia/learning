package com.motaharinia.msutility.calendar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای جابجا کردن فیلد تاریخ در مدلها از شمسی به میلادی در زمان ارسال درخواست از کلاینت به سرور و بالعکس استفاده میشود
 */
public class CustomDate implements Comparable, Serializable {

    /**
     * سال در تاریخ شمسی
     */
    private Integer year;
    /**
     * ماه در تاریخ شمسی
     */
    private Integer month;
    /**
     * روز در تاریخ شمسی
     */
    private Integer day;

    public CustomDate() {
    }

    @JsonCreator
    public CustomDate(@JsonProperty("year") Integer year, @JsonProperty("month") Integer month, @JsonProperty("day") Integer day) throws Exception {
        this.year = year;
        this.month = month;
        this.day = day;
        deserializeDate();
    }

    public CustomDate(@NotNull Date date) throws Exception {
        if (ObjectUtils.isEmpty(date)) {
            throw new UtilityException(CalDateTime.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.setYear(calendar.get(Calendar.YEAR));
        this.setMonth(calendar.get(Calendar.MONTH) + 1);
        this.setDay(calendar.get(Calendar.DAY_OF_MONTH));
    }

    private void deserializeDate() throws Exception {
        if (ObjectUtils.isEmpty(this.year) && ObjectUtils.isEmpty(this.month) && ObjectUtils.isEmpty(this.day)) {
            return;
        }
        Locale currentLocale = LocaleContextHolder.getLocale();
        if (!validateDate(currentLocale.getLanguage())) {
            throw new UtilityException(CalDateTime.class, UtilityExceptionKeyEnum.DATE_VALIDATION_FAILED, "");
        }
        if (currentLocale.getLanguage().equals("fa")) {
            //user entered a jalali date
            String jalaiDateString = this.year + "/" + this.month + "/" + this.day;
            try {
                String gregorianDateString = CalDateTime.jalaliToGregorianDate(jalaiDateString, "/", "/");
                String[] gregorianParts = gregorianDateString.split("/");
                this.year = Integer.parseInt(gregorianParts[0]);
                this.month = Integer.parseInt(gregorianParts[1]);
                this.day = Integer.parseInt(gregorianParts[2]);
            } catch (Exception e) {
                this.year = null;
                this.month = null;
                this.day = null;
            }
        }
    }

    private Boolean validateDate(String locale) {
        boolean result = true;
        if (locale.equals("fa") && !CalDateTime.checkJalaliDateValidity(year, month, day)) {
            result = false;
        } else if (locale.equals("en") && !CalDateTime.checkGregorianDateValidity(year, month, day)) {
            result = false;
        }
        return result;
    }

    public static Boolean isEmpty(CustomDate customDate) {
        if (ObjectUtils.isEmpty(customDate)) {
            return true;
        }
        if (ObjectUtils.isEmpty(customDate.getYear()) || ObjectUtils.isEmpty(customDate.getMonth()) || ObjectUtils.isEmpty(customDate.getDay())) {
            return true;
        }
        return false;
    }

    @NotNull
    public String getFormattedString(@NotNull  String dateDelimiter){
        if (!CustomDate.isEmpty(this)) {
            return year + dateDelimiter+ CalDateTime.fixOneDigit(month.toString()) + dateDelimiter + CalDateTime.fixOneDigit(day.toString()) ;
        } else {
            return "Empty";
        }
    }

    @Override
    public String toString() {
        return "CustomDate{" +this.getFormattedString("-")+ '}';
    }

    @Override
    public int compareTo(Object customDate) {
        CustomDate compareCustomDate = (CustomDate) customDate;
        Integer ret = 0;
        if ((this.getYear() == null) || (compareCustomDate.getYear() == null)) {
            ret = 0;
        } else {
            if (Objects.equals(this.getYear(), compareCustomDate.getYear())) {
                if ((this.getMonth() == null) || (compareCustomDate.getMonth() == null)) {
                    ret = 0;
                } else {
                    if (Objects.equals(this.getMonth(), compareCustomDate.getMonth())) {
                        if ((this.getDay() == null) || (compareCustomDate.getDay() == null)) {
                            ret = 0;
                        } else {
                            ret = this.getDay() - compareCustomDate.getDay();
                        }
                    } else {
                        ret = this.getMonth() - compareCustomDate.getMonth();
                    }
                }
            } else {
                ret = this.getYear() - compareCustomDate.getYear();
            }
        }
        return ret;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.year);
        hash = 79 * hash + Objects.hashCode(this.month);
        hash = 79 * hash + Objects.hashCode(this.day);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.equals(obj)) {
            return true;
        }
        if (ObjectUtils.isEmpty(obj)) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        final CustomDate other = (CustomDate) obj;
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.month, other.month)) {
            return false;
        }
        if (!Objects.equals(this.day, other.day)) {
            return false;
        }
        return true;
    }

    //getter-setter:
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

}
