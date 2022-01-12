package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {


        char[] letters = new char[26];
        int count = 0;
        for (char i = 'a', j = 0; i <= 'z' ; i++, j++) {

            letters[j]= i;

        }

        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------------");

        char[] z_a = new  char[26];

        char end = 'Z';
        for (int i = 0; i < z_a.length; i++, end--) {

            z_a [i] = end;

        }
        System.out.println(Arrays.toString(z_a));


    }
}
