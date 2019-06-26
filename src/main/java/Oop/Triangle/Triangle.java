package Oop.Triangle;

import Oop.AbstractShape;
import Oop.Shape;

public class Triangle extends AbstractShape implements Shape {

    double side1, side2, side3;  // стороны треугольника, side1 - сторона треугоника, к которой перпендикулярна высота h
    double p = (side1 + side2 + side3)/2;  // полупериметр
    double h =  (2/side1)*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));  // высота треугольника

    double areaTriangle = (h*side1)/2;    // расчёт площади треугольника через его высоту

    public double getArea() {
        return areaTriangle;
    }
}
