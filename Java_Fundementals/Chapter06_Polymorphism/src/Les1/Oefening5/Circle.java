package Les1.Oefening5;

public class Circle extends Ellipse{

    //Circle class has no own variables, no own methods.
    // it uses the Ellipse class constructor to set the data in the Shape class (longVar = shortVar),
    // and uses the Ellipse surfaceArea method.
    public Circle(double radius){
        super(radius,radius); //this passes longVar and shortVar to Ellipse class, which passes it to Shape class.
    }
}
