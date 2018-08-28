package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;
import pages.header.NavigationPageObject;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HomepageSteps {

    private TestContext test; //tiek izveidots privāts TestContext tipa objekts test - pieejams tikai šajā klasē

    public HomepageSteps(TestContext testContext){
        this.test = testContext;
    }




    @And("^I select book Hotels button$")
    public void iSelectBookHotelsButton()  {

        test.getHomepagePage().selectHotelsButton();
    }

}