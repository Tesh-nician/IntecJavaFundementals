package Les1.Oefening3;

public class Triangle extends Shape{

        private int height;
        private int width;


        public Triangle(int height, int width){
            this.height = height;
            this.width=width;
        }


        @Override //Overrides the main class
        public int surfaceArea() {

            return this.height*this.width/2;
        }

        @Override ////Overrides the main class
        public  int perimeter(){
            double c= Math.sqrt(this.height*this.height+this.width*this.width);

            return (int)(this.height+this.width+c);//typecasting to int = form of polymorphism :-)
        }

}
