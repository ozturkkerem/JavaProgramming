package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTwoVariable {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        double [] arr3 = {10.0,11,41.5,7.6};
        double [] arr4 = {21.4, 53.2};
        char [] arr5 = {'a','b','c','d'};
        char [] arr6 = {'e','f','g','h'};
        String [] arr7 = {"kerem"};
        String [] arr8 = {"pasha"};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
        System.out.println(Arrays.toString(merge(arr3,arr4)));
        System.out.println(Arrays.toString(merge(arr5,arr6)));
        System.out.println(Arrays.toString(merge(arr7,arr8)));
        
    }



    public static int[] merge(int []x , int []y){
        int [] result = new int[x.length+ y.length];
        int i = 0;
        for (int each:x)
        {
         result[i++]= each;
        }
        for (int each:y)
        {
            result[i++]= each;
        }

        return result;

    }
    public static double[] merge(double []x , double []y){
        double [] result = new double[x.length+ y.length];
        int i = 0;
        for (double each:x)
        {
            result[i++]= each;
        }
        for (double each:y)
        {
            result[i++]= each;
        }

        return result;

    }
    public static char[] merge(char []x , char []y){
        char [] result = new char[x.length+ y.length];
        int i = 0;
        for (char each:x)
        {
            result[i++]= each;
        }
        for (char each:y)
        {
            result[i++]= each;
        }

        return result;

    }
    public static String[] merge(String []x , String []y){
        String [] result = new String[x.length+ y.length];
        int i = 0;
        for (String each:x)
        {
            result[i++]= each;
        }
        for (String each:y)
        {
            result[i++]= each;
        }

        return result;

    }
}
