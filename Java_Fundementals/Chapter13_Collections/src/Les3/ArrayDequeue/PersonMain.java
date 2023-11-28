package Les3.ArrayDequeue;

import java.util.ArrayDeque;

public class PersonMain {
    public static void main(String[] args) {

        ArrayDeque<Person> queueGender = new ArrayDeque<>();
        queueGender.offerFirst(new Person("Bob", Person.Gender.MALE));
        queueGender.offerFirst(new Person("Bill", Person.Gender.MALE));
        queueGender.offerFirst(new Person("Rudi", Person.Gender.MALE));
        queueGender.offerLast(new Person("Charlene", Person.Gender.FEMALE));
        queueGender.offer(new Person("Annie", Person.Gender.FEMALE));


        Person person = queueGender.pollFirst();

        while (person != null) {
            System.out.println("Couples are: " + person + " and " + queueGender.pollLast() + "\n");
            person = queueGender.pollFirst();
        }


    }
}
