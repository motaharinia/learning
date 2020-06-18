
package com.motaharinia.msutility.validation.daterange;


import com.motaharinia.msutility.calendar.CalendarTools;
import com.motaharinia.msutility.customfield.CustomDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author administrator
 */
public class DateRangeValidator implements ConstraintValidator<DateRange, CustomDate> {

    private static final Logger logger = LoggerFactory.getLogger(DateRangeValidator.class);

    private String message = "validation.dateRange";
    private String from;
    private String to;

    @Override
    public void initialize(DateRange a) {
        from = a.from();
        to = a.to();
    }

    @Override
    public boolean isValid(CustomDate customDate, ConstraintValidatorContext cvc) {

        if (customDate == null || customDate.getYear() == null || customDate.getMonth() == null || customDate.getDay() == null) {
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
        if (param.equals("unlimited") || param.equals("today")) {
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
        logger.info("customDate: Year: " + customDate.getYear() + " Month: " + customDate.getMonth() + " Day: " + customDate.getDay());
        if (from.equals("unlimited") && to.equals("unlimited")) {
            //In this case, no need to validate date, every data is acceptable
            result = true;
        } else if (from.equals("unlimited") && !to.equals("unlimited")) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, customDate.getYear());
            calendar.set(Calendar.MONTH, customDate.getMonth() - 1);
            calendar.set(Calendar.DAY_OF_MONTH, customDate.getDay());
            Date userEnteredDate = calendar.getTime();

            if (to.equals("today")) {
                Date today = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(today);
                c.add(Calendar.DATE, 1);

                result = userEnteredDate.before(c.getTime());
                if (!result) {
                    message = "validation.dateRange[to=" + to + "]";
                }

            } else {
                //convert TO date from jalali to gregorian
                String gregorian_TO_String = CalendarTools.jalaliToGregorianDate(to, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date gregorian_TO_Date = df.parse(gregorian_TO_String);
                    result = userEnteredDate.before(gregorian_TO_Date);
                    if (!result) {
                        message = "validation.dateRange[to=" + to + "]";
                    }
                } catch (ParseException ex) {
                    result = false;
                }

            }

        } else if (!from.equals("unlimited") && to.equals("unlimited")) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, customDate.getYear());
            calendar.set(Calendar.MONTH, customDate.getMonth() - 1);
            calendar.set(Calendar.DAY_OF_MONTH, customDate.getDay());
            Date userEnteredDate = calendar.getTime();

            if (from.equals("today")) {
                Date today = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(today);
                c.add(Calendar.DATE, -1);
                result = userEnteredDate.after(c.getTime());
                if (!result) {
                    message = "validation.dateRange[from=" + from + "]";
                }
            } else {
                //convert TO date from jalali to gregorian
                String gregorian_FROM_String = CalendarTools.jalaliToGregorianDate(from, "-", "-");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date gregorian_FROM_Date = df.parse(gregorian_FROM_String);
                    result = userEnteredDate.after(gregorian_FROM_Date);
                    if (!result) {
                        message = "validation.dateRange[from=" + from + "]";
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
            if (from.equals("today")) {
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

            if (to.equals("today")) {
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
                    message = "validation.dateRange";
                } else {
                    result = userEnteredDate.after(fromDate) && userEnteredDate.before(toDate);
                    if (!result) {
                        message = "validation.dateRange[from=" + from + ", to=" + to + "]";
                    }
                }

            }

        }

        return result;
    }

    public static void main(String[] args) {

        String date1 = "2015/01/02";
        String date2 = "2015/01/01";

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d1 = df.parse(date1);
            Date d2 = df.parse(date2);
            Boolean tmp = d1.after(d2);
            logger.info(tmp.toString());
        } catch (Exception e) {
            logger.info("111");
        }

    }

}
