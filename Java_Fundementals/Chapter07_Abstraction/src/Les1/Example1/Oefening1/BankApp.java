package Les1.Example1.Oefening1;

public class BankApp {
    public static void main(String[] args) {

        //Creëer een abstracte klas Bank met een abstracte methode getBalance.
        //In BankA, BankB en BankC wat de sub-klassen zijn, word 1000, 1500 en $2000 gestort. Elke bank heeft ook een methode getBalance.
        //Roep deze methode op en creëer een object van elke klas.

        BankA newBankA = new BankA();
        BankB newBankB = new BankB();
        BankC newBankC = new BankC();


        newBankA.getBalance();
        newBankB.getBalance();
        newBankC.getBalance();




    }
}
