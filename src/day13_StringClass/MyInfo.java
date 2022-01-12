package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your school name");
        String school = scan.nextLine();
        System.out.println("Enter your city name");
        String cityName = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your building number");
        int building = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name");
        String street = scan.nextLine();


        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println(building + " " + street + " " + cityName + " " + state + " " + zipCode);
        System.out.println(school);




    }
}
