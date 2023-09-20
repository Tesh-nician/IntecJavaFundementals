package Les3.oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        //initialisation
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;

        //logic
        boolean equal = (bNum==cNum);
        boolean notEqual = (aNum!=cNum);
        boolean biggerThan = (aNum>bNum);
        boolean smallerThan = (cNum<aNum);
        boolean biggerEqual = (aNum>=bNum);
        boolean smallerEqual = (cNum<=aNum);

        //output

        System.out.println("int == long : "+equal);
        System.out.println("byte != long : "+notEqual);
        System.out.println("byte > int : "+biggerThan);
        System.out.println("long < byte : "+smallerThan);
        System.out.println("byte >= int : " +biggerEqual);
        System.out.println("long <= byte : "+smallerEqual);

    }
}
