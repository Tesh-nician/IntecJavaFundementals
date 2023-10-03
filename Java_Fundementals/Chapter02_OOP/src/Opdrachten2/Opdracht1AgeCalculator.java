package Opdrachten2;

import java.util.Scanner;

public class Opdracht1AgeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to My Little Age Calculator Program (MLACP).");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int myAge = myScanner.nextInt();

        if (myAge >= 18) {
            System.out.println("You are an adult.");
        } else if (myAge >= 10 && myAge < 18) {
            System.out.println("You are a teenager.");
        } else if (myAge >= 2 && myAge < 10) {
            System.out.println("You are are a child. Please ask your parents permission to use this computer.");
        } else {
            System.out.println("You are a baby. Please inform you parents that are using a computer.");

        }
        System.out.println("Thank you for using MLACP(tm)");


    }
}
