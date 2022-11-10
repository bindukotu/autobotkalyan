import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue ={"stepDefinitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
        tags = "@POSTAPI1")




public class SwaggerRunner extends AbstractTestNGCucumberTests {
}
