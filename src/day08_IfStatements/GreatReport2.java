package day08_IfStatements;
import java.util.Scanner;

public class GreatReport2 {
    public static void main(String[] args) {
        System.out.println("what is your score? write it ");
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        boolean excellent = score >= 90 && score <= 100;
        boolean great = !excellent && score >= 80;
        boolean good = score <= 79 && score >= 70;
        boolean passed = score <= 69 && score >= 60;
        boolean fail = score <= 59 && score >= 0;

        if (excellent){
            System.out.println("excellent");  //a
        }
        if (great){
            System.out.println("Great");   //b
        }
        if(good){
            System.out.println("good");  //c
        }
        if (passed){
            System.out.println("passed");  //d
        }
        if (fail){
            System.out.println(("fail"));  //f
        }



    }



}
