package day15_ForLoop;
import java.util.Scanner;
public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -1;
        for (int i = 0,x = i; i < 5; i++) {
                System.out.println("Enter the " + i + ". number: ");
                int number = scan.nextInt();

                if (number> max)
                    max = number;
        }
        scan.close();
        System.out.println(max);

    }
}
