package Les1.Oefening3;

public class ShapeMain {
    public static void main(String[] args) {


        Shape newShape = new Shape(10, 30);
        System.out.println(newShape.surfaceArea());
        System.out.println(newShape.perimeter());

        Rectangle newRectangle = new Rectangle(10, 30);
        System.out.println(newRectangle.surfaceArea());//This class inherits surfaceArea method from the superclass
        System.out.println(newRectangle.perimeter());//This class inherits perimeter method from the superclass

        Square newSquare = new Square(30);
        System.out.println(newSquare.surfaceArea());//This class inherits surfaceArea method from the superclass
        System.out.println(newSquare.perimeter());//This class inherits perimeter method from the superclass

        Triangle newTriangle = new Triangle(10,30);
        System.out.println(newTriangle.surfaceArea()); //Triangle overrides surfaceArea method
        System.out.println(newTriangle.perimeter()); //Triangle overrides surfaceArea method






    }
}
