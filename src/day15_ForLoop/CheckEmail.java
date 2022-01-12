package day15_ForLoop;

public class CheckEmail {
    public static void main(String[] args) {


    String email = "www.fds.com";
String emailLower = email.toLowerCase();
    if (emailLower.startsWith("www.") && (emailLower.endsWith(".com")||(emailLower.endsWith(".edu"))||(emailLower.endsWith(".gov"))))
        System.out.println("valid");
    else System.out.println("not valid");



    }



}
