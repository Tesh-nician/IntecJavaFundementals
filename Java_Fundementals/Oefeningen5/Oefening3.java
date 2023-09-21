package Les5.Oefeningen5;

public class Oefening3 {
    public static void main(String[] args) {
        //Do-while loop

        //initialisation and declarations
        String myName = "Jonathan Deroo";
        int myAge = 57;
        int years = 0;



        //looping
        do {
            System.out.println("My name is " + myName + " and my age is "+years);
            years++;
                            //This is the break
            if (years==myAge+1) { //Age + 1 because the condition is checked at the end of the loop
                break;
            }

        }
                            //check condition
        while (years < 150);

        System.out.println("End of loop"); //Testing to see where the loop ends

        //Thank you for teaching us so much in only a few days. I wish you a nice weekend");


    }
}


