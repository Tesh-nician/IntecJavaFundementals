package Les1.Oefeningen1.oefening2;

public class Pensioner extends Person{

    public String pensionerDescription = "A person who is studying and learning.";

   public String livesHere;

    public Pensioner() {
        super();
        System.out.println(pensionerDescription+ " = Pensioner construction with NO string parameter. ");
    }

    public Pensioner(String livesHere, String typeOfPerson) {
        super(typeOfPerson);
        this.livesHere = livesHere;
        System.out.println(livesHere+ " (From the subclass).");
    }

    public String getLivesHere() {
        return livesHere;
    }
}
