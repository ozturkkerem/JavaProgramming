package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Kerem";
        int age = 38;
        String citizen = "Usa";

        boolean isEligible = age >= 21 && citizen == "Usa";
        // Eligible
        if(isEligible){
            System.out.println("Eligible");
        }
        // Not eligible
        if(!isEligible){
            System.out.println("Not Eligible");
        }

    }
}
