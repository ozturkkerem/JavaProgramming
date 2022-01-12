package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoesStore {
    public static void main(String[] args) {

        Shoes shoes1= new Shoes();
        Shoes shoes2 = new Shoes();
        Shoes shoes3 = new Shoes();
        Shoes shoes4 = new Shoes();

        shoes1.setInfo("fly","white","spor", 8,120);
        shoes2.setInfo("light","black","running", 9,90);
        shoes3.setInfo("air", "black", "spor", 8,80);
        shoes4.setInfo("jump","black", "spor",9,120);

        ArrayList<Shoes> shoesList = new ArrayList<>(Arrays.asList(shoes1,shoes2,shoes3,shoes4));

        for (Shoes each : shoesList) {
            if (each.type.equals("spor"))
                System.out.println(each.model);

        }
        System.out.println("--------------------------------------------");

        ArrayList<Shoes> under100 = new ArrayList<>(shoesList);

        under100.removeIf(p->p.price>100);

        System.out.println(under100);

        System.out.println("------------------------------------");

        shoes1.ticket();

    }
}
