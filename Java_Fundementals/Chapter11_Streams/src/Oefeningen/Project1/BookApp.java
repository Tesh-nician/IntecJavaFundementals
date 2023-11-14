package Oefeningen.Project1;

import java.time.LocalDate;


public class BookApp {
    public static void main(String[] args) {


        int numberOfBooks = 6;

        Book[] library = new Book[numberOfBooks];
        library[0] = new Book("Blindsight", new Person("Peter", "Watts", LocalDate.of(1958, 1, 25)), LocalDate.of(2006, 10, 3), "SF, Dystopia");
        library[1] = new Book("Ringworld", new Person("Larry", "Niven", LocalDate.of(1938, 4, 30)), LocalDate.of(1970, 10, 1), "SF, Hard");
        library[2] = new Book("A Wizard of Earthsea", new Person("Ursula K.", "Le Guin", LocalDate.of(1929, 10, 21)), LocalDate.of(1968, 1, 1), "Fantasy, High");
        library[3] = new Book("Tactics of Mistake", new Person("Gordon R.", "Dickson", LocalDate.of(1923, 11, 1)), LocalDate.of(1971, 1, 1), "SF, MFuture History");
        library[4] = new Book("The March of Folly", new Person("Barbara W.", "Tuchman", LocalDate.of(1912, 2, 6)), LocalDate.of(1958, 1, 2), "History, Political");
        library[5] = new Book("Echopraxia", new Person("Peter", "Watts", LocalDate.of(1958, 1, 25)), LocalDate.of(2016, 8, 26), "History, Political");


        //Methode 1:
        System.out.println("Latest book: "+Book.getLatestBook(library));
        //Methode 2:
        Book.printYoungestWriter(library);
        //Methode 3:
        Book.printedSortedByTitle(library);
        //Methode 4:
        Book.countBooksPerAuthor(library);
        //Methode 5:
        Book.printBooksReleasedIn2016(library);








    }
}
