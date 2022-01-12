package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
//trim
        //String str1 = "         batch 25.  k          ";
        //String str2 = str1.trim();
        //System.out.println(str2);

      //String str3 = "kerempasacokyasa";

        //System.out.println(str3.indexOf("asa"));

        String s = "Dog Dog Dog Dog Dog Dog";

        s = s.replace("Dog", "cat");

        System.out.println(s);

        String s2 = "C# is fun, C# is cool";

        s2 = s2.replace(" C#", "Java");

        System.out.println(s2);



    }
}
