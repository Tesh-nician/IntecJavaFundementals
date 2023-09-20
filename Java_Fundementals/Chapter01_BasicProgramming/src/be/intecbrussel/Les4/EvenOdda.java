package be.intecbrussel.Les4;

import java.util.Scanner;

public class EvenOdda {
    public static void main(String[] args) {


        //Les4/03 Oefeningen / Oefening 5


        Scanner myScanner = new Scanner(System.in);

        //input
        System.out.println("Welcome to EvenOdda.");
        System.out.print("Please enter an integer : ");
        double numberDouble = myScanner.nextDouble();
        double remainder = numberDouble%2;

        //logic

        if (remainder == 0) {
            System.out.println("even");
        } else System.out.println("odd");
        System.out.println("Thank you for using our application");
    }








    }

