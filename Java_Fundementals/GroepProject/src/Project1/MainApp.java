package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Welcome to our casino!");
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        int playerBalance = 20000;
        Casino[] casino = {null, new SlotMachine(playerBalance), null, null};
        do {
            System.out.println("\nChoose your game: 1.Claw Machine 2.Slot machine 3.Lotto 4.Roulette ");
            playerChoice = scanner.nextInt();
            casino[playerChoice - 1].launch(scanner);
        } while (casino[playerChoice - 1].playerBalance >= casino[playerChoice - 1].costPerTicket);
        System.out.println("\nSorry your balance is too small to continue playing");

    }

}
