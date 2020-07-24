package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drums extends Instrument{

    private String type;

    public Drums(String type, String categoryType, String make, String model, int bought, int sell) {
        super(categoryType, make, model, bought, sell);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "rat-a-tat-tat";
    }


}
