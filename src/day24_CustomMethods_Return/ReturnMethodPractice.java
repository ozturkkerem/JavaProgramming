package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        System.out.println(maxNumber(3,5));

    }

    public static int  maxNumber(int x, int y){
        int z=0;
        if (x>y)
            z=x;
        else
            z=y;

        return z;
    }
}
