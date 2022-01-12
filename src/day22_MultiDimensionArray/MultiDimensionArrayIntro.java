package day22_MultiDimensionArray;

import java.util.Arrays;

public class MultiDimensionArrayIntro {
    public static void main(String[] args) {

        String [] group1 = {"jon", "Michael", "Ayse"};
        String [] group2 = {"Nermin", "Kaycee", "Bush"};
        String [] group3 = {"Hakan", "queens", "murat"};

        String [][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("------------------------------------");

        int[][] arr20 ={   {1,3,5}   ,  {2,4,6} , {12,24,36,48}   };
        System.out.println(Arrays.deepToString(arr20));

    }
}
