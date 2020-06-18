package com.motaharinia.msutility.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.msutility.search.sample.SearchRowViewUserBrief;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-14<br>
 * Time: 20:49:58<br>
 * Description:<br>
 *     کلاس تست SearchFilterModel
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SearchFilterModelTests {

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
    void serializeDeserializeTest() throws Exception {
        Locale.setDefault(new Locale("fa"));

        List<SearchFilterRestrictionModel> searchFilterRestrictionModelList=new ArrayList<>();
        searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("firstName", SearchFilterOperationEnum.MATCH,"mostafa"));
        List<SearchFilterSortModel> searchFilterSortModelList=new ArrayList<>();
        searchFilterSortModelList.add(new SearchFilterSortModel("lastName", SearchFilterSortTypeEnum.ASC));
        SearchFilterModel searchFilterModel=new SearchFilterModel();
        searchFilterModel.setSearchRowView(SearchRowViewUserBrief.class);
        searchFilterModel.setPage(1);
        searchFilterModel.setRows(10);
        searchFilterModel.setRestrictionList(searchFilterRestrictionModelList);
        searchFilterModel.setSortList(searchFilterSortModelList);

        String json=mapper.writeValueAsString(searchFilterModel);
        SearchFilterModel searchFilterModel2=mapper.readValue(json, SearchFilterModel.class);
        assertThat(searchFilterModel2.getRestrictionList().get(0).getFieldValue()).isEqualTo("mostafa");
    }
}