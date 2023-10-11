package Les2;

public class ToCharArrayExample {
    public static void main(String[] args) {
        String stringtoChar = "From String to a char array";
        char[] charArray = stringtoChar.toCharArray();

        for (char ch:charArray) {
            System.out.println(ch+"|");
        }
    }
}
