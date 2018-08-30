package pages.ladingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.hotelreservation.HotelDetailsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BookHotelsPageObject {



    private SelenideElement getEnterHotelNameButton() {

        return $(By.xpath("//span[contains(text(), \"Search by Hotel\")]//parent::a//following-sibling::input"));
    }

    private SelenideElement getSingaporeHotelButton() {

        return $(By.xpath("//div[contains(text(),\"Hotels\")]//parent::li//li//div"));
    }

    private SelenideElement getCheckInButton() {
        return $(By.xpath("//div[@id = 'dpd1']//descendant::input"));
        // $("input[class=form-control input-lg dpd2]");}
    }

    private SelenideElement getCheckOutButton() {return $(By.xpath("//div[@id='dpd2']//descendant::input"));
    }

    private SelenideElement getAmountOfTravellersButton(){
        return $("input[id='travellersInput']");
    }

    private SelenideElement getChildInputButton(){
        return $("input[id='childInput']");
    }
    private SelenideElement getSearchHotelButton() {
        return $(By.xpath("//div[@id=\"HOTELS\"]//button[contains(text(), \"Search\")]"));
    }





    public void enterHotelName(String hotel){
        getEnterHotelNameButton().sendKeys(hotel);
    }

    public void selectSingaporeHotel(){
        getSingaporeHotelButton().click();
    }

    public String getTheCityName(){

        return getSingaporeHotelButton().getText().split(" ")[3];
    }


    public void enterCheckInDate(String checkInDate){
        getCheckInButton().sendKeys(checkInDate);
    }

    public void enterCheckOutDate(String checkOutDate){
        getCheckOutButton().sendKeys(checkOutDate);
    }

    public void setAmountOfTravellers(){
        getAmountOfTravellersButton().click();
    }

    public void enterAmountOfChildren (String Children) {
        getChildInputButton().sendKeys(Children);
    }

    public HotelDetailsPageObject selectSearchHotelButton(){
        getSearchHotelButton().click();
        return page(HotelDetailsPageObject.class);
    }

}
