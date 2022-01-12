package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String brand, String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void SelfDefense(){
        System.out.println(brand+ " " + model + "is self defensing");
    }



}
