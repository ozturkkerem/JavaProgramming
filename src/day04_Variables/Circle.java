package day04_Variables;

public class Circle {
    public static void main(String[] args) {

        double pi = 3.14;
        double radious = 5.5;
        double diameter = 2 * radious;
        double area = radious * radious * pi;
        double perimater = diameter * pi;

        System.out.println("radious = " + radious);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);

        System.out.println("perimater = " + perimater);


    }

}
