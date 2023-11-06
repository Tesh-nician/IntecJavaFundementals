package Les1.NonStaticExample;

public class MainApp2 {
    public static void main(String[] args) {
        NonStaticExample newNonStaticExample = new NonStaticExample();
        NonStaticExample.Inner newInner = newNonStaticExample.new Inner();
        newInner.run();
        System.out.println(newInner.a);

    }
}
