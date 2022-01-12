package day36_Inheritance.phoneTask;

public class Phone {

    public String brand, model,color;
    public double price, size;

    public void setInfo(String brand, String model, String color, double price, double size) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void call (long phoneNumber){
        System.out.println( "is calling  by" + phoneNumber );

    }

    public void text(long phoneNumber){
        System.out.println(" is texting  by " + phoneNumber);

    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}


/*

1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects


 */