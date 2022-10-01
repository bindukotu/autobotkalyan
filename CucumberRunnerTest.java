gitimport io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
<<<<<<< HEAD
        glue = "stepDefintion"

//       tags = "@aruna",
//   plugin = {"pretty","html:target/report/cucumber.html",
=======
        glue = "Sridevi is making these changes"
//        tags = "@Changed by Sridevi",
//        plugin = {"pretty","html:target/report/cucumber.html",
>>>>>>> master
//                "json:target/cucumber.json"}

//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
//        plugin = {"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
