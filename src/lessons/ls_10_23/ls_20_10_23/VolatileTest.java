package lessons.ls_10_23.ls_20_10_23;

/**
 * Created by andrey on 26.10.16.
 */
public class VolatileTest {
    private volatile static int MY_INT = 0;
    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();

    }

    private static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value < 5) {
//                System.out.println("Listener = " + local_value);
                if (local_value != MY_INT) {
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    private static class ChangeMaker extends Thread {
        @Override
        public void run() {

            int local_value = MY_INT;

            while (MY_INT < 5) {
                System.out.println("Incrementing MY_INT to " + (local_value + 1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
