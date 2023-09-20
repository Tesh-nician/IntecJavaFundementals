package be.intecbrussel.Les2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {



        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number A");
        float number_A = myScanner.nextFloat();



        System.out.println("Enter number B");
        float number_B =myScanner.nextFloat();

        System.out.println(number_A + " + " + number_B + " = " + (number_A+number_B));
        System.out.println("The difference is: " + (number_A-number_B));
        System.out.println("The multiplication is: " + (number_A*number_B));
        System.out.println("The division is: " + (number_A/number_B));
        System.out.println("The modulus is: " + (number_A%number_B));

    }
}
