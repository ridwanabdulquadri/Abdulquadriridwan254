package airconditioner;

import Ridwan.airconditioner.AirConditioner;
import jdk.jfr.Label;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class AirConditionerTest {
        private AirConditioner airConditioner;

        @BeforeEach
        void setUp() {
            this.airConditioner = new AirConditioner();
        }

        @Test
        public void testThatWeCanGiveItInitialValues() {
            Assertions.assertNull(this.airConditioner.getName());
            Assertions.assertEquals((Object)null, this.airConditioner.getColour());
            Assertions.assertEquals(0, this.airConditioner.getTemperature());
        }

        @Label("Test that we can assign new values to the AC")
        @Test
        public void test2() {
            this.airConditioner.setName("Samsung");
            this.airConditioner.setColour("White");
            Assertions.assertEquals("Samsung", this.airConditioner.getName());
            Assertions.assertEquals("White", this.airConditioner.getColour());
        }

        @Test
        public void checkThatTemperatureCanBeIncreasedAndDecreased() {
            Assertions.assertTrue(this.airConditioner.getTemperature() == 0);
            int i;
            for(i = 0; i < 10; ++i) {
                this.airConditioner.increaseTheTemperature();
            }

            Assertions.assertTrue(this.airConditioner.getTemperature() == 10);

            for(i = 0; i < 7; ++i) {
                this.airConditioner.decreaseTheTemperature();
            }

            Assertions.assertTrue(this.airConditioner.getTemperature() == 3);
            this.airConditioner.offTheAc();
            Assertions.assertTrue(this.airConditioner.getTemperature() == 0);
            this.airConditioner.onTheAc();
            Assertions.assertEquals(3, this.airConditioner.getTemperature());
        }

        public void testThatAcCanBeTurnedOn() {
        }
    }
