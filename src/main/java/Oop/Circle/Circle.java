package Oop.Circle;

import Oop.AbstractShape;
import Oop.Shape;

public class Circle extends AbstractShape implements Shape {

    double radius;

    double areaCircle = Math.PI * Math.pow(radius, 2);

    public double getArea() {
        return areaCircle;
    }
}
