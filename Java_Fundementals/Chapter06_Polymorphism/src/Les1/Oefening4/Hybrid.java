package Les1.Oefening4;

public class Hybrid extends Vehicle{


    String newName = "Hybrid";
    @Override
    public void iAm(){
        System.out.println("method: I am a Hybrid");
    }

    public void batteryOn(){
        System.out.println("Now using electrical power.");
    }
    public void batteryOf(){
        System.out.println("Now using petrol.");
    }
}
