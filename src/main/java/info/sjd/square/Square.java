package info.sjd.square;

import info.sjd.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public Square() { }

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

}
