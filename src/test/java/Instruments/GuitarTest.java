package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before()
    public void before(){
        guitar = new Guitar(6, "electric", "strings", "gibson", "les paul", 800, 1000);
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void hasCategoryType(){
        assertEquals("strings", guitar.getCategoryType());
    }

    @Test
    public void hasMake(){
        assertEquals("gibson", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("les paul", guitar.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("clannnnng", guitar.play());
    }

    @Test
    public void canBuy(){
        assertEquals(800, guitar.getBought());
    }

    @Test
    public void canSell(){
        assertEquals(1000, guitar.getSell());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(880, guitar.calculateMarkUp(guitar), 0.1);
    }






}
