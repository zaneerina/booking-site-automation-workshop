package stepdefinitions;

import cucumber.api.java.en.Then;
import pages.signup.SignUpPageObject;

public class AccountSteps {



    @Then("^user account page is opened $")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED");
    }
}
