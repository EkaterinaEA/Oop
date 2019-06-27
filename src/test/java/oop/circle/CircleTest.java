package oop.circle;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    private Circle circle;

    @BeforeEach
    public void setup(){
        this.circle = new Circle();
        circle.setRadius(5.0);
    }

    @Test
    public void getAreaTest_NOT_NULL(){
        Assert.assertNotNull(circle.getArea());
    }

    @Test
    public void getAreaTest(){

        double expected = circle.getArea();
        double actual = Math.PI * Math.pow(5.0, 2);

        Assert.assertEquals(expected, actual, 0);

    }

}
