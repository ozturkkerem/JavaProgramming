package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArrayOverloading {
    public static void main(String[] args) {

        int [] intArray = {5,6,0,-1,3,4};

        double[] doubleArray = {10.5,11.5,5,5.4,5};

        char[] charArray = {'E', 'F', 'B','D', 'C', 'A'};

        System.out.println(Arrays.toString(addX(intArray,6)));
        System.out.println(Arrays.toString(addX(doubleArray,12.4)));
        System.out.println(Arrays.toString(addX(charArray,'z')));
    }






    public static int [] addX (int[] array, int element){
 int [] result = new int[array.length+1];
        int i = 0;
        for (int each:array) {
            result[i++] = each;
        }
        result[i]=element;
        
        return  result;
    }
    public static double [] addX (double[] array, double element){
        double [] result = new double[array.length + 1];
        int i = 0;
        for (double each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return result;
    }
    public static String [] addX (String[] array, String element){
        String [] result = new String[array.length+1];
        int i = 0;
        for (String each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return  result;
    }
    public static char [] addX (char[] array, char element){
        char [] result = new char[array.length+1];
        int i = 0;
        for (char each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return  result;
    }
}

/*
        1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array
 */