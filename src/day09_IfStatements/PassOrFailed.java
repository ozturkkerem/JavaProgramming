package day09_IfStatements;
import java.util.Scanner;
public class PassOrFailed {
    public static void main(String[] args) {

        System.out.println("What is the score?");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if(score >= 60 ) {
            System.out.println("Congrats, you passed");
        }
        else {
            System.out.println("Failed");
        }




    }
}
