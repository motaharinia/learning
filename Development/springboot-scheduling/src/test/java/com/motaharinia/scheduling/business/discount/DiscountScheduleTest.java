package com.motaharinia.scheduling.business.discount;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * کلاس تست ماژول زمان بندی تخفیفها
 */
@SpringBootTest
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DiscountScheduleTest {

    @Autowired
    DiscountSchedule discountSchedule;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
    }

    @Test
    @Order(1)
    public void fixedDelayTest() {
        try {
            Thread.sleep(16L);
            System.out.println("discountSchedule.fixedDelayCount:" + discountSchedule.fixedDelayCount);
            assertThat(discountSchedule.fixedDelayCount).isEqualTo(3);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

}
