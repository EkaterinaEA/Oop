package oop.square;

import oop.AbstractShape;
import oop.Shape;

public class Square extends AbstractShape {

    private double side;

    public double getArea() {
        return Math.pow(side, 2);
    }
}
