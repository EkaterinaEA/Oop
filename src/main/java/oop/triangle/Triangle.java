package oop.triangle;

import oop.AbstractShape;
import oop.Shape;

public class Triangle extends AbstractShape {

    private double side1, side2, side3;  // стороны треугольника, side1 - сторона треугоника, к которой перпендикулярна высота h
    private double p = (side1 + side2 + side3)/2;  // полупериметр
    private double h =  (2/side1)*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));  // высота треугольника

    public double getArea() {
        return (h*side1)/2;
    }
}
