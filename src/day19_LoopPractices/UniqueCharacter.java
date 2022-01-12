package day19_LoopPractices;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //unique characters


        for (int j = 0; j <= str.length()-1; j++) {


        char ch = str.charAt(j);

        int count = 0; // represent the frequency of the ch

        for (int i = 0; i <=  str.length()-1; i++) {

            char each = str.charAt(i);

            if (ch == each){
                count++;
            }


        }
        if (count == 1)
            result += ch + "";

        }

        System.out.println(result);




    }
}
