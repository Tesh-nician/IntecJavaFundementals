package Project2;

public class Student extends Person{

    int id=0;
    private static  int incrementID=0; //Static!!!

    public Student() {
    }

    public Student(String name, String lastName) {
        super(name, lastName);
        this.id = getIncrementID();
        //ID increment zou beter werken als het gegenereerd werd in ScoreInfoService!
        // Hier wordt het 2 keer aangeroepen!!!
    }


    private static int getIncrementID(){
        return ++incrementID;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
