package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n                           Welcome to PERFECTLY HONEST CASINO (tm).");
        System.out.println("\n       (We do not cheat, recycle drugs money or hide money from the national tax authorities).");
        System.out.println("\n\n                                          (Guaranteed!)");
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        int playerBalance = 5000;
        Casino[] casino = {new ClawMachine(playerBalance), new SlotMachine(playerBalance), new Lotto(playerBalance), new Roulette(playerBalance)};
        do {

            System.out.println("\n_______________________________________________________________________________________________");
            System.out.println("[ Choose your game: 1.Claw Machine (1€) 2.Slot machine (50€) 3.Lotto (100€) 4.Roulette (200€) ]");
            System.out.println("-----------------------------------------------------------------------------------------------");
            playerChoice = scanner.nextInt();
            if (Casino.playerBalance >= casino[playerChoice - 1].costPerTicket) {
                casino[playerChoice - 1].launch(scanner);
            } else {
                System.out.println("\nYour balance is too small for that game, please choose another one");
            }
        } while (casino[playerChoice - 1].playerBalance >= 1);
        System.out.println("\nSorry your balance is too small to continue playing");
    }
}