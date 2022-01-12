package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MaxNumberOverLoading {
    public static void main(String[] args) {

        int [] arr = {1,4,6,7,96,4,3453,767,867,100,43};
        System.out.println((maxNumber(arr)));
        byte [] arr1 = {1,4,6,7,96,4,42};
        System.out.println((maxNumber(arr1)));

    }


    public static int maxNumber(int [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }
    public static double maxNumber(double [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }
    public static long maxNumber(long [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }
    public static short maxNumber(short [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }
    public static float maxNumber(float [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }
    public static byte maxNumber(byte [] number){
        Arrays.sort(number);
        return number[number.length-1];
    }






}
