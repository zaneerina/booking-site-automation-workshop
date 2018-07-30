package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.login.LogInPageObject;

import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    //selenide funkcijas:
    //nodefineet piekluvi elementam, kur objekti bus privati, tips SelenideElement (selenide atribuuts)
    //pirmaa metode:  private SelenideElement myAccountButton = $("test");
    //otraa metode; dinamiskaakai piekluvei:
    private SelenideElement getMyAccountButton() {

        return $("test");
    }
    private SelenideElement getSignUpButton() {

        return $("test");
    }

    private SelenideElement getLogOutButton(){     //nodefinee logout pogu navigation logaa
        return $("test");
    }

    private SelenideElement getLogInButton() {     //nodefinee login pogu navigation logaa
        return $("test");
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


}
