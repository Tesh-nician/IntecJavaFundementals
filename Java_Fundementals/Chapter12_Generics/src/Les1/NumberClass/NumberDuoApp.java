package Les1.NumberClass;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> numberDuoInt = new NumberDuo<>(2,5);
        NumberDuo<Long> numberDuoDouble = new NumberDuo<>(2L,5L);
        NumberDuo<Number> numberDuoNumber = new NumberDuo<>(2,5);


        System.out.println(numberDuoInt.sum());
        System.out.println(numberDuoDouble.sum());
        System.out.println(numberDuoNumber.sum());
    }


}
