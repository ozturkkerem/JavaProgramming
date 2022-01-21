package replit;

public class bookMain {
    public static void main(String[] args) {


        System.out.println(isTitleWord("at"));


    }
    public static Boolean isTitleWord(String word) {

        boolean result = true;

        String [] arr = {"at", "by", "in", "into", "near", "of", "on", "to", "than", "via","and", "but", "for", "nor", "or", "so", "yet","a" , "an", "the"};

        for (String each : arr) {
            if (each.equalsIgnoreCase(word))
                return false;
        }


        return result;

    }
}


