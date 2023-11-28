package Les3.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("TreeSet: "+set);

        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First Element: "+firstElement);
        System.out.println("Last Element: "+lastElement);


        Integer higherValue = set.higher(5);
        System.out.println("Element higher than 5: "+higherValue);

        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5: "+higherValue);

        TreeSet<Integer>descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: "+descendingSet);


        TreeSet<Integer>subset = (TreeSet<Integer>) set.subSet(3,8);
        System.out.println("Subset TreeSet: "+subset);

        set.clear();
        boolean isEmpty= set.isEmpty();
        System.out.println("is TreeSet empty? "+isEmpty);

    }
}
