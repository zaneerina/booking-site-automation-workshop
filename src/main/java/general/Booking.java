package general;

import lombok.Data;

@Data

public class Booking {

    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private String noOfAdults;
    private String noOfChildren;
    private String HotelLocation;

    public Booking(){

        this.roomType = "Room : Junior Suites";
        this.checkInDate = "01/09/2018";
        this.checkOutDate = "09/09/2018";
        this.noOfAdults = "2";
        this.noOfChildren = " 2 ";
        this.HotelLocation = "Singapore";
    }
}
