package Oop.Square;

import Oop.AbstractShape;
import Oop.Shape;

public class Square extends AbstractShape implements Shape {

    double side;

    double areaSquare = Math.pow(side, 2);

    public double getArea() {
        return areaSquare;
    }
}
