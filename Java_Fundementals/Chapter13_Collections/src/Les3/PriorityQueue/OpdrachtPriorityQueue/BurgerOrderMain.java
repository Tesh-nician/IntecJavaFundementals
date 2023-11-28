package Les3.PriorityQueue.OpdrachtPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerOrderMain {
    public static void main(String[] args) {

        Queue<BurgerOrder> burgerKing = new PriorityQueue<>() {
        };

        burgerKing.offer(new BurgerOrder("Fish Burger",3));
        burgerKing.offer(new BurgerOrder("King Burger",1));
        burgerKing.offer(new BurgerOrder("Little Mac",6));
        burgerKing.offer(new BurgerOrder("Vegetable Burger", 2));
        burgerKing.offer(new BurgerOrder("Fat Burger", 5));
        burgerKing.offer(new BurgerOrder("Cheese Burger",4));

       // Comparator burgerComparator = burgerKing.comparator();

       // System.out.println(burgerComparator);

        BurgerOrder b = burgerKing.poll();
        while (b!=null) {
            System.out.println("Now making:"+b+"\n_____________________________________________");
            b=burgerKing.poll();

        }

    }
}
