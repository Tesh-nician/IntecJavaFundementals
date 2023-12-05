package be.intecbrussel.Les1;

public class StringExample {
    public static void main(String[] args) {
        String name="Jonathan";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String str = "hello world";
        System.out.println(str.length());


        String str2 = "";
        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());


        String str3 = "hello world";
        System.out.println(str3.replace('e','a'));
        System.out.println(str3.replace('l','L'));


        String str4 =     "hello world   ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());


        System.out.println(str.indexOf("world"));
        System.out.println(str.contains("world"));
        System.out.println("1234567890");
        System.out.println("|"+str.substring(5,10));



















    }
}
