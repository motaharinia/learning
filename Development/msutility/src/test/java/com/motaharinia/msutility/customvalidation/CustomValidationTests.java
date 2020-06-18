package com.motaharinia.msutility.customvalidation;

import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customvalidation.sample.CompanyPhoneTestModel;
import com.motaharinia.msutility.customvalidation.sample.DateRangeTestModel;
import com.motaharinia.msutility.customvalidation.sample.DecimalCountTestModel;
import com.motaharinia.msutility.customvalidation.sample.DoubleRangeTestModel;
import org.junit.jupiter.api.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-13<br>
 * Time: 16:40:56<br>
 * Description:<br>
 *     کلاس تست CustomValidation
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomValidationTests {

    private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private Validator validator= factory.getValidator();

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
    void companyPhoneTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        CompanyPhoneTestModel model = new CompanyPhoneTestModel();
        model.setCompanyPhoneNo("22555");
        Set<ConstraintViolation<CompanyPhoneTestModel>> violations = validator.validate(model);
        assertThat(violations.isEmpty()).isEqualTo(true);
    }

    @Order(2)
    @Test
    void dateRangeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        DateRangeTestModel model = new DateRangeTestModel();
        model.setRegisterDate(new CustomDate(new Date()));
        model.setCreateDate(new CustomDate(new Date()));
        model.setUpdateDate(new CustomDate(new Date()));
        model.setDeleteDate(new CustomDate(new Date()));
        Set<ConstraintViolation<DateRangeTestModel>> violations = validator.validate(model);
        assertThat(violations.isEmpty()).isEqualTo(true);
    }

    @Order(3)
    @Test
    void decimalCountTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        DecimalCountTestModel model = new DecimalCountTestModel();
        model.setDouble1(12.582);
        model.setDouble2(12.582);
        Set<ConstraintViolation<DecimalCountTestModel>> violations = validator.validate(model);
        assertThat(violations.isEmpty()).isEqualTo(true);
    }

    @Order(4)
    @Test
    void doubleRangeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        DoubleRangeTestModel model = new DoubleRangeTestModel();
        model.setDouble1(12.582);
        Set<ConstraintViolation<DoubleRangeTestModel>> violations = validator.validate(model);
        assertThat(violations.isEmpty()).isEqualTo(true);
    }

}
