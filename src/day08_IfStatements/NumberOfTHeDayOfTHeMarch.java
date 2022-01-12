package day08_IfStatements;
import java.util.Scanner;

public class NumberOfTHeDayOfTHeMarch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //boolean days31 =  number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;

        boolean days30 = number == 4 || number == 6 ||  number == 9 || number == 11;
        boolean days28 = number == 2;
        boolean days31 = !days28 && !days30;

        if (days28){
            System.out.println("28 days");
        }
        if (days30){
            System.out.println("30 days");
        }
        if (days31){
            System.out.println("31 days");
        }
    }
}
