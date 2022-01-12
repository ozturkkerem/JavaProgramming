package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PhoneObject {
    public static void main(String[] args) {


        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();
        Phone phone5 = new Phone();

        phone1.setInfo("Iphone","IOS","black", 1000,5.2);
        phone2.setInfo("Samsung","Android","white", 900,4.2);
        phone3.setInfo("Nokia","Android","Gray", 500,6.2);
        phone4.setInfo("Motorola","Android","red", 700,5.2);
        phone5.setInfo("Siemens","IOS","yellow", 400,5.2);

        ArrayList<Phone> softwareAndroid = new ArrayList<>();
        softwareAndroid.addAll(Arrays.asList(phone1,phone2,phone3,phone4,phone5));

        softwareAndroid.removeIf(p-> p.software.equals("IOS"));

        for (Phone each : softwareAndroid){
            System.out.println(each.brand + " " + each.software);
        }

        System.out.println("------------------------------------------");
        ;





    }


}
