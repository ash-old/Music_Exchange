package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() throws Exception {
        drums = new Drums("acoustic", InstrumentType.PERCUSSION, "dw", "exotic stainless steel", 300, 500);
    }

    @Test
    public void getType() {
        assertEquals("acoustic", drums.getType());
    }

//    @Test
//    public void getCategoryType(){
//        assertEquals("percussion", drums.getCategoryType());
//    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void getMake(){
        assertEquals("dw", drums.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("exotic stainless steel", drums.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("rat-a-tat-tat", drums.play());
    }

    @Test
    public void canBuy(){
        assertEquals(300, drums.getBought());
    }

    @Test
    public void canSell(){
        assertEquals(500, drums.getSell());
    }

//    @Test
//    public void canCalculateMarkUp(){
//        assertEquals(330, drums.calculateMarkUp(drums), 0.1);
//    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(200, drums.calculateMarkUp(drums), 0.1);
    }

}