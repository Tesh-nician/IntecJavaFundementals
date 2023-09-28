package Les30efeningen5;

public class Oefening2withIf {
    public static void main(String[] args) {


        int count = 1;
        while (count < 7) {

            long cijfer = Math.round((100 * Math.random()));
            if (cijfer <= 45) {
                System.out.println(cijfer);
                ++count;
            }
        }
    }
}