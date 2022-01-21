package day40_FinalKeyword;

import day39_Recap.shape.Circle;
import day39_Recap.shape.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){

        if (circle.getRadius() < 5){
            return;
        }


        this.circle = circle;
    }


    public Square getSquare(){
        return square;
    }



}