package Les1.Oefening1;

public class PairApp {
    public static void main(String[] args) {

        //met integers
        Pair myPair = new Pair(5,6);

        System.out.println(myPair);

        //met strings
        Pair myPair2 = new Pair<>("Huis","Stoel");

        System.out.println(myPair2);
    }
}
