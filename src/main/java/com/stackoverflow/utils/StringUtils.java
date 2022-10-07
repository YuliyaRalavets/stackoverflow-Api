package com.stackoverflow.utils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.apache.commons.text.StringEscapeUtils;

public class StringUtils {

  public static String getStringForURL(String stringName){
    String userNameForLink = String.join("-", StringEscapeUtils.unescapeHtml3(stringName)
        .replaceAll("'","").split("[\\s._-]+"));
    return URLEncoder.encode(userNameForLink,StandardCharsets.UTF_8).toLowerCase();
  }
}
