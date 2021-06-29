package ch.bbw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setup(){
        testee = new Calculator();
    }
    @Test
    public void testSummeZweiPositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.differenz(20, 7) == 13);
    }
    @Test
    public void testSummeZweiNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(-11,-4)== -15);
    }
    @Test
    public void testSubtractionZweiNegativeIsOk(){
        testee = new Calculator();
        assertTrue(testee.differenz(-13,-5)==-8);
    }
}