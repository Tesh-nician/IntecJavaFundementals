package Les30efeningen5;

import java.util.Random;
public class Oefening1
{
    public static void main(String[] args) {

        Random random = new Random();

        for (int i=1; i<6; ++i) {

            int randomInt = random.nextInt();

            System.out.println(randomInt);

        }


    }
}
