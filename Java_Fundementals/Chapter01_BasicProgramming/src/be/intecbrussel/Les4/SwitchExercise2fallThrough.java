package be.intecbrussel.Les4;

import java.util.Scanner;

public class SwitchExercise2fallThrough {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("String: I / we / you /our? : ");
        String text = myScanner.nextLine();

        switch (text) {
            case "I":
                System.out.println("I want to become a doctor");
                //break;
            case "we":
                System.out.println("We are Indian");
                //reak;
            case "you":
                System.out.println("You are my crony friend");
                //break;
            case "our":
                System.out.println("Our Indian Belgian flag is tri-colour");
                //break;

            default:
                System.out.println("This is the default statement.");
                //break;
        }
    }
}
