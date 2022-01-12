package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100 excellent
        80~89 great
        70~79 good
        60~79 passed
        0~59 failed
         */

        int score = 70;

        if (score>= 0 && score <= 100){
            if (score >= 90)
                System.out.println("Excellent");
            else if (score >= 80)
                System.out.println("great");
            else if (score >= 70)
                System.out.println("good");
            else if (score >= 60)
                System.out.println("passed");
            else{
                System.out.println("Failed");
            }
        }
        else{
            System.out.println("Score is not valid");
        }

    }
}
