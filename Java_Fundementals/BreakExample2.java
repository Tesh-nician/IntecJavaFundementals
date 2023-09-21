package Les5;

public class BreakExample2 {
    public static void main(String[] args) {

        for (int index = 0; index <120; index++){
            if (index==100) {
                System.out.println("You have reached SPACE!!!");
                continue;
            }
            System.out.println(index);
        }
    }
}
