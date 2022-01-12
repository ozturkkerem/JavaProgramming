package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for(int each:array){
            System.out.println(each);
        }
        
    }
    
    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array){
        for(double each:array){
            System.out.println(each);
        }

    }
    
    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for(char each:array){
            System.out.println(each);
        }

    }

    //prints each string of a String array in separate lines
    public static void printEachElement(String[] array){
        for(String each:array){
            System.out.println(each);
        }

    }

    //returns the maximum number for integer array
    public static int max (int [] numbers){

        Arrays.sort(numbers);

        return numbers [numbers.length-1];
    }

    //returns the maximum number for double array
    public static double max (double [] numbers){

        Arrays.sort(numbers);

        return numbers [numbers.length-1];
    }

    //returns the maximum number for integer array
    public static int min (int [] numbers){

        Arrays.sort(numbers);

        return numbers [0];
    }

    //returns the maximum number for double array
    public static double min (double [] numbers){

        Arrays.sort(numbers);

        return numbers [0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains (int[], int)
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each: array) {
            if (each==element)
                result = true;
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean. contains (double[], double)
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each: array) {
            if (each==element)
                result = true;
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean. contains (String[], String)
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each: array) {
            if (each.equals(element))
                result = true;
        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean. contains (char[], char)
    public static boolean contains(char [] array, char element){
        boolean result = false;

        for (char each : array) {
            if ( each == element)
                result = true;
        }
        return result;
    }

    //counts the number of elements from given int array, return int (int[], int)
    public static int frequencyOfElement(int [] array, int element){
        int count = 0;

        for (int each :array) {
            if (each==element)
                count++;
        }


        return count;
    }

    //counts the number of elements from given double array, return int (double[], double)
    public static int frequencyOfElement(double [] array, double element){
        int count = 0;

        for (double each :array) {
            if (each==element)
                count++;
        }


        return count;
    }

    //counts the number of elements from given char array, return int (char[], char)
    public static int frequencyOfElement(char [] array, char element){
        int count = 0;

        for (int each :array) {
            if (each==element)
                count++;
        }


        return count;
    }

    //counts the number of elements from given String array, return int (String[], String)
    public static int frequencyOfElement(String [] array, String element){
        int count = 0;

        for (String each :array) {
            if (element.equals(each))
                count++;
        }


        return count;
    }

    //adds the given element to array, returns a new array
    public static int [] addElement (int[] array, int element){
        int [] result = new int[array.length+1];
        int i = 0;
        for (int each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return  result;
    }

    //adds the given element to array, returns a new array
    public static double [] addElement (double[] array, double element){
    double [] result = new double[array.length + 1];
    int i = 0;
        for (double each:array) {
        result[i++] = each;
    }
    result[i]=element;

        return result;
}

    //adds the given element to array, returns a new array
    public static String [] addElement (String[] array, String element){
        String [] result = new String[array.length+1];
        int i = 0;
        for (String each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return  result;
    }

    //adds the given element to array, returns a new array
    public static char [] addElement (char[] array, char element){
        char [] result = new char[array.length+1];
        int i = 0;
        for (char each:array) {
            result[i++] = each;
        }
        result[i]=element;

        return  result;
    }

    // returns the unique elements of the array as a new array (int[], int)
    public static int[] uniqueElements(int [] array){
        int [] result = {};
        for (int each: array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }//frequencyOfElement

        return  result;
    }

    // returns the unique elements of the array as a new array (double[], double)
    public static double[] uniqueElements(double [] array){
        double [] result = {};
        for (double each: array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }//frequencyOfElement

        return  result;
    }

    // returns the unique elements of the array as a new  char array(char[], char)
    public static char[] uniqueElements(char [] array){
        char [] result = {};
        for (char each: array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }//frequencyOfElement

        return  result;
    }

    // returns the unique elements of the array as a new String array (String[], String)
    public static String[] uniqueElements(String [] array){
        String [] result = {};
        for (String each: array) {

            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }//frequencyOfElement

        return  result;
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

    //removes index from the array , returns new array (double [], double)
    public static double[] removeElement (double [] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double [] result = new double[array.length-1];
        int j = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (i== index)
                continue;
            result[j++] = array[i];
        }
        return result;
    }

    //removes index from the array , returns new array (char [], char)
    public static char[] removeElement (char [] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char [] result = new char[array.length-1];
        int j = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (i== index)
                continue;
            result[j++] = array[i];
        }
        return result;
    }

    //removes index from the array , returns new array (String [], String)
    public static String[] removeElement (String [] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String [] result = new String[array.length-1];
        int j = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (i== index)
                continue;
            result[j++] = array[i];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge (int [] arr1, int [] arr2){
        int[]result = {};
        for (int each:arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each:arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge (double [] arr1, double [] arr2){
        double[]result = {};
        for (double each:arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each:arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge (char [] arr1, char [] arr2){
        char[]result = {};
        for (char each:arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each:arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge (String [] arr1, String [] arr2){
        String[]result = {};
        for (String each:arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each:arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //reverse the given array and return array (int [])
    public static int[] reverse (int[] array){

        int [] result = {};

        for (int i = array.length-1; i>= 0  ; i--) {

            result = ArraysUtility.addElement(result ,array[i]);

        }
        return result;
    }

    //reverse the given array and return array (double [])
    public static double[] reverse (double[] array ){

        double [] result = {};

        for (int i = array.length-1; i>= 0  ; i--) {

            result = ArraysUtility.addElement(result ,array[i]);

        }
        return result;
    }

    //reverse the given array and return array (char [])
    public static char[] reverse (char[] array ){

        char [] result = {};

        for (int i = array.length-1; i>= 0  ; i--) {

            result = ArraysUtility.addElement(result ,array[i]);

        }
        return result;
    }
    
    //reverse the given array and return array (String [])
    public static String[] reverse (String[] array ){

        String [] result = {};

        for (int i = array.length-1; i>= 0  ; i--) {

            result = ArraysUtility.addElement(result ,array[i]);

        }
        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int [] replace(int [] arr, int index, int newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        arr[index]=newElement;

        return arr;

    }

    //replace the elements of the array at given index with the new element
    public static double [] replace(double [] arr, int index, double newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        arr[index]=newElement;

        return arr;

    }

    //replace the elements of the array at given index with the new element
    public static char [] replace(char [] arr, int index, char newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }

    //replace the elements of the array at given index with the new element
    public static String [] replace(String [] arr, int index, String newElement){

        if(index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        arr[index]=newElement;

        return arr;


    }

    //replaces all the matching old values of the array with the new value. (int[] , int ,int)
    public static int [] replaceAll(int [] arr, int oldElement, int newElement){

        int [] result = new int[arr.length];
        int i = 0;
        for (int each: arr) {
            result[i] = each;
            if (result[i]==oldElement)
                result[i]=newElement;
            i++;
        }
        return  result;


    }

    //replaces all the matching old values of the array with the new value.(double[] , double ,double)
    public static double [] replaceAll(double [] arr, double oldElement, double newElement){

        double [] result = new double[arr.length];
        int i = 0;
        for (double each: arr) {
            result[i] = each;
            if (result[i]==oldElement)
                result[i]=newElement;
            i++;
        }
        return  result;


    }

    //replaces all the matching old values of the array with the new value. (char[] , char ,char)
    public static char [] replaceAll(char [] arr, char oldElement, char newElement){

        char [] result = new char[arr.length];
        int i = 0;
        for (char each: arr) {
            result[i] = each;
            if (result[i]==oldElement)
                result[i]=newElement;
            i++;
        }
        return  result;


    }

    //replaces all the matching old values of the array with the new value.(String[] , String ,String)
    public static String [] replaceAll(String [] arr, String oldElement, String newElement){

        String [] result = new String[arr.length];
        int i = 0;
        for (String each: arr) {
            result[i] = each;
            if (result[i].equals(oldElement))
                result[i]=newElement;
            i++;
        }
        return  result;


    }

    //removes the duplicates from given array, returns the array
    public static int[] removeDuplicates(int[] array){

        int [] result = {};

        for (int each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static double[] removeDuplicates(double[] array){

        double [] result = {};

        for (double each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static char[] removeDuplicates(char[] array){

        char [] result = {};

        for (char each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //removes the duplicates from given array, returns the array
    public static String[] removeDuplicates(String[] array){

        String [] result = {};

        for (String each:array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

    //swaps two index in array by index number, returns array (int [], int , int)
    public static int [] swap (int arr [],int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    //swaps two index in array by index number, returns array (double [], int , int)
    public static double [] swap (double arr [],int index1, int index2){

        double temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    //swaps two index in array by index number, returns array (char [], int , int)
    public static char [] swap (char arr [],int index1, int index2){

        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    //swaps two index in array by index number, returns array (String [], int , int)
    public static String [] swap (String arr [],int index1, int index2){

        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }


    // it checks all char in string and separate them as digit , letters and special characters
    public static void retrieve(String str){

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            if (Character.isLetter(str.charAt(i)))
                letters+= str.charAt(i);
            else if(Character.isDigit(str.charAt(i)))
                digits+=str.charAt(i);
            else
                specialChars += str.charAt(i);


            System.out.println("Letters: " +letters);
            System.out.println("Digits: " +digits);
            System.out.println("Special Chars: "+  specialChars);
        }
    }










}


