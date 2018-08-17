package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class LoginSteps {

    private TestContext test;
    public LoginSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I enter Email address in login form$")
    public void iEnterEmailAddressInLoginForm()  {
        // login.enterEmail(user.getEmailAddress());
        // --> login: test.getLoginPage; user: test.getUser();
        test.getLoginPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter Password in login form$")
    public void iEnterPasswordInLoginForm()  {
         test.getLoginPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I select Login button in Login form$")
    public void iSelectLoginButtonInLoginForm()  {
        test.getLoginPage().selectLogInButton();
    }

    @And("^I login into account$")
    public void iLoginIntoAccount()  {
        iEnterEmailAddressInLoginForm();
        iEnterPasswordInLoginForm();
        iSelectLoginButtonInLoginForm();
    }


}
