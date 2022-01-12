package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        //substring()

        String word = "Cydeo School";

        String word1= word.substring(0,4+1);
        System.out.println(word1);

        String word2 = word.substring(6);
        System.out.println(word2);

        System.out.println("------------------------------------------");

        String wordNew = "Java Programming Language";
        String s1 = wordNew.substring(0, wordNew.indexOf(" "));
        String s2 = wordNew.substring(wordNew.indexOf(" ")+1, wordNew.lastIndexOf(" "));
        String s3 = wordNew.substring(wordNew.lastIndexOf(" ")+1, wordNew.lastIndexOf("e") + 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        System.out.println("-------------------------------------------");





    }
}
