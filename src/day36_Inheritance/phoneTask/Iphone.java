package day36_Inheritance.phoneTask;

public class Iphone extends Phone{


    public void faceTime(long phoneNumber){
        System.out.println("facing time by" + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("face timing by" +  email);
    }

}
