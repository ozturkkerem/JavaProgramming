package day20_Arrays;

import java.util.Scanner;

public class Number10Times {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like to enter?");
        int num = scan.nextInt();
        int[] numbers = new int[num];

        for (int i = 0, j=1; i < num; i++, j++) {

            System.out.println("Enter a number " + j +" : ");
            numbers[i]= scan.nextInt();

        }

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]>max)
                    max=numbers[i];
                if (numbers[i]<min)
                    min = numbers[i];
            }
        System.out.println(max);
        System.out.println(min);

        //System.out.println(Arrays.toString(numbers));
    scan.close();
    }
}
