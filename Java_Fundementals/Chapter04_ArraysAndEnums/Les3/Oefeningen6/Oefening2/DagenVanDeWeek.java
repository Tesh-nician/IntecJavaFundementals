package Les3.Oefeningen6.Oefening2;

public enum DagenVanDeWeek {

    Maandag(1),
    Dinsdag(2),
    Woensdag(3),
    Donderdag(4),
    Vrijdag(5),
    Zaterdag(6),
    Zondag(7);


    // Field
    private int dagVDWeek;

    // Constructor
    private DagenVanDeWeek(int dagVDWeek) {
        this.dagVDWeek = dagVDWeek;
    }

    public int getDagVDWeek(int dagVDWeek) {
        return dagVDWeek;
    }

}
