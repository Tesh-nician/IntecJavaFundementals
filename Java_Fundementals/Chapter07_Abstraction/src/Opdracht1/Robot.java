package Opdracht1;

public class Robot {


    private  String unitName;


    public void Robot(){
        this.unitName="nameless robot";
    }

    public void Robot (String unitName) {
        this.unitName=unitName;
    }

    public void boot(){
        System.out.println("This robot is starting up.");
    }




}
