package day18_NestedLoop;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("login");
        }
        else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your user name: ");
                 u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("login");
                break;
                }

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.out.println("Your account is locked!!");
            }

            }
    scan.close();
    }




    }

