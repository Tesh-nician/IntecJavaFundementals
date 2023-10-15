package Les1.Oefeningen1.oefening2;

public class Student extends Person{

    public String studentDescription = "A person who is studying and learning.";

    public String subject;

    public Student() {
        super();
        System.out.println(studentDescription+ " = Student construction with NO string parameter. ");
    }

    public Student(String subject, String typeOfPerson) {
        super(typeOfPerson);
        this.subject = subject;
        System.out.println(subject + " (From the subclass");
    }

    public String getSubject() {
        return subject;
    }

}
