package Les1.Oefening1;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        Calculator newCalculator = new Calculator();

        System.out.println(newCalculator.getMinimum(3000, 1111, 300000));//opdracht1


        System.out.println(newCalculator.getEven(4)); //opdracht2

        //opdracht 3 - Reverse-Polish Notation Calculator

        System.out.println("Welcome to My Little OOP Reverse-Polish-Notation Calculator.");

        //big loop
        boolean doCalculatorLoop = true;
        while (doCalculatorLoop) {

        System.out.println("Please enter the two numbers to be used for the calculations:");

        double inputNumber1 = myScanner.nextDouble();
        System.out.println(" and now the second number");
        double inputNumber2 = myScanner.nextDouble();

        System.out.println("Please choose the operator:   + , -, / , %   or press 's', 'q', or the enter key to end.");
        myScanner.nextLine();//emptying the buffer!!!

        char operator = myScanner.nextLine().charAt(0);


       // System.out.println(operator); /for debugging

        switch (operator) {

            case '+':
                System.out.println(newCalculator.getAddition(inputNumber1, inputNumber2));
                break;
            case '-':
                System.out.println(newCalculator.getSubtract(inputNumber1, inputNumber2));
                break;
            case '*':
                System.out.println(newCalculator.getMultiply(inputNumber1, inputNumber2));
                break;
            case '/':
                System.out.println(newCalculator.getDivide(inputNumber1, inputNumber2));
                break;
            case '%':
                System.out.println(newCalculator.getModulus(inputNumber1, inputNumber2));
                break;
            default:
              doCalculatorLoop = false; //any character that is not an operator will exit the loop.
                break;
        }
        } //end of big loop

    }
}
