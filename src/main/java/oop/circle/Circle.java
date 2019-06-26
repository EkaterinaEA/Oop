package oop.circle;

import oop.AbstractShape;
import oop.Shape;

public class Circle extends AbstractShape {

    private double radius;

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
