package day27_WrapperClasses;

public class Retrieve {
    public static void main(String[] args) {

       int [] arr = {10, 20, 30, 40, 50};
       char [] arrC = {'a', 'b' , 'c' , 'd' , 'e'};


        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);
    String str = "Wooden???? Spoon!4";

    retrieve(str);
        System.out.println(checkUpAndLow("keremOZTUR"));
    ;

    }


    // it checks all char in string and separate them as digit , letters and special characters
public static void retrieve(String str){

        String letters = "";
        String digits = "";
        String specialChars = "";
    for (int i = 0; i <= str.length()-1 ; i++) {
        if (Character.isLetter(str.charAt(i)))
        letters+= str.charAt(i);
        else if(Character.isDigit(str.charAt(i)))
        digits+=str.charAt(i);
        else
            specialChars += str.charAt(i);


        System.out.println("Letters: " +letters);
        System.out.println("Digits: " +digits);
        System.out.println("Special Chars: "+  specialChars);
    }
}

public static boolean checkUpAndLow(String str){



    int up = 0;
    int low = 0;

    for (int i = 0; i <str.length() ; i++) {

        if (Character.isUpperCase(str.charAt(i)))
            up++;
            else if(Character.isLowerCase(str.charAt(i)))
            low++;


    }

    System.out.println(up);
    System.out.println(low);


    if (up==low)

        return true;
    return false;





}



}
