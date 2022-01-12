package utilities;

public class MathUtility {


    public static int sumOfNumber(int x, int y){

        return x+y;
    }

    public static double sumOfNumber(double x, double y){

        return x+y;
    }

    public static int subOfNumber(int x, int y){

        return x-y;
    }

    public static double subOfNumber(double x, double y){

        return x-y;
    }

    public static int multiOfNumber(int x, int y){

        return x*y;
    }

    public static double multiOfNumber(double x, double y){

        return x*y;
    }

    public static int divisionOfNumber(int x, int y){

        return x/y;
    }

    public static double divisionOfNumber(double x, double y){

        return x/y;
    }

    public static boolean ifEven(int x){
            boolean isEven = (x%2==0);
        return isEven;
    }

    public static boolean ifOdd(int x){
        boolean isOdd = (x%2!=0);
        return isOdd;
    }

    public static int maxNumberOfTwo(int x, int y){
            if (x>y)
                return x;
            return y;
    }

    public static double maxNumberOfTwo(double x, double y){
        if (x>y)
            return x;
        return y;
    }

    public static int minNumberOfTwo(int x, int y){
        if (x>y)
            return y;
        return x;
    }

    public static double minNumberOfTwo(double x, double y){
        if (x>y)
            return y;
        return x;
    }

    public static int squareOfNumber(int x){
        return x*x;
    }

    public static double squareOfNumber(double x, double y){

        return x*x;
    }

    public static int cubeOfNumber(int x){
        return x*x*x;
    }
    public static double cubeOfNumber(double x){
        return x*x*x;
    }
}
