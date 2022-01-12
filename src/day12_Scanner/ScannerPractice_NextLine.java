package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name");
        String FullName = input.nextLine();



        System.out.println("enter your programming language");
        String programming =  input.nextLine();



        System.out.println("Enter your age");
        int age = input.nextInt();
input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("FullName = " + FullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
input.close();
    }
}
