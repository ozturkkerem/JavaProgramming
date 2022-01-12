package day37_Inheritance.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}

//  We use Encapsulation prevent the other classes to access to private fields. We can also add condition through  setter such as Age must bi smaller than '0' or salary must be greater than 0.