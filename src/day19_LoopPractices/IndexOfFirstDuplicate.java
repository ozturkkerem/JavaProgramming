package day19_LoopPractices;

public class IndexOfFirstDuplicate {
    public static void main(String[] args) {

        String str = "kerem";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each)
                count++;
                System.out.println(count);
            }

        }
        System.out.println(result);

    }
}
