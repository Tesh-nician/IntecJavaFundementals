package Les3.Oefeningen6.Oefening3;

public enum HolidayDestination {

    //Constants

    Belgie(1),
    Chili(2),
    Denemarken(3),
    Estonia(4),
    Finland(5),
    Georgia(6),
    Italie(7),
    Madagascar(8),
    Frankrijk(9),
    Duitsland(10);



    // Field
    private int holidayDestination;

    //constructor
    private HolidayDestination(int holidayDestination) {
        this.holidayDestination = holidayDestination;
    }

    //Method
    int getHolidayDestination(int holidayDestination) {
        return holidayDestination;

    }

}

