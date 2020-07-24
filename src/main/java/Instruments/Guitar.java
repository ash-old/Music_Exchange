package Instruments;

import behaviours.IPlay;

public class Guitar extends Instrument {

    private int noOfStrings;
    private String type;

    public Guitar(int noOfStrings, String type, String categoryType, String make, String model, int bought, int sell) {
        super(categoryType, make, model, bought, sell);
        this.noOfStrings = noOfStrings;
        this.type = type;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "clannnnng";
    }


}
