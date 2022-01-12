package day17While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //usernamr:"Cydeo"
        //password: "Cydeo123"
        System.out.println("Enter your username");

        String userName = scan.next();
        System.out.println("Enter your password:");
        String passWord = scan.next();
        int count = 3;


            if (userName.equals("Cydeo") && passWord.equals("Cydeo123"))
        System.out.println("Login success");
        else{
            while (!(userName.equals("Cydeo") && passWord.equals("Cydeo123") ) && count >0)    {
                System.out.println("Incorrect");
                System.out.println("Enter your username");
                userName = scan.next();
                System.out.println("Enter your password");
                passWord = scan.next();
                count--;
            }

            if (userName.equals("Cydeo") && passWord.equals("Cydeo123"))
                System.out.println("User logg in");
            else
                System.out.println("blocked");

                scan.close();

            }


    }
}
