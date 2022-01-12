package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println(list3);
        Collections.swap(list3,4,1);
        System.out.println(list3);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll((Arrays.asList(10,10,20,30,40,50,10,10,10)));
        System.out.println(list4);

        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);

    }
}
