package Les3.oefening2;

public class Oefening4 {
    public static void main(String[] args) {
        //initialisation

        short shortNum = 29999; //maximale grootte van short variabele
        float floatNum = -10.99999999999F; // dit word afgerond naar 11.0 !!!
        boolean booVar = true;
        boolean booVar2 = true;

        //increment and decrement
        System.out.println("shortNum : " + shortNum);
        System.out.println("floatNum : " + floatNum);
        System.out.println("floatNum += shortNum : "+(floatNum += shortNum));
        System.out.println("shortNum += floatNum : "+(shortNum += floatNum)); // dit is typecasting!!!


        System.out.println(shortNum += floatNum);
        // System.out.println(booVar += booVar2); // blijkbaar kan je booleans niet incrementeren (ik had gehoopt dat true + 1 = false :-( )
    }
}
