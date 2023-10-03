package Opdrachten2;

import java.util.Scanner;

public class Opdracht3ElektriciteitApp {
    public static void main(String[] args) {
        System.out.println("Welkom in Mijn Kleine Elektriciteitberekenaar (MKEB) (tm)");

        //initialisatie
        Scanner myScanner = new Scanner(System.in);
        //String myChoice = myScanner.nextLine();
        int doCase = 0;  //used for Switch
        boolean correctInput = true; //use to check valid input


        do {
            System.out.println("Wilt u berekeningen uitvoeren voor meerdere huizen? Tik dan: j  voor ja");
            System.out.println("Wilt u berekeningen uitvoeren voor één huis? Tik dan: n voor neen.");
            String multiHuis = myScanner.nextLine();

            //checking for valid input
            if ((multiHuis.charAt(0) == 'j') || (multiHuis.charAt(0) == 'J')) {
                doCase = 1;
                correctInput = true;
                break;
            } else if ((multiHuis.charAt(0) == 'n') || (multiHuis.charAt(0) == 'N')) {
                doCase = 2;
                correctInput = true;
                break;
            } else { //invalid input
                System.out.println("Sorry, u moet kiezen tussen j en n. Probeer opnieuw");
                correctInput = false;
                continue;
            }

        } while (correctInput == false); //first loop will always run, terminates on true.

        //System.out.println(correctInput); // debugging
        //System.out.println(doCase); // debugging


        //tweede lus voor de uitvoering


        switch (doCase) {  //switch controlling één huis or meerdere huizen
            case 1: {
                //input
                //String doorGaan = "n";
                boolean decision = true;

                do { //loop controlling meerdere huizen
                    System.out.println("Dus meerdere huizen");// for debugging
                    System.out.println("Naam van verbruiker: ");
                    String naamVerbruiker = myScanner.nextLine();
                    System.out.println("Vermogen in watt/uur: ");
                    short wattPerUur = myScanner.nextShort();
                    System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt: ");
                    short urenPerDag = myScanner.nextShort();
                    System.out.println("Aantal dagen per maand dat elektriciteit wordt gebruikt: ");
                    short dagenPerMaand = myScanner.nextShort();
                    System.out.println("Eenheidsprijs voor elektriciteit in Euro cent: ");
                    double eenheidsPrijs = myScanner.nextDouble();
                    double kostprijs=(wattPerUur * urenPerDag * dagenPerMaand * eenheidsPrijs /10000);
                    System.out.println("Maandelijkse elektriciteitskost voor " + naamVerbruiker + " is " +kostprijs);
                    myScanner.nextLine(); // empty scanner buffer
                    System.out.println("Do you wish to continue? y/n");
                    String doorGaan = myScanner.nextLine();

                    // System.out.println("doorGaan = "+doorGaan); // for debugging

                    //check if user wants to stop the loop
                    if (doorGaan.charAt(0) == 'y' || doorGaan.charAt(0) == 'Y') {
                        decision = true;
                        continue;
                    }
                    else if (doorGaan.charAt(0) == 'n' || doorGaan.charAt(0) == 'N') {
                        decision = false;
                        break;// end case
                    }
                    else {
                        System.out.println("Error: start again.");
                        continue;
                    }
                }
                while (decision == true); // loop controlling meerdere huizen
                break; //end case
            }


            case 2: { // switch case controlling éé huis
                System.out.println("Dus één huis.");
                System.out.println("Naam van verbruiker: ");
                String naamVerbruiker2 = myScanner.nextLine();
                System.out.println("Vermogen in watt/uur: ");
                short wattPerUur2 = myScanner.nextShort();
                System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt: ");
                short urenPerDag2 = myScanner.nextShort();
                System.out.println("Aantal dagen per maand dat elektriciteit wordt gebruikt: ");
                short dagenPerMaand2 = myScanner.nextShort();
                System.out.println("Eenheidsprijs voor elektriciteit in Euro cent: ");
                double eenheidsPrijs2 = myScanner.nextDouble();
                double kostprijs = (wattPerUur2 * urenPerDag2 * dagenPerMaand2 * eenheidsPrijs2 /10000);
                System.out.println("Maandelijkse elektriciteitskost voor " + naamVerbruiker2 + " is " + kostprijs);
                break;//end case
            }

        }


        System.out.println("Dank u voor uw gebruik van MKEB.");
        System.out.println("Indien u tevreden bent met, kunt u misschien overwegen om andere applicaties van DerooSoft te gebruiken.");



    }
}
