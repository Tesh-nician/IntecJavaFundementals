package Les2.Oefeningen;

public class Oefening1 {
    public static void main(String[] args) {
        String myString = "Char Array!";
        char[] charArray = myString.toCharArray();

        for (char ch : charArray) {
            System.out.print(ch + "|");
        }
    }
}
