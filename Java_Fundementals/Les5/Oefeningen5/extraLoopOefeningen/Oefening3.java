package Les5.extraLoopOefeningen;

import java.util.Scanner;


public class Oefening3 {
    public static void main(String[] args) {

        //Schrijf een programma dat vraagt dat de gebruiker getallen één voor één in te voeren,
        // waarbij elk getal wordt opgeteld bij een sum totaal. Het programma verlaat de loop wanneer
        // de gebruiker -1 invoert en drukt vervolgens de sum van alle ingevoerde getallen af (behalve -1).

    Scanner myScanner = new Scanner(System.in);
// initialisations
    Float number; // input number
    Float sum = 0f; // the result

        System.out.println("Welcome to my little calculator. Please enter numbers to be summed (input will terminate with -1): ");

        boolean stop = false; // to be used for the loop and to break after -1 ("break" would also be possible).

        while (stop == false) {
            number = myScanner.nextFloat();
            if (number ==-1) {
                stop = true;
               // break; dit is ook mogelijk, maar de logica is duidelijker met stop = true.
            }
            sum += number;
            myScanner.nextLine();
            System.out.println("So far, the sum is: "+sum);
        } // end of while loop.

        System.out.println("The final sum is: "+sum +". Goodbye.");


    }

}
