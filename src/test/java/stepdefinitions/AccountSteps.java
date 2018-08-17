package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;


public class AccountSteps {

    private TestContext test;
    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I logout$")
    public void iLogOut()  {
        //navigate.selectLogOutButton(); --> navigate: test.getNavigation();
        test.getNavigation().selectLogOutButton();
    }


    @Then("^user account page is opened $")
    public void userAccountPageIsOpened()  {
        System.out.println("ACCOUNT CREATED");
    }

    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
    }
}
