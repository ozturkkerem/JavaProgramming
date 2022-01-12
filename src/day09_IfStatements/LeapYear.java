package day09_IfStatements;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("what year is that? ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year " + year + " is a leap year");
        }

        else{
            System.out.println("Year " + year + " is not a leap year");
        }


    }
}
