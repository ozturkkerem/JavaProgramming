package day36_Inheritance.cryptoToken;

import day30_CustomClass.Car;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(10,3421,123,321,1,true);

        Cardano cardano = new Cardano();
        cardano.setInfo(20,34,2,3,1, cardano.isMineAble);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(5,1,1,1,1,true);


        System.out.println(bitcoin.totalPrice()+cardano.totalPrice()+ ethereum.totalPrice());

    }


}
