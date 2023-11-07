package Les1.Examples;

public class Lambda1 {
    public static void main(String[] args) {
        Lambda1Interface ref=(x,y)->{
            System.out.println("Hello"+x+y);
            System.out.println("Have a nice Day");
        };
        ref.message("World", '!');
    }
}
