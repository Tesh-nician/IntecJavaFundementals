package Les2;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int intArr[] = {300,200,100,400,500};

        Arrays.sort(intArr);

        int keyElement = 300;

        System.out.println(keyElement+" found at "+Arrays.binarySearch(intArr,keyElement));
    }
}
