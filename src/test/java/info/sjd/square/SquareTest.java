package info.sjd.square;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {

    private Square square;

    @BeforeEach
    public void setup(){
        this.square = new Square();
        square.setSide(5.0);
    }

    @Test
    public void getAreaTest_NOT_NULL(){
        Assert.assertNotNull(square.getArea());
    }

    @Test
    public void getAreaTest(){

        double expected = square.getArea();
        double actual = Math.pow(5.0, 2);

        Assert.assertEquals(expected, actual, 0);

    }
}
