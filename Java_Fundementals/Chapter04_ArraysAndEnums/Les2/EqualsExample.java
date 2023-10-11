package Les2;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {


        int[] arrayO1 = {1,2,3,4};
        int[] arrayO2 = {1,2,3,4};
        int[] arrayO3 = {4,3,2,1};
        int[] arrayO4 = {1,2,3,4,5};
        long[] arrayO5 = {1,2,3,4};


        System.out.println("Arr 1 == Arr2?"+ Arrays.equals(arrayO1,arrayO2));
        System.out.println("Arr 1 == Arr3?"+Arrays.equals(arrayO1,arrayO3));
        System.out.println("Arr 1 == Arr4?"+Arrays.equals(arrayO1,arrayO4));
       // System.out.println("Arr 1 == Arr5?"+Arrays.equals(arrayO1,arrayO5)); Compile !!! Verschillende type
    }
}
