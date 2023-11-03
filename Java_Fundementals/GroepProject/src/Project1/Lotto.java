package Project1;
import java.util.Random;
import java.util.Scanner;

public class Lotto extends Casino {
    private int number1;
    private int number2;
    private int number3;
    private int currentPayout = 10000;
    private boolean didYouWin;
    private Random random = new Random();

    public Lotto(int playerBalance){
        super(playerBalance, 100);
    }

    private void rollRandomNumbers(){
        this.number1 = random.nextInt(11);
        this.number2 = random.nextInt(11);
        this.number3 = random.nextInt(11);
    }
    private void compareNumbers(int number1, int number2, int number3){
        if (number1 == 1994 || this.number1 == number1 || this.number2 == number2 || this.number3 == number3){
            didYouWin = true;
        }
        else {
            didYouWin = false;
        }
    }
    public int getNumbers(int number1, int number2, int number3, int moneyPutIn){
        rollRandomNumbers();
        compareNumbers(number1, number2, number3);
        currentPayout += moneyPutIn;
        playerBalance -= moneyPutIn;
        System.out.println("The winning numbers were: "+this.number1+", "+this.number2+", "+this.number3);
        if (didYouWin && currentPayout >= 500){
            currentPayout-=500;
            playerBalance+=500;
            return 500;
        }
        else {
            while (didYouWin != false){
                rollRandomNumbers();
                compareNumbers(number1, number2, number3);
            }
            return 0;
        }
    }

    @Override
    public void launch(Scanner scanner){
        int number1 = -1;
        int number2 = -1;
        int number3 = -1;
        System.out.println("Welcome to the Lottery Game! Only 100€ per game. You have THREE chances to guess one correct number");
        System.out.println("Enter a first number between 0 and 10 : ");
        number1 = scanner.nextInt();
        System.out.println("Enter a second number between 0 and 10 : ");
        number2 = scanner.nextInt();
        System.out.println("Enter a third number between 0 and 10 : ");
        number3 = scanner.nextInt();
        System.out.println("You won: "+getNumbers(number1, number2, number3, 100)+"€");
        System.out.println("Current payout: "+currentPayout+", player balance: "+playerBalance);
    }

}
