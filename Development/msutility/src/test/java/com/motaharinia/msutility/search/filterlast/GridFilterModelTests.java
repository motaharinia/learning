package com.motaharinia.msutility.search.filterlast;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-14
 * Time: 20:49:58
 * Description: کلاس تست GridFilterModel
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GridFilterModelTests {

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
    void deserializeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        String json = "{" +
                "'filters': '{groupOp:AND,rules:[]}'," +
                "'nd': 58626," +
                "'page': 1," +
                "'pageGridColModelList': [" +
                "{'name': '[object Object]', 'index': '[object Object]', 'align': 'center', 'width': 120, 'sortType': 'string','searchoptions':{'stype':'and','sopt':['like' , 'equal'],'value':'test1'}}," +
                "{'name': '[object Object]', 'index': '[object Object]', 'align': 'center', 'width': 150, 'sortType': 'string','searchoptions':{'stype':'or','sopt':['bigger' , 'equal'],'value':'test2'}}" +
                "]," +
                "'parameters': [0]," +
                "'parametersMode': 'frontPurchaseOrderCustomer'," +
                "'rows': 100," +
                "'search': false," +
                "'sidx':''," +
                "'sord':'asc'" +
                "}";
        GridFilterModel gridFilterModel = mapper.readValue(json.replaceAll("'","\""), GridFilterModel.class);
        assertThat(gridFilterModel.getPageGridColModelList().get(1).getPageGridSearchOptions().getSearchValue()).isEqualTo("test2");
    }
}
