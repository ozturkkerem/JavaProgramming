package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {


    int number = 100;

    if( number %2 == 0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }


        System.out.println("---------------------------------------");

    String result = (number %2 == 0)? "even": "odd";
        System.out.println(result);



    }
}
