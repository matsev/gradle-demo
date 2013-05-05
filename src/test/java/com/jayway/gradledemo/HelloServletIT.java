package com.jayway.gradledemo;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.expect;

public class HelloServletIT {

    @Test public void
    calls_the_server_and_receives_ok_status() {
        expect().
                statusCode(HttpStatus.SC_OK).
                contentType("text/html").
        when().
                get("/gradle-demo/hello");
    }
}
