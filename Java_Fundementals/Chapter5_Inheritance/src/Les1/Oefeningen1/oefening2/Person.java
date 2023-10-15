package Les1.Oefeningen1.oefening2;

public class Person {

    String personDescription2 = "Member of Homo Sapiens sapiens (This is in the superclass no-args constructor).";

    public String personDescription= "A human being (also superclass of Student)";


    public Person() {
        System.out.println(personDescription2);
    }

    public Person(String typeOfPerson) {
        this();
        System.out.println(personDescription+ " (This comes from the Person class with 1 string argument.");
        System.out.println(typeOfPerson+" : This is printed in the superclass, but the variable comes from the sub-class" );
    }
}
