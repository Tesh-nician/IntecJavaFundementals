package Oefeningen6;

public class Oefening2 {
    public static void main(String[] args) {
        //Typecasting Narrowing

        //also conversion with rounding and converting into a string

        double number = 10.99;


        int number2 = (int) number;  //Narrowing

        int number3 = (int) Math.round(number);  //Rounding up

        String numberNowaString = String.valueOf(number);  //Conversion to string


        //Output
        System.out.println(number + " becomes " + number2 + " (int)");
        System.out.println(number + " becomes " + number3 + " (Math.round)");
        System.out.println(number + " becomes " + numberNowaString + " (string)");

    }
}
