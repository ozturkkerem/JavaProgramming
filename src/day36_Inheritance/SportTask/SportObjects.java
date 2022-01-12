package day36_Inheritance.SportTask;

public class SportObjects {

    public static void main(String[] args) {

        Football football1 = new Football();

        football1.setInfo ("Football",11,4,42);

        football1.penalty();

        System.out.println(football1);

    }
}
