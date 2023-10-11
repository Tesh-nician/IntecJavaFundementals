package Les2;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int[] myArr = {10, -20, 33, 9, 97, -65, 345};

        System.out.println("Original myArr is  " + Arrays.toString(myArr));

        Arrays.sort(myArr,0,4);

        System.out.println("\nSoreted Arr with range 0 to4: "+ Arrays.toString(myArr));

        Arrays.sort(myArr);

        System.out.println("\nThe whole sorted array is: "+ Arrays.toString(myArr));
    }
}
