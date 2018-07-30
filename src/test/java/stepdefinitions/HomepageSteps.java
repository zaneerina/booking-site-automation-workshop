package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private NavigationPageObject homepage = new NavigationPageObject(); //uztaisiis jaunu objektu no klases NavigationPageobject


    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visible"); //sheit buss assert, lai paarbaudiitu, vai homepage ir atveerta
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        homepage.selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        homepage.selectLogInButton();
    }

    @And("^I Navigate to Signup page$")
    public void iNavigateToSignUpPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

    @And("^I Navigate to Login page$")
    public void iNavigateToLoginPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectLoginButton();
}