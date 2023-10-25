package Oefening5;

public class FlashLight {

    Object myBatteryObject; //This is the type of battery that is used in the flashlight.


    public FlashLight(Object aThing){ //This constructs a new flashlight instance with the given battery.
        this.myBatteryObject=aThing;
    }


    @Override
    public String toString() {
        return "This flashLight uses " +
                myBatteryObject +" batteries.";
    }
}
