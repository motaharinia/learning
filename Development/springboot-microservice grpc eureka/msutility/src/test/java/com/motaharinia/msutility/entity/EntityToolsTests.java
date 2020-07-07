package com.motaharinia.msutility.entity;

import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.entity.sample.SampleEntity;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:27:46<br>
 * Description:<br>
 * کلاس تست EntityTools
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EntityToolsTests {

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        Locale.setDefault(new Locale("fa"));
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
    void checkEntityNullTest() {
        SampleEntity sampleEntity = null;
        try {
            EntityTools.checkEntity(sampleEntity, SampleEntity.class, true);
            fail("check null failed");
        } catch (Exception ex) {
            UtilityException utilityException =new UtilityException(SampleEntity.class, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_NULL, "entity");
            assertThat(ex)
                    .isInstanceOf(UtilityException.class)
                    .hasMessage(utilityException.getMessage());
        }
    }

    @Order(2)
    @Test
    void checkEntityNullListTest() {
        List<SampleEntity> sampleEntityList = null;
        try {
            EntityTools.checkEntity(sampleEntityList, SampleEntity.class, true);
            fail("check null failed");
        } catch (Exception ex) {
            UtilityException utilityException =new UtilityException(SampleEntity.class, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_NULL, "entity");
            assertThat(ex)
                    .isInstanceOf(UtilityException.class)
                    .hasMessage(utilityException.getMessage());
        }
    }


    @Order(3)
    @Test
    void checkEntityNullListItemTest() {
        List<SampleEntity> sampleEntityList =new ArrayList<>();
        sampleEntityList.add(new SampleEntity(1));
        sampleEntityList.add(null);
        try {
            EntityTools.checkEntity(sampleEntityList, SampleEntity.class, true);
            fail("check null failed");
        } catch (Exception ex) {
            UtilityException utilityException =new UtilityException(SampleEntity.class, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_NULL, "entityOfCollection");
            assertThat(ex)
                    .isInstanceOf(UtilityException.class)
                    .hasMessage(utilityException.getMessage());
        }
    }

    @Order(4)
    @Test
    void checkEntityInvalidTest() {
        SampleEntity sampleEntity = new SampleEntity(1);
        sampleEntity.setInvalid(true);
        try {
            EntityTools.checkEntity(sampleEntity, SampleEntity.class, true);
            fail("check invalid failed");
        } catch (Exception ex) {
            UtilityException utilityException = new UtilityException(SampleEntity.class, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entity.id:" + sampleEntity.getId().toString());
            assertThat(ex)
                    .isInstanceOf(UtilityException.class)
                    .hasMessage(utilityException.getMessage());
        }
    }

    @Order(5)
    @Test
    void checkEntityInvalidListItemTest() {
        SampleEntity sampleEntity = new SampleEntity(1);
        sampleEntity.setInvalid(true);

        List<SampleEntity> sampleEntityList =new ArrayList<>();
        sampleEntityList.add(sampleEntity);
        try {
            EntityTools.checkEntity(sampleEntityList, SampleEntity.class, true);
            fail("check invalid failed");
        } catch (Exception ex) {
            UtilityException utilityException =new UtilityException(SampleEntity.class, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entityOfCollection.id:" + sampleEntity.getId().toString());
            assertThat(ex)
                    .isInstanceOf(UtilityException.class)
                    .hasMessage(utilityException.getMessage());
        }
    }

}
