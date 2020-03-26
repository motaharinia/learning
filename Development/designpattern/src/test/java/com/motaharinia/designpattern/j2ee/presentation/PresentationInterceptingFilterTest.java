package com.motaharinia.designpattern.j2ee.presentation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

//An Intercepting Filter Pattern says that "if you want to intercept and manipulate a request and response before and after the request is processed".
//یک الگوی فیلتر رهگیری می گوید " می خواهید یک درخواست و پاسخ را رهگیری و درخواست و پاسخ را قبل و بعد از پردازش درخواست دستکاری کنید".
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PresentationInterceptingFilterTest {


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
     * این متد Interceptor را در J2ee InterceptingFilter Design Pattern تست میکند
     */
    @Test
    void j2eeInterceptorTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("username", "admin");
        map.add("password", "admin@1234");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity( "http://localhost:" + port + "/interceptingFilter/login" , request , String.class );
        String response = responseEntity.getHeaders().getFirst("response");
        Assertions.assertEquals("Login success", response);
    }

    /**
     * این متد Filter را در J2ee InterceptingFilter Design Pattern تست میکند
     */
    @Test
    void j2eeFilterTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("username", "admin");
        map.add("password", "admin@1234");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity( "http://localhost:" + port + "/interceptingFilter/login" , request , String.class );
        String response = responseEntity.getHeaders().getFirst("filterRunOrder");
        Assertions.assertEquals("1,2", response);
    }
}
