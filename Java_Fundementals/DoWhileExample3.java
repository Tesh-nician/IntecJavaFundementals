package Les5;

public class DoWhileExample3 {
    public static void main(String[] args) {

        int x= 21, sum=0;

        do {

            sum+=x;x--;
            System.out.println("X is "+x+"  Interim summation: "+sum);


        }
        while (x>10);

        System.out.println("Final summation: "+sum);
    }
}
