package com.motaharinia.msutility.search.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.filter.*;
import org.junit.jupiter.api.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

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
public class SearchDataModelTests {

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
//        List<SearchDataRowModel> gridRowModelList = new ArrayList<>();
//        gridRowModelList.add(new SearchDataRowModel(1, new SearchRowViewTest()));
//        gridRowModelList.add(new SearchDataRowModel(2,new SearchRowViewTest()));
//        SearchDataModel searchDataModel =new SearchDataModel(1,10l,20l,gridRowModelList,null);
//


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

        System.out.println("SearchDataModelTests.serializeTest searchFilterModel:" + searchFilterModel.toString());

        SearchRowViewUserBriefImpl searchRowViewTest = null;
        List<SearchRowView> viewList = new ArrayList<>();
        viewList.add (new SearchRowViewUserBriefImpl(1) );
        viewList.add (new SearchRowViewUserBriefImpl(2) );
        Page<SearchRowView> viewPage = new PageImpl<>(viewList);

        SearchDataModel searchDataModel =new SearchDataModel(viewPage,searchFilterModel,null);

        System.out.println("searchDataModel:" + searchDataModel.toString());

        String json =mapper.writeValueAsString(searchDataModel);
        System.out.println(json);
        assertThat(json.contains("records")).isEqualTo(true);
    }
}
