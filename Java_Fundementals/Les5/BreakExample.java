package Les5;

public class BreakExample {
    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            if (index == 4) {
                break;
            }
            System.out.println(index);
        }
    }
}

