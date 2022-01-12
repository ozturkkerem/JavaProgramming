package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArray2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {7,8,9,10,11,12};

        int [] arr3 = ArraysUtility.merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

    }


}
