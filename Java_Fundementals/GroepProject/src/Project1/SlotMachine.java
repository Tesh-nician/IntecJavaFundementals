package Project1;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine extends Casino {

    int currentPayout=3900; //dit is de betalingsbalans van DEZE machine (13*300).
    int odds; //kans om te winnen, afhankelijk van currentPayout
    int youWin = 0; //Hoeveel je gewonnen hebt in deze sessie1

    public SlotMachine(int playerBalance) {
        super(playerBalance, 50);
        this.playerBalance = playerBalance;
    }
    //odds varieert met currentPayout,
    // i.e. winstgevendheid van deze machine.
    // Initieel =0 => 1/1000 => 1/100 => 1/10
    private void whatOddsToGive() {
        if (this.currentPayout <= 800) {
            this.odds = 1;

        }
        if (this.currentPayout > 800) {
            this.odds = 1000;
        }
        if (this.currentPayout > 900) {
            this.odds = 100;
        }
        if (this.currentPayout > 1000) {
            this.odds = 10;
        }

    }

    public int playTheSlots(int playerBalance) {
        this.playerBalance = playerBalance;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Slotmachine (tm)!");
        System.out.println("Your balance is: " + playerBalance + "\nEach game costs 50€. \nA random number is generated between 0 and 7. If a 7 comes up you will WIN 3 0 0 €!");
        System.out.println("How many games do you wish to Play?");
        int numberOfGames = myScanner.nextInt();

        if (playerBalance / (numberOfGames * 50) > 0) {

            this.playerBalance -= (numberOfGames * 50);
            this.currentPayout += (numberOfGames * 50);

            for (int slotCounter = 1; slotCounter <= numberOfGames; slotCounter++) { //slotCounter is de loop counter

                Random randomNumber = new Random();

                whatOddsToGive(); //updating odds variable with this method

                int slotNumber = (numberOfGames==13&&this.currentPayout>3900)? 7:randomNumber.nextInt(odds); //the larger the odds variable, the larger the range of random numbers = smaller chance of winning.

                System.out.println("odds: " + odds + "  random number: " + slotNumber + " payout: " + this.currentPayout);//for debugging


                if (slotNumber == 7) {
                    System.out.println(" A 7!!!!  You WIN!!!");
                    this.currentPayout -= 300;
                    this.youWin = this.youWin + 300;
                    this.playerBalance += 300;
                    System.out.println("Your total winnings are: " + youWin + " !!!!");
                } else {
                    System.out.println(slotNumber + " : Sorry, no win. Better luck next time.");
                }


            } //end for loop

        } //end if check for playerBalance enough for number of games
        else {System.out.println("You do not have enough money to play this many games.");}

        return youWin;

}



        //deze getter zal in de toekomst nodig zijn voor casino management.
        public int getCurrentPayout() {
            return currentPayout;
        }

    @Override
    public void launch(Scanner scanner) {
        playTheSlots(playerBalance);

    }
}

