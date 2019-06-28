package info.sjd;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

import java.util.logging.Logger;

public class PrintArea {

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
