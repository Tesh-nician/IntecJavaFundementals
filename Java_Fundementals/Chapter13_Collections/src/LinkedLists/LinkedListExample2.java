package Les2.LinkedLists;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Mumbai");

        cities.add("Leuven"); //repetition

        cities.add(3,"Delhi");

        System.out.println("LinkedList -> ");
        cities.forEach(city -> System.out.println(city + " "));

    }
}
