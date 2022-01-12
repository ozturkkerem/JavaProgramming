package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        int num = 1;
        Integer num1 = 200;
        boolean r =   list.remove(num1);
        System.out.println(list);

        System.out.println("------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        System.out.println(characters.indexOf('A'));
        System.out.println(characters.lastIndexOf('A'));






    }
}
