package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
         System.out.println("SELECT LOGIN BUTTON");
        //selectSignUpButton();
    }


    @And("^I enter Email address in login form$")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
         System.out.println("ENTER EMAIL");
        //enterEmailAddressInLoginForm();
    }

    @And("^I enter Password in login form$")
    public void iEnterPasswordInLoginForm() throws Throwable {
         System.out.println("ENTER PASSWORD");
        //enterPasswordInLoginForm();
    }

    @And("^I select Sign up button in login form$")
    public void iSelectSignUpButtonInLoginForm() throws Throwable {

         System.out.println("SELECT SIGNUP BUTTON IN LOGIN");
       // selectSignUpButtonInLoginForm();

    }
}
