package com.stackoverflow.framework.listener;

import static io.restassured.RestAssured.given;

import com.stackoverflow.framework.specifications.Specification;
import org.testng.IClassListener;
import org.testng.ITestClass;

public class ApiListener implements IClassListener {
  private boolean isRequestSpecificationSet = false;
  private final String baseURI = "https://api.stackexchange.com";

  @Override
  public void onBeforeClass(ITestClass testClass) {
    if (!isRequestSpecificationSet) {
      Specification.installSpecification(Specification.requestSpecification(baseURI));
      isRequestSpecificationSet = true;
    }
  }
}
