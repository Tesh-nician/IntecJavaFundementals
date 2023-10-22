package Les1.Oefening4;

public class VehicleMain {
    public static void main(String[] args) {

        //Schrijf een programma om downcasting en upcasting te tonen.
        //
        //De parent class is Vehicle en maak 3 verschillende child classes.
        //
        //Laat zien hoe je de downcasting en upcasting uitvoert.

        //Vehicle class only has iAm method.
        //Cabrio class  has sunroof methods.
        // Hybrid class has battery method.
        //Suv class has no own method.


        Vehicle newVehicle = new Vehicle();
        Cabrio newCabrio = new Cabrio();
        Hybrid newHybrid = new Hybrid();
        Suv newSUV = new Suv();

        newVehicle.iAm();
        newCabrio.iAm();
        newCabrio.sunroofOpen();//method ONLY available in Cabrio class
        newHybrid.iAm();
        newHybrid.batteryOn();
        newSUV.iAm();





        //Examples of upcasting:
        System.out.println("__________________________________________________\nUpcasting of newCabrio to Vehicle class now happening:");
        Vehicle newVehicleReferenceOfCabrioInstance = newCabrio; //creates an instance of newCabrio with superclass reference.
                                                                // Cabrio => Vehicle.
        newVehicleReferenceOfCabrioInstance.newName="Vehicle";

        newVehicleReferenceOfCabrioInstance.iAm();  // is able to perform the same-name method from superclass.
        System.out.println("But Java thinks I am a: "+newVehicleReferenceOfCabrioInstance.newName);



        //Examples of downcasting:
        System.out.println("\nDowncasting of upcasted Cabrio now happening:");


        Cabrio newCabrioReferenceFromUpcastedCabrioObject = (Cabrio) newVehicleReferenceOfCabrioInstance;// Cabrio => Vehicle => Cabrio
        newCabrioReferenceFromUpcastedCabrioObject.newName="Cabrio";
        newCabrioReferenceFromUpcastedCabrioObject.iAm();
        newCabrioReferenceFromUpcastedCabrioObject.sunroofClose();
        System.out.println("But Java thinks I am a: "+newCabrioReferenceFromUpcastedCabrioObject.newName);


        System.out.println("_________________________________________________");


        System.out.println("Upcasting of newHybrid to Vehicle class now happening:");
        Vehicle newVehicleReferenceOfHybridInstance = newHybrid; //creates an instance of newHybrid with superclass reference.
        // Hybrid => Vehicle.
        newVehicleReferenceOfHybridInstance.newName="Vehicle";

        newVehicleReferenceOfHybridInstance.iAm();  // is able to perform the same-name method from superclass.
        System.out.println("But Java thinks I am a: "+newVehicleReferenceOfHybridInstance.newName);



        //Examples of downcasting:
        System.out.println("\nDowncasting of upcasted Hybrid now happening:");


        Hybrid newHybridReferenceFromUpcastedHybridObject = (Hybrid) newVehicleReferenceOfHybridInstance;// Hybrid => Vehicle => Hybrid
        newHybridReferenceFromUpcastedHybridObject.newName="Hybrid";
        newHybridReferenceFromUpcastedHybridObject.iAm();
        newHybridReferenceFromUpcastedHybridObject.batteryOn();
        System.out.println("But Java thinks I am a: "+newHybridReferenceFromUpcastedHybridObject.newName);


        System.out.println("_________________________________________________");

        System.out.println("Upcasting SUV to Vehicle class now happening:");
        //Examples of upcasting:

        Vehicle newVehicleReferenceFromSUVInstance = (Vehicle) newSUV;
        newVehicleReferenceFromSUVInstance.iAm();
        newVehicleReferenceFromSUVInstance.newName="Vehicle.";
        System.out.println("But Java thinks I am a: "+newVehicleReferenceFromSUVInstance.newName);

        System.out.println("\nDowncasting of upcasted SUV Class: \n");

        Suv newSUVReferenceFromUpcastedVehicleInstance = (Suv) newVehicleReferenceFromSUVInstance;
        newSUVReferenceFromUpcastedVehicleInstance.iAm();
        newSUVReferenceFromUpcastedVehicleInstance.newName="SUV";
        System.out.println("But Java thinks I am a: "+newSUVReferenceFromUpcastedVehicleInstance.newName);

        System.out.println("________________________________________________");














    }
}
