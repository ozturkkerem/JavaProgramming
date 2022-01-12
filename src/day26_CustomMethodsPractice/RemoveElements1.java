package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500,600};
        numbers=removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }
    //removes index from the array , returns new array (int [], int)
    public static int[] removeElement (int [] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
        System.exit(0);
        }

        int [] result = new int[array.length-1];
        int j = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (i== index)
                continue;
        result[j++] = array[i];


    }
        return result;
    }
}
