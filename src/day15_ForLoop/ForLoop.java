package day15_ForLoop;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 15; i <= 45 ; i++) {
            System.out.print(i+ ", ");
        }
        System.out.println("\n");
        for (int i = 100; i >=50; i--){
            System.out.print(i+" ");
        }
        System.out.println("----------------------------------------------------");
        for (int i = 1; i <55;i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }


        System.out.println("----------------------------------------------------");
        for (int i = 2; i <55; i+=2)
            {
                System.out.print(i+" ");
            }


        System.out.println("------------------oooo_____________________");
        for (int i = 65; i <= 90; i++) {
            char a = (char) i;
            System.out.print (a+ " ");
        }
        System.out.println(" ");
        for (int i = 97; i <= 122; i++) {
            char a = (char) i;
            System.out.print (a+ " ");
        }
        System.out.println(" ");
        for (int i = 90; i >= 65; i--) {
            char a = (char) i;
            System.out.print (a+ " ");
        }
        System.out.println(" ");
        for (int i = 122; i >= 97; i--) {
            char a = (char) i;
            System.out.print (a+ " ");
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        for (int i = 1; i<=8 ;i++){

            System.out.println("* * * * * *");


        }
        for (int i = 1 ; i <= 100; i++){
            if (i % 3== 0)
                System.out.print("FIN ");
            else if(i % 5== 0)
            System.out.print("RA ");
            else if (i % 15 ==0)
                System.out.print("FINRA ");
            else
                System.out.print(i+" ");





            }
        System.out.println("--------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5 ;i++ ){

            System.out.println(" Enter the number: ");
            total += scan.nextInt();

        }
        System.out.println(total);
        scan.close();






















        }



    }

