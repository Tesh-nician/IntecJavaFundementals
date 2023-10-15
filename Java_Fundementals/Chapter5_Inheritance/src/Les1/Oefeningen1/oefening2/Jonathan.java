package Les1.Oefeningen1.oefening2;

public class Jonathan extends Student{

    public String name;

    public Jonathan (String name, String subject, String typeOfPerson) {
        super(subject, typeOfPerson);
        System.out.println(name+ "  (From the sub-sub-class)");
    }
}
