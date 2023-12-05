package Les1.ExceptionsExample1;

public class E5NumberFormatExceptionExceptions {
    public static void main(String[] args) {
        int a;

       try {
           a = Integer.parseInt("a");
           System.out.println("A is= " + a);
       } catch (NumberFormatException exception) {
            System.out.println("a kan niet worden geconverteerd naar een integer");
           System.out.println(exception.getMessage());
                    System.out.println("My exception"+ exception);
           exception.printStackTrace();

        } finally {
            System.out.println("Finally code block werkt");
        }
        System.out.println("Deze code werkt.");
    }
}
