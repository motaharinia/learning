package com.motaharinia.presentation.adminuser;


import com.motaharinia.business.service.adminuser.SearchRowViewAdminUserBrief;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

//https://reflectoring.io/unit-testing-spring-boot/
//https://www.javaguides.net/2018/09/spring-boot-2-rest-apis-integration-testing.html


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdminUserControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    /**
     * شیی crud
     */
    private static Integer crudId;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }

    @Test
    @Order(1)
    public void create() throws Exception {
        String uri="http://localhost:" + port + "/adminUser";
        Map<String, String> variableHashMap = new HashMap<String, String>();

        AdminUserModel adminUserModel = new AdminUserModel();
        adminUserModel.setFirstName("Mostafa");
        adminUserModel.setLastName("Motaharinia");
        adminUserModel.setPassword("123456789");
        adminUserModel.setUsername("eng.motahari@gmail.com");

        adminUserModel = restTemplate.postForObject(uri, adminUserModel, AdminUserModel.class, variableHashMap);
        System.out.println("create userModel.toString():"+ adminUserModel.toString());
        crudId= adminUserModel.getId();
        assertThat(adminUserModel.getId()).isNotEqualTo(null);
    }

    @Test
    @Order(2)
    public void readOne() throws Exception {
        String uri="http://localhost:" + port + "/adminUser/"+crudId;
        AdminUserModel resultModel = restTemplate.getForObject(uri, AdminUserModel.class);
        assertThat(resultModel.getId()).isEqualTo(crudId);
    }

    @Test
    @Order(3)
    public void readGrid() throws Exception {
        String uri="http://localhost:" + port + "/adminUser";

        List<SearchFilterRestrictionModel> searchFilterRestrictionModelList=new ArrayList<>();
        searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("firstName", SearchFilterOperationEnum.MATCH,"mostafa"));
        List<SearchFilterSortModel> searchFilterSortModelList=new ArrayList<>();
        searchFilterSortModelList.add(new SearchFilterSortModel("firstName", SearchFilterSortTypeEnum.ASC));
        searchFilterSortModelList.add(new SearchFilterSortModel("lastName", SearchFilterSortTypeEnum.DSC));
        SearchFilterModel searchFilterModel=new SearchFilterModel();
        searchFilterModel.setSearchRowView(SearchRowViewAdminUserBrief.class);
        searchFilterModel.setPage(0);
        searchFilterModel.setRows(10);
        searchFilterModel.setRestrictionList(searchFilterRestrictionModelList);
        searchFilterModel.setSortList(searchFilterSortModelList);

        CustomObjectMapper customObjectMapper = new CustomObjectMapper();
        uri += "?searchFilterModel={searchFilterModel}";

        SearchDataModel searchDataModel = restTemplate.getForObject(uri , SearchDataModel.class,customObjectMapper.writeValueAsString(searchFilterModel));
        System.out.println("searchDataModel:" + searchDataModel.toString());
        assertThat(searchDataModel.getPage()).isEqualTo(searchFilterModel.getPage());
    }
//
//    @Test
//    @Order(4)
//    public void listGrid() throws Exception {
//        String uri="http://localhost:" + port + "/adminUser/firstName/Mostafa";
//        GridDataModel gridDataModel = restTemplate.getForObject(uri, GridDataModel.class);
//        List<Object[]> listArray =gridDataModel.getModelList();
//        listArray.stream().forEach(array-> System.out.println(array[0].getClass().getName()));
//        List<Integer> idList = listArray.stream().map(array->(Integer)array[0]).collect(Collectors.toList());
//        assertThat(idList).contains(crudId);
//    }
}
