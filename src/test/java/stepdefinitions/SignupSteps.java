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
       // System.out.println("SELECT ACCOUNT MENU");
        selectMyAccountMenu();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT SIGNUP BUTTON");
        //selectSignUpButton();
    }

    @And("^I enter First name in the signup page$")
    public void iEnterFirstName() throws Throwable {
        System.out.println("ENTER FIRST NAME");
        //enterFirstName();
    }

    @And("^I enter Last name in the signup page$")
    public void iEnterLastName() throws Throwable {
       System.out.println("ENTER LAST NAME");
       // enterLastName();
    }

    @And("^I enter Mobile number in the signup page$")
    public void iEnterMobileNumber() throws Throwable {
        System.out.println("ENTER MOBILE NUMBER");
        //enterMobileNumber();
    }

    @And("^I enter Email address in the signup page$")
    public void iEnterEmailAddress() throws Throwable {
        System.out.println("ENTER EMAIL ADDRESS");
        //enterEmailAddress();
    }

    @And("^I enter Password in the signup page$")
    public void iEnterPassword() throws Throwable {
       System.out.println("ENTER PASSWORD");
       // enterPassword();
    }

    @And("^I confirm Password in the signup page$")
    public void iConfirmPassword() throws Throwable {
        System.out.println("ENTER CONFIRMATION PASSWORD");
        //confirmPassword();
    }

    @And("^I select Sign up button in the signup page$")
    public void iSelectSignUpButtonInTheSignupPage() throws Throwable {
        System.out.println("SELECT SIGNUP BUTTIN IN SIGN UP");
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpenend() throws Throwable {
        System.out.println("ACCOUNT CREATED");
    }


}
