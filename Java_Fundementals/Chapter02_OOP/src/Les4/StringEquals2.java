package be.intecbrussel.Les4;

public class StringEquals2 {
    public static void main(String[] args) {

        //string objects

        String str01="Hell Intec";
        String str02= new String ("Hello Intec");
        String str03=str02;

// false omdat 2 objecten
        boolean equal01 = (str01==str02);

        //true omdat beide variabelen naar hetzelfde object refereren

        boolean equal02 = (str02==str03);

        System.out.println(equal01);
        System.out.println(equal02);


        System.out.println(str01.equals(str02));
        System.out.println(str01.equals(str03));
        System.out.println(str02.equals(str03));



    }
}
