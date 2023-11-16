package Les1.ArrayListOefeningen;

import java.util.ArrayList;

public class ArrayListOefening1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("Lahore");
        cities2.add("Hyderabad");
        cities2.add("Delhi");

        ArrayList<String> citiesCombined = new ArrayList<>();

        citiesCombined.addAll(cities);
        citiesCombined.addAll(cities2);
        citiesCombined.forEach(city -> System.out.println(city + " "));





    }
}
