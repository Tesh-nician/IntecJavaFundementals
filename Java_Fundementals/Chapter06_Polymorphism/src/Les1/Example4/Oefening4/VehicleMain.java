package Les1.Example4.Oefening4;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle();
        newVehicle.method();
        Hybrid newHybrid = new Hybrid();
        newHybrid.method();

        //upcasting
        Vehicle newVehicleUp = new Hybrid();

        //downcasting

        Hybrid newHybridDown = (Hybrid) newVehicleUp;




    }
}
