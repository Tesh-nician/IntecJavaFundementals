package Opdrachten3;

public class Oefening2_DoWhile_en_IF {
    public static void main(String[] args) {

        //FriendshipRank
        //Exchanges cadeaus for friendship
        // The extra exercise modifies the increment


        int mijnCadeaus = 43;
        int shopkeeperFriendshipRank=0;
        int numberOfFriendshipLevels=0;
        int critical=1;

        do {

            System.out.println("My Cadeaus = "+mijnCadeaus + " Friendship Rank = "+shopkeeperFriendshipRank+" Critical = "+critical+" Friendship levels = "+numberOfFriendshipLevels);
            shopkeeperFriendshipRank = shopkeeperFriendshipRank + critical; //critical is th value of the cadeau, starting with 1 and incremented for each Critical.
            mijnCadeaus--;


            if (shopkeeperFriendshipRank > 20) {
                numberOfFriendshipLevels++;
                System.out.println("Another Friendship Level!");
                shopkeeperFriendshipRank=0;
            }
            if (shopkeeperFriendshipRank%5==0) {//elke 5de Friendship level:  modulus 5 == 0
                critical++; // this increases the increment of cadeau, so with each Critical it goes up by 1.
                System.out.println("Another Critical!");
            }



        }
        while (mijnCadeaus > 0);

        System.out.println("Mijn cadeaus is "+mijnCadeaus+" en Total Friendship levels = "+numberOfFriendshipLevels);


    }
}
