package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(3, InstrumentType.BRASS, "yamaha", "ytr-2330", 200, 300);
    }

    @Test
    public void getNoOfValves() {
        assertEquals(3, trumpet.getNoOfValves());
    }

//    @Test
//    public void getCategoryType() {
//        assertEquals("brass", trumpet.getCategoryType());
//    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void getMake() {
        assertEquals("yamaha", trumpet.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("ytr-2330", trumpet.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("toot-toot", trumpet.play());
    }

    @Test
    public void canBuy(){
        assertEquals(200, trumpet.getBought());
    }

    @Test
    public void canSell(){
        assertEquals(300, trumpet.getSell());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(100, trumpet.calculateMarkUp(trumpet), 0.1);
    }

//    @Test
//    public void canCalculateMarkUp(){
//        assertEquals(220, trumpet.calculateMarkUp(trumpet), 0.1);
//    }
}