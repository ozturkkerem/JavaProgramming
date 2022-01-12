package day09_IfStatements;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {

        System.out.println("Please give number of the week");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String day = "x";

        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }
        System.out.println(day);

    }
}
