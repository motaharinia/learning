package com.motaharinia.msutility.grid.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motaharinia.msutility.grid.filter.GridFilterModel;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-14
 * Time: 20:49:58
 * Description: کلاس تست GridDataModel
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GridDataModelTests {

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
    void serializeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));
        List<GridRowModel> gridRowModelList = new ArrayList<>();
        gridRowModelList.add(new GridRowModel(1,new Object[]{1, "test1",1100 }));
        gridRowModelList.add(new GridRowModel(2,new Object[]{ 2,"test2",1200 }));

        List<Object[]> rows = new ArrayList<>();
        rows.add(new Object[]{1, "test1",1100 });
        rows.add(new Object[]{ 2,"test2",1200 });

//        GridDataModel gridDataModel=new GridDataModel(1,10l,20l,gridRowModelList,null);
        GridDataModel gridDataModel=new GridDataModel(1,10l,20l,rows,null);
        String json =mapper.writeValueAsString(gridDataModel);
        System.out.println(json);
        assertThat(json.contains("test2")).isEqualTo(true);
    }
}
