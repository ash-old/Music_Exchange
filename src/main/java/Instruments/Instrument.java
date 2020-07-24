package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String categoryType;
    private String make;
    private String model;
    private int bought;
    private int sell;

    public Instrument(String categoryType, String make, String model, int bought, int sell) {
        this.categoryType = categoryType;
        this.make = make;
        this.model = model;
        this.bought = bought;
        this.sell = sell;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getBought(){
        return bought;
    }

    public int getSell(){
        return sell;
    }

    public double calculateMarkUp(Instrument instrument) {
        double markUp = instrument.getBought() * 0.10;
        return markUp + instrument.getBought();
    }
}
