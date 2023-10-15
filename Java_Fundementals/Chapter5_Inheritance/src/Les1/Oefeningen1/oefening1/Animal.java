package Les1.Oefeningen1.oefening1;

public class Animal {

    //Maak een Animal klas en 3 verschillende dier klassen.
    //Laat zien hoe je een properties, methode en constructor over erft van klas Animal.

    public boolean movement = true;

    public boolean feedsOnOrganicMatter = true;

    String animalCharacteristics = "Animal = it moves and eats plants and other animals.";

    public Animal(){

        System.out.println(animalCharacteristics);
    }


    public boolean isMovement() {
        return movement;
    }

    public boolean isFeedsOnOrganicMatter() {
        return feedsOnOrganicMatter;
    }
}


