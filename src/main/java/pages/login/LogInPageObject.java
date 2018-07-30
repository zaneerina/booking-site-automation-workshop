package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LogInPageObject {


    private SelenideElement getEmailField() { //nodefineets epasta lodzinsh
        return $("test");
    }

    private SelenideElement getPasswordField() { //nodefineets paroles lodzinsh
        return $("test");
    }

    private SelenideElement getLogInButton() {
        return $("test");

    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public AccountPageObject selectLogInButton() {
        getLogInButton().click();
        return page(AccountPageObject.class);
    }

}
