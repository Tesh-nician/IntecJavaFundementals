package Les30efeningen5;

import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i=1; i<7; ++i) {

            int randomBound = random.nextInt(46);

            System.out.println(randomBound);

        }

    }
}
