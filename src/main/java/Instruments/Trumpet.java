package Instruments;

public class Trumpet extends Instrument{

    private int noOfValves;

    public Trumpet(int noOfValves, String categoryType, String make, String model, int bought, int sell) {
        super(categoryType, make, model, bought, sell);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String play(){
        return "toot-toot";
    }


}
