package be.intecbrussel.Les1;

import static be.intecbrussel.Les1.Rectangle.messageStatic;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.getArea(20, 10));
        System.out.println(rectangle.getArea(20.0,35.0));
        System.out.println(rectangle.getArea(20.0,35));

        messageStatic();


        }

    }

