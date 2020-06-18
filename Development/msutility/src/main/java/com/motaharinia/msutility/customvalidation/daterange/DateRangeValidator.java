
package com.motaharinia.msutility.customvalidation.daterange;


import com.motaharinia.msutility.calendar.CalendarTools;
import com.motaharinia.msutility.customfield.CustomDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:02:58<br>
 * Description:<br>
 *     کلاس بررسی کننده انوتیشن اعتبارسنجی محدوده تاریخ<br>
 * فقط برای فیلدهای از نوع CustomDate میتوان از این اعتبارسنجی استفاده کرد
 */
public class DateRangeValidator implements ConstraintValidator<DateRange, CustomDate> {

    private String message = "customValidation.dateRange";
    private String from;
    private String to;

    @Override
    public void initialize(DateRange a) {
        from = a.from();
        to = a.to();
    }

    @Override
    public boolean isValid(CustomDate customDate, ConstraintValidatorContext cvc) {
        if(CustomDate.isEmpty(customDate)){
            return true;
        }

        if (!validateParameters(from)) {
             return false;
        }

        if (!validateParameters(to)) {
            return false;
        }

        boolean result = validateDateRange(customDate);
        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;
    }

    private static boolean validateParameters(String param) {
        String datePattern = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
        if (param.equalsIgnoreCase("unlimited") || param.equalsIgnoreCase("today")) {
            return true;
        } else if (param.matches(datePattern)) {
            String[] paramParts = param.split("-");
            return CalendarTools.checkJalaliDateValidity(Integer.parseInt(paramParts[0]), Integer.parseInt(paramParts[1]), Integer.parseInt(paramParts[2]));
        } else {
            return false;
        }

    }

    private boolean validateDateRange(CustomDate customDate) {
        boolean result = false;
        if (from.equalsIgnoreCase("unlimited") && to.equalsIgnoreCase("unlimited")) {
            //In this case, no need to validate date, every data is acceptable
            result = true;
        } else if (from.equalsIgnoreCase("unlimited") && !to.equalsIgnoreCase("unlimited")) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, customDate.getYear());
            calendar.set(Calendar.MONTH, customDate.getMonth() - 1);
            calendar.set(Calendar.DAY_OF_MONTH, customDate.getDay());
            Date userEnteredDate = calendar.getTime();

            if (to.equalsIgnoreCase("today")) {
                Date today = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(today);
                c.add(Calendar.DATE, 1);

                result = userEnteredDate.before(c.getTime());
                if (!result) {
                    message = "customValidation.dateRange[to=" + to + "]";
                }

            } else {
                //convert TO date from jalali to gregorian
                String gregorian_TO_String = CalendarTools.jalaliToGregorianDate(to, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date gregorian_TO_Date = df.parse(gregorian_TO_String);
                    result = userEnteredDate.before(gregorian_TO_Date);
                    if (!result) {
                        message = "customValidation.dateRange[to=" + to + "]";
                    }
                } catch (ParseException ex) {
                    result = false;
                }

            }

        } else if (!from.equalsIgnoreCase("unlimited") && to.equalsIgnoreCase("unlimited")) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, customDate.getYear());
            calendar.set(Calendar.MONTH, customDate.getMonth() - 1);
            calendar.set(Calendar.DAY_OF_MONTH, customDate.getDay());
            Date userEnteredDate = calendar.getTime();

            if (from.equalsIgnoreCase("today")) {
                Date today = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(today);
                c.add(Calendar.DATE, -1);
                result = userEnteredDate.after(c.getTime());
                if (!result) {
                    message = "customValidation.dateRange[from=" + from + "]";
                }
            } else {
                //convert TO date from jalali to gregorian
                String gregorian_FROM_String = CalendarTools.jalaliToGregorianDate(from, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date gregorian_FROM_Date = df.parse(gregorian_FROM_String);
                    result = userEnteredDate.after(gregorian_FROM_Date);
                    if (!result) {
                        message = "customValidation.dateRange[from=" + from + "]";
                    }
                } catch (ParseException ex) {
                    result = false;
                }

            }

        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, customDate.getYear());
            calendar.set(Calendar.MONTH, customDate.getMonth() - 1);
            calendar.set(Calendar.DAY_OF_MONTH, customDate.getDay());
            Date userEnteredDate = calendar.getTime();

            Date fromDate;
            Date toDate;
            if (from.equalsIgnoreCase("today")) {
                fromDate = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(fromDate);
                c.add(Calendar.DATE, -1);
                fromDate = c.getTime();

            } else {
                String gregorian_FROM_String = CalendarTools.jalaliToGregorianDate(from, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    fromDate = df.parse(gregorian_FROM_String);
                } catch (ParseException ex) {
                    fromDate = null;
                    result = false;
                }

            }

            if (to.equalsIgnoreCase("today")) {
                toDate = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(toDate);
                c.add(Calendar.DATE, 1);
                toDate = c.getTime();

            } else {
                String gregorian_TO_String = CalendarTools.jalaliToGregorianDate(to, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    toDate = df.parse(gregorian_TO_String);
                } catch (ParseException ex) {
                    toDate = null;
                    result = false;
                }

            }

            if (fromDate != null && toDate != null) {
                if (fromDate.compareTo(toDate) > 0) {
                    result = false;
                    message = "customValidation.dateRange";
                } else {
                    result = userEnteredDate.after(fromDate) && userEnteredDate.before(toDate);
                    if (!result) {
                        message = "customValidation.dateRange[from=" + from + ", to=" + to + "]";
                    }
                }

            }

        }
        return result;
    }
}
