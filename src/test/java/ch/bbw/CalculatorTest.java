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
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk(){//Packetproctected macht keinen sinn blyat
        assertTrue(testee.differenz(20, 7) == 13);
    }
    @Test
    public void testSummeZweiNegativeIsOk(){
        assertTrue(testee.summe(-11,-4)== -15);
    }
    @Test
    public void testSubtractionZweiNegativeIsOk(){//Private macht kein Sinn
        assertTrue(testee.differenz(-13,-5)==-8);
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void testAdditionZahlenBereich(){
        assertTrue(testee.summe(Integer.MAX_VALUE, 2)!=0);
    }

}