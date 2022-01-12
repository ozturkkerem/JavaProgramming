package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse (int arr [] ){

        int [] result = {};

        for (int i = arr.length-1; i>= 0  ; i--) {

            result = ArraysUtility.addElement(result ,arr[i]);

        }
        return result;
    }


}
