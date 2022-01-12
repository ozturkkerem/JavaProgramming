package day25_CustomMethod_Overloading;

public class MethodOverLoading {
    public static void main(String[] args) {

        int [] intArray = {5,6,0,-1,3,4};

        double[] doubleArray = {10.5,11.5,5,5.4,5};

        char[] charArray = {'E', 'F', 'B','D', 'C', 'A'};

    sumOfNumbers(10,20);


    }

    public static int sumOfNumbers(int num1 , int num2){

        return num1+num2;
    }

    public static  double sumOfNumbers (double num1, double num2){

        return num1+num2;
    }

    public static int sumOfNumbers(int num1 , int num2, int num3){


        return num1+num2+num3;


    }

    public static int sumOfNumbers(int num1 , int num2, int num3, int num4){


        return num1+num2+num3+num4;
    }


}
