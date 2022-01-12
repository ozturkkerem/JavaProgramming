package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {


            result += str.charAt(i);


        }
        return result;

    }

    //checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){

        return reverse(str).equalsIgnoreCase(str);
    }

    //if the given string anagram, return boolean
    public static boolean isAnagram(String str1, String str2){
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);


    }

    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str){
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);
            if ( !result.contains(each+""))
                result+= each;
        }

        return result;
    }

    //check for if password strong
    public static boolean isStrongPassword(String password){

        boolean r1 =password.length() >= 8 &&!password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false;// has special character
        boolean r5 = false; //has digit


        char [] chars = password.toCharArray();


        for (char each : chars) {

            if (Character.isUpperCase(each)){

                r2 = true;
            }
            else if (Character.isLowerCase(each)){

                r3 = true;
            }


            else if (Character.isDigit(each)){

                r5 = true;
            }
            else {

                r4 = true;


            }}

        boolean isStringPassword = r1 && r2 && r3 && r4 && r5;
        return isStringPassword;
    }

}