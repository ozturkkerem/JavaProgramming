package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "David", "Kerem"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);





    }
}
