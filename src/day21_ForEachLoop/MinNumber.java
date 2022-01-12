package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int [] numbers = {10,5,4,20,1,0,54,34534,543,4,2,32,3,4,5,5,56,45};
        int min = numbers[0];

        for (int number:numbers) {
            if (number<min)
                min = number;
        }
        System.out.println(min);
    }
}
