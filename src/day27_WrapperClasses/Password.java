package day27_WrapperClasses;

public class Password {
    public static void main(String[] args) {


        String passWord = "kErem1983!";


        System.out.println(isPassword(passWord));


    }


    public static boolean isPassword(String str){

        boolean isStrong = false;
        boolean long1 = false;
        boolean space = true;   //ok
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialCharacter = false;
        boolean digit = false;



        if (str.length()<8)
        long1 = false;

        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);


            if (ch==' ')
                space = false;
            if (Character.isUpperCase(ch))
                upperCase = true;
            if (Character.isLowerCase(ch))
                lowerCase = true;
            if (!Character.isDigit(ch)&&!Character.isLetter(ch))
                specialCharacter = true;
            if (Character.isDigit(ch))
                digit = true;



        }
        if (space &&upperCase&&lowerCase&&specialCharacter&&digit)
return true;
return false;

    }

}
