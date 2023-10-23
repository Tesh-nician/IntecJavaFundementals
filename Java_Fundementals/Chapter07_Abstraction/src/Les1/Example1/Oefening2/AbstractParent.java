package Les1.Example1.Oefening2;

public abstract class AbstractParent {

    public AbstractParent(){
        System.out.println("This is the constructor of the abstract class.");
    }

    public abstract void aMethod();

    public void nonAbstrMethod(){
        System.out.println("This is a normal method of the abstract class.");
    }



}
