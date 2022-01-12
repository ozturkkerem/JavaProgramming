package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
char []ch1 = str1.toCharArray();
        char []ch2 = str1.toCharArray();
        for (char each1:str1.toCharArray()) {

            int count = 0;

            for (char each2:str2.toCharArray())
            {
            if (each1==each2)
                count++;
            }
            if (count != 1)
            {
                System.out.println(" they are not same character");
            break;
            }


        }
        System.out.println("They are same character");
        System.out.println("--------------------------------");

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("Anagram = " + anagram);

    }
}
