package be.intecbrussel.Les3;


public class RectangleApp {
    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle(10,30);
        //rect1.setHeight(10);
        //rect1.setWidth(30);

        System.out.println("Height and Width: "+rect1.getHeight()+"  "+rect1.getWidth());

        System.out.println("Rectangle 1, Area: "+rect1.getArea());
        System.out.println("Rectangle 1, Perimeter: "+rect1.getPerimeter());

        rect1.grow(10); // add 10


        System.out.println("After grow = 10");

        System.out.println("Height and Width: "+rect1.getHeight()+"  "+rect1.getWidth());

        System.out.println("Rectangle 1, Area: "+rect1.getArea());
        System.out.println("Rectangle 1, Perimeter: "+rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(1,2,3,4);
        System.out.println("Height = "+ rect2.getHeight());
        System.out.println("Width = "+ rect2.getWidth());
        System.out.println("xPos = "+ rect2.getxPos());
        System.out.println("yPos = "+ rect2.getyPos());

        Rectangle rect3 = new Rectangle(1,2,3,4);



        System.out.println("Height = "+ rect3.getHeight());
        System.out.println("Width = "+ rect3.getWidth());
        System.out.println("xPos = "+ rect3.getxPos());
        System.out.println("yPos = "+ rect3.getyPos());




    }

}
