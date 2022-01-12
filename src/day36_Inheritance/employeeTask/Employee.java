package day36_Inheritance.employeeTask;

public class Employee {


    public String name, jobTitle, companyName;
    public int age, id;
    public char gender;
    public double salary;

    public void setInfo(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}

/*
    Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()


    Tester

    Developer

    Driver

    Teacher




 */
