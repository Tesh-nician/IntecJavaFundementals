package be.intecbrussel.Les2;

public class ArithmeticsExample {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        float fdiv = a/b;
        int mod = a%b;

        System.out.println("a:" +a +" b:"+b);
        System.out.println("Sum of a and b:" +sum);
        System.out.println("Subtraction of a and b:" +sub);
        System.out.println("Multiplication of a and b:" +mul);
        System.out.println("Division of a and b (int!!!):" +div); //with int the part after the comma is discarded
        System.out.println("Float Division of a and b (int!!!):" +fdiv); //with int the part after the comma is discarded
        System.out.println("Modulus of a and b:" +mod);

        //increment 1

        int inc=++b;
        System.out.println("Incrementing B" +inc);

        //decrement 1 to starting value

        int dec=--b;
        System.out.println("Decrementing B" +dec);


    }
}
