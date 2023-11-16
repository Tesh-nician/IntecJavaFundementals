package Les1;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> duoString = new Duo<>("Hello", "World");

        System.out.println(duoString.getS1()+" - "+duoString.getS2());

        Duo<Integer> duoInt = new Duo<>(10,100);

        System.out.println(duoInt.getS1()+" - "+duoInt.getS2());

    }
}
