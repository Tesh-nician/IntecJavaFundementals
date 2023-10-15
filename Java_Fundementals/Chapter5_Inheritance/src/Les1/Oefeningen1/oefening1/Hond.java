package Les1.Oefeningen1.oefening1;

public class Hond extends Animal{
    private final String animalName = "Hond";

    private String sound =  "Woefwoef";

    public  Hond (){ super(); }

    public String getAnimalName() {
        return animalName;

    }
    public String  getSound() {
        return sound;
    }

}
