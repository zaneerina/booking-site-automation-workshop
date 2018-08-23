package pages.hotelreservation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HotelDetailsPageObject {

    private SelenideElement getRoomsSection() {
        return $("section[id= 'ROOMS']");
    }

    private SelenideElement getBookNowJunior(){

            return $(By.xpath("//section[@id=\"ROOMS\"]" +
                    "//descendant::button[@href='#details52']" +
                    "//ancestor::div[@class=\"col-md-3 book_buttons hidden-xs hidden-sm go-right\"]" +
                    "//following-sibling::div[@class='col-md-4 go-right']" +
                    "//descendant::button"));
    }

    public void locateRoomsSection() {

        getRoomsSection().scrollTo();
    }

    public void tapOnBookNowJunior() {
            getBookNowJunior().click();
        }
}
