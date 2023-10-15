package Les1.Oefeningen1.oefening2;

public class TypeOfPersonApp {
    public static void main(String[] args) {
        //Superclass is Person, the two subclasses are Student and Pensioner, and Jonathan is the sub-sub-class.
        //Person has properties  persondescription and persondescription2 (used for the This() chain)
        // in the superclass.
        //Student has property "subject".
        //Pensioner has property "livesHere".
        //Jonathan has property "name".



    Student aStudent = new Student("History","A student");//constructor chain

    System.out.println(aStudent.getSubject()+" (getter from the student class)"); //variable has already
                                                                    // been set in the student constructor

    Pensioner aPensioner = new Pensioner("Brussels","A pensioner"); //constructor chain

    System.out.println(aPensioner.getLivesHere()+" (getter from the pensioner class)"); //variable has already
                                                                    // been set in the pensioner constructor

    System.out.println("\n\nThis is 3-class chain!!! \n");
    Jonathan newJonathan = new Jonathan("Jonathan Deroo","Java","Student");


    }
}
