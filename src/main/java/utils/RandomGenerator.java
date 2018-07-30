package utils; //utils package sastaav no mazaam klasiiteem, kuras  dara konkreetas lietas

import org.apache.commons.lang.RandomStringUtils;

public class RandomGenerator {

    //static - metode neko neietekmes; uzgjenerees stringu; static noziimee, ka nevajadzees taisit objektu randomgen, bet varees
    //piekluut no jebkuras klases

    public static String generateRandomString(){
        return RandomStringUtils.random(10,true, false); // iekavas padod skaitu, cik daudz padot chars, ja grib burtus, tad true,
    }

    public static String generateRandomPhoneNumber() {
        return "+371" + RandomStringUtils.random(8, false, true); //+371 + random 8 cipari
    }

    public static String generateRandomEmail() {
        return RandomStringUtils.random(7, true, false) + "." + // vards.
                RandomStringUtils.random (7, true, false) + "@" + // uzvards@
                RandomStringUtils.random(7, true, false) + ".com"; //domens.com
    }
}
