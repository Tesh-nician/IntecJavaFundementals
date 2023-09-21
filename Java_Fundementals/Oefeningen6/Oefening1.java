package Oefeningen6;

public class Oefening1 {
    public static void main(String[] args) {

        //Typecasting Widening

        int number01=253;
        long number02 = 2365L;

        double number012 = number01;  //casting
        double number022 = number02;  //casting

        System.out.println(number01 + " becomes "+ number012);
        System.out.println(number02 + " becomes "+ number022);

    }
}