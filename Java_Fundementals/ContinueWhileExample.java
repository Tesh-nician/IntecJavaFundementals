package Les5;

public class ContinueWhileExample {
    public static void main(String[] args) {

        int index= 0;

        while (index<10) {

            if (index==4) {
                index++;
                continue;
            }

            System.out.println(index);
            index++;

        }
    }
}
