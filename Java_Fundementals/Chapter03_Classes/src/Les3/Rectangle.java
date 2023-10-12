package be.intecbrussel.Les3;

public class Rectangle {

    public int height;
    public int width;
    public int x;
    public int y;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public Rectangle(int x) {
        this.x = x;
    }

    public Rectangle() {
    }



    public void setHeight(int height) {
        this.height = height <0? -height : height;
    }
    public int getHeight() {
        return height;
    }



    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }


    public void setxPos(int x) {
        this.x = x ;
    }


    public int getxPos() {
        return x;
    }

    public void setyPos(int y) {
        this.y = y;
    }
    public int getyPos() {
        return y;
    }



    public int getArea () {

        return 2*width*height;
    }
    public int getPerimeter () {

        return 2*(height+width);
    }

    public void grow(int d) {
        this.height = height+Math.abs(d);
        this.width = width+Math.abs(d);
    }



    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.x = rectangle.x;
        this.y = rectangle.y;
    }



}



