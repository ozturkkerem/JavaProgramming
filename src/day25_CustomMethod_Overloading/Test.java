package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);
        System.out.println(StringUtility.reverse(str));

        String word = "Civic";
        System.out.println(StringUtility.isPalindrome(word));

        String [] names = {"Anna" , "ali" , "Kerem", "mom", "jon"};

        int count = 0;

        for (String each:names) {
            if (StringUtility.isPalindrome(each))
       count++;
        }
        System.out.println(count);

        System.out.println(StringUtility.removeDuplicates(str));
        System.out.println(ArraysUtility.frequencyOfElement(names,"ali"));

    }

}
