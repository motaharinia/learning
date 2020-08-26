package com.motaharinia.msutility.object;

import com.motaharinia.msutility.object.sample.ClassA;
import com.motaharinia.msutility.object.sample.ClassB;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-22<br>
 * Time: 13:41:19<br>
 * Description:<br>
 * کلاس تست ObjectTools
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ObjectToolsTests {

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws Exception {
        Locale.setDefault(new Locale("fa"));
    }

    /**
     * این متد بعد از هر تست این کلاس اجرا میشود
     */
    @AfterEach
    void finalizeEach() throws IOException {
        Locale.setDefault(Locale.US);
    }

    @Order(1)
    @Test
    void copyTest() {
        try {
            ClassA classA = new ClassA();
            classA.setId(1);
            classA.setName("ali");
            classA.setFamily("alimi");
            classA.setFatherName("FFFFFF");
            classA.setTest("TTTTTTTTT");
            classA.setMobile("09124376251");

            ClassB classB = new ClassB();
            classB = (ClassB) ObjectTools.copy(classA, classB, new String[]{}, new String[]{});


            assertThat(classB.getDefaultContact_mobile()).isEqualTo(classA.getMobile());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Order(2)
    @Test
    void copyWithPrefixAddTest() {
        try {
            ClassB classB = new ClassB();
            classB.setName("ali");
            classB.setUser_test("TTTTTTTTT");
            classB.setUser_fatherName("FFFFFF");

            ClassA classA = new ClassA();
            classA = (ClassA) ObjectTools.copy(classB, classA, null, new String[]{"user_"});
            assertThat(classA.getMobile()).isEqualTo(classB.getDefaultContact_mobile());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

}
