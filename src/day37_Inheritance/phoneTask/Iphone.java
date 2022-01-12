package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }



    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + "is having a facetime with "+ phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + "is having a facetime with "+ email);
    }

}

//  public Iphone( String model, String size, double price, String color) {
//        super("Apple", model, size, price, color);
//    }
//