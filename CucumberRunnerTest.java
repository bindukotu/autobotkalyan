import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepDefintion"
//        tags = "@Kalyan",
//        plugin = {"pretty","html:target/report/cucumber.html",
//                "json:target/cucumber.json"}

//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
//        plugin = {"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
