package com.motaharinia.msutility.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.msutility.search.sample.SearchRowViewAdminUserBrief;
import com.motaharinia.msutility.search.sample.SearchRowViewAdminUserBriefImpl;
import org.junit.jupiter.api.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-14<br>
 * Time: 20:49:58<br>
 * Description:<br>
 * کلاس تست SearchDataModel
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
    void serializeTest() {
        try {
            Locale.setDefault(new Locale("fa"));
            List<SearchFilterRestrictionModel> searchFilterRestrictionModelList = new ArrayList<>();
            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("firstName", SearchFilterOperationEnum.MATCH, "mostafa"));
            List<SearchFilterSortModel> searchFilterSortModelList = new ArrayList<>();
            searchFilterSortModelList.add(new SearchFilterSortModel("firstName", SearchFilterSortTypeEnum.ASC));
            searchFilterSortModelList.add(new SearchFilterSortModel("lastName", SearchFilterSortTypeEnum.DSC));
            SearchFilterModel searchFilterModel = new SearchFilterModel();
            searchFilterModel.setSearchRowView(SearchRowViewAdminUserBrief.class);
            searchFilterModel.setPage(1);
            searchFilterModel.setRows(10);
            searchFilterModel.setRestrictionList(searchFilterRestrictionModelList);
            searchFilterModel.setSortList(searchFilterSortModelList);

            SearchRowViewAdminUserBriefImpl searchRowViewTest = null;
            List<SearchRowViewAdminUserBrief> viewList = new ArrayList<>();
            viewList.add(new SearchRowViewAdminUserBriefImpl(1));
            viewList.add(new SearchRowViewAdminUserBriefImpl(2));
            Page<SearchRowViewAdminUserBrief> viewPage = new PageImpl<>(viewList);


            SearchDataModel searchDataModel = new SearchDataModel(viewPage, searchFilterModel, "");

            System.out.println("searchDataModel:" + searchDataModel.toString());

            String json = mapper.writeValueAsString(searchDataModel);
            assertThat(json.contains("records")).isEqualTo(true);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}
