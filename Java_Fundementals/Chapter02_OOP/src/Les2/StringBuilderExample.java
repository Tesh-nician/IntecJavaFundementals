package be.intecbrussel.Les2;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder string1 = new StringBuilder(); // long way

        string1.append("hello world!");

        System.out.println(string1);

        StringBuilder string2 = new StringBuilder("hello world!"); //short way of doing it

        StringBuilder string3 = new StringBuilder("walter, mike");

        System.out.println(string3);

        string3.insert(6, ", edwin"); // Inserting at place 6, moving place 6 to the right!!

        System.out.println(string3);

        string3.insert(0, "mary, "); //Array always start at 0!!

        System.out.println(string3);

        string3.insert(4, "/jeff ");

        System.out.println(string3);


        StringBuilder string4 = new StringBuilder("hell0 world!");

        String text = string4.toString();

        System.out.println(text);

        System.out.println(string4.reverse()); //Reverse
        System.out.println(string3.reverse());




    }
}
