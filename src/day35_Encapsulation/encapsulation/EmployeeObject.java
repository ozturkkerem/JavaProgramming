package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ayse",'K',11,-2900);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Kerem",'M',31,115000);

        employee2.setSalary(120000);

        System.out.println(employee2.getSalary());
    }
}
