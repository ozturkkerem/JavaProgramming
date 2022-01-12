package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        // ArrayList<String> student = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//
        numbers.add(20);
        numbers.add(30);//
        numbers.add(40);//
        numbers.add(50);
        numbers.add(60);//


        numbers.add(4,45);



        System.out.println(numbers);
        System.out.println(numbers.size() );

        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);

        System.out.println("----------------------------------");
        Integer x=  numbers.get(3);
        System.out.println(x);
        System.out.println("------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("----------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("Java");
        list.add("C");
        list.add("Ruby");

        list.set(2, "JavaScript");

        System.out.println(list);

    }


}
