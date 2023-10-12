package Les3.Oefeningen6.Oefening3;


import java.util.Scanner;

public class HolidayDestinationApp {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


    HolidayDestination[ ] holidayDestinationArray = HolidayDestination.values();


        for (HolidayDestination land : holidayDestinationArray)

    {
        System.out.println(land + " heeft index " + land.ordinal());

    }

        System.out.println("Welk land wilt u bezoeken? (geef de index in:\n");

        int myCountry = myScanner.nextInt();



        //System.out.println("Dus u wilt "+getHolidayDestination(myCountry)+" bezoeken?");

       //HolidayDestination country = HolidayDestination.myCountry;








    }
}

