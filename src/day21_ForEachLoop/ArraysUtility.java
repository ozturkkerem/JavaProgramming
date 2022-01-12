package day21_ForEachLoop;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1 , 2 , 3 , 4 , 5};


        System.out.println(Arrays.toString(nums));
        System.out.println("-----------------------");

        int [] scores = {95 , 100 , 55,65,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length-1]);
        System.out.println("---------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);
    }
}
