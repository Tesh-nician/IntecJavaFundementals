package Les2.LinkedLists;

import java.util.LinkedList;

public class LinkedListOefening3 {
    public static void main(String[] args) {

        LinkedList <Integer> intList = new LinkedList<Integer>();

        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));
        intList.add((int) Math.round(Math.random()*100));





        printList(intList);

        printSum(intList);

        printAverage(intList);

    }

    static void printList(LinkedList<Integer> intList) {
        System.out.println("\n\nprintList method: ");
        intList.forEach(i-> System.out.println(i));
    }

    static void printSum(LinkedList<Integer> intList) {
         //int sumOfInt=0;

        System.out.println("\nprintSum using streams() and reduce(): ");
        System.out.println(intList.stream().reduce(0,(sumOfInt,i)->sumOfInt+i));

    }
    static void printAverage(LinkedList<Integer> intList) {
        //int sumOfInt=0;

        System.out.println("\nprintAverage using streams(),reduce() and count(): ");
        System.out.println(intList.stream().reduce(0,(sumOfInt,i)->sumOfInt+i)/intList.stream().count());
        System.out.println();

    }



}
