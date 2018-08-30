package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;
import io.netty.handler.codec.socks.SocksAddressType;

import javax.xml.soap.SOAPPart;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchHotelSteps {

    private TestContext test;
    public SearchHotelSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I enter ([^\"]*) hotel")
    public void iEnterHotelName(String hotel)  {

        test.getBookHotelsPage().enterHotelName(hotel);
    }

   @And("^I select hotel located in ([^\"]*)$")
    public void iSelectHotelLocatedInSingapore(String Location)  {
        //test.getBookHotelsPage().selectSingaporeHotel();
       test.getBookHotelsPage().selectHotelLocation(Location);
   }


    @And("^I select ([^\"]*) checkInDate")
    public void iSelectAsCheckInDate(String checkInDate)  {

       test.getBookHotelsPage().enterCheckInDate(checkInDate);

    }

    @And("^I select ([^\"]*) as Check out date$")
    public void iSelectAsCheckOutDate(String checkOutDate)  {

        test.getBookHotelsPage().enterCheckOutDate(checkOutDate);

    }


    @And("^I select ([^\"]*) Adults and ([^\"]*) Children$")
    public void iSelectAdultAndChildren(String Adults, String Children)  {
        test.getBookHotelsPage().setAmountOfTravellers();
        test.getBookHotelsPage().clearAdultsBox();
        test.getBookHotelsPage().enterAmountOfAdults(Adults);
        test.getBookHotelsPage().enterAmountOfChildren(Children);


    }

    @And("^I select Search button$")
    public void iSelectSearchButton()  {
    test.getBookHotelsPage().selectSearchHotelButton();
    }


    @And("^The hotel in ([^\"]*) is found$")
    public void theCorrectAmountOfHotelsIsFound(String Location)  {

        assertThat(test.getBookHotelsPage().getHotelLocationaName(Location)).isEqualTo(test.getBooking().getHotelLocation());






    }
}
