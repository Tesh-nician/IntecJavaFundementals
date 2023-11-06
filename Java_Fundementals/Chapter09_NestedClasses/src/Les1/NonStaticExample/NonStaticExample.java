package Les1.NonStaticExample;

public class NonStaticExample {

    private int a =10;

    public class Inner {

        int a=10;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStaticExample.this.a);
            Inner i=new Inner();
            System.out.println(i.a);
            System.out.println(Inner.this.a);


        }


    }
}
