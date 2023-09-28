package be.intecbrussel.Les5.Oefeningen;

public class WrapperOefening2 {
    public static void main(String[] args) {

        float numberPrimitive = 299_792.458f;

        Float numberObject = numberPrimitive;

        String numberString = numberObject.toString();

        System.out.println("This is a string with a length of: " + numberString.length());







    }
}
