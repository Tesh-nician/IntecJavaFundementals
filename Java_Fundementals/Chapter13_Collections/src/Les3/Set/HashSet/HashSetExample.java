package Les3.Set.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add(null);
        set.add("Apple");

        System.out.println("HashSet: "+set);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? "+containsApple);
        set.remove("Apple");
        System.out.println(set);

        System.out.println("Size of set? "+set.size());

        set.clear();
        System.out.println("Is set empty? "+set.isEmpty());
    }
}
