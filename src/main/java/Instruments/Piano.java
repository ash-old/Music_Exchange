package Instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(int noOfKeys, String categoryType, String make, String model, int bought, int sell) {
        super(categoryType, make, model, bought, sell);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String play(){
        return "plink plonk";
    }


}
