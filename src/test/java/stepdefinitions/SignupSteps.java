package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }
    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
         System.out.println("SELECT ACCOUNT MENU");
       // selectMyAccountMenu();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT SIGNUP BUTTON");
       // selectSignUpButton();
    }

    @And("^I enter First name in the signup page$")
    public void iEnterFirstNameInTheSignupPage() throws Throwable {
        System.out.println("ENTER FIRST NAME");
       // enterFirstNameInTheSignupPage();
    }

    @And("^I enter Last name in the signup page$")
    public void iEnterLastNameInTheSignupPage() throws Throwable {
        System.out.println("ENTER LAST NAME");
       // enterLastNameInTheSignupPage();
    }

    @And("^I enter Mobile number in the signup page$")
    public void iEnterMobileNumberInTheSignupPage() throws Throwable {
        System.out.println("ENTER MOBILE NUMBER");
       // enterMobileNumberInTheSignupPage();
    }

    @And("^I enter Email address in the signup page$")
    public void iEnterEmailAddressInTheSignupPage() throws Throwable {
        System.out.println("ENTER EMAIL ADDRESS");
      //  enterEmailAddressInTheSignupPage();

    }

    @And("^I enter Password in the signup page$")
    public void iEnterPasswordInTheSignupPage() throws Throwable {
        System.out.println("ENTER PASSWORD");
       // enterPasswordInTheSignupPage();
    }
    @And("^I confirm Password in the signup page$")
    public void iConfirmPasswordInTheSignupPage() throws Throwable {
        System.out.println("ENTER CONFIRMATION PASSWORD");
       // confirmPasswordInTheSignupPage();
    }

    @And("^I select Sign up button in the signup page$")
    public void iSelectSignUpButtonInTheSignupPage() throws Throwable {
        System.out.println("SELECT SIGNUP BUTTIN IN SIGN UP");
       // selectSignUpButtonInTheSignupPage();

    }

    @Then("^user account page is opened $")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED");
    }


}