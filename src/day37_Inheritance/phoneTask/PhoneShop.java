package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "12","Black","6.7",600);

        Samsung samsung = new Samsung("Samsung","S 8","5","GREY",400);

        Nokia nokia = new Nokia("Nokia", "5110", "5","Green", 200);


        System.out.println(iphone);

        System.out.println("------------------------------------");

        samsung.call(911);
        samsung.freeze();

        System.out.println(iphone.hasBattery);

    }
}
