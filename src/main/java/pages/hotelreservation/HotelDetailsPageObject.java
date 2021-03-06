package pages.hotelreservation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HotelDetailsPageObject {

    private SelenideElement getRoomsSection() {
        return $("section[id= 'ROOMS']");
    }

    private SelenideElement getBookNowJuniorButton(){

            return $(By.xpath("//div[@id=\"availability52\"]//preceding-sibling::div//button[contains(text(), \"Book Now\")]"));
    }

    private SelenideElement getHotelDetailsHeader(){
        return $(By.xpath("//div[@class = 'header-mob']//descendant::span[contains (text(), 'Rendezvous Hotels')]"));
    }

    private SelenideElement getDescriptionBox(){
        return $(".desc-scrol");
    }

    private SelenideElement getLoadingIndicator() {

        return $(By.id ("preloader"));
    }

    private SelenideElement getCheckinDate() {
        return $(By.xpath("//label[contains(text(), \" Check in\")]//following-sibling::input"));
    }

    private SelenideElement getCheckoutDate() {
        return $(By.xpath("//label[contains(text(), \" Check out\")]//following-sibling::input"));
    }
    private SelenideElement getAmountOfAdults(){
        return $("[id=adults]");
    }
    private SelenideElement getAmountOfChildren(){
        return $("[id=child]");
    }



    public void locateRoomsSection() {

        getRoomsSection().scrollTo();
    }

    public void tapOnBookNowJunior() {

        getBookNowJuniorButton().click();
    }

    public String getHotelDetailsHeaderText(){

        return getHotelDetailsHeader().getText();
    }

    public boolean isDescriptionBoxVisible(){

        return getDescriptionBox().isDisplayed();
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000 );
    }

    public String getChekinDateText(){

        return getCheckinDate().getValue();
    }

    public String getCheckoutDateText(){

        return getCheckoutDate().getValue();
    }

    public String getAmountOfAdultsAsString(){

        return getAmountOfAdults().getValue();
    }

    public String getAmountOfChildrenAsString(){

        return getAmountOfChildren().getText();
    }



}
