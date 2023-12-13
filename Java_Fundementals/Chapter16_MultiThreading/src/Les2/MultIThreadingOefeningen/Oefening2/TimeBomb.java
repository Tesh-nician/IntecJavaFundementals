package Les2.MultIThreadingOefeningen.Oefening2;

import java.time.LocalTime;

public class TimeBomb {


    int timer;
    private Thread bomb;


    public TimeBomb(int timer) {
        this.timer = timer;





        bomb = new Thread(() -> {

            Thread.currentThread().setPriority(7); //helpt niet
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " s!");
                try {
                    Thread.sleep(this.timer * 100);
                } catch (InterruptedException e) {
                    System.out.println("Disarmed");
                    return;
                }
            }

           long timeEnd = LocalTime.now().getSecond();
            System.out.println("BANG!!!!!!");

        });


    }

    public void activate() {
        //long timeStart = LocalTime.now().getSecond();//werkt niet: probleem met scope, oplossing
        // is timeStart als return value en dan gebruiken in de main thread.
        // Maar dit is teveel werk voor deze eenvoudige opdracht :-)
        bomb.start();
    }

    public void disarm() {
        //long timeEnd = LocalTime.now().getSecond();
        if (bomb.isAlive()) {
            bomb.interrupt();
        }
    }



}

