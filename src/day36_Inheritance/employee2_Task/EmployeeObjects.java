package day36_Inheritance.employee2_Task;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer developer1 = new Developer();

        developer1.setInfo("Kenan","sunior",'M',32,122,10000);

        Tester tester1 = new Tester();

        tester1.setInfo("Nermin","Sdet",'F',23,122,10000);

        Driver driver1 = new Driver();

        driver1.setInfo("Kennedy","Driver",'M',32,122,100000);

        Teacher teacher1 = new Teacher();

        teacher1.setInfo("osman", "Teacher",'M',23,122,12200);


        developer1.coding();

        System.out.println(developer1);

        developer1.work();

    }
}
