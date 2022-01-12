package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr4 = {1,2,3,4,5,5,5,5,6};
        ArraysUtility.printEachElement(arr1);

        char [] arr2=  {'a' , 'd' , 'g', 'y','a'};
        ArraysUtility.printEachElement(arr2);

        int max1 = ArraysUtility.max(arr1);
        int min1 = ArraysUtility.min(arr1);
        System.out.println(max1);
        System.out.println(min1);
        double [] arr3 = {10.2, 43.7,6.45,6.9};

        System.out.println(ArraysUtility.contains(arr1,6));

        System.out.println(ArraysUtility.frequencyOfElement(arr4,1));
        System.out.println(ArraysUtility.frequencyOfElement(arr2,'a'));
    }

}
