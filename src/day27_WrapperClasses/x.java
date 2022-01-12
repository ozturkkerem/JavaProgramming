package day27_WrapperClasses;

public class x {
    public static void main(String[] args) {

        String s = "2:55:00PM";

        boolean number = Character.isDigit(s.charAt(0)) &&Character.isDigit(s.charAt(1));

        System.out.println();

        char ch = s.charAt(1);

         if (!Character.isDigit(ch))
             System.out.println("yes");
         else
             System.out.println("no");

    }

}
