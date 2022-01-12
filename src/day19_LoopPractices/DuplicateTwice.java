package day19_LoopPractices;

public class DuplicateTwice {
    public static void main(String[] args) {
        String str = "kerem";
        String result = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                char each = str.charAt(j);
                if (ch == each)
                    count++;

            }
            if (result.contains(ch+""))
            continue;

            if (count == 2)
            result += ch;


        }
        System.out.println(result);
    }
}
