package day30_CustomClass;

public class CatObject {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();


        cat1.setInfo("lea", "White", 2,'F',"Large");
        cat2.setInfo("tekir", "black" , 3,'M',"Medium");

        Cat [] cats = {cat1,cat2};




    }
}
