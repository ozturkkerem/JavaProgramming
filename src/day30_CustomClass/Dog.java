package day30_CustomClass;


import java.security.PublicKey;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogname, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogname;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size= dogSize;
        color = dogColor;


    }


    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }





}
/*
Attributes:
    name, age, gender, breed, size, color



Actions:
eat(), play(), bark()....


 */