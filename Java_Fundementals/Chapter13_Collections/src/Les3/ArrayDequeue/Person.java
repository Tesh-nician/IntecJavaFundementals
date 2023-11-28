package Les3.ArrayDequeue;

public class Person  {
    String name;
    Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    enum Gender {
        MALE,
        FEMALE;
    }

}
