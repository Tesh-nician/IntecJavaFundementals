package Les1.Oefening4;

public class Cabrio extends Vehicle{


    String newName = "Cabrio";

    @Override
    public void iAm(){
        System.out.println("method: I am a Cabrio");
    }

    public void sunroofOpen(){
        System.out.println("The sunroof is open.");
    }
    public void sunroofClose(){
        System.out.println("The sunroof is closed.");
    }


}
