package chapter2;

import Ridwan.chapter2.BMI;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class BMITest {
    private BMI bmi = new BMI();

    @Test
    void getBMITest() {
        assertEquals(1.0609567901234567, bmi.getBmi(55, 7.2));
    }
}
