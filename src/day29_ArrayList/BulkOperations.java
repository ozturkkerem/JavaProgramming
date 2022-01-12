package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {


        /*

             ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */






        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        System.out.println("--------------------------------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300));

        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);


        System.out.println("----------------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList <String> namesList = new ArrayList<>();    //new ArrayList<>(Arrays.asList(names));

        namesList.addAll(Arrays.asList(names));

        System.out.println("-------------------------------------------");

        int [] arr = {1,2,3,4,5,6,7,8,9,10};


        ;

        System.out.println(convertArrayToArrayList(arr));


    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list =  new ArrayList<>();

        for (Integer each : array) {
            list.add(each);
        }
        return  list;
    }
}
