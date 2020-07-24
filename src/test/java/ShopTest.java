import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drums drums;
    Guitar guitar;

    @Before
    public void before(){
        drums = new Drums("acoustic", "percussion", "dw", "exotic stainless steel", 300, 500);
        guitar = new Guitar(6, "electric", "strings", "gibson", "les paul", 800, 1000);
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void shopExists() {
        assertEquals("Ray's Music Exchange", shop.getName());
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddStock(){
        shop.addStock(drums);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(drums);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.getStockSize());

    }


}
