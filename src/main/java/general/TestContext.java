package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.hotelreservation.HotelDetailsPageObject;
import pages.hotelreservation.InvoicePageObject;
import pages.hotelreservation.ReservationPageObject;
import pages.ladingpage.BookHotelsPageObject;
import pages.ladingpage.HomepagePageObject;
import pages.login.LogInPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigationPage;
    private BookHotelsPageObject bookHotelsPage;
    private LogInPageObject loginPage;
    private SignUpPageObject signUpPage;
    private HomepagePageObject homepagePage;
    private HotelDetailsPageObject hotelDetailPage;
    private InvoicePageObject invoicePage;
    private ReservationPageObject reservationPage;
    private Booking booking;

    public TestContext(){ //konstruktors, kas uztaisīs jaunus objektus; nosaukums tāds pats, kā klasei
        this.user = new User(); //atmiņā tiek rezervēta vieta šim object
        this.accountPage = new AccountPageObject();
        this. navigationPage = new NavigationPageObject();
        this.bookHotelsPage = new BookHotelsPageObject();
        this.loginPage = new LogInPageObject();
        this.signUpPage = new SignUpPageObject();
        this.homepagePage = new HomepagePageObject();
        this.hotelDetailPage = new HotelDetailsPageObject();
        this.invoicePage = new InvoicePageObject();
        this.reservationPage = new ReservationPageObject();
        this.booking = new Booking();

    }

}
