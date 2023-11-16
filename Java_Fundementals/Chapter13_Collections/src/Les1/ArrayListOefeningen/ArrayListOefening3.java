package Les1.ArrayListOefeningen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOefening3 {
    public static void main(String[] args) {

        ArrayList<String>woordenLijst = new ArrayList<>();
        Scanner newScanner = new Scanner(System.in);
        String input="";

        while (!input.equals("end")){
            input=newScanner.nextLine().toLowerCase();
            woordenLijst.add(input);
        }

        woordenLijst.remove(woordenLijst.size()-1);

        woordenLijst.forEach(woord -> System.out.println(woord));

    }
}
