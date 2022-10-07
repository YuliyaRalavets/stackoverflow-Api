package com.stackoverflow.framework.properties;

import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public class ApiPropertyService {
  private static final ResourceBundle RESOURCE_BUNDLE = setUpBundle();

  private static ResourceBundle setUpBundle() {
    return ResourceBundle
        .getBundle("api");
  }

  public static String getValueOf(String key) {
    String bundleValue = RESOURCE_BUNDLE.getString(key);
    return new String(bundleValue.getBytes(StandardCharsets.UTF_8));
  }
}
