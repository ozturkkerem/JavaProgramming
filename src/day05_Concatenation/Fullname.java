 package day05_Concatenation;

public class Fullname {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullname = firstName + " " + lastName;

        System.out.println("Fullname of the person is  = " + fullname);
        System.out.println(fullname + " is " + age + " years old" );
        System.out.println(fullname + " is " + jobTitle + ", " + " works at " + companyName + " , " + " and " + fullname
        + "'s " + "salary is $" + salary );






    }
}
