package Les1.ComparableClass.ComparableExample;

public class ComparableDuoApp {
    public static void main(String[] args) {
        ComparableDuo myCompDuo = new ComparableDuo<>(155,254);

        System.out.println(myCompDuo.getHighest());
        System.out.println(myCompDuo.getLowest());
        System.out.println(myCompDuo);

        ComparableDuo<Integer>d1 = new ComparableDuo<>(3,5);
        ComparableDuo<Double>d2 = new ComparableDuo<>(3.5,5.0);
        //ComparableDuo<Number>d3 = new ComparableDuo<>(3.5,5.0); Number does not implement Comparable interface


        System.out.println(d1.getHighest());
        System.out.println(d1.getLowest());

        ComparableDuo<String> s1 = new ComparableDuo<>("Bert","Andrew");
        System.out.println(s1);
        System.out.println(s1.getLowest());//Andrew



    }
}
