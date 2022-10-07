package com.stackoverflow.api.answer;

import static com.stackoverflow.api.Endpoints.ANSWERS;
import static com.stackoverflow.framework.properties.ApiPropertyConst.ANSWERS_PAGE_SIZE;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import com.stackoverflow.bo.Answer;;
import com.stackoverflow.framework.properties.ApiPropertyService;
import com.stackoverflow.utils.StringUtils;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class VerifyStackoverflowGetAnswer extends BaseAnswer {

  private List<Answer> answers;
  private final String LINK_PATTERN = "https://stackoverflow.com/users/%d/%s";
  private ValidatableResponse response;

  @BeforeClass
  public void setUpAnswers() {
    response = given()
        .formParams(ANSWER_QUERY_PARAM)
        .when()
        .get(ANSWERS)
        .then();
    answers = response.extract()
        .body()
        .jsonPath()
        .getList("items", Answer.class);
  }

  @Test(description = "Verify response status code is 200")
  public void checkStatusCode() {
    response.assertThat().statusCode(HttpStatus.SC_OK);
  }

  @Test(description = "Verify each array element contains an Owner object")
  public void checkThatAnswerCorrespondResponseSchema() {
    response.assertThat()
        .body(JsonSchemaValidator
            .matchesJsonSchemaInClasspath("answerResponseSchema.json"));
  }

  @Test(description = "Verify size of the array matches the request parameter")
  public void checkAnswersCount() {
    int pageSize = Integer.parseInt(ApiPropertyService.getValueOf(ANSWERS_PAGE_SIZE));
    assertTrue(answers.size() <= pageSize,
        String.format("Answer list is more than %d!", pageSize));
  }

  @Test(description = "Verify link is formed with display_name and user_id fields")
  public void checkOwnersLinks() {
    assertTrue(answers.stream().map(Answer::getOwner).collect(Collectors.toList())
            .stream()
            .allMatch(owner -> String.format(LINK_PATTERN,
                owner.getUser_id(),
                StringUtils.getStringForURL(owner.getDisplay_name())).equals(owner.getLink())),
        "The link is not formed with user_id and display_name fields!");
  }
}
