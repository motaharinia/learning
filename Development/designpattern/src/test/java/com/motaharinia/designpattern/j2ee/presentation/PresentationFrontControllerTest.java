package com.motaharinia.designpattern.j2ee.presentation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

//A Front Controller Pattern says that if you want to provide the centralized request handling mechanism so that all the requests will be handled by a single handler".
//This handler can do the authentication or authorization or logging or tracking of request and then pass the requests to corresponding handlers.
//یک الگوی کنترل كننده جلو می گوید كه می خواهید مکانیسم رسیدگی به درخواست متمرکز را فراهم كنید تا تمام درخواست ها توسط یك كنترل كننده واحد انجام شود. "
//این کنترل کننده می تواند تأیید اعتبار یا مجوز یا ورود به سیستم یا پیگیری درخواست را انجام دهد و سپس درخواست ها را به دستگیرندگان مربوطه ارسال کند
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PresentationFrontControllerTest {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }


    /**
     * این متد نمایش صفحه خانه را در J2ee Front Controller Design Pattern تست میکند
     */
    @Test
    void j2eeFrontControllerHomeTest() {
        String result = restTemplate.getForObject("http://localhost:" + port + "/frontController/show/HOME", String.class);
        Assertions.assertEquals("trackRequest.isAuthenticUser.HomeView.", result);
    }

    /**
     * این متد نمایش صفحه دانشجو را در J2ee Front Controller Design Pattern تست میکند
     */
    @Test
    void j2eeFrontControllerStudentTest() {
        String result = restTemplate.getForObject("http://localhost:" + port + "/frontController/show/STUDENT", String.class);
        Assertions.assertEquals("trackRequest.isAuthenticUser.StudentView.", result);
    }
}
