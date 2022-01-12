package day17While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {


       /* for (char i = 'A'; i <= 'E' ; i++) {
            if (i == 'C')
                //break;
                continue;
                System.out.println(i);
*/


        System.out.println("Even numbers");
        for (int i = 1; i <= 10; i++) {

            if (i%2 != 0){
                continue;
            }
            System.out.println(i);

        }

        for (int i = 1; i <= 20; i++) {
            if (i%2 == 0)
                continue;
            else
                System.out.println(i);
        }


    }






    }

