package be.intecbrussel.Les4;

public class StringEquals3 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");


        System.out.println("s1 and s2 are equal: " + (s1==s2));
        System.out.println("s1 and s2 are equal: " + (s1.equals(s2)));


        s1=s2; //changes the references of s1 object to those of s2


        System.out.println("s1 and s2 are equal: " + (s1==s2));


    }
}
