package Instruments;

public class Trumpet extends Instrument{

    private int noOfValves;

    public Trumpet(int noOfValves, InstrumentType instrumentType, String make, String model, int bought, int sell) {
        super(instrumentType, make, model, bought, sell);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String play(){
        return "toot-toot";
    }


}
