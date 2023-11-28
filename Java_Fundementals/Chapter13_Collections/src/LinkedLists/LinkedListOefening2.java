package Les2.LinkedLists;

import java.util.LinkedList;

public class LinkedListOefening2 {
    public static void main(String[] args) {

        LinkedList<String> sentence = new LinkedList<>();

        sentence.add("The");
        sentence.add("lazy");
        sentence.add("fox");
        sentence.add("jumps");
        sentence.add("over");
        sentence.add("the");
        sentence.add("moon");

       printSentence(sentence);

       printSentenceInReverseOrder(sentence);

       printNumberOfWords(sentence);




    }

    static void printSentence(LinkedList<String> sentence) {
        System.out.println("Sentence normal: -> ");
        sentence.forEach(word -> System.out.print(word + " "));
        System.out.println("\n");
    }

    static void printSentenceInReverseOrder(LinkedList<String> sentence) {

        long numberOfElements = sentence.stream().count();

        System.out.println("Sentence reversed: -> ");

        for (int i =(int)numberOfElements-1; i>=0;i-- ) {
            System.out.print(sentence.get(i)+" ");
        }
        System.out.println("\n");

    }

    static void printNumberOfWords(LinkedList<String> sentence) {

        long numberOfElements = sentence.stream().count();

        System.out.println("Number of words: "+numberOfElements);

        System.out.println("\n");

    }


}
