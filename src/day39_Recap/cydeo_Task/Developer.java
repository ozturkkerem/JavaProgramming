package day39_Recap.cydeo_Task;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public  void fixingBugs(){

        System.out.println(getJobTitle()+" " + getName() + " is fixing the bug");

    }

    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working on a bug");
    }

}
