package day36_Inheritance.scrumTeam;

public class Employee extends Person {

    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(int id, String jobTitle, double salary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.setInfo(name,age,gender);
    }

    public void work(){
        System.out.println(name + " is working");
    }


    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class,
							 you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed

 */
