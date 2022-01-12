package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String [] arr = str.split("");

      ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

    }
}
