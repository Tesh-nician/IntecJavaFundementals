package Les1.Example4;

public class UPDownCastingMain {
    public static void main(String[] args) {

        Parent parent = new Child(); // this works because fitting child object into a parent superclass.
        parent.name = "Intec Brussel";
//Printing the parent class name
        System.out.println(parent.name);
//parent class method is overridden method hence this will be executed
        parent.method();
// Trying to Downcasting Implicitly. You will get a compile time error.
//Child child = new Parent();  Does not work because fitting a parent object into a child subclass.

        // Downcasting Explicitly
       // Child child = (Child)parent;
        //System.out.println("Child = (Child)parent = "+child.name);
       // child.method();


    }
}
