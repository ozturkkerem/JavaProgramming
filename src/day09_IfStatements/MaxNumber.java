package day09_IfStatements;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println("Please write 2 integer ");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x>y){
            System.out.println(x +" is greater than " + y);
        }
        else{
            System.out.println(y +" is greater than " + x);
        }

    }
}
