package Les3Oefeningen4;
import java.util.Random;
public class RandomMathExample {
    public static void main(String[] args) {

        Random random = new Random();

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

        int  randomInt = random.nextInt();
        System.out.println(randomInt);

        int randomBound = random.nextInt(50);
        System.out.println(randomBound);








    }
}
