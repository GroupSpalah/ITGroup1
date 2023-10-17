package homeworks.anton_gvozdenko.hw_13_10_23.task2;

public class Test {
    public static void main(String[] args) {
        Thread[] threads = new Thread[15];
        for (int i = 0; i < 15; i++) {
            threads[i] = new RandomTread();
            threads[i].start();
        }
    }
}
