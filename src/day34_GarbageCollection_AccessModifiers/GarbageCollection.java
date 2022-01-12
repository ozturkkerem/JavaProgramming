package day34_GarbageCollection_AccessModifiers;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import day31_Constructors.Student;


public class GarbageCollection {
    public static void main(String[] args) {

    String  language = "Python";

    language = " java";


        System.out.println("-----------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);

        System.out.println(list2);


        System.out.println("------------------------------------------------");


        Student student1 = new Student("Tahir",30,'M','A',102);

        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);


        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Java");

        ArrayList<String> l2 = l1;



        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);



    }
}
