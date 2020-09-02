package com.motaharinia.presentation.adminuser;


import com.motaharinia.business.service.adminuser.SearchRowViewAdminUserBrief;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.msutility.string.RandomGenerationTypeEnum;
import com.motaharinia.msutility.string.StringTools;
import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;
import com.motaharinia.persistence.orm.etcitem.EtcItemInitialData;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

//https://reflectoring.io/unit-testing-spring-boot/
//https://www.javaguides.net/2018/09/spring-boot-2-rest-apis-integration-testing.html
//https://attacomsian.com/blog/http-requests-resttemplate-spring-boot#


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  کلاس تست ماژول ادمین
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdminUserControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EtcItemInitialData etcItemInitialData;

    /**
     * شیی crud
     */
    private static Integer crudId=1;
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
    public void create() {
        try {
            String uri = "http://localhost:" + port + "/adminUser";
            Map<String, String> variableHashMap = new HashMap<String, String>();

             random=StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_ALL,5,false);
            CustomDate dateOfBirth=new CustomDate();
            dateOfBirth.setYear(1399);
            dateOfBirth.setMonth(4);
            dateOfBirth.setDay(3);

            AdminUserModel adminUserModel = new AdminUserModel();
            adminUserModel.setFirstName("Mostafa " + random);
            adminUserModel.setLastName("Motaharinia " + random);
            adminUserModel.setPassword("123456789");
            adminUserModel.setUsername("eng.motahari_"+random+"@gmail.com");
            adminUserModel.setDateOfBirth(dateOfBirth);
            adminUserModel.setGender_id(1);
            adminUserModel.setDefaultAdminUserContact_address("Shahrak Gharb " + random);
            adminUserModel.setSkillList(Arrays.asList(new AdminUserSkillModel[]{new AdminUserSkillModel(null,"skill-" + random),new AdminUserSkillModel(null,"skill-" + StringTools.generateRandomString(RandomGenerationTypeEnum.NUMBER,5,false))}));

            adminUserModel = this.restTemplate.postForObject(uri, adminUserModel, AdminUserModel.class, variableHashMap);
            System.out.println("create userModel.toString():" + adminUserModel.toString());
            crudId = adminUserModel.getId();
            assertThat(adminUserModel.getId()).isNotEqualTo(null);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(2)
    public void readById() {
        try {
            String uri = "http://localhost:" + port + "/adminUser/" + crudId;
            AdminUserModel resultModel = this.restTemplate.getForObject(uri, AdminUserModel.class);
            assertThat(resultModel.getId()).isEqualTo(crudId);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(3)
    public void readGrid() {
        System.out.println("LocaleContextHolder.getLocale()"+ LocaleContextHolder.getLocale());
        try {
            String uri = "http://localhost:" + port + "/adminUser";

            if(ObjectUtils.isEmpty(random)){
                random="skill";
            }
            CustomDate dateOfBirthFrom=new CustomDate();
            dateOfBirthFrom.setYear(1399);
            dateOfBirthFrom.setMonth(4);
            dateOfBirthFrom.setDay(3);

            CustomDate dateOfBirthTo=new CustomDate();
            dateOfBirthTo.setYear(1399);
            dateOfBirthTo.setMonth(4);
            dateOfBirthTo.setDay(6);


            List<String> usernameList = new ArrayList<>();
            usernameList.add("eng.motahari_pxQti@gmail.com");
            usernameList.add("eng.motahari_kqFkT@gmail.com");
            usernameList.add("eng.motahari_cxgFw@gmail.com");

            List<SearchFilterRestrictionModel> searchFilterRestrictionModelList = new ArrayList<>();
            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("firstName", SearchFilterOperationEnum.MATCH, "mostafa",SearchFilterNextConditionOperatorEnum.AND));
            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("defaultAdminUserContact.address", SearchFilterOperationEnum.MATCH, "Shahrak Gharb",SearchFilterNextConditionOperatorEnum.AND));
            //searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("skillSet.title", SearchFilterOperationEnum.MATCH, random,SearchFilterNextConditionOperatorEnum.AND));
//            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("dateOfBirth", SearchFilterOperationEnum.GREATER_THAN_EQUAL, dateOfBirthFrom,SearchFilterNextConditionOperatorEnum.AND));
//            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("dateOfBirth", SearchFilterOperationEnum.LESS_THAN_EQUAL, dateOfBirthTo,SearchFilterNextConditionOperatorEnum.AND));
//            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("username", SearchFilterOperationEnum.IN, usernameList,SearchFilterNextConditionOperatorEnum.AND));
//            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("skillSet", SearchFilterOperationEnum.MEMBER_OF, 45,SearchFilterNextConditionOperatorEnum.AND));
            List<SearchFilterSortModel> searchFilterSortModelList = new ArrayList<>();
            searchFilterSortModelList.add(new SearchFilterSortModel("firstName", SearchFilterSortTypeEnum.ASC));
            searchFilterSortModelList.add(new SearchFilterSortModel("lastName", SearchFilterSortTypeEnum.DSC));
            searchFilterSortModelList.add(new SearchFilterSortModel("defaultAdminUserContact.address", SearchFilterSortTypeEnum.DSC));
            searchFilterSortModelList.add(new SearchFilterSortModel("gender.value", SearchFilterSortTypeEnum.DSC));
            //searchFilterSortModelList.add(new SearchFilterSortModel("defaultAdminUserContact.type.value", SearchFilterSortTypeEnum.DSC));
            SearchFilterModel searchFilterModel = new SearchFilterModel();
            searchFilterModel.setSearchRowView(SearchRowViewAdminUserBrief.class);
            searchFilterModel.setPage(0);
            searchFilterModel.setRows(20);
            searchFilterModel.setRestrictionList(searchFilterRestrictionModelList);
            searchFilterModel.setSortList(searchFilterSortModelList);

            CustomObjectMapper customObjectMapper = new CustomObjectMapper();
            uri += "?searchFilterModel={searchFilterModel}";

            SearchDataModel searchDataModel = this.restTemplate.getForObject(uri, SearchDataModel.class, customObjectMapper.writeValueAsString(searchFilterModel));
            System.out.println("searchDataModel:" + searchDataModel.toString());
            assertThat(searchDataModel.getPage()).isEqualTo(searchFilterModel.getPage());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }



    @Test
    @Order(4)
    public void update() throws Exception {
        try {
            String uri = "http://localhost:" + port + "/adminUser";
            Map<String, String> variableHashMap = new HashMap<String, String>();

            //جستجوی ادمین جهت ویرایش
            AdminUserModel adminUserModel = this.restTemplate.getForObject(uri+ "/"+crudId, AdminUserModel.class);

            random=StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_ALL,5,false);
            CustomDate dateOfBirth=new CustomDate();
            dateOfBirth.setYear(1399);
            dateOfBirth.setMonth(12);
            dateOfBirth.setDay(22);

            //ویرایش اطلاعات مدل
            adminUserModel.setFirstName(adminUserModel.getFirstName()+ "Updated");
            adminUserModel.setLastName(adminUserModel.getLastName()+ "Updated");
            adminUserModel.setPassword(adminUserModel.getPassword()+ "Updated");
            adminUserModel.setUsername("updated" + adminUserModel.getUsername());
            adminUserModel.setDateOfBirth(dateOfBirth);
            adminUserModel.setGender_id(2);
            adminUserModel.setDefaultAdminUserContact_address(adminUserModel.getDefaultAdminUserContact_address()+ "Updated");
            adminUserModel.getSkillList().add(new AdminUserSkillModel(null,"skill-added in update"));

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<AdminUserModel> entity = new HttpEntity<>(adminUserModel, headers);
            ResponseEntity<AdminUserModel> response = this.restTemplate.exchange(uri, HttpMethod.PUT, entity, AdminUserModel.class);
            adminUserModel=response.getBody();


            assertThat(adminUserModel.getGender_id()).isEqualTo(2);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(5)
    public void delete() throws Exception {
        try {
            String uri = "http://localhost:" + port + "/adminUser/"+crudId;
            Map<String, String> variableHashMap = new HashMap<String, String>();

            AdminUserModel adminUserModel;

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<AdminUserModel> response = this.restTemplate.exchange(uri, HttpMethod.DELETE, entity, AdminUserModel.class);
            adminUserModel=response.getBody();


            assertThat(adminUserModel.getId()).isEqualTo(crudId);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
    @Test
    @Order(7)
    public void hchFindTest() {
        try {
            String uri = "http://localhost:" + port + "/adminUser/hchFindByName/"+ "Mostafa";
            Integer[] resultModel = this.restTemplate.getForObject(uri, Integer[].class);
            assertThat(resultModel.length).isGreaterThan(0);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
    @Test
    @Order(7)
    public void hchFindByGenderTest() {
        try {
            String uri = "http://localhost:" + port + "/adminUser/hchFindByGender/"+ crudId;
            Integer[] resultModel = this.restTemplate.getForObject(uri, Integer[].class);
            assertThat(resultModel.length).isGreaterThan(0);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }


}