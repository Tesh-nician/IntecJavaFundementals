package Les1.Example1.Oefening3;

public class SolarBodyCircumferenceMain {
    public static void main(String[] args) {

        //Bereken de omtrek van 3 planeten:
        //onze Zon, Aarde,Maan
        //Je moet gebruik maken van een final methode en een final variabele



        Sun newSun = new Sun();
        Earth newEarth = new Earth();
        Moon newMoon = new Moon();

        System.out.println("Circumference of the Sun is: "+ newSun.myCircumference()+newSun.UNIT);
        System.out.println("Circumference of the Earth is: "+ newEarth.myCircumference()+newEarth.UNIT);
        System.out.println("Circumference of the Moon is: "+ newMoon.myCircumference()+newMoon.UNIT);

    }
}
