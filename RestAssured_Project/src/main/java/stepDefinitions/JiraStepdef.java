package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Jira.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static io.restassured.RestAssured.given;

public class JiraStepdef {
    Response response;
    @Given("^I am on the jira application$")
    public void iAmOnTheJiraApplication() {
        RestAssured.baseURI="https://j91.atlassian.net/";
    }

    @When("^I pass the end point to create the Epic$")
    public void iPassTheEndPointToCreateTheEpic() throws ParseException {

        Reporter reporter = new Reporter();
        reporter.setAccountId("63364ae62eaaa5dcfa156176");
        reporter.setEmailAddress("jayasrijj91@gmail.com");
        Assignee assignee = new Assignee();
        assignee.setAccountId("63364ae62eaaa5dcfa156176");
        assignee.setEmailAddress("jayasrijj91@gmail.com");
        Project project = new Project();
        project.setId(10000);
        project.setKey("BQQ");
        project.setName("Batch4_QA_QE");
        IssueType issueType = new IssueType();
        issueType.setName("Epic");
        Fields fields = new Fields();
        fields.setProject(project);
        fields.setSummary("Automating_ the _ Epic_in jira with  the postman");
        fields.setIssuetype(issueType);
      /*  String sDate1="2022-11-14";
        String sDate2 = "2022-11-4";
        SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MMM-dd");
        Date date2=formatter2.parse(sDate2);
        Date date1=formatter2.parse(sDate1); */
        fields.setCustomfield_10015("2022-11-04");
        fields.setDuedate("2022-11-14");
        fields.setDescription("\\n\\n Automate the Jira With Postman for creating Epic and user stories\\n");
        fields.setAssignee(assignee);
        fields.setReporter(reporter);
        List<String> labels = new ArrayList<>();
        labels.add("Sprint9");
        Root root = new Root();
        root.setFields(fields);


        response = given().
                when().
                header("Authorization","Basic amF5YXNyaWpqOTFAZ21haWwuY29tOm1QVzdBVGhJMWNocFQ1UGpwbEh6NEQzNw==").
                header("Content-Type","application/json").
                body(root).
                post("rest/api/2/issue").andReturn();
        String res =response.getBody().asString();
        System.out.println(res);
    }

    @Then("^I see the status code (.*)$")
    public void iSeeTheStatusCode(int expectedStatusCode) {
        int actualStatusCode=response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }
}
