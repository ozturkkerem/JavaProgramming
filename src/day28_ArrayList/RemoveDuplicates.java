package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {




        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList <Integer> result = new ArrayList<>(); // 10,20,30


        for (Integer each: list) {
            if (!result.contains(each))
                result.add(each);

        }
        System.out.println(result);
        System.out.println("--------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);


        System.out.println(list1.equals(list2));


    }
}
