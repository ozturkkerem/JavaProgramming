package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber){

            System.out.println(number + "is even Number");
        }
        else {
            System.out.println(number + "is odd Number");
        }

        System.out.println("---------------------------------------------");


        int n = 200;
        //positive
        if (n > 0){

            System.out.println(n + " is positive number");
        }
        ///
        if (n < 0){

            System.out.println(n + " is negative number");
        }
        if (n == 0){
            System.out.println(n + " is zero");

        }




    }
}
