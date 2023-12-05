package Les2.ExceptionsExamples;

import java.util.Scanner;

public class E5NumberFormatExcerption_2 {
    public static void main(String[] args) {
        String sleeftijd;
        int iLeeftijd;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Geef je leeftij in: ");
        sleeftijd = scanner.nextLine();

        try {
            iLeeftijd = Integer.parseInt(sleeftijd);//Double.parseDouble of Float.parseFloat ook mogelijk
            System.out.println("Jouw leeftijd: " + iLeeftijd);
        } catch (NumberFormatException nfe) {
            System.out.println("Err: leeftijd bevat geen numeriek waarde");

        }
    }
}
