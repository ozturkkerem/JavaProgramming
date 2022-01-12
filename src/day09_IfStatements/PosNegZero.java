package day09_IfStatements;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        System.out.println("Number please");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n > 0) {
            System.out.println("Positive");
        }
        else if(n < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }



}
