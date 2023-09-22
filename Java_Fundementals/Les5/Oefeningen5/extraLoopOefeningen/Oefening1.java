package Les5.extraLoopOefeningen;

public class Oefening1 {
    public static void main(String[] args) {

        //faculteit

        //Schrijf een programma dat de faculteit van een bepaald getal te vinden.
        // uitleg: De faculteit van een niet-negatief geheel getal n is het product van alle
        // positieve gehele getallen kleiner dan of gelijk aan n. De faculteit van 4
        // (geschreven als 4!) is bijvoorbeeld 4 x 3 x 2 x 1 = 24

 //initialisation
        int numberFac = 4;
        double result = 1; // double want ! wordt snel héél groot :-)
        //int count = numberFac;

        //For loop met n* (n-1)
        for (int count = (numberFac-1); count != 0 ; count--) {
            System.out.println("Seed number: "+numberFac+" Counter: "+count+" Result "+result );

            result = result+(result*count);

        } //end loop

        System.out.println("De faculteit van "+numberFac + " is " + result);

    }
}
