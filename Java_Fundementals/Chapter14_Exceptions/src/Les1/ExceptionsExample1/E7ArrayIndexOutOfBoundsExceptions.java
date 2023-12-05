package Les1.ExceptionsExample1;

public class E7ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) {;

        try {
            String[] maanden = {"Januari", "Februari", "Maart", "April","Mei"};

            for (int i = 0; i < 6; i++) {
                System.out.println(maanden[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array out of bounds!");
            System.out.println(exception.getMessage());
            exception.printStackTrace();

        }

        finally {
            System.out.println("Deze code werkt");
        }
    }
}
