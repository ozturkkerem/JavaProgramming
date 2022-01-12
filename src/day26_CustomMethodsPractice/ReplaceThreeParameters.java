package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReplaceThreeParameters {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,2,3,44,5};





       int [] x= replace(arr,2,30);
        System.out.println(Arrays.toString(x));



    }

    //replace the elements of the array at given index with hte new element
    public static int [] replace(int [] arr, int index, int newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

            arr[index]=newElement;

        return arr;

    }

    //replace the elements of the array at given index with hte new element
    public static double [] replace(double [] arr, int index, double newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        arr[index]=newElement;

        return arr;

    }

    //replace the elements of the array at given index with hte new element
    public static char [] replace(char [] arr, int index, char newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }

    //replace the elements of the array at given index with hte new element
    public static String [] replace(String [] arr, int index, String newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        arr[index]=newElement;

        return arr;


    }



}
