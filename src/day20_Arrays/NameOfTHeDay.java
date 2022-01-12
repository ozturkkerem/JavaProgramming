package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class NameOfTHeDay {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("enter a number of the day");

        int number = scan.nextInt()-1;

        String[] days = {"Monday", "Tuesday" , "Wednesday" , "Thursday" , "Friday" ,"Saturday" , "Sunday"};

        System.out.println(days[number]);

        System.out.print(Arrays.toString(days));

scan.close();
    }
}
