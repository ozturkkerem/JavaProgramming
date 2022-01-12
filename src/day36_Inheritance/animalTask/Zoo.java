package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","Black");

        Cat cat = new Cat();
        cat.setInfo("Tekir","anatol",'F',3,"small","white");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher","african",'F',4,"Medium","Black");


        System.out.println(dog);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();



    }
}
