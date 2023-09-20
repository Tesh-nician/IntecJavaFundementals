package be.intecbrussel.Les2;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Declarations
        String name;
        String address;
        String telephoneNumber;


        //input Name
        System.out.println("Enter Name");

        name = myScanner.nextLine();


        //input Address
        System.out.println("Enter Adress");

        address = myScanner.nextLine();

        //input telephoneNumber
        System.out.println("Enter telephone number");

        telephoneNumber = myScanner.nextLine();

        //Output of everything
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone number: " + telephoneNumber);
    }
}
