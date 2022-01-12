package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26];

        for (int i = 0, j= 'z' ;i < 26; i++, j--)
        {

            alphabet[i] = (char) j;


        }
        System.out.println(Arrays.toString(alphabet));



    }
}
