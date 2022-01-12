package day23_CustomMethods_Void;

public class CustomMethodWithParameters {



    public static void main(String[] args) {
        int x = 12;
        oddOrEven(x);
printAToB(4,24);

    }


    public static void oddOrEven(int number){
        if (number%2==0)
            System.out.println("even");
        else System.out.println("odd");
    }
    public static void printAToB(int x, int y){

        for (int i = x; i <y ; i++) {

            System.out.print(i+" ");
        }


    }

}
