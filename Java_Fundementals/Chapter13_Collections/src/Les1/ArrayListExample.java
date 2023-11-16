package Les1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Nina");
        list.add("Jana");
        list.add("Maxim");
        list.add("Haytam");
        list.add("Abdessamad");
        list.add("Raphael");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
