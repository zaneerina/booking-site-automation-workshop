package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NavigationSteps {

    private TestContext test;
    public NavigationSteps(TestContext testContext){

        this.test = testContext;
    }



    @When("^I select My account menu$")
    public void iSelectMyAccountMenu()  {
        //   navigation.selectMyAccountButton(); -->
        //           --> navigation: test.getNavigation();
        test.getNavigationPage().selectMyAccountButton();
    }

    @And("^I select Sign up button in Navigation bar$")
    public void iSelectSignUpButton()  {

        test.getNavigationPage().selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton()  {
        test.getNavigationPage().selectLogInButton();
    }

    @And("^I Navigate to Signup page$")
    public void iNavigateToSignUpPage()  {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

    @And("^I Navigate to Login page$")
    public void iNavigateToLoginPage()  {
        iSelectMyAccountMenu();
        iSelectLoginButton();
    }


    @When("^I select Home button in Navigation bar$")
    public void iSelectHomeButtonInNavigationBar() throws InterruptedException {
        Thread.sleep(6000);
        test.getNavigationPage().selectHomeButton();
    }

    @Given("^Landing page is opened$")
    public void iHaveOpenedHomepage()  {

        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getNavigationPage().isLogoVisible()).isTrue();
       // assertThat(test.getNavigationPage().isMyAccountButtonVisible()).isTrue();
    }
}
