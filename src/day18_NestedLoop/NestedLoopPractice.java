package day18_NestedLoop;

import java.util.Scanner;
public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("enter the age: ");
            int age = scan.nextInt();

            while (!(age >0 && age <= 120)){
                System.out.println("Please enter valid age:");
                age = scan.nextInt();

            }

            System.out.println("Would you like to continue? ");
            String  a = scan.next().toLowerCase();

            while (!(a.equals("no") || a.equals("yes"))){
                System.out.println("Invalid answer. Please re-enter");
                a = scan.next().toLowerCase();
            }



            if (a.equals("no"))
                break;

        }



scan.close();




    }
}
