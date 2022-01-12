package day30_CustomClass;

import java.util.ArrayList;
import java.util.function.DoublePredicate;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "lucky";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";



        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";



        Dog dog3 = new Dog();
        dog3.setInfo("Jack","german",4,'F',"Large","Pink");

        Dog dog4 = new Dog();
        dog4.setInfo("puppy", "sivas kangal", 8,'M', "Large", "White");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pitt-Bull",6,'M',"Large","Grey");


        dog1.eat();

        dog2.bark();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

        ArrayList<Dog> femaleDog = new ArrayList<>();
        ArrayList<Dog> maleDog = new ArrayList<>();











    }

}
