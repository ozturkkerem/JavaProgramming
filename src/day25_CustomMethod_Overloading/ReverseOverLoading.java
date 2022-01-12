package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseOverLoading {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverse(numbers)));




    }
    public static int [] reverse(int [] arr){
        int [] result = new int[arr.length];
        int i = arr.length-1;
        for (int each: arr) {
            result[i--]=each;
        }

        return result;
    }
    public static double [] reverse(double [] arr){
        double [] result = new double[arr.length];
        int i = arr.length-1;
        for (double each: arr) {
            result[i--]=each;
        }

        return result;
    }
    public static char [] reverse(char [] arr){
        char [] result = new char[arr.length];
        int i = arr.length-1;
        for (char each: arr) {
            result[i--]=each;
        }

        return result;
    }
    public static String [] reverse(String [] arr){
        String [] result = new String[arr.length];
        int i = arr.length-1;
        for (String each: arr) {
            result[i--]=each;
        }

        return result;
    }

}
