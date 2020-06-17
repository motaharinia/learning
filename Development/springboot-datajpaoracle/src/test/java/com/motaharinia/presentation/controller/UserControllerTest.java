package com.motaharinia.presentation.controller;


import com.motaharinia.business.service.SearchRowViewUserBrief;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.presentation.model.UserModel;
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
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

//https://reflectoring.io/unit-testing-spring-boot/
//https://www.javaguides.net/2018/09/spring-boot-2-rest-apis-integration-testing.html


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserControllerTest {
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
        String uri="http://localhost:" + port + "/user";
        Map<String, String> variableHashMap = new HashMap<String, String>();

        UserModel userModel = new UserModel();
        userModel.setFirstName("Mostafa");
        userModel.setLastName("Motaharinia");
        userModel.setPassword("123456789");
        userModel.setUsername("eng.motahari@gmail.com");

        userModel = restTemplate.postForObject(uri, userModel, UserModel.class, variableHashMap);
        System.out.println("create userModel.toString():"+ userModel.toString());
        crudId=userModel.getId();
        assertThat(userModel.getId()).isNotEqualTo(null);
    }

    @Test
    @Order(2)
    public void readOne() throws Exception {
        String uri="http://localhost:" + port + "/user/"+crudId;
        UserModel resultModel = restTemplate.getForObject(uri, UserModel.class);
        assertThat(resultModel.getId()).isEqualTo(crudId);
    }

    @Test
    @Order(3)
    public void readGrid() throws Exception {
        String uri="http://localhost:" + port + "/user";

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

        CustomObjectMapper customObjectMapper = new CustomObjectMapper();
        uri += "?searchFilterModel={searchFilterModel}";

        System.out.println(customObjectMapper.writeValueAsString(searchFilterModel));
//        HashMap<String,String> urlVariablemap = new HashMap<>();
//        urlVariablemap.put("searchFilterModel",customObjectMapper.writeValueAsString(searchFilterModel));

        SearchDataModel searchDataModel = restTemplate.getForObject(uri , SearchDataModel.class,customObjectMapper.writeValueAsString(searchFilterModel));

        System.out.println("searchDataModel:" + searchDataModel.toString());

        assertThat(searchDataModel.getPage()).isEqualTo(searchFilterModel.getPage());
    }
//
//    @Test
//    @Order(4)
//    public void listGrid() throws Exception {
//        String uri="http://localhost:" + port + "/user/firstName/Mostafa";
//        GridDataModel gridDataModel = restTemplate.getForObject(uri, GridDataModel.class);
//        List<Object[]> listArray =gridDataModel.getModelList();
//        listArray.stream().forEach(array-> System.out.println(array[0].getClass().getName()));
//        List<Integer> idList = listArray.stream().map(array->(Integer)array[0]).collect(Collectors.toList());
//        assertThat(idList).contains(crudId);
//    }
}
