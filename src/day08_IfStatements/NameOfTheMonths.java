package day08_IfStatements;
import java.util.Scanner;

public class NameOfTheMonths {
    public static void main(String[] args) {

        System.out.println("Write the number of the month please ==> ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean january = x == 1;
        boolean february = x == 2;
        boolean march = x == 3;
        boolean april = x == 4;
        boolean may = x == 5;
        boolean june = x == 6;
        boolean july = x == 7;
        boolean august = x == 8;
        boolean september = x == 9;
        boolean october = x == 10;
        boolean november = x == 11;
        boolean december = x == 12;

        if (january){
            System.out.println("january = " + january);
        }
        if (february){
            System.out.println("february = " + february);
        }
        if (march){
            System.out.println("march = " + march);
        }
        if (april){
            System.out.println("april = " + april);
        }
        if (may){
            System.out.println("may = " + may);
        }
        if (june){
            System.out.println("june = " + june);
        }
        if (july){
            System.out.println("july = " + july);
        }

        if (august){
            System.out.println("august = " + august);
        }
        if (september){
            System.out.println("september = " + september);
        }
        if (october){
            System.out.println("october = " + october);
        }
        if (november){
            System.out.println("november = " + november);
        }
        if (december){
            System.out.println("december = " + december);
        }
    }
}
