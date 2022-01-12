package day26_CustomMethodsPractice;

import java.util.Arrays;

public class x {
    public static void main(String[] args) {
        int [] input = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        System.out.println(Arrays.toString(do_switch(input)));
        }
    public static int[] do_switch(int[] i) {
        int [] result = new int [i.length];
        int j = 0;
        for(int element : i){

            result[j] = element;
            j++;
        }
        result[0]= i[i.length-1];
        result[result.length-1]= i[0];

        // your codes here:

        return result;
    }
}


