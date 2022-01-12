package day37_Inheritance.scrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

public void fixBugs (){
    System.out.println(jobTitle + " " + name + " is fixing Bugs");

}


    public String toString() {
        return "Developer{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
