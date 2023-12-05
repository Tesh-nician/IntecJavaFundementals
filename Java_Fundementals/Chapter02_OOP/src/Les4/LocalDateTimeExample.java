package be.intecbrussel.Les4;

 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {


        LocalDate justTheDate = LocalDate.now();
        LocalTime justTheTime = LocalTime.now();
        LocalDateTime dateAndTheTimeNow = LocalDateTime.now();

        System.out.println(justTheDate);
        System.out.println(justTheTime);
        System.out.println(dateAndTheTimeNow);

    }
}
