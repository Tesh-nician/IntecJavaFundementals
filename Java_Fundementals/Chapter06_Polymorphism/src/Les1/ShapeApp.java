package Les1.Oefening5;

public class ShapeApp {
    public static void main(String[] args) {

        //Parent class is Shape: no methods, only variables.
        //Subclasses are Rectangle and Circle, only methods, no variables.
        //Subsubclasses are Square and Ellipse, no variables, no own methods.

        Shape newShape = new Shape();

        Rectangle newRectangle = new Rectangle(40,20); //the variables are upcasted to double
        System.out.println("Area of newRectangle= "+newRectangle.surfaceArea());

        Square newSquare = new Square(20); //the variable is upcasted to double
        System.out.println("Area of newSquare= "+newSquare.surfaceArea());

        Ellipse newEllipse = new Ellipse(40,20); //the variable is upcasted to double
        System.out.println("Area of newEllipse= "+newEllipse.surfaceArea());

        Circle newCircle = new Circle(20); //the variable is upcasted to double
        System.out.println("Area of newCircle= "+newCircle.surfaceArea());


        System.out.println("\nnewRectangle an instance of Shape?: "+(newRectangle instanceof Shape));
        System.out.println("newSquare an instance of Rectangle?: "+(newSquare instanceof Rectangle));
        System.out.println("newSquare an instance of Shape (transitivity)?: "+(newSquare instanceof Shape));
        System.out.println("newRectangle an instance of Square?"+(newRectangle instanceof Square));
        System.out.println("newShape an instance of Square?"+(newShape instanceof Square));


        System.out.println("\nnewEllipse an instance of Shape?: "+(newEllipse instanceof Shape));
        System.out.println("newCircle an instance of Ellipse?: "+(newCircle instanceof Ellipse));
        System.out.println("newCircle an instance of Shape (transitivity)?: "+(newCircle instanceof Shape));
        System.out.println("newEllipse an instance of Circle?: "+(newEllipse instanceof Circle));
        System.out.println("newShape an instance of Circle?: "+(newShape instanceof Circle));


        //System.out.println("newCircle an instance of Rectangle?: "+(newCircle instanceof Rectangle));//Error: incompatible types.
        //Impossible to use instanceof between trees???











    }
}
