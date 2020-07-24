import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<Instrument>();
    }

    public String getName() {
        return name;
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void addStock(Instrument instrument) {
        this.stock.add(instrument);
    }

    public void removeStock(Instrument instrument) {
        this.stock.remove(instrument);
    }
}
