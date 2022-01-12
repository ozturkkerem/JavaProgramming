package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("Fiat", "Dublo", 2020);

        Car car4 = new Car("Reno", "Megan", 2010,20000);

        Car car5 = new Car("Bmw","X5",1999,50000,"red");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
