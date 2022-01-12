package day11_Switch_Scanner;
import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println("integer please");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String result = (number >= 0 && number <= 9)? (number == 0)? "Zero" : (number == 1)? "one" : (number == 2)? "Two" : (number == 3)? "Three" :
                (number == 4)? "Four" : (number == 5)? "Five" :  (number == 6)? "Six" :  (number == 7)? "Seven" :  (number == 8)? "Eight" :
                        "Nine" : "Invalid Number";

        System.out.println(result);


    }

}
