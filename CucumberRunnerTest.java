<<<<<<< HEAD
giimport io.cucumber.testng.AbstractTestNGCucumberTests;
=======
gitimport io.cucumber.testng.AbstractTestNGCucumberTests;
>>>>>>> 0bb2b06a6040733d0233b2f80b4cf49c5637db0f
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
<<<<<<< HEAD
        glue = "stepDefintion"

//        tags = "@Changes made by Sridevi",

=======
        glue = "Sridevi is making these changes again"
//        tags = "@Changed by Sridevich",
>>>>>>> 0bb2b06a6040733d0233b2f80b4cf49c5637db0f
//        plugin = {"pretty","html:target/report/cucumber.html",
//                "json:target/cucumber.json"}

//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
//        plugin = {"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
