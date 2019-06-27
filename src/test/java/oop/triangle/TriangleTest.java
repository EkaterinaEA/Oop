package oop.triangle;

import oop.square.Square;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    public void setup(){
        triangle = new Triangle();
        triangle.setSide1(5);
        triangle.setSide2(7);
        triangle.setSide3(9);
    }

    @Test
    public void getAreaTest_NOT_NULL(){
        Assert.assertNotNull(triangle.getArea());
    }

    @Test
    public void getAreaTest(){

        double expected = triangle.getArea();
        double actual = (6.96*5)/2;

        Assert.assertEquals(expected, actual, 0.5);

    }
}
