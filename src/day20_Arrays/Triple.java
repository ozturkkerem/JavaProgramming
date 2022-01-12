package day20_Arrays;

public class Triple {
    public static void main(String[] args) {

        String str = "xxxabc";
        int count = 0; // triple counter

        // for loop for counting each character
        for (int i = 0; i < str.length(); i++) {

            // I made a while condition checking if str.charAt(i)== str.charAt(i+1) and str.charAt(i+2)
                            //String str = "x  x    x  a  b  c ";
//                          //  index =     0  1    2  3  4  5
//                               i=>        i  i+1 i+2
            //if index i , i+1 , i+2 == I have a triple and I wanna count it.
                 //i+2< str.length(). I did this because we need at least 3 index to check.
                 //for example "xxxabc"=> you can no check after for i index 4 and 5 because we are looking for triple
            while (i+2< str.length()&&str.charAt(i) == str.charAt(i + 1)&&str.charAt(i+1) == str.charAt(i + 2)) {

                i++;
                count++;

            }
        }

        System.out.println(count);


    }}