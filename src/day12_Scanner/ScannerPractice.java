package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("true or false?");
        boolean result = input.nextBoolean();
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("name = " + name);
input.close();

    }
}
