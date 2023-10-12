package Les3;

public enum Color {

    //Constanten
    RED(100),
    GREEN(200),
    BLUE(300);


    // Field
    private int colorCode;


    // Constructor
    private Color(int colorCode) {
        this.colorCode = colorCode;
    }

    // Methodes
    int getColorCode() {
        return colorCode;
    }

    public void colorInfo() {
        System.out.println("Universal Color");

    }
}


