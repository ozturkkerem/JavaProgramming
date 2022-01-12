package day17While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){

            str = str.replaceFirst("Java","");
            frequency++;

        }
        System.out.println(frequency);
        System.out.println("-------------------------------------------------------------");

        String str1 = "Java Java Python Python car car car car car car";
            int count = 0;

            while (str1.contains("car")){

                str1 = str1.replaceFirst("car", "");
            count++;
            }
        System.out.println(count);
    }
}
