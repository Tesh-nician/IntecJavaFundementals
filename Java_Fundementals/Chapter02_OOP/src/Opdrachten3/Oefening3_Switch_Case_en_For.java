package Opdrachten3;

public class Oefening3_Switch_Case_en_For {
    public static void main(String[] args) {

        int myEperiencePoints = 0;
        int numberOfMonsters = 0;
        int outcome=3; //default

        do {
            int monsterXP = (int) (1 + Math.round(Math.random() * 2));
            System.out.println("The next monster has " + monsterXP + " experience points.");
            if (monsterXP==1) {
                continue;//avoiding monsters with XP = 1
            }
            System.out.println("ENCOUNTER!");

            myEperiencePoints=myEperiencePoints+monsterXP;
            numberOfMonsters++;
            if (numberOfMonsters>=10) {
                outcome=2;
                break; // you have encountered 10 monsters (maximum allowed)
            }
            if (myEperiencePoints>=15) {outcome=1;}

        } while(myEperiencePoints <= 15);

        //System.out.println("break="+outcome); used for debugging





        System.out.println("You have encountered "+numberOfMonsters+" monsters and have collected "+myEperiencePoints+" XP.");


        switch (outcome) {

            case 1: //level UP

                System.out.println("You will now Level UP!!!");
            //break; FALL THROUGH :-)

            default: //10 monsters but no level up

                System.out.println("You have encountered "+numberOfMonsters+" monsters.");

                break;

        }
    }
}
