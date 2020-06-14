package com.motaharinia.msutility.calendar;

import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-13
 * Time: 16:40:56
 * Description: کلاس تست CalDateTime
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalDateTimeTests {
    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }

    //--------------------------------------------------متدهای کمکی--------------------------------------------------
    @Order(1)
    @Test
    void fixDateSlashTest(){
        assertThat(CalDateTime.fixDateSlash("1399/5/3","/")).isEqualTo("1399/05/03");
    }

    @Order(2)
    @Test
    void fixOneDigitTest(){
        assertThat(CalDateTime.fixOneDigit("5")).isEqualTo("05");
    }

    //--------------------------------------------------متدهای دریافت تاریخ و زمان فعلی--------------------------------------------------

    @Order(3)
    @Test
    void getCurrentGregorianDateStringTest(){
        assertThat(CalDateTime.getCurrentGregorianDateString("/")).isNotEqualTo(null);
    }

    @Order(4)
    @Test
    void getCurrentGregorianDateTimeStringTest(){
        assertThat(CalDateTime.getCurrentGregorianDateTimeString("/")).isNotEqualTo(null);
    }

    @Order(5)
    @Test
    void getCurrentJalaliDateStringTest(){
        assertThat(CalDateTime.getCurrentJalaliDateString("/")).isNotEqualTo(null);
    }

    @Order(6)
    @Test
    void getCurrentJalaliDateTimeStringTest(){
        assertThat(CalDateTime.getCurrentJalaliDateTimeString("/")).isNotEqualTo(null);
    }

    //--------------------------------------------------متدهای تبدیل تاریخ جلالی به میلادی--------------------------------------------------
    @Order(7)
    @Test
    void jalaliToGregorianDateTest() throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        assertThat(CalDateTime.jalaliToGregorianDate("1399/12/30","/")).isEqualTo(cal.getTime());
    }

    @Order(8)
    @Test
    void jalaliToGregorianDate2Test(){
        assertThat(CalDateTime.jalaliToGregorianDate("1399/12/30","/","-")).isEqualTo("2021-03-20");
    }

    //--------------------------------------------------متدهای تبدیل تاریخ-زمان جلالی به میلادی--------------------------------------------------

    @Order(9)
    @Test
    void jalaliToGregorianDateTimeTest() throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        assertThat(CalDateTime.jalaliToGregorianDateTime("1399/12/30 00:00:00","/")).isEqualTo(cal.getTime());
    }

    @Order(10)
    @Test
    void jalaliToGregorianDateTime2Test(){
        assertThat(CalDateTime.jalaliToGregorianDateTime("1399/12/30 00:00:00","/","-")).isEqualTo("2021-03-20 00:00:00");
    }

    //--------------------------------------------------متدهای تبدیل تاریخ میلادی به جلالی--------------------------------------------------

    @Order(11)
    @Test
    void gregorianToJalaliDateTest() throws ParseException {
        assertThat(CalDateTime.gregorianToJalaliDate("2021/03/20","/","-")).isEqualTo("1399-12-30");
    }

    @Order(12)
    @Test
    void gregorianToJalaliDate2Test() throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        assertThat(CalDateTime.gregorianToJalaliDate(cal.getTime()).toString()).isEqualTo("CustomDate{1399-12-30}");
    }

    //--------------------------------------------------متدهای تبدیل تاریخ-زمان میلادی به جلالی--------------------------------------------------
    @Order(13)
    @Test
    void gregorianToJalaliDateTimeTest() throws ParseException {
        assertThat(CalDateTime.gregorianToJalaliDateTime("2021/03/20 00:00:00","/","-")).isEqualTo("1399-12-30 00:00:00");
    }

    @Order(14)
    @Test
    void gregorianToJalaliDateTime2Test() throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        assertThat(CalDateTime.gregorianToJalaliDateTime(cal.getTime()).toString()).isEqualTo("CustomDateTime{1399-12-30 00:00:00}");
    }

    //--------------------------------------------------متدهای اصلاح کننده متناسب با زبان لوکال و تفاوت زمانی بین دو تاریخ--------------------------------------------------

    @Order(15)
    @Test
    void fixToLocaleDateTest() throws ParseException {
        assertThat(CalDateTime.fixToLocaleDate("2021/03/20","-",new Locale("fa"))).isEqualTo("1399-12-30");
    }

    @Order(16)
    @Test
    void fixToLocaleDateTimeTest() throws ParseException {
        assertThat(CalDateTime.fixToLocaleDateTime("2021/03/20 00:00:00","-",new Locale("fa"))).isEqualTo("1399-12-30 00:00:00");
    }

    @Order(17)
    @Test
    void getTwoDateDifferenceSecondTest() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(simpleDateFormat.parse("2021-03-20 00:00:10"));
        assertThat(CalDateTime.getTwoDateDifference(cal1.getTime(),cal2.getTime(),DateTimeUnitEnum.SECOND)).isEqualTo(10);
    }

    @Order(18)
    @Test
    void getTwoDateDifferenceMinuteTest() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(simpleDateFormat.parse("2021-03-20 00:10:00"));
        assertThat(CalDateTime.getTwoDateDifference(cal1.getTime(),cal2.getTime(),DateTimeUnitEnum.MINUTE)).isEqualTo(10);
    }

    @Order(19)
    @Test
    void getTwoDateDifferenceHourTest() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(simpleDateFormat.parse("2021-03-20 10:00:00"));
        assertThat(CalDateTime.getTwoDateDifference(cal1.getTime(),cal2.getTime(),DateTimeUnitEnum.HOUR)).isEqualTo(10);
    }

    @Order(20)
    @Test
    void getTwoDateDifferenceDayTest() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(simpleDateFormat.parse("2021-03-19 00:00:00"));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        assertThat(CalDateTime.getTwoDateDifference(cal1.getTime(),cal2.getTime(),DateTimeUnitEnum.DAY)).isEqualTo(1);
    }

    //--------------------------------------------------متدهای تبدیلی CustomDate و CustomDateTime به Date--------------------------------------------------

    @Order(21)
    @Test
    void getDateFromCustomDateTest() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        CustomDate customDate = new CustomDate(cal.getTime());
        assertThat(CalDateTime.getDateFromCustomDate(customDate)).isEqualTo(cal.getTime());
    }

    @Order(22)
    @Test
    void getDateFromCustomDateTimeTest() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        CustomDateTime customDateTime = new CustomDateTime(cal.getTime());
        assertThat(CalDateTime.getDateFromCustomDateTime(customDateTime)).isEqualTo(cal.getTime());
    }

    //--------------------------------------------------متدهای بررسی کننده تاریخهای جلالی و میلادی--------------------------------------------------

    @Order(23)
    @Test
    void checkJalaliDateValidityTest() throws Exception {
        assertThat(CalDateTime.checkJalaliDateValidity(1399,8,31)).isEqualTo(Boolean.FALSE);
    }

    @Order(24)
    @Test
    void checkGregorianDateValidityTest() throws Exception {
        assertThat(CalDateTime.checkGregorianDateValidity(2021,18,20)).isEqualTo(Boolean.FALSE);
    }
}
