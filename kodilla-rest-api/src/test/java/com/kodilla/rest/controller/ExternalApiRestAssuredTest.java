package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();
    }

    @Test
    void testPutPostShouldReturnStatus200AndValidateResponse() {
        given().
                header("Content-Type", "application/json; charset=UTF-8").
                body("{\"id\": 1, \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}").
                when().
                put("https://jsonplaceholder.typicode.com/posts/1").
                then().
                assertThat().
                statusCode(200).
                body("id", equalTo(1)).
                body("title", equalTo("foo")).
                body("body", equalTo("bar")).
                body("userId", equalTo(1)).
                log().all();
    }


}
