package Les2.Oefeningen;

public class Oefening2 {
    public static void main(String[] args) {

        String[] firstArray = {"Intec", "is", "the", "best!"};

        String[] secondArray = {"C#", "is", "the", "worst!"};

        String[] tempArray = {" "," "," "," "};


        if (firstArray.length == secondArray.length) {


            for (int count = 0; count < firstArray.length; count++) {
                tempArray[count] = firstArray[count];
                firstArray[count] = secondArray[count];
                secondArray[count] = tempArray[count];
            }

            System.out.println("First Array");
            String FirstArrayisNowAString=String.join(" ",firstArray);
            System.out.println(FirstArrayisNowAString);

            System.out.println("Second Array");
            String SecondArrayisNowAString=String.join(" ",secondArray);
            System.out.println(SecondArrayisNowAString);




        }
        else {
            System.out.println("The two arrays have different length!");
        }







    }
}
