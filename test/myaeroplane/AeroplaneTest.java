package myaeroplane;

import Ridwan.myaeroplane.Aeroplane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AeroplaneTest {
    Aeroplane aeroplane;

    @BeforeEach
    public void setUp() {

        this.aeroplane = new Aeroplane();
    }

    @Test
    void checkTheNameAndSeat() {
        assertNull(null, this.aeroplane.getName());
        assertNull(null, this.aeroplane.getName());
    }

    @Test
    void NameForAeroplaneAndAc() {
        this.aeroplane.setName("Qatar");
        this.aeroplane.setAcName("Panasonic");
        Assertions.assertEquals("Panasonic", this.aeroplane.getAcName());
        Assertions.assertEquals("Qatar", this.aeroplane.getName());

    }

    @Test
    void checkThatSeatIsComplete() {
        this.aeroplane.setSeat(15);
        assertEquals(15, this.aeroplane.getSeat());
    }

    @Test
    void displayTheColourOfAeroplane() {
        this.aeroplane.setColour("White");
        Assertions.assertEquals("White", this.aeroplane.getColour());
    }

    @Test
    void checkAcTemperatureWhenItOn() {
        aeroplane.isOn(true);
//        this.aeroplane.getTemperature();
//        int i;
//        for (int i = 0; i <  ; i++) {
//
        assertEquals(0, this.aeroplane.getTemperature());
    }

    @Test
    void increaseTemperature() {
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();
        this.aeroplane.getTemperature();

        int i;
        for (int j = 0; j < 18; ++j) {
            this.aeroplane.getTemperature();
        }
        assertEquals(26, this.aeroplane.getTemperature());
    }

    @Test
    void decreaseTemperature(){
        this.aeroplane.setDecreaseTemperature(26);
        this.aeroplane.getDecreaseTemperature();
        this.aeroplane.getDecreaseTemperature();
        this.aeroplane.getDecreaseTemperature();
        this.aeroplane.getDecreaseTemperature();
        int i;
        for(i = 0; i < 7; ++i) {
            this.aeroplane.getDecreaseTemperature();
        }

        assertEquals( 15,this.aeroplane.getDecreaseTemperature());
    }
    @Test
    void checkMyAeroplaneIfItStillWorking(){
        this.aeroplane.setOn(true);
        this.aeroplane.isOn(true);
        this.aeroplane.setSeat(15);
        this.aeroplane.setColour("white");
        assertEquals(15,this.aeroplane.getSeat());
        assertEquals("white",this.aeroplane.getColour());
        assertEquals(0,this.aeroplane.getAcOn());


    }
}