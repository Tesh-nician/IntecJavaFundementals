package Opdrachten3;

public class Oefening4_DoWhile_en_IfElse {
    public static void main(String[] args) {
        //Lootboxes en FriendshipCrown

        int myCredits = 17;



        do {

            myCredits--;
            double dobbelsteen20 = (double) (1L + Math.round(Math.random() * 19.0));
            if (dobbelsteen20==13) {//check for winning condition
                System.out.println("Congratulations! You have won the Crown of Friendship.");
                break;
            }

            if (dobbelsteen20==7) {myCredits=myCredits+2;} //check for extra credits



        }
        while (myCredits>0); //end if no more credits


        System.out.println("You have "+myCredits+" credits.");

    }
}
