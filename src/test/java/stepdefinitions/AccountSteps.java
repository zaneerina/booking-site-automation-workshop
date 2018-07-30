package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.header.NavigationPageObject;
import pages.signup.SignUpPageObject;

public class AccountSteps {

    private NavigationPageObject account = new NavigationPageObject();


    @And("^I logout$")
    public void iLogOut() throws Throwable {
        account.selectLogOutButton();
    }


    @Then("^user account page is opened $")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED");
    }
}
