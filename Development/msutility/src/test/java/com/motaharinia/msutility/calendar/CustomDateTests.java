package com.motaharinia.msutility.calendar;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-13
 * Time: 16:40:56
 * Description: کلاس تست CustomDate
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomDateTests {

    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        Locale.setDefault(Locale.ENGLISH);
    }


    @Order(1)
    @Test
    void constructor1Test() throws Exception {
        Locale.setDefault(new Locale("fa"));
        String json = "{\"year\":1399,\"month\":12,\"day\":30}";
        CustomDate customDate = mapper.readValue(json, CustomDate.class);
        assertThat(customDate.toString()).isEqualTo("CustomDate{2021-03-20}");
    }


    @Order(2)
    @Test
    void constructor2Test() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        CustomDate customDate = new CustomDate(cal.getTime());
        assertThat(customDate.toString()).isEqualTo("CustomDate{2021-03-20}");
    }

    @Order(3)
    @Test
    void comparatorTest() throws Exception {
        List<CustomDate> customDateList = new ArrayList<>();
        customDateList.add(new CustomDate(2015, 12, 13));
        customDateList.add(new CustomDate(2016, 10, 1));
        customDateList.add(new CustomDate(2014, 8, 2));
        customDateList.add(new CustomDate(2015, 11, 2));
        customDateList.add(new CustomDate(2014, 4, 14));
        customDateList.add(new CustomDate(2016, 1, 16));
        Collections.sort(customDateList);
        assertThat(customDateList.get(0).toString()).isEqualTo("CustomDate{2014-04-14}");
    }
}
