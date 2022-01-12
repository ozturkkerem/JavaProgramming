package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //20 /6 ==> 3 with the remainder of t2;
        int count = 0;
        while (num1>=num2){

            num1 -= num2;
            count++;

        }
        System.out.println("remainder " + count);
        System.out.println(num1);
scan.close();
    }
}
