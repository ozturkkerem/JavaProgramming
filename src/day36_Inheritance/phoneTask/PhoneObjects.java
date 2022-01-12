package day36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Iphone","10","Black",500,5.2);
        Iphone iphone2 = new Iphone();
        iphone2.setInfo("Iphone","12","White",600,6);

        iphone1.faceTime(312412412);

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia","5110","green",500,4);

        System.out.println(nokia1);

        nokia1.selfDefense();

        Samsung samsung1 = new Samsung();

        samsung1.setInfo("Samsung","s8","Blue",1000,5);

        samsung1.freeze();
    }
}
