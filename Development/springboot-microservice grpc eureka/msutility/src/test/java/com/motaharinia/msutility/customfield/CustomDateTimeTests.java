package com.motaharinia.msutility.customfield;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-13<br>
 * Time: 16:40:56<br>
 * Description:<br>
 * کلاس تست CustomDateTime
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomDateTimeTests {

    private final ObjectMapper mapper = new ObjectMapper();

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
    void constructor1Test() {
        try {
            Locale.setDefault(new Locale("fa"));
            String json = "{\"year\":1399,\"month\":12,\"day\":30,\"hour\":0,\"minute\":0,\"second\":0}";
            CustomDateTime customDateTime = mapper.readValue(json, CustomDateTime.class);
            assertThat(customDateTime.toString()).isEqualTo("CustomDateTime{2021-03-20 00:00:00}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }


    @Order(2)
    @Test
    void constructor2Test() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
            Calendar cal = Calendar.getInstance();
            cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
            CustomDateTime customDateTime = new CustomDateTime(cal.getTime());
            assertThat(customDateTime.toString()).isEqualTo("CustomDateTime{2021-03-20 00:00:00}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Order(3)
    @Test
    void comparatorTest() {
        try {
            List<CustomDateTime> customDateTimeList = new ArrayList<>();
            customDateTimeList.add(new CustomDateTime(2015, 12, 13, 0, 0, 0));
            customDateTimeList.add(new CustomDateTime(2016, 10, 1, 0, 0, 0));
            customDateTimeList.add(new CustomDateTime(2014, 8, 2, 0, 0, 0));
            customDateTimeList.add(new CustomDateTime(2015, 11, 2, 0, 0, 0));
            customDateTimeList.add(new CustomDateTime(2014, 4, 14, 10, 10, 10));
            customDateTimeList.add(new CustomDateTime(2016, 1, 16, 0, 0, 0));
            Collections.sort(customDateTimeList);
            assertThat(customDateTimeList.get(0).toString()).isEqualTo("CustomDateTime{2014-04-14 10:10:10}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}