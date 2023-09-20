
package be.intecbrussel.Les1;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username");

        String userName = myScanner.nextLine();

        System.out.println("Username is " + userName);

       System.out.println("Enter gebruikersnaam");

       String gebruikersNaam = myScanner.nextLine();

      System.out.println("Gebruikersnaam is " + gebruikersNaam);




    }
}
