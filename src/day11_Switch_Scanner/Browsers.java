package day11_Switch_Scanner;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {

        // chrome, firerox, opera, safari, edge


        System.out.println("Write the browser");

        String browser = "chrome";
        String result = "";

        boolean validBrowser = browser == "chrome" || browser == "firefox"; // || browser == "opera" || browser == "safari" || browser == "edge";
        System.out.println(validBrowser);
        if (validBrowser) {
            if (browser == "chrome")
                result = "Chrome Browser is Selected";
            else if (browser == "firefox")
                result = "Firefox Browser is Selected";
            else if (browser == "opera")
                result = "Opera Browser is Selected";
            else if (browser == "safari")
                result = "Safari Browser is Selected";
            else
                result = "Edge Browser is Selected";

        } else
            System.out.println("Not valid browser");

        System.out.println(result);
    }
}
