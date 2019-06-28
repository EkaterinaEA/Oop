package info.sjd.dataTypeConversion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SumNumbersTest {

    @Test
    public void sum_NOT_NULL(){
        SumNumbers sumNumbers = new SumNumbers();
        Assert.assertNotNull(sumNumbers.sumModulo());
        Assert.assertNotNull(sumNumbers.sumSplittingCharacters());
    }

    @Test
    public void sumModuloTest(){
        SumNumbers sumNumbers = new SumNumbers();

        int expected = sumNumbers.sumModulo();
        int actual = 1+2+3+4+5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumSplittingCharactersTest(){
        SumNumbers sumNumbers = new SumNumbers();

        int expected = sumNumbers.sumSplittingCharacters();
        int actual = 1+2+3+4+5;

        Assert.assertEquals(expected, actual);
    }

}
