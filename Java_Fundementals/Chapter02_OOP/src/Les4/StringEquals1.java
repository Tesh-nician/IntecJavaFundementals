package be.intecbrussel.Les4;

public class StringEquals1 {
    public static void main(String[] args) {

        int a=10;
        int b=10;
        double c=5.5;

        //boolean

        boolean equal01=(a==b);
        boolean equal02=(a==c);

        System.out.println(equal01);
        System.out.println(equal02);


        //string objects

        String s1="intec";
        String s2="intec";
        String s3="INTEC";
        String s4="Java";


        boolean equal03 = (s1==s2);
        boolean equal04 = (s2==s3);
        boolean equal05 = (s3==s4);

        //true, alles komt overeen
        System.out.println(equal03);
        //false, niet alles in dezelfde case
        System.out.println(equal04);
        //false, inhoud is verschiiled
        System.out.println(equal05);







    }
}
