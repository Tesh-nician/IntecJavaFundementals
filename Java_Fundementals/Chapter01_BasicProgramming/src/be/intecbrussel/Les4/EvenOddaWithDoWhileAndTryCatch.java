
import java.util.Scanner;
import java.util.InputMismatchException;

public class EvenOddaWithDoWhileAndTryCatch {
    public static void main(String[] args) {

        //Les4/03 Oefeningen / Oefening 5

        Scanner myScanner = new Scanner(System.in);

        //initialisation
        boolean userEntersCorrectInput = true;


        System.out.println("Welcome to EvenOdda.");

        //The big loop

        do {

            //input
            System.out.print("Please enter an integer : ");

            try {
                //dit stuk test voor even/oneven
                int number = myScanner.nextInt();
                int remainder = number % 2;
                if (remainder == 0) {
                    System.out.println("even");
                } else System.out.println("odd");
               break;

            }
            catch (InputMismatchException e) {
               // userEntersCorrectInput = true;
                System.out.print("This is not a whole number.");
                myScanner.nextLine();
                continue;

                }

            //if (!(number>=0 || number<0 )) {   Dit werkt niet!!!!!!

        } while (userEntersCorrectInput);

        System.out.println("Thank you for using our application :-)");
    }
}

