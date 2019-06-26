package oop;

import oop.circle.Circle;
import oop.square.Square;
import oop.triangle.Triangle;

import java.util.logging.Logger;

public class printArea {

    public static Logger log = Logger.getLogger(Shape.class.getName());

    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();

    public void printCircleArea()
    {
        log.info(String.valueOf(circle.getArea()));
    }

    public void printSquareArea()
    {
        log.info(String.valueOf(square.getArea()));
    }

    public void printTriangleArea()
    {
        log.info(String.valueOf(triangle.getArea()));
    }

}
