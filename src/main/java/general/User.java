package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data //lombok runtimaa uztaisa set & get metodes automaatiski


public class User {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String password;

    public User(){ //konstruktors
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.emailAddress = generateRandomEmail();
        this.password = generateRandomString();
    }

    public User(String firstName, String lastName){ // metode, ja ir zinaams konkreets vards un uzvaards

        this.firstName = firstName;
        this.lastName = lastName;
    }
}
