package Les1.Oefening1;

public class Calculator {


    public int getMinimum(int cijfer1, int cijfer2, int cijfer3) {
        return Math.min(cijfer3, (Math.min(cijfer1, cijfer2)));
    }

    public boolean getEven(int cijfer) {
        boolean evenTrue;

        //cijfer%2==0?  evenTrue=true : evenTrue=false; werkt niet????

        if (cijfer % 2 == 0) {
            evenTrue = true;
        } else evenTrue = false;

        return evenTrue;
    }

    public double getAddition(double cijfer1, double cijfer2) {

        return cijfer1+cijfer2;
    }

    public double getSubtract(double cijfer1, double cijfer2) {

        return cijfer1-cijfer2;
    }

    public double getMultiply(double cijfer1, double cijfer2) {

        return cijfer1*cijfer2;
    }

    public double getDivide(double cijfer1, double cijfer2) {

        return cijfer1/cijfer2;
    }

    public double getModulus(double cijfer1, double cijfer2) {

        return cijfer1%cijfer2;
    }





}