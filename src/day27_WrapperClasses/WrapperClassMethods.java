package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

       int num = Integer.parseInt(str);

        System.out.println(num);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("--------------------------------------------------");

        String s2 = "123";

        Integer x = Integer.valueOf(s2);

        String s3 = "1.5";
        Double y = Double.valueOf(s3);
        double z = y;
        System.out.println("--------------------------------------------------");


        char ch1 = '0';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        //isLetterOrDigit()
        boolean r4 = !Character.isLetterOrDigit(ch1);

        //upperCase
        boolean r5 =  Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("--------------------------------------");

        String s = " adasda1dsadas2fdsadsf3fsdfsd4";

        int sum = 0;
        for (char each:s.toCharArray()) {

            if (Character.isDigit(each))
            sum += Integer.parseInt(each+"");
        }

        System.out.println(sum);







    }
}
