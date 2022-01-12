package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        System.out.println("Enter your building number");

        String building = input.next();
        input.nextLine();

        System.out.println("Enter your street name");
        String Street = input.nextLine();
        System.out.println("Enter your city name");
        String city = input.nextLine();
        System.out.println("enter your state:");
        String state = input.next();
        System.out.println("Enter your zip code");
        String zipcode = input.next();

        System.out.println("name = " + name);
        System.out.println("building = " + building);
        System.out.println("Street = " + Street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);

input.close();
    }

}

