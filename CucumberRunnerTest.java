
gitimport io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

        glue = "stepDefintion"
<<<<<<< HEAD
//        tags = "@Sailaja1",
=======
//       tags = "@Changes are for Sri",
//       tags = "@Changes made by Lakshmi",
>>>>>>> 0d71dd475dc9edfb3fa74ae65181aacdfe090671
//        plugin = {"pretty","html:target/report/cucumber.html",
//                "json:target/cucumber.json"}
//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
       plugin = {"pretty1","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
