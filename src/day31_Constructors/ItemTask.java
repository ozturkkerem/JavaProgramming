package day31_Constructors;

public class ItemTask {

    public String name;
    public Double unitPrice;
    public int quantity;

    public ItemTask(String name, Double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCOst(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "ItemTask{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCOst() +
                '}';
    }
}

/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()
 */