package day19_LoopPractices;

public class FirstDuplicate {
    public static void main(String[] args) {

        String str = "abcdefghf";

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (each == ch){
                    count++;
                }
                }
            if (count ==2){
                System.out.println(ch);
                break;

            }

        }





    }
}
