package Les1;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo <String,Integer> mDuo = new MixedDuo<>("Dog", 15);

        System.out.println(mDuo.getObject1()+" - "+mDuo.getObject2());
    }
}
