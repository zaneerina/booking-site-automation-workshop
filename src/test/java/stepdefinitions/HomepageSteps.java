package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private TestContext test; //tiek izveidots privāts TestContext tipa objekts test - pieejams tikai šajā klasē

    public HomepageSteps(TestContext testContext){
        this.test = testContext;
    }

   // private NavigationPageObject navigation = new NavigationPageObject(); //uztaisiis jaunu objektu no klases NavigationPageobject


    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage()  {
        System.out.println("Navigation is visible"); //sheit buss assert, lai paarbaudiitu, vai homepage ir atveerta
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu()  {
     //   navigation.selectMyAccountButton(); -->
     //           --> navigation: test.getNavigation();
        test.getNavigation().selectMyAccountButton();
    }

    @And("^I select Sign up button in Home page$")
    public void iSelectSignUpButton()  {
        test.getNavigation().selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton()  {
        test.getNavigation().selectLogInButton();
    }

    @And("^I Navigate to Signup page$")
    public void iNavigateToSignUpPage()  {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

    @And("^I Navigate to Login page$")
    public void iNavigateToLoginPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectLoginButton();
    }


}