package day10_NestedIf;

import java.util.Scanner;

public class NestedIfIntro {
    public static void main(String[] args) {
        System.out.println("Please write result of the test: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if (score >= 00 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("invalid Score");
        }

        System.out.println("------------------------------------");


        int age = 25;
        boolean hasId = true;

        if (hasId) {


            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
            System.out.println("You must have an Id to buy alcohol");
        }
        System.out.println("-----------------------------------------------------");

        int number = 5;

        if (number > 0 && number < 8) {

            if (number == 1)
                System.out.println("Sunday");
            else if (number == 2)
                System.out.println("Monday");
            else if (number == 3)
                System.out.println("Tuesday");
            else if (number == 4)
                System.out.println("Wednesday");
            else if (number == 5)
                System.out.println("Thursday");
            else if (number == 6)
                System.out.println("Friday");
            else
                System.out.println("Saturday");
        }
        else{
            System.out.println("The number is not valid");
        }

    }
}
