package oop.Testy;

public class RentableLand {
    int COST_PER_SQUARE_METER = 150;
    //za 1 den za 1 metr
    boolean isFarmLand;

    public RentableLand(int COST_PER_SQUARE_METER, boolean isFarmLand) {
        this.COST_PER_SQUARE_METER = COST_PER_SQUARE_METER;
        this.isFarmLand = isFarmLand;
    }

    int rent(int width, int lenght, int days){
        COST_PER_SQUARE_METER = COST_PER_SQUARE_METER* width* lenght * days;
        if (isFarmLand == true &&  days >= 182 ){
            COST_PER_SQUARE_METER=COST_PER_SQUARE_METER-100000;
            COST_PER_SQUARE_METER!==0;
        }
        return rent;
    }







}
