package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator = '-';
        double n1 = 200.5;
        double n2 = 10.5;
        double result = 0;

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            switch (operator) {

                case '-':
                    result = n1 - n2;
                    break;

                case '+':
                    result = n1+n2;
                    break;

                case '*':
                    result = n1*n2;
                    break;
                default:
                    result = n1/n2;

            }
        } else
            System.err.println("Invalid Operator: " + operator);

        System.out.println(result);
    }
}


//valid operator  -, +, *, /
// n1 & n2