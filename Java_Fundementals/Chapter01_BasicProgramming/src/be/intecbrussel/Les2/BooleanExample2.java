package be.intecbrussel.Les2;

public class BooleanExample2 {
    public static void main(String[] args) {

        //initialisation
        boolean c=true;
        boolean d=false;


        //logic

        boolean result01 = (c&&d);
        boolean result02 = (c||d);
        boolean result03 = (!(c&&d));

        //output
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);



    }
}
