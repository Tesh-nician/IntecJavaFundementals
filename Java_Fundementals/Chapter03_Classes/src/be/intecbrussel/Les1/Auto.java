package be.intecbrussel.Les1;

public class Auto {


private String merk;
private String model;
private int speed;

//private Auto() {}

public Auto (String merk, String Model) {
    this.merk = merk;
    this.model = model;
}


    public void getMessageCreation() {
        System.out.println("Auto is created!");
    }

    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

}

