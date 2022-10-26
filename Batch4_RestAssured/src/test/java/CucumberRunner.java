import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/resources/Features"
        , monochrome = true
        ,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
        , glue = { "stepDefinitions" }
        , tags= {"@GETAPI"}
        , strict = true)
public class CucumberRunner extends AbstractTestNGCucumberTests
{

}
