package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReturnMethodPractices {
    public static void main(String[] args) {

        String srt = "kerem ozturk";
        int [] number = {7,4,5634,6,8,79,5,4343,2423,6,56,76,6,2,457,5,8,54,5,25,235,3542,10000,564,1,5,57};
        System.out.println(maxNumber(number)+"  "+minNumber(number));
        System.out.println(removeDuplicate(srt));
        System.out.println(Arrays.toString(reversedArray(number)));

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(newArray(arr1,arr2)));

    }

    public static String removeDuplicate(String str){
        String noDuplicate = "";

        for (int i = 0; i <= str.length()-1  ; i++) {

            char each = str.charAt(i);

            if (!noDuplicate.contains(each+""))
                noDuplicate+=each;

        }




        return noDuplicate;
    }
    public static int maxNumber(int[]num ){

        Arrays.sort(num);
        int max= num[0];


        return max;
    }
    public static int minNumber(int[]num ){

        Arrays.sort(num);
        int min= num[num.length-1];


        return min;
    }
    public static int [] reversedArray( int [] numbers){

        int [] reArray = new int[numbers.length];
        for (int i = numbers.length-1; i >=0 ; i--) {

            reArray[i]=numbers[numbers.length-1-i];


        }

        return reArray;
    }
    public static int [] newArray(int [] array1, int [] array2){
        int [] newArray = new int[array1.length+array2.length];

        for (int i = 0; i <=array1.length-1; i++ )

            newArray[i] = array1[i];


        for ( int i = 0  ; i <=array2.length-1; i++ )

            newArray[array1.length+i] = array2[i];

            return newArray;

}

}
/*


    4. create a method that return the reversed array

    5. create a method that can merge two arrays and return
 the new array
 */