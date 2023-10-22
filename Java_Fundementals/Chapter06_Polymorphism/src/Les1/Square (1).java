package Les1.Oefening5;

public class Square extends Rectangle{

    //Square class has no own variables and no own methods.
    // it uses the Rectangle class constructor to set the data in the Shape class (longVar = shortVar),
    // and uses the Rectangle surfaceArea method.
    public Square(double sideVar){
        super(sideVar,sideVar); //this passes longVar and shortVar to Rectangle class, which passes it to Shape class.
     }
}
