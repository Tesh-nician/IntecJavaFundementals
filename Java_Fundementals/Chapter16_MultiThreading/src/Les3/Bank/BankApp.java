package Les3.Bank;

public class BankApp {
    public static void main(String[] args) {
        Bank bankrekening = new Bank();
        int jouwSalaris = 3000;
        bankrekening.addAmountPerMonth(jouwSalaris);

        int bedragRekeningen = 1500; //bills due

        bankrekening.payBills(bedragRekeningen);

        //toon status
        System.out.println("Bankrekening status: ");
        System.out.println("Totaal geld: "+bankrekening.getMoneyOnBankAccount());
        System.out.println("Genoeg geld aanwezig?: "+bankrekening.isEnoughOnBankAccount());

    }

}
