package info.sjd.circle;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

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
