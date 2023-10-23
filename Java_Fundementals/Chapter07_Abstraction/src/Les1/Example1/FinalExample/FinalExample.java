package Les1.Example1.FinalExample;

public class FinalExample {
    public static void main(String[] args) {

    }

    //final variable, direct initialize
    final int THRESHOLD = 5;
    // a final static variable PI, direct initialize
    static final double PI = 3.141592653589793;
    // blank final variable
    final int CAPACITY;
    // blank final variable
    final  static  int  DAYS_OF_THE_WEEK=7;
    // blank final variable

    // instance initializer block
    {
        CAPACITY = 25;
    }
    // static initializer block




    /*
     *constructor for initializing MINIMUM Note that if there are more than one constructor,
     *you must initialize MINIMUM in them also
     */
    public void IntecBrussel() {
        final int MINIMUM = -1;
    }
}





