
gitimport io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

        glue = "stepDefintion"

//        tags = "@Sailaja1",
//        tags = "@Sailaja2",
//       tags = "@Changes are for Adi",
//       tags = "@Changes made by Lakshmi2",
//        plugin = {"pretty","html:target/report/cucumber.html",
//                "json:target/cucumber.json"}
//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
       plugin = {"pretty1","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
