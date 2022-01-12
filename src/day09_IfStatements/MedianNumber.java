package day09_IfStatements;
import java.util.Scanner;
public class MedianNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x > y && x < z) {
            System.out.println(x + " is the median number");
        } else if (x < y && x > z) {
            System.out.println(x + " is the median number");
        } else if (y > x && y < z) {
            System.out.println(y + " is the median number");
        } else if (y < x && y < z) {
            System.out.println(y + " is the median number");
        } else if (z > y && z < x) {
            System.out.println(y + " is the median number");
        } else if (z < y && z > x) {
            System.out.println(y + " is the median number");
        }
    }
}