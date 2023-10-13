package lessons.ls_10_23.ls_13_10_23;

import java.util.concurrent.TimeUnit;

public class InterruptThread {
    public static void main(String[] args) {

        MyInter myInter = new MyInter();

        Thread thread = new Thread(myInter, "Worker");

        thread.start();

        thread.interrupt();

    }
}

class MyInter implements Runnable {
    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        System.out.println("Before try " + thread.isInterrupted());
        try {
//            Thread.sleep(1000);
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Inside catch " + thread.isInterrupted());
            thread.interrupt();
            System.out.println("Last row catch " + thread.isInterrupted());

        }
        System.out.println("Inside MyInter");
    }

}

