package day30_CustomClass;

public class Cat {

    public String name;
    public String color;
    public int age;
    public char gender;
    public  String size;


    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void walk(){
        System.out.println(name+ " is walking");
    }

    public void setInfo (String name, String color, int age, char gender, String size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.size = size;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }



}
