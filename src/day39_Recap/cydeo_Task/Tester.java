package day39_Recap.cydeo_Task;

public class Tester extends  Employee {

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void createTicket(){

        System.out.println(getJobTitle()+" "+getName()+ " is creating ticker");


    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is creating a ticker");
    }
}
