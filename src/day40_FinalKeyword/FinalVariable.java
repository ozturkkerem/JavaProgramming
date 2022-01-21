package day40_FinalKeyword;

public class FinalVariable {


    final String birthDay;

    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

      //  pi = 4.14;
       // pi = 5.41;


        final String name;
        name = "java";

        System.out.println(name);

        System.out.println("-----------------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        System.out.println(obj.birthDay);
      //  obj.birthDay= "june/01";

        System.out.println("------------------------------------------------");
        System.out.println(FinalVariable.name);



    }




}
