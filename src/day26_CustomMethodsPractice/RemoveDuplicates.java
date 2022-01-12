package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,4,5,6,7,7,7,8,8,8,9,9};

        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));



    }
    //removes the duplicates from given array, returns the array
    public static int[] removeDuplicates(int[] array){

        int [] result = {};

        for (int each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static double[] removeDuplicates(double[] array){

        double [] result = {};

        for (double each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static char[] removeDuplicates(char[] array){

        char [] result = {};

        for (char each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static String[] removeDuplicates(String[] array){

        String [] result = {};

        for (String each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }


}


