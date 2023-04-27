package chapter2;

import Ridwan.chapter2.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    Calculate calculate;
    void setUp(){
        this.calculate = new Calculate();
    }
    @Test
    void calculateSumOfThreeNumber(){
        int num = Calculate.addNumber(2,6,5);
        assertEquals(13, num);
    }
    @Test
    void subtractFifteenNumber(){
        int num = Calculate.minusNumbers(50,25,25);
        assertEquals(50,num);
    }
    @Test
    void multiplyFifteenNumber(){
        Calculate.multiplyNumbers(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        assertEquals(1, calculate.multiplyNumbers(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
    }
    @Test
    void divideSomeNumbers(){
        Calculate.divideThisNumber(10000,100);
        assertEquals(100,calculate.divideThisNumber(10000,100));
    }
    @Test
    void getDecimalInNumber(){
        Calculate.getTheDecimal(111,9);
        assertEquals(12.0, calculate.getTheDecimal(111,9));
    }

}