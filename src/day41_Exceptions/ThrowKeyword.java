package day41_Exceptions;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {


        System.out.println("Hello");

        //throw new ArithmeticException("Wrong Calculation");

      //   throw new InterruptedException();


        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 130){
            throw new InputMismatchException("Invalid Age: "+age);
        }




        System.out.println("age = " + age);
        System.out.println("finish");


    }
}

