package Les1.OptionalClass;

import java.util.Optional;

public class Person {

    String name;
    public Person(String name) {
        this.name=name;
    }



    public static Optional<Person> getPerson(String name) {
        Person[] people = new Person[]{new Person("Bob"), new Person("Jean"), new Person("Tom")};

        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name)) {
                return Optional.of(people[i]);
            }

        }

        return Optional.empty();
    }

    public String getName() {
        return name;
    }
}


