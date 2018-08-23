package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.ladingpage.HomepagePageObject;
import pages.login.LogInPageObject;

import pages.signup.SignUpPageObject;

import javax.security.auth.login.AccountException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    //selenide funkcijas:
    //nodefineet piekluvi elementam, kur objekti bus privati, tips SelenideElement (selenide atribuuts)
    //pirmaa metode:  private SelenideElement myAccountButton = $("test");
    //otraa metode; dinamiskaakai piekluvei:

    private SelenideElement getMyAccountButton() {

        return $(By.xpath("//nav/descendant::li[@id='li_myaccount']/a"));
    }
    private SelenideElement getSignUpButton() {

        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]"));
    }

    private SelenideElement getLogInButton() {     //nodefinee login pogu navigation logaa

        return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]"));

    }
    private SelenideElement getLogOutButton(){     //nodefinee logout pogu navigation logaa

        return $(By.xpath("//nav/descendant::a[contains(text(), 'Logout')]"));
    }

    private SelenideElement getUserAccountButton(String username){
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username + "')]"));
        // tiek mekleets elements username vārds (kurš padots caur user object), un pēc tā meklēts elementu
    }

    private SelenideElement getHomeButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Home')]"));
    }


    // public metodei var pieklut jebkurs; void neatgriez neko; click atradiis elementu un uzklikos

    public void selectMyAccountButton() {

        getMyAccountButton().click();
    }


    //bez void jaanoraada, ko atgriezt
    public SignUpPageObject selectSignUpButton(){
        getSignUpButton().click();
        return page(SignUpPageObject.class); //izpildot šo, tiks atgriezts SignUpPageObject clases objekts
    }

    public LogInPageObject selectLogInButton() {    //publiska metode, kura atgriezh login lapu (uzklikojot login pogu)
        getLogInButton().click();
        return page(LogInPageObject.class);
    }

    public LogInPageObject selectLogOutButton() {     // publiska metode, kura atgriezh login lapu (uzklik logout)
        getLogOutButton().click();
        return page (LogInPageObject.class);
    }

    public AccountPageObject selectUserAccountButton(String username){
        getUserAccountButton(username).click();
        return page(AccountPageObject.class);

    }

    public HomepagePageObject selectHomeButton() {

        getHomeButton().click();
        return page(HomepagePageObject.class);
    }

}
