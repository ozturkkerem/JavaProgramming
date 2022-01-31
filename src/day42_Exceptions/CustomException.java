package day42_Exceptions;

class FadyException extends  RuntimeException{


    public FadyException(){
        super("TIme for a short break ");
    }

    public FadyException(String message) {
        super(message);
       // System.out.println("it is time for break");
    }
}



public class CustomException {

    public static void main(String[] args) {

        //throw  new FadyException("It is time for break");
        throw  new FadyException();
    }


}
