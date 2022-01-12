package day20_Arrays;

import java.util.Arrays;

public class Array_1to100 {
    public static void main(String[] args) {

        int [] numbers = new int[100];

        for (int i = 0,j=1; i <100; i++, j++){

            numbers[i]= j;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------------------");

        int [] numbers2 = new int[100];

        for (int i = 0, j=100; i <= 99 ; i++, j--) {

            numbers2[i]=j;

        }
        System.out.println(Arrays.toString(numbers2));
        System.out.println("------------------------------");




    }
}