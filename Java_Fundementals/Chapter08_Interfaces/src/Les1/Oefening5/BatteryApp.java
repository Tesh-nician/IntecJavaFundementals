package Oefening5;

public class BatteryApp {
    public static void main(String[] args) {

        Battery vartaAA1 = new VartaAA();
        Battery duracelAA= new DuracelAA();

       System.out.println("My Varta has a reserve of "+vartaAA1.powerReserve+"mAh");
       System.out.println("My Duracel has a reserve of "+vartaAA1.powerReserve+"mAh");
    }
}
