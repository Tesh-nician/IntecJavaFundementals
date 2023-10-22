package Les1.Oefening5;

public class Ellipse extends Shape{

    //Ellipse class has no own variables,
    // it uses Shape class data to calculate the surfaceArea method.


    public Ellipse(double longVar, double shortVar){
        setLongVar(longVar);
        setShortVar(shortVar);
    }

    public double surfaceArea(){
        return 3.1415926*getLongVar()*getShortVar();
    }
}

