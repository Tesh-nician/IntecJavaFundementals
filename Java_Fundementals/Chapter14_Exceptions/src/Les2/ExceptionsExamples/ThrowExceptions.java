package Les2.ExceptionsExamples;

public class ThrowExceptions {
    public static void main(String[] args) {
        ageCheck(20);

    }
    public static void ageCheck(Integer num) throws NumberFormatException{
        if (num < 18) {
           throw new NumberFormatException("U mag niet stemmen");
        }
        else {
            System.out.println("U kunt stemmen");
        }
    }
}
