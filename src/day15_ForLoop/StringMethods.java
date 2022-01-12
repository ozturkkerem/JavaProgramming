package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = " ";
        boolean r = str.isEmpty();
        boolean b = str.isBlank();


        System.out.println(r);
        System.out.println(b);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

    String input1 = "I love java";
    String  input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.toLowerCase().contains(input2.toLowerCase()));


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("S");
        boolean y = a.startsWith("oo");
        boolean caseSen = a.toLowerCase().startsWith("w");


        System.out.println(x+"\n"+y+"\n"+caseSen);





    }
}
