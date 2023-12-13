package Les2.DaemonExample.Synchronized;
/*

public class ThreadVoorbeeld {

    private int count=0;
    public int getCount() {
        return  count;
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadVoorbeeld voorbeeld = new ThreadVoorbeeld();
        InnerThread thread1 = new ThreadVoorbeeld(voorbeeld);
        InnerThread thread2 = new ThreadVoorbeeld(voorbeeld);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("Hallo vanaf de hoofdthread");

    }

    private static class InnerThread extends Thread {
        private ThreadVoorbeeld voorbeeld;

        public InnerThread(ThreadVoorbeeld voorbeeld) {this.voorbeeld = voorbeeld;}

        @Override
        public void run() {

            try {
                voorbeeld.incrementCount();
                Thread.sleep(3000);
                System.out.println("Hallo vanaf thread " + this.getId() + " , count is nu " + voorbeeld.getCount());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    public synchronized void incrementCount() {count++;}
    }
}
*/