package day36_Inheritance.bookTask;

public class AudioBook extends Book{

    public int length;

    public String Narrator;

    public void setInfo (int length, String narrator) {
        this.length = length;
        Narrator = narrator;
    }

    public void listen(){
        System.out.println(title + "is being listening");
    }

}


/*

	3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()



 */