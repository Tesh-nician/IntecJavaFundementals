package Java_Fundementals.Chapter07_Abstraction.src.Opdracht1;

public class BendingRobot extends Opdracht1.Robot {

    private double maxBendAngle;
    private double bendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        //super(unitName); //Error: must be on the first line????
        setUnitName(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bend) {
        this.bendAngle = this.bendAngle + bend;
        if (this.bendAngle > maxBendAngle) {
            System.out.println("Robot has achieved maximum bend-angle.");
            bendAngle = maxBendAngle;
        } else {
            System.out.println("New bend-angle is now: " + this.bendAngle);
        }
        //method to bend, check if exceeding maxbendagnle


    }
}
