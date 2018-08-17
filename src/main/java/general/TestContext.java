package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.ladingpage.BookHotelsPageObject;
import pages.login.LogInPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private BookHotelsPageObject bookHotelsPage;
    private LogInPageObject loginPage;
    private SignUpPageObject signUpPage;

    public TestContext(){ //konstruktors, kas uztaisīs jaunus objektus; nosaukums tāds pats, kā klasei
        this.user = new User(); //atmiņā tiek rezervēta vieta šim object
        this.accountPage = new AccountPageObject();
        this. navigation = new NavigationPageObject();
        this.bookHotelsPage = new BookHotelsPageObject();
        this.loginPage = new LogInPageObject();
        this.signUpPage = new SignUpPageObject();

    }

}
