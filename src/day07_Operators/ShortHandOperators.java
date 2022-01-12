package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assigment: =
        int number = 100;

        System.out.println("number = " + number);

        number = 200;

        System.out.println("number = " + number);
        ;

        String word = "Java Programming";

        System.out.println("word = " + word); //java programming

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        System.out.println("-----------------------------------");

        //Addition Assigment:

        int x = 100;

        System.out.println("x = " + x);

        // x= x + 200;
        x += 200;

        System.out.println("x = " + x);

        String str = "wooden";
        str += " spoon";
        System.out.println("str = " + str);

        System.out.println("---------------------------------------");

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1); //9;

        double availablebalance = 1000;

        availablebalance += 300;

        System.out.println("availablebalance = " + availablebalance);

        availablebalance -= 500;

        System.out.println("availablebalance = " + availablebalance);


        availablebalance -= 200;
        availablebalance += 400;

        System.out.println("availablebalance = " + availablebalance);



        double salary = 50000.5;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);


        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

        double num2 = 25000.0;

        num2 /= 2;
        System.out.println("num2 = " + num2);
        
        
        double num3 = 100;
        
        num3 %= 3;

        System.out.println("num3 = " + num3);

        int amount = 172;  // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        System.out.println("-------------------------------");
        int cents2 = 180;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);


        System.out.println("---------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("----------------------------------");

        int balance =  3500;

        // insurance fee: $153

        balance %= 153;

        System.out.println("balance = " + balance);




    }
}
