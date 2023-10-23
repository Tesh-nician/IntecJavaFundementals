package Les1.Example1.FinalExample2;

public class FinalExample2 {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Intec");
        System.out.println("Before the change= "+sb);
        sb.append("Brussel");
        System.out.println("After the change= "+sb);


         int[] arr={1,2,3};

        for ( final int numbers:arr){ //this makes the ARRAY final, not the counter.
            System.out.println(numbers);

        }


    }
}
