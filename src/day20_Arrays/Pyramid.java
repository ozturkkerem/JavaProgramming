package day20_Arrays;

public class Pyramid {
    public static void main(String[] args) {

        int h = 9;


        for (int i = 0; i<h ; i++)

        {
            for (int j = 0; j < i+1; j++){

                System.out.print("#");
            }
            System.out.println("");

        }
        System.out.println("--------------------------");
        for (int i = 0; i<h ; i++){

            for (int j = 0; j < h-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){

                System.out.print("#");
            }
            System.out.println("");

        }
        System.out.println("--------------------------");
        for (int i = 0; i<h ; i++){

            for (int j = 0; j < h-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){

                System.out.print("#");
            }
            System.out.print(" ");


            for (int j = 0; j < i+1; j++){

                System.out.print("#");

            }
            System.out.println("");


}}}
