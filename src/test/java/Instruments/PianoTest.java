package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(88, "keys", "steinway & sons", "b-211", 600, 800);
    }

    @Test
    public void getNoOfKeys() {
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void getCategoryType() {
        assertEquals("keys", piano.getCategoryType());
    }

    @Test
    public void getMake() {
        assertEquals("steinway & sons", piano.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("b-211", piano.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk", piano.play());
    }

    @Test
    public void canBuy(){
        assertEquals(600, piano.getBought());
    }

    @Test
    public void canSell(){
        assertEquals(800, piano.getSell());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(660, piano.calculateMarkUp(piano), 0.1);
    }
}