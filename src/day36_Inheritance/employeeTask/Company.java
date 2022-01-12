package day36_Inheritance.employeeTask;

public class Company {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Kerem","Sdet","CVS",34,2321,'M',120000);

        Developer developer1 = new Developer();
        developer1.setInfo("Jon","developer","jhonsan",34,2122,'M',100000);

        Driver driver1 = new Driver();
        driver1.setInfo("Ayse","driver", " nest",23,2112,'F',122000);

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Michael","Teacher","DIsstrifk100",42,1221,'F',100000);

        System.out.println(tester1);

        tester1.testing();

    }

}
