package com.stackoverflow.api.answer;

import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_FILTER;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_ORDER;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_PAGE;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_PAGE_SIZE;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_SITE;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_SORT;

import com.stackoverflow.framework.properties.ApiPropertyService;
import java.util.Map;

public class BaseAnswer {

  protected final Map<String, String> ANSWER_QUERY_PARAM = Map.of(
      "site", ApiPropertyService.getValueOf(ANSWERS_SITE),
      "page", ApiPropertyService.getValueOf(ANSWERS_PAGE),
      "pagesize", ApiPropertyService.getValueOf(ANSWERS_PAGE_SIZE),
      "order", ApiPropertyService.getValueOf(ANSWERS_ORDER),
      "sort", ApiPropertyService.getValueOf(ANSWERS_SORT),
      "filter", ApiPropertyService.getValueOf(ANSWERS_FILTER));
}
