package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("kerem");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 12);

        Student student4 = new Student("Mert", 12,'A');

        Student student5 = new Student("Cihat",'M',28);

        Student student6 = new Student("Suayib", 'M',27,15);

        Student student7 = new Student("Ali", 'M', 42,30,'A');


        Student [] students = {student1,student2,student3,student4,student5,student6, student7};

        System.out.println(Arrays.toString(students));




    }
}
