package day21_ForEachLoop;

import java.util.Arrays;

public class MargeTwoArray {
    public static void main(String[] args) {

        String[] group1 = {"ale", "veli", "deli"};
        String[] group2 = {"kazim","mazim", "lazim", "dazim", "razim"};

        String[] students = new String[group1.length+ group2.length];
int i = 0;
        for (String each:group1
             ) {
            students[i++] = each;
        }
        for (String each:group2
        ) {
            students[i++]= each;
        }

        System.out.printf(Arrays.toString(students));

    }
}
