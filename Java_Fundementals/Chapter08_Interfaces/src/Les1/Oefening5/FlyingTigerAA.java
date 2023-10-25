package Oefening5;

public class FlyingTigerAA implements Battery{

    int powerReserve = 1000; //Defines the power reserve of the battery in mAh.

    @Override
    public int deliverPower() { return this.powerReserve;}

    @Override
    public String toString() {
        return "Flying Tiger AA "+powerReserve+" mAh";
    }
}
