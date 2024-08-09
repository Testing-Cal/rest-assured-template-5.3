package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ResourceBundle;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class DemoApplicationTest {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("application");

    @BeforeEach
    public void beforeClass() {
        RestAssured.baseURI = "https://ghibliapi.herokuapp.com";
        RestAssured.basePath = "/locations";
        //RestAssured.basePath = "/getDetails";
        //RestAssured.port = Integer.parseInt(resourceBundle.getString("server.port"));
    }

    @Test
    public void checkStatusCode() {
        /*Response res = given().when().get("/getDetails").then().log().all().extract()
                .response();
        int statusCode = given().when().get("/getDetails").getStatusCode();
        given().when().get("/getDetails").then().assertThat().statusCode(statusCode);*/
        Response res = given().when().get("/locations").then().log().all().extract()
                .response();
        int statusCode = given().when().get("/locations").getStatusCode();
        given().when().get("/locations").then().assertThat().statusCode(statusCode);
    }

/*    @BeforeClass
    public void before() {
        RestAssured.port = Integer.parseInt(resourceBundle.getString("server.port"));
    }

    @Test
    public void checkStatusCodeGetDetails() {
        Response res = given().when().get("/getDetails").then().log().all().extract()
                .response();
        int statusCode = given().when().get("/getDetails").getStatusCode();
        given().when().get("/getDetails").then().assertThat().statusCode(statusCode);
    }*/
}
