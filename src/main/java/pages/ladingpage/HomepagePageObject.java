package pages.ladingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomepagePageObject {


    private SelenideElement getHotelsButton() {
        return $("li[data-title ='HOTELS']"); }




    public BookHotelsPageObject selectHotelsButton()  {

        getHotelsButton().click();
        return page(BookHotelsPageObject.class);
    }

}
