package Les2.LinkedLists;

import java.util.LinkedList;

public class LinkedListOefening1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

       LinkedList<String> cities2 = new LinkedList<>();
        cities2.add("Lahore");
        cities2.add("Hyderabad");
        cities2.add("Delhi");

        LinkedList<String> citiesCombined = new LinkedList<>();

        citiesCombined.addAll(cities);
        citiesCombined.addAll(cities2);
        citiesCombined.forEach(city -> System.out.println(city + " "));
    }
}
