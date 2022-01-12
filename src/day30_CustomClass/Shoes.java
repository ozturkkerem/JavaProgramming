package day30_CustomClass;

public class Shoes {

    public String model;
    public String color;
    public String type;
    public int size;
    public int price;


    public void setInfo(String model, String color, String type, int size, int price) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String toString() {
        return "Shoes{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public void ticket(){
        System.out.println(model + "  shoes is $" + price);
    }
}
