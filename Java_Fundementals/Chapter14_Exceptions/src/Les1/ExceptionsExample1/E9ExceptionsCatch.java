package Les1.ExceptionsExample1;

public class E9ExceptionsCatch {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
            int result = 5 / 0;
            System.out.println(result);

        } catch (ArithmeticException | NumberFormatException anException) {
            System.out.println(anException.getMessage());
            anException.printStackTrace();
        }
        /*catch (ArithmeticException exception) {
            exception.printStackTrace();
        }*/ //does not work, two catches does not work.



    }
}
