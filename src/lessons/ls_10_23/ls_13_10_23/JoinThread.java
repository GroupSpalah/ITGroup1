package lessons.ls_10_23.ls_13_10_23;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Hello");
            while (true) {

            }
        };

        Thread thread = new Thread(runnable, "Worker");

        thread.start();

        thread.join();

        System.out.println("Main is finished");
    }
}
