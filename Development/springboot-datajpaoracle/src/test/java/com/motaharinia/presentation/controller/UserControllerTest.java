package com.motaharinia.presentation.controller;

import com.motaharinia.presentation.model.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
public class UserControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;




    @Test
    public void create() throws Exception {
        String uri="http://localhost:" + port + "/user";
        Map<String, String> variableHashMap = new HashMap<String, String>();

        UserModel userModel = new UserModel();
        userModel.setFirstName("Mostafa");
        userModel.setLastName("Motaharinia");
        userModel.setPassword("123456789");
        userModel.setUsername("eng.motahari@gmail.com");

        UserModel resultModel = restTemplate.postForObject(uri, userModel, UserModel.class, variableHashMap);
        assertThat(resultModel.getId()).isNotEqualTo(null);
    }
}
