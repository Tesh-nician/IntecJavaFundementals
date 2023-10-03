package Opdrachten2;

import java.util.Scanner;

public class Opdracht2HiLowApp {
    public static void main(String[] args) {
        //Introduction
        System.out.println("Welcome to Higher Lower App (HLA)(tm)");
        System.out.println("In this game you will try to guess the number generated by the program.");
        System.out.println("After your guess, the program will tell you if you are Too High or Too Low, so you can correct your next guess.");
        System.out.println("Good luck!");
        //Initialisation

       Scanner myScanner = new Scanner(System.in);


        long secretNumber = Math.round((99*Math.random()));
        // System.out.println("secret number = "+secretNumber); // used to check program logic is working
        boolean doesNotMatch = true;
        int guessCount = 1;

        while (doesNotMatch) {




            //guessing

            System.out.println("Please guess a number between 0 and 99.");
            int guessedNumber = myScanner.nextInt();

            //input parameter check
            if (guessedNumber<0||guessedNumber>99) {
                System.out.println("Sorry, the number MUST be between 0 and 99!");
                continue;
            }


            if (guessedNumber<secretNumber) {
                System.out.println("Higher than your guess.");
            }
            else if (guessedNumber>secretNumber) {
                System.out.println("Lower than your guess.");
            }
            else {
                System.out.println("Congratulations! You have guessed the correct number.");
                break;
            }
            guessCount++;







        }

        System.out.println("Number of guesses = "+guessCount);












    }
}
