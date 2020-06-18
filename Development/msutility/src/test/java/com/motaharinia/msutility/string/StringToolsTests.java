package com.motaharinia.msutility.string;

import com.motaharinia.msutility.calendar.CalendarTools;
import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customfield.CustomDateTime;
import com.motaharinia.msutility.calendar.DateTimeUnitEnum;
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
 * Description: کلاس تست StringTools
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringToolsTests {
    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        Locale.setDefault(Locale.US);
    }

    /**
     * این متد بعد از هر تست این کلاس اجرا میشود
     */
    @AfterEach
    void finalizeEach() {
        Locale.setDefault(Locale.US);
    }

    @Order(1)
    @Test
    void generateMD5HashTest() throws Exception {
        assertThat(StringTools.generateMD5Hash("Mostafa",20)).isNotBlank();
    }


}
