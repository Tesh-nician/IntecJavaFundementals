package be.intecbrussel.Les1;

public class Oefeningen1 {
    public static void main(String[] args) {

        String string1 = "Java Exercises!";
        System.out.println(string1.substring(5, (string1.length())));

        String string2 = "walter, edwin, mike";
        System.out.println(string2.contains("edwin"));

        String string3 = "Hello world";


        // System.out.println(string3.charAt(3)); //test

        for (int count = 0; count <= 10; count++) {

            System.out.print(string3.charAt(count));

            //  ((count=0)||(count = 3)||(count = 5) || (count = 7)) ?   //use if to change to upper case

            // System.out.println(string3.toUpperCase(3));    // use char.at instead??


        }
    }
}
