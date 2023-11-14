package Oefeningen.Project1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Book {

    public String title;
    public Person author;
    public LocalDate releaseDate;
    public String genre;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public Book(String title, Person author, LocalDate releaseDate, String genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }


    public static List<Book> getLatestBook (Book[] libraryBooks) {
        LocalDate latestDate = Arrays.stream(libraryBooks)
                .map(book -> book.getReleaseDate())
                .max(Comparator.comparing(LocalDate::toEpochDay)).get();
        return Arrays.stream(libraryBooks).filter(book -> book.getReleaseDate().equals(latestDate)).collect(Collectors.toList());
    }


    public static void printYoungestWriter (Book[] libraryBooks) {
        LocalDate youngestDate = Arrays.stream(libraryBooks).map(book -> book.author.dateOfBirth).max(Comparator.comparing(LocalDate::toEpochDay)).get();
        System.out.println("the youngest author is "+Arrays.stream(libraryBooks)
                .filter(book -> book.author.dateOfBirth.equals(youngestDate))
                .map(book -> book.getAuthor())
                .collect(Collectors.toList()));

    }


    // public void printSortedByTitle(Book[] books): deze methode sorteert de array
    //van boeken in alfabetische volgorde, gebruik makend van de naam. Tot slot print
    //hij ze af
    public static void printedSortedByTitle (Book [] libraryBooks) {
        System.out.println("Your library sorted alphabetically by title: \n"+Arrays.stream(libraryBooks)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList()));
    }

    //public void countBooksPerAuthor (Book[] books): deze methode print het aantal
    //boeken af per auteur. Vb: Stephen King: 2; Robert Jordan:2; Mark Twain: 1
    //https://stackoverflow.com/questions/53688831/how-to-find-counts-of-distinct-objects-using-java-streams

    public static void countBooksPerAuthor(Book [] libraryBooks) {
        System.out.println("Counting books per author: "+Arrays.stream(libraryBooks).
                collect(Collectors.groupingBy(Book::getAuthor,Collectors.counting())));
    }

    //public void printBooksReleasedIn2016(Book[] books): Print de boeken af die
    //gereleaset zijn in 2016.
    public static void printBooksReleasedIn2016 (Book[] libraryBooks) {

        System.out.println("The books relased in 2016 are: " + Arrays.stream(libraryBooks)
                        .filter(book -> book.getReleaseDate().isAfter(LocalDate.of(2016,1,1))
                                && book.getReleaseDate().isBefore(LocalDate.of(2017,1,1)))
                        .collect(Collectors.toList()));
    }





    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                ", author=" + author +
                ", releaseDate=" + releaseDate +
                ", genre= " + genre  +
                "}\n";
    }
}
