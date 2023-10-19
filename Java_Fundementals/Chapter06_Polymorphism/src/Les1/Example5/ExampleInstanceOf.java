package Les1.Example5;

public class ExampleInstanceOf {
    public static void main(String[] args) {

        // checking if name is a instanceof String class
        String name = "Intec Brussel";
        System.out.println("Is name a instance of String : " + (name instanceof String));
// Important: Object is ancestor of all classes in Java
        System.out.println("Is name a instance of Object class : " + (name instanceof Object));

        TestInstanceOf object01 = new TestInstanceOf();
//DifferentTestClass object01 = new DifferentTestClass();
// Checking were object01 is a instance of.
        System.out.println("Is Object01 a instance of TestInstanceof? : " + (object01 instanceof TestInstanceOf));
        System.out.println("Is Object01 a instance of DifferentTestClass? : " + (object01 instanceof DifferentTestClass));


    }
}


