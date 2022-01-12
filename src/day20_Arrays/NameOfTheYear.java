package day20_Arrays;
import java.util.Scanner;

public class NameOfTheYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scan.nextInt();

        String [] months = {"January", "February", "March", "April", "May" ,"June"
                ,"July" , "August","September","October" ,"November" ,"December"};

        System.out.println(months[i-1]);


scan.close();
    }
}
