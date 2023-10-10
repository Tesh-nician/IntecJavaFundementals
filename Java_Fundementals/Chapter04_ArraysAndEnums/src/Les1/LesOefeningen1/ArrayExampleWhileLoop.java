package Les1.LesOefeningen1;

public class ArrayExampleWhileLoop {
    public static void main(String[] args) {


        int[] numbersArr = {2, 4, 6, 8, 10};
        int count = 0;

        while (count < numbersArr.length) {
            System.out.println(count + "  " + numbersArr[count]);
            count++;
        }

    }
}
