package day19_LoopPractices;

public class FrequencyOfCharacter {
    public static void main(String[] args) {


        String str = "aabcccd";
        String result = "";




        for (int i = 0; i<= str.length()-1; i++){

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length()-1; j++) {

                char each = str.charAt(j);

                if (each == ch)
                    count++;


            }
            if (result.contains(ch+""))
                continue;
            result += ch+""+count;

        }

        System.out.println(result);









    }
}
