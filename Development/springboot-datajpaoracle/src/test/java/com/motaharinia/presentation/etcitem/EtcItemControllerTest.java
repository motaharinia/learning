package com.motaharinia.presentation.etcitem;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.genericmodel.ComboTypeEnum;
import com.motaharinia.msutility.genericmodel.CustomComboModel;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.persistence.orm.etcitem.EtcItemInitialData;
import com.motaharinia.presentation.generic.CustomComboFilterModel;
import com.motaharinia.presentation.generic.EntityEnum;
import com.motaharinia.presentation.generic.EntityParametersModeEnum;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * کلاس تست ماژول مقادیر ثابت
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EtcItemControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EtcItemInitialData etcItemInitialData;


    private static Integer crudId = 1;
    private static String random;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws InvocationTargetException, UtilityException, IllegalAccessException, BusinessException {
        Locale.setDefault(new Locale("fa"));
        etcItemInitialData.checkEtcItems();
    }


    @Test
    @Order(1)
    public void customComboTest() throws Exception {
        try {
            HashMap<String, Object> extMap = new HashMap<>();
            extMap.put("id", 1000);
            String uri = "http://localhost:" + port + "/etcItem";
            CustomComboFilterModel customComboFilterModel = new CustomComboFilterModel();
            customComboFilterModel.setMode(EntityParametersModeEnum.ETC_ITEM__GENDER);
            customComboFilterModel.setType(ComboTypeEnum.COMBO);
            customComboFilterModel.setEntity(EntityEnum.ETC_ITEM);
            customComboFilterModel.setInput("م");
            customComboFilterModel.setExtMap(extMap);

            CustomObjectMapper customObjectMapper = new CustomObjectMapper();
            uri += "?customComboFilterModel={customComboFilterModel}";
            CustomComboModel customComboModel = this.restTemplate.getForObject(uri, CustomComboModel.class, customObjectMapper.writeValueAsString(customComboFilterModel));
            assertThat(customComboModel).isNotEqualTo(null);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

}
