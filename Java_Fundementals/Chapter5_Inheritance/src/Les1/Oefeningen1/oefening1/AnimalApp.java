package Les1.Oefeningen1.oefening1;

public class AnimalApp {
    public static void main(String[] args) {
        //Maak een Animal klas en 3 verschillende dier klassen.
        //Laat zien hoe je een properties, methode en constructor over erft van klas Animal.



        //Hond object
        Hond myHond = new Hond(); //also calls superclass constructor
        System.out.println(myHond.getAnimalName());
        System.out.println(myHond.getSound());
        System.out.println("Moves: "+myHond.isMovement()); //getter from superclass
        System.out.println("Eats organic matter: "+myHond.isFeedsOnOrganicMatter()); //getter from superclass

        System.out.println("_______________________________________________");
        //Muis object
        Muis myMuis = new Muis(); //also calls superclass constructor
        System.out.println(myMuis.getAnimalName());
        System.out.println(myMuis.getSound());
        System.out.println("Moves: "+myMuis.isMovement()); //getter from superclass
        System.out.println("Eats organic matter: "+myMuis.isFeedsOnOrganicMatter()); //getter from superclass

        System.out.println("_______________________________________________");
        //Olifant object
        Olifant myOlifant = new Olifant(); //also calls superclass constructor
        System.out.println(myOlifant.getAnimalName());
        System.out.println(myOlifant.getSound());
        System.out.println("Moves: "+myOlifant.isMovement()); //getter from superclass
        System.out.println("Eats organic matter: "+myOlifant.isFeedsOnOrganicMatter()); //getter from superclass





    }
}
