package Les1.Oefening5;

public class Rectangle extends Shape {

    //Rectangle class has no own variables,
    // it uses Shape class data to calculate the surfaceArea method.


    public Rectangle(double longVar, double shortVar){
       setLongVar(longVar);
       setShortVar(shortVar);
    }

    public double surfaceArea(){
        return getLongVar()*getShortVar();
    }
}
