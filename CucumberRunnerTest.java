
gitimport io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

        glue = "stepDefintion"
//       tags = "@Changes are for Sri",
//       tags = "@Changes made by Lakshmi",
//        plugin = {"pretty","html:target/report/cucumber.html",
//                "json:target/cucumber.json"}
//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
       plugin = {"pretty1","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
