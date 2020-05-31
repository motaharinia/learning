package com.motaharinia.presentation.controller;


import com.motaharinia.business.service.UserGrid1View;
import com.motaharinia.presentation.model.UserModel;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ActiveProfiles;

import java.util.HashMap;
import java.util.Map;

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
    private UserModel userModel=new UserModel();

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

        this.userModel = new UserModel();
        this.userModel.setFirstName("Mostafa");
        this.userModel.setLastName("Motaharinia");
        this.userModel.setPassword("123456789");
        this.userModel.setUsername("eng.motahari@gmail.com");

        this.userModel = restTemplate.postForObject(uri, this.userModel, UserModel.class, variableHashMap);
        System.out.println("create this.userModel.toString():"+ this.userModel.toString());
        assertThat(this.userModel.getId()).isNotEqualTo(null);
    }

    @Test
    @Order(2)
    public void findOne() throws Exception {
        System.out.println("findOne this.userModel.toString():"+ this.userModel.toString());
        String uri="http://localhost:" + port + "/user/"+this.userModel.getId();
        UserModel resultModel = restTemplate.getForObject(uri, UserModel.class);
        assertThat(resultModel.getId()).isEqualTo(this.userModel.getId());
    }

//    @Test
//    @Order(3)
//    public void findAll() throws Exception {
//        String uri="http://localhost:" + port + "/user";
//        Page<UserModel> userModelPage = restTemplate.getForObject(uri, Page.class);
//        assertThat(userModelPage.getContent()).contains(this.userModel);
//    }

    @Test
    @Order(4)
    public void findUserByFirstName() throws Exception {
        System.out.println("findUserByFirstName this.userModel.toString():"+ this.userModel.toString());
        String uri="http://localhost:" + port + "/user/firstName/" + this.userModel.getFirstName();
        UserGrid1View userGrid1View = restTemplate.getForObject(uri, UserGrid1View.class);
        assertThat(userGrid1View.getFirstName()).contains(this.userModel.getFirstName());
    }
}
