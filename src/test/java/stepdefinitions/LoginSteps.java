package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import general.User;
import pages.login.LogInPageObject;
import pages.signup.SignUpPageObject;

public class LoginSteps {

    private LogInPageObject login = new LogInPageObject();
    private User user = new User();



    @And("^I enter Email address in login form$")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password in login form$")
    public void iEnterPasswordInLoginForm() throws Throwable {
         login.enterPassword(user.getPassword());
    }

    @And("^I select Login button in Login form$")
    public void iSelectLoginButtonInLoginForm() throws Throwable {
        login.selectLogInButton();
    }

    @And("^I login into account$")
    public void iLoginIntoAccount() throws Throwable {
        iEnterEmailAddressInLoginForm();
        iEnterPasswordInLoginForm();
        iSelectLoginButtonInLoginForm();
    }


}
