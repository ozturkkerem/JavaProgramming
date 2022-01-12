package day07_Operators;

public class Casting {
    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte)averageScore;
        short num2 = (byte)averageScore;
        int num3 = (byte)averageScore;
        long num4 = (byte)averageScore;
        float num5 = averageScore;
        double num6 = averageScore;


        System.out.println(num2);

    }

}