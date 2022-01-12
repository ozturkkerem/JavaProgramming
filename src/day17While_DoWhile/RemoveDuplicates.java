package day17While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCCDDDEEE";

        String result = ""; //

        for (int i = 0; i <= str.length()-1 ; i++){

            String ch = "" + str.charAt(i);

            if (result.contains(ch))
                continue;
            else
                result+=ch;


        }

        System.out.println(result);









    }
}
