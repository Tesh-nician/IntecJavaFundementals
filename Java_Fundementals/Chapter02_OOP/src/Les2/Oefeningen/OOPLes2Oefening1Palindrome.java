package be.intecbrussel.Les2.Oefeningen;

import java.util.Scanner;

public class OOPLes2Oefening1Palindrome {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Welcome to Palindrome Checker. Please enter the potential palindrome: ");

        String toCheckInput = myScanner.nextLine();

        //StringBuilder candidate = new StringBuilder(toCheckInput);// does not work
        StringBuilder candidate = new StringBuilder();
        candidate.append(toCheckInput);

        //toCheckInput);// does not work




        StringBuilder candidateReversed = new StringBuilder(candidate.reverse());



        ;

        String candidate2 = candidate.toString();
        String candidateReversed2 = candidateReversed.toString();
        System.out.println("candidate (object): "+candidate);
        System.out.println("candidate2 (normal string): "+candidate2);
        System.out.println("candidateReversed (object): "+candidateReversed);
        System.out.println("candidateReversed2 (normal string):"+candidateReversed2); //test



        //boolean itsAPalindrome = (candidateReversed.contains(candidate)); //does not work with StringBuilder
       //boolean itsAPalindrome = (candidateReversed.equals(candidate));//does not work
        //boolean itsAPalindrome = (candidateReversed2.contains(candidate2)); //does not work
        //boolean itsAPalindrome = (candidateReversed2 == candidate2); //does not work
        boolean itsAPalindrome = (candidateReversed2.equals(candidate2));//does not work
        //int itsAPalindrome = (candidateReversed2.compareTo(candidate2));//does not work, Boolean == does not work with strings







        System.out.println(itsAPalindrome);


        if (itsAPalindrome = true) {
            System.out.println("It's a Palindrome!!!!");
        } else {
            System.out.println("Sorry, it's not a Palindrome.");


        }
    }
}
