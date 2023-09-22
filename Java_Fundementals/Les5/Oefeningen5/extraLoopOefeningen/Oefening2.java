package Les5.extraLoopOefeningen;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Oefening2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //faculteit met input en input validatie
        //elegante oplossing for negatieve getallen, maar zonder waarschuwing. Ik vind geen goede oplossing. :-(

//initialisation
        boolean userEntersCorrectInput = true;


        System.out.println("Welcome to My Little Faculty Calculator.");

        //The big loop

        do {

            int numberFac;

            //input
            System.out.print("Please enter a positive integer larger than 0 : ");

            try {
                //input and check for integer > 0

               do { numberFac = myScanner.nextInt();
               } while (numberFac<1);

                double result = 1;
                //int count = numberFac;

                //For loop met n* (n-1)
                for (int count = (numberFac-1); count != 0 ; count--) {
                    System.out.println("Seed number: "+numberFac+" Counter: "+count+" Result "+result );

                    result = result+(result*count);

                } //end loop

                System.out.println("De faculteit van "+numberFac + " is " + result);
                break;

            }
            catch (InputMismatchException e) { //check for non-integer numbers

                System.out.print("This is not a number.");
                myScanner.nextLine();
                continue;

            }


        } while (userEntersCorrectInput);

        System.out.println("Thank you for using our application :-)");
    }
}

