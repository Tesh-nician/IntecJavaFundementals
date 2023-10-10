package Les1.LesOefeningen1;

public class Oefening3 {
    public static void main(String[] args) {


        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < 10; i++) {

           boolean evenOdd = list[i] % 2 ==0 ? true:false;
            System.out.print(list[i]);
            System.out.println(evenOdd? " Even":"Uneven");

            }

        }


    }

