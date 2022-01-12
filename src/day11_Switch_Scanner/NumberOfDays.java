package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 9;
        String result = "0";
        if (number >= 1 && number <=12 ){

            switch (number){

                case 2:
                    result = "28";
                    break;
                case 4 : case 6: case 9 : case 11:
                    result = "31";
                    break;

                default:
                    result = "30";

            }
            System.out.println(result);



        }
        else
            System.out.println("invalid Number");




    }
}
