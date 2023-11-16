package Les1.Oefening1;

public class Pair <E>{

    private E aThing;
    private E bThing;

    public Pair(E aThing, E bThing) {
        this.aThing = aThing;
        this.bThing = bThing;
    }

    public E getaThing() {
        return aThing;
    }

    public E getbThing() {
        return bThing;
    }


    @Override
    public String toString() {
        return "Pair Object: " +
                "aThing=" + aThing +
                ", bThing=" + bThing;
    }
}

