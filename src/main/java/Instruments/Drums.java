package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drums extends Instrument{

    private String type;

    public Drums(String type, InstrumentType instrumentType, String make, String model, int bought, int sell) {
        super(instrumentType, make, model, bought, sell);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "rat-a-tat-tat";
    }


}
