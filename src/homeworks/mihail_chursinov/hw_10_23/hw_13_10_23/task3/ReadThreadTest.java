package homeworks.mihail_chursinov.hw_10_23.hw_13_10_23.task3;

public class ReadThreadTest {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.print("Thread " + i + "\t");
            ReadThread readThread = new ReadThread();
            readThread.start();
            readThread.join();
        }
    }

}
