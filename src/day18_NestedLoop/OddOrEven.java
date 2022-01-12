package day18_NestedLoop;

import  java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        while(true){
            System.out.println("Please enter a number: ");
            int num = scan.nextInt();
            if (num%2==0)
                System.out.println("Even number");
            else System.out.println("Odd number");

            System.out.println("Would you like to enter another number?");
            String a = scan.next();
            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {

                System.out.println("Invalid answer, please repeat the answer");
                a = scan.next();
            }

            if (a.equalsIgnoreCase("no"))
                break;

        }

scan.close();




    }
}
