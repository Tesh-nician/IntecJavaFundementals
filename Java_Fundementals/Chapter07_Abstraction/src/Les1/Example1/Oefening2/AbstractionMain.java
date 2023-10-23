package Les1.Example1.Oefening2;

public class AbstractionMain {
    public static void main(String[] args) {
        //Een abstracte klas heeft een constructor die als print statement heeft: "This is constructor of abstract class".
        //Deze klas heeft ook een abstracte methode met de naam aMethod en een non-abstracte methode die als print statement heeft: "This is a normal method of abstract class".
        //Dan heb je een sub-klas SubClass die erft van de abstracte klas.
        //Deze klas heeft de methode aMethod dat als print statement heeft: "This is abstract method".
        //Daarna creeer je een object van sub-klas en roep de methodes op


        SubClass newSubClass = new SubClass();

        System.out.print("Abstract method:  ");
        newSubClass.aMethod();
        System.out.print("Non-abstract method:  ");
        newSubClass.nonAbstrMethod();
    }
}
