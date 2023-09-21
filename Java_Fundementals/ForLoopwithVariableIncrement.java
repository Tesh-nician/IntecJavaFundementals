package Les5;

public class ForLoopwithVariableIncrement {
    public static void main(String[] args) {


        //add primary loop with var step

        for (double step = 1; step < 10; step = step + 0.2) {


            for (double index = 0; index < 1000000000; index = index + step) {
                //System.out.println(("The index is: " + index));
            }

            System.out.println("step is "+step);


        }

    }
}
