package day17While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your first number; ");
        int number1 = scan.nextInt();
        System.out.println("please enter your second number; ");
        int number2 = scan.nextInt();

        System.out.println("please enter your operator: "); // only + or -

        char ch = scan.next().charAt(0);

          while ( !(ch == '+' || ch == '-')){
       //while ( ch != '+' || ch != '-'){
            System.out.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+' ? number1+number2 : number1-number2));

    }
}
