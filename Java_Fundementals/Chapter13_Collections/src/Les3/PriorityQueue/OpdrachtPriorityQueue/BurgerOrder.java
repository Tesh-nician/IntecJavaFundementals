package Les3.PriorityQueue.OpdrachtPriorityQueue;

public class BurgerOrder implements Comparable<BurgerOrder> {

    String naam;
    int nummer;

    public BurgerOrder(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "naam='" + naam + '\'' +
                ", nummer=" + nummer +
                '}';
    }

    @Override
    public int compareTo(BurgerOrder o) {
        //return (this.nummer - o.getNummer() );
        System.out.println(o+" comparing to "+this.naam+" : "+this.nummer);

        return (o.getNummer()- this.nummer);
        //return (o.getNummer() );
    }
}
