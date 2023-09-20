package be.intecbrussel.Les2;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        //number1
        System.out.println("Enter number 1");

        float num1 = myScanner.nextFloat();

        //number2
        System.out.println("Enter number 2");
        float num2 = myScanner.nextFloat();

        //number3
        System.out.println("Enter number 3");

        float num3 = myScanner.nextFloat();

        //number4
        System.out.println("Enter number 4");
        float num4 = myScanner.nextFloat();

        //number5

        System.out.println("Enter number 5");

        float num5 = myScanner.nextFloat();



        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        System.out.println("Number 4: " + num4);
        System.out.println("Number 5: " + num5);
        System.out.println("The average is: " + (num1+num2+num3+num4+num5)/5);

    }
}
