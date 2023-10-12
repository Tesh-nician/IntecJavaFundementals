package Les3.Oefeningen6.Oefening1;

public class DagenVanDeWeekApp {
    public static void main(String[] args) {

        DagenVanDeWeek[ ] dagenVandeweekArray = DagenVanDeWeek.values();
        for (DagenVanDeWeek dag : dagenVandeweekArray) {
            System.out.println(dag + " at index " + dag.ordinal());
        }
    }
}
