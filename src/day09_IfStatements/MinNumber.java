package day09_IfStatements;
import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {

        System.out.println("please write to integer");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x < y){
            System.out.println(x + " is the minimum number");
        }
        else if (x > y){
            System.out.println(y + " is the minumum number");
        }
        else if (x == y){
            System.out.println(y + " x equal y");
        }




    }



}
