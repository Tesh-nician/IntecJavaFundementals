package Les1.Example3.Oefening3;

public class Trapezium extends Shape{
    private int width;
    private int height1;
    private int height2;


    public Trapezium(int width, int height1,int height2){
        this.width = width;
        this.height1= height1;
    }
@Override
    public int surfaceArea() {
        return (this.height1+this.height2)/2*this.width;
    }
}
