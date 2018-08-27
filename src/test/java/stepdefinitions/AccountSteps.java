package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;


public class AccountSteps {

    private TestContext test;
    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I logout$")
    public void iLogOut()  {
        //navigate.selectLogOutButton(); --> navigate: test.getNavigation();
        test.getNavigationPage().selectLogOutButton();
    }


    @Then("^user account page is opened $")
    public void userAccountPageIsOpened()  {

        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getAccountPage().getAccountName()).isEqualTo(test.getUser().getFirstName());
        assertThat(test.getAccountPage().getAccountLastName()).isEqualTo(test.getUser().getLastName());
    }

    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        test.getNavigationPage().selectUserAccountButton(test.getUser().getFirstName());
    }
}
