package Les1.StaticExamples1;

public class MainApp2 {
    public static void main(String[] args) {
        StaticExample.Inner newInner = new StaticExample.Inner();
        newInner.run();
        System.out.println(newInner.a);
    }
}
