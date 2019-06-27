package oop.triangle;

import oop.AbstractShape;

public class Triangle extends AbstractShape {

    private double side1, side2, side3;  // sides of the triangle, side1 - side of the triangle to which height h is perpendicular
    private double p = (side1 + side2 + side3)/2;  // semi-perimeter
    private double h =  (2/side1)*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));  // triangle height

    public Triangle() { }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return (h*side1)/2;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getP(){
        return p;
    }

    public double getH(){
        return h;
    }

}
