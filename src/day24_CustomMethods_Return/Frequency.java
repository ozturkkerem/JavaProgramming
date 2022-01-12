package day24_CustomMethods_Return;

public class Frequency {
    public static void main(String[] args) {

        String name = "Kerem Ozturk";

        for (int i = 0; i <= name.length()-1; i++) {
            System.out.print(name.charAt(i)+": ");
            System.out.println(frequency(name, name.charAt(i)));

        }


        //int frequency = frequency(name,'e');

    }

    public static int frequency(String name, char ch){
        int count= 0;

        for (int i = 0; i<= name.length()-1;i++){
            if (ch==name.charAt(i))
            count++;

        }



        return count;
    }
}
