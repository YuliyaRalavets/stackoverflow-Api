package com.stackoverflow.framework.specifications;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Specification {

  public static RequestSpecification requestSpecification (String url){
    return new RequestSpecBuilder()
        .setBaseUri(url)
        .setContentType(ContentType.JSON)
        .build();
  }

  public static void installSpecification(RequestSpecification requestSpecification) {
    RestAssured.requestSpecification = requestSpecification;
  }
}
