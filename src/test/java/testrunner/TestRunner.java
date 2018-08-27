package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"} ,
      tags = {"@TEST"} //testrunner palaidīs tos testus, kuriem ir tags TEST (signup.feature file)
)
public class TestRunner {


}
