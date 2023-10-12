package Les3.Oefeningen6.Oefening2;

import java.util.Scanner;



public class DagenVanDeWeekApp2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welke Dag is het vandaag?\nGeef in:");
        System.out.println("Maandag = 1\nDinsdag = 2\nWoensdag = 3\nDonderdag=4\nVrijdag=5\nZaterdag=6\nZondag=7\n");



        int caseToCheck = myScanner.nextInt();

       // System.out.println((getDagenVDWeek(caseToCheck)); //werkt niet???

        DagenVanDeWeek[ ] dagenVandeekArray = DagenVanDeWeek.values();



        System.out.println(dagenVandeekArray[caseToCheck-1]);





    }
}