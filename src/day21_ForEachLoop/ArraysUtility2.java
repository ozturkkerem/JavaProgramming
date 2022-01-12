package day21_ForEachLoop;
import java.util.Arrays;
public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay" , "Cihan", "David", "James", "Aaron","Daniel"};
        String [] earlyBird = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBird));
        System.out.println("-----------------------------------------");
        int[] score = {10,20,30,40,50,60,70,80,90,100};
        int [] score1 = Arrays.copyOfRange(score,3,7);
        System.out.println(Arrays.toString(score1));
        for (int all : score){
            System.out.println(all);
        }
    }
}
