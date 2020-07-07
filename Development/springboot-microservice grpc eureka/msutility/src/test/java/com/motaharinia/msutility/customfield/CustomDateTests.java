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
 *     کلاس تست CustomDate
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomDateTests {

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
        try{
        Locale.setDefault(new Locale("fa"));
        String json = "{\"year\":1399,\"month\":12,\"day\":30}";
        CustomDate customDate = mapper.readValue(json, CustomDate.class);
        assertThat(customDate.toString()).isEqualTo("CustomDate{2021-03-20}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }


    @Order(2)
    @Test
    void constructor2Test(){
        try{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(simpleDateFormat.parse("2021-03-20 00:00:00"));
        CustomDate customDate = new CustomDate(cal.getTime());
        assertThat(customDate.toString()).isEqualTo("CustomDate{2021-03-20}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Order(3)
    @Test
    void comparatorTest() {
        try{
        List<CustomDate> customDateList = new ArrayList<>();
        customDateList.add(new CustomDate(2015, 12, 13));
        customDateList.add(new CustomDate(2016, 10, 1));
        customDateList.add(new CustomDate(2014, 8, 2));
        customDateList.add(new CustomDate(2015, 11, 2));
        customDateList.add(new CustomDate(2014, 4, 14));
        customDateList.add(new CustomDate(2016, 1, 16));
        Collections.sort(customDateList);
        assertThat(customDateList.get(0).toString()).isEqualTo("CustomDate{2014-04-14}");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}
