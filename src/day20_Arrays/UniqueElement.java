package day20_Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"Java", "Java" , "C#", "Python", "Python"};





        for (int j = 0; j < words.length; j++) {
            int frequency = 0;


        for (int i = 0; i < words.length; i++) {



            if (words[i].equalsIgnoreCase(words[j]))
            frequency++;



        }
        if (frequency==1) {
            System.out.println(words[j]);
         //   break;
        }
        }

    }
}
