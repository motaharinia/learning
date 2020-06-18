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
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-13<br>
 * Time: 16:40:56<br>
 * Description:<br>
 *     کلاس تست StringTools
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
        assertThat(StringTools.generateMD5Hash("Mostafa Motaharinia",20)).isNotBlank();
    }

    @Order(2)
    @Test
    void removeHtmlTest() throws Exception {
        assertThat(StringTools.removeHtml("Mostafa<br>Motaharinia").contains("<br>")).isNotEqualTo(true);
    }

    @Order(3)
    @Test
    void summarizeStringTest() throws Exception {
        assertThat(StringTools.summarizeString("Hello Mostafa Motaharinia",20)).isEqualTo("Hello Mostafa Mot...");
    }

    @Order(4)
    @Test
    void highlightTest() throws Exception {
        assertThat(StringTools.highlight("Hello Mostafa Motaharinia","Hello")).isEqualTo("<span class='highlight'>Hello</span> Mostafa Motaharinia");
    }

    @Order(5)
    @Test
    void generateRandomStringCharacterAllTest() throws Exception {
        assertThat(StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_ALL,5,false).matches("^[a-zA-Z]*$")).isEqualTo(true);
    }

    @Order(6)
    @Test
    void generateRandomStringNumberTest() throws Exception {
        assertThat(StringTools.generateRandomString(RandomGenerationTypeEnum.NUMBER,5,false).matches("^[0-9]*$")).isEqualTo(true);
    }

    @Order(7)
    @Test
    void generateRandomStringCharacterNumberTest() throws Exception {
        assertThat(StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_NUMBER,5,false).matches("^[a-zA-Z0-9]*$")).isEqualTo(true);
    }
}
