package Oefening5;

public class DuracelAA implements Battery {

    int powerReserve = 2500; //Defines the power reserve of the battery in mAh.

    @Override
    public int deliverPower() { return this.powerReserve;}

    @Override
    public String toString() {
        return "Duracel AA "+powerReserve+" mAh";
    }
}
