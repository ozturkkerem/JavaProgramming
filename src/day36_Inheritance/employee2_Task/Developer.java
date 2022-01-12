package day36_Inheritance.employee2_Task;

public class Developer extends Employee{

    public void coding(){
        System.out.println(name + "is coding");
    }

    public void fixingBug(){

        System.out.println(name + "fixing bugs");
    }



}


/*
	2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */