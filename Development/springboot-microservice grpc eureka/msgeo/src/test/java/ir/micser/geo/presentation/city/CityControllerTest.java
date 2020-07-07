package ir.micser.geo.presentation.city;


import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.*;
import com.motaharinia.msutility.string.RandomGenerationTypeEnum;
import com.motaharinia.msutility.string.StringTools;
import ir.micser.geo.business.service.city.SearchRowViewCityBrief;
import ir.micser.geo.persistence.orm.etcitem.EtcItemInitialData;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  کلاس تست ماژول شهر
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CityControllerTest {
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
    public void create() throws Exception {
        try {
            String uri = "http://localhost:" + port + "/v1/city";
            Map<String, String> variableHashMap = new HashMap<String, String>();

             random=StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_ALL,5,false);

            CityModel cityModel = new CityModel();
            cityModel.setTitle("Tehran "+random);

            //cityModel = this.restTemplate.postForObject(uri, cityModel, CityModel.class, variableHashMap);
            //System.out.println("create city.toString():" + cityModel.toString());
            //crudId = cityModel.getId();
            //assertThat(cityModel).isNotEqualTo(null);

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<CityModel> entity = new HttpEntity<>(cityModel, headers);
            ResponseEntity<CityModel> response = this.restTemplate.exchange(uri, HttpMethod.POST, entity, CityModel.class);

            assertThat(response).isNotEqualTo(null);
            assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(response.getBody()).isNotEqualTo(null);
            cityModel=response.getBody();
            assertThat(cityModel.getTitle()).isEqualTo("Tehran "+random);
            crudId = cityModel.getId();


        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(2)
    public void readById() {
        try {
            String uri = "http://localhost:" + port + "/v1/city/" + crudId;

            //CityModel resultModel = this.restTemplate.getForObject(uri, CityModel.class);
            //assertThat(resultModel.getId()).isEqualTo(crudId);

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<CityModel> response = this.restTemplate.exchange(uri,HttpMethod.GET,entity, CityModel.class);

            assertThat(response).isNotEqualTo(null);
            assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(response.getBody()).isNotEqualTo(null);
            CityModel adminUserModel=response.getBody();
            assertThat(adminUserModel.getId()).isEqualTo(crudId);

        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(3)
    public void readGrid() {
        try {
            String uri = "http://localhost:" + port + "/v1/city";

            if(ObjectUtils.isEmpty(random)){
                random="skill";
            }

            List<String> titleList = new ArrayList<>();
            titleList.add("Tehran");
            titleList.add("Shiraz");
            titleList.add("Kashan");

            List<SearchFilterRestrictionModel> searchFilterRestrictionModelList = new ArrayList<>();
            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("title", SearchFilterOperationEnum.MATCH, "tehran",SearchFilterNextConditionOperatorEnum.AND));
//            searchFilterRestrictionModelList.add(new SearchFilterRestrictionModel("title", SearchFilterOperationEnum.IN, titleList,SearchFilterNextConditionOperatorEnum.AND));
            List<SearchFilterSortModel> searchFilterSortModelList = new ArrayList<>();
            searchFilterSortModelList.add(new SearchFilterSortModel("title", SearchFilterSortTypeEnum.ASC));
            SearchFilterModel searchFilterModel = new SearchFilterModel();
            searchFilterModel.setSearchRowView(SearchRowViewCityBrief.class);
            searchFilterModel.setPage(0);
            searchFilterModel.setRows(20);
            searchFilterModel.setRestrictionList(searchFilterRestrictionModelList);
            searchFilterModel.setSortList(searchFilterSortModelList);

            CustomObjectMapper customObjectMapper = new CustomObjectMapper();
            uri += "?searchFilterModel={searchFilterModel}";

            //SearchDataModel searchDataModel = this.restTemplate.getForObject(uri, SearchDataModel.class, customObjectMapper.writeValueAsString(searchFilterModel));
            //System.out.println("searchDataModel:" + searchDataModel.toString());
            //assertThat(searchDataModel.getPage()).isEqualTo(searchFilterModel.getPage());

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<SearchFilterModel> entity = new HttpEntity<>(searchFilterModel, headers);
            ResponseEntity<SearchDataModel> response = this.restTemplate.exchange(uri, HttpMethod.GET, entity, SearchDataModel.class,customObjectMapper.writeValueAsString(searchFilterModel));

            assertThat(response).isNotEqualTo(null);
            assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(response.getBody()).isNotEqualTo(null);
            SearchDataModel searchDataModel=response.getBody();
            assertThat(searchDataModel.getPage()).isEqualTo(searchFilterModel.getPage());

        } catch (Exception ex) {
            fail(ex.toString());
        }
    }



    @Test
    @Order(4)
    public void update() throws Exception {
        try {
            String uri = "http://localhost:" + port + "/v1/city";
            //جستجوی شهر جهت ویرایش
            CityModel cityModel = this.restTemplate.getForObject(uri+ "/"+crudId, CityModel.class);

            random=StringTools.generateRandomString(RandomGenerationTypeEnum.CHARACTER_ALL,5,false);

            //ویرایش اطلاعات مدل
            cityModel.setTitle( cityModel.getTitle() + " updated");

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<CityModel> entity = new HttpEntity<>(cityModel, headers);
            ResponseEntity<CityModel> response = this.restTemplate.exchange(uri, HttpMethod.PUT, entity, CityModel.class);
            cityModel =response.getBody();

            assertThat(cityModel.getTitle()).contains("updated");
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    @Order(5)
    public void delete() throws Exception {
        try {
            String uri = "http://localhost:" + port + "/v1/city/"+crudId;

            // build the request
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<CityModel> response = this.restTemplate.exchange(uri, HttpMethod.DELETE, entity, CityModel.class);
            CityModel cityModel =response.getBody();

            assertThat(cityModel.getId()).isEqualTo(crudId);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}
