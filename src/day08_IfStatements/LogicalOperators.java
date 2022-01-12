package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Ahmet";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;


        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan  : " + isEligible2);

        System.out.println("-----------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 21 &&  (gender == 'M' || gender == 'F');

        System.out.println(name3 + "is eligible for election : " + isEligible3);



    }
}