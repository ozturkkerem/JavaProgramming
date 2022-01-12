package day36_Inheritance.cryptoToken;

public class CryptoToken {

    public double price, marketCap, volume, circulatingSupply;
    public int quantity;
    public boolean isMineAble;

    public void setInfo(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineAble) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.quantity = quantity;
        this.isMineAble = isMineAble;
    }


    public double totalPrice(){

        return price * quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineAble=" + isMineAble +
                ", Total Price" + totalPrice() +
                '}';
    }
}

/*

CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */
