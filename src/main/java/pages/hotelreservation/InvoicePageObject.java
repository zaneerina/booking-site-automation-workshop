package pages.hotelreservation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class InvoicePageObject {

    private SelenideElement getLoadingIndicator() {

        return $(By.xpath ("//title[contains(text(), \"Invoice\")]//parent::head//following-sibling::body//descendant::div[@id=\"preloader\"]"));
    }

    private SelenideElement getBannerUnpaid(){
        return $(By.xpath("//div[contains(text(), \"Unpaid\")]"));
    }

    private SelenideElement getCheckinDate(){
        return $(By.xpath("//strong[contains(text(),\"Check in\")]//parent::td//following-sibling::td"));
    }

    private SelenideElement getCheckoutDate(){
        return $(By.xpath("//strong[contains(text(),\"Check out\")]//parent::td//following-sibling::td"));
    }
    private SelenideElement getRoomType(){
        return $(By.xpath("//img[@class=\"img-responsive\"]//parent::td//parent::tr//following-sibling::tr//td"));
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 7000 );
    }

    public boolean isUnpaidInvoiceDisplayed(){

        return getBannerUnpaid().isDisplayed();
    }

    public String getCheckInDateText(){
        return getCheckinDate().getText();
    }

    public String getCheckOutDateText(){
        return getCheckoutDate().getText();
    }

    public String getRoomTypeName(){
        return getRoomType().getText();
    }

}
