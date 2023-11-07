package Les1.Examples;

public class LambdaMain3 {
    public static void main(String[] args) {
        MInterface ref = (str) -> {
            String result ="";
            for (int i= str.length()-1;i>=0;i--)
                result +=str.charAt(i);
            return result;

        };

        System.out.println("Lambda reversed = "+ref.reverse("Lambda reversed"));
    }
}
