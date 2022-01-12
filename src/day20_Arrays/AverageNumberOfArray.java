package day20_Arrays;

public class AverageNumberOfArray {
    public static void main(String[] args) {

        int [] number = {10,20,30,40,50,60};

        int length = number.length;
        int sum = 0;

        for (int i = 0; i < length; i++){
            sum += number[i];

        }
        int ave = sum/length;

        System.out.println(ave);

    }
}
