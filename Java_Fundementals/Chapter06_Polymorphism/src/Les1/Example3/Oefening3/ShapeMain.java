package Les1.Example3.Oefening3;

public class ShapeMain {
    public static void main(String[] args) {


        Shape newShape = new Shape(10, 30);
        System.out.println(newShape.surfaceArea());

        Rectangle newRectangle = new Rectangle(10, 30);
        System.out.println(newRectangle.surfaceArea());

        Square newSquare = new Square(20);
        System.out.println(newSquare.surfaceArea());

        Trapezium newTrapezium = new Trapezium(10,20,30);
        System.out.println(newTrapezium.surfaceArea());





    }
}
