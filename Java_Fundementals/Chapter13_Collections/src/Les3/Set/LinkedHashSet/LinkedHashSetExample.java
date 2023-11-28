package Les3.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set= new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        System.out.println("LinkedHashSet: "+set);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? "+containsApple);

        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? "+removed);

        System.out.println("LinkedHashSet: "+set);

        int size = set.size();
        System.out.println("Size of LinkedHashSet: "+size);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is LinkedHashSet empty? "+isEmpty);





    }
}
