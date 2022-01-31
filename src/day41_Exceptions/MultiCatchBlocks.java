package day41_Exceptions;

import day39_Recap.cydeo_Task.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;

        try {

            System.out.println(employee.getSalary());




        }catch (NullPointerException e){
            System.out.println("First first catch block firsttt ");
            e.printStackTrace();
        }


        catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
        e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }


        System.out.println("Tested completed");

    }

}
