package Les1.Oefening3;

public class Shape {
    private int width;
    private int height;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Shape(){}

    public Shape(int width, int height){
        this.width = width;
        this.height= height;
    }


    public int surfaceArea() {      //This method is inherited by Rectangle and Square, but not by Triangle
        return this.width*this.height;
    }






    public int perimeter() {  //This method is inherited by Rectangle and Square, but not by Triangle

        return this.width*this.height*2;

    }
}
