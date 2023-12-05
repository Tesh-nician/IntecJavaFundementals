package Les5.Oefeningen5;

public class Oefening1 {
    public static void main(String[] args) {
        //Gebruik een for loop

        for (int number = 100; number>=1; number--) {
            // System.out.println(("The index is: " + number)); Used for testing

            int mod7 = number%7;

            if (mod7 == 0) {

                //System.out.println("mod7 : " + mod7); Used for esting
                System.out.println("Deelbaar door 7 : " + number);
            }
        }




    }
}
