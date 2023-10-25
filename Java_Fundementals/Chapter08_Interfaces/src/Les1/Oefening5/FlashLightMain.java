package Oefening5;

public class FlashLightMain {
    public static void main(String[] args) {

        Battery newVarta = new VartaAA();
        FlashLight zakLamp1 = new FlashLight(newVarta);
        Battery newDuracel = new DuracelAA();
        FlashLight zaklamp2 = new FlashLight(newDuracel);
        Battery newFlyingTiger = new FlyingTigerAA();
        FlashLight zaklamp3 = new FlashLight(newFlyingTiger);

        System.out.println(zakLamp1);
        System.out.println(zaklamp2);
        System.out.println(zaklamp3);



    }
}
