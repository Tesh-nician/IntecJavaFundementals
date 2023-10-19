package Les1.Example6;

import Les1.Example5.TestInstanceOf;

public class TestMain {
    public static void main(String[] args) {

        TestInstanceOf object01 = new TestInstanceOf();
//DifferentTestClass object01 = new DifferentTestClass();
// Checking were object01 is a instance of.
        System.out.println("Is Object01 a instance of TestInstanceof? : " + (object01 instanceof TestInstanceOf));
        System.out.println("Is Object01 a instance of DifferentTestClass? : " + (object01 instanceof DifferentTestClass));

        class TestInstanceof{};
        TestInstanceof test = null;
        System.out.println("A test of TestInstanceof: "+ (test instanceof TestInstanceof));//null prevents instanceof from finding a relationship!!!

DifferentTestClass.method01(object01);


    }
}
